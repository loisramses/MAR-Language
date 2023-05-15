import org.antlr.v4.runtime.tree.*;
import SymbolTable.FunctionSymbol;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import SymbolTable.VariableSymbol;
import mar.marBaseListener;
import mar.marParser;

public class RefPhase extends marBaseListener {
    ParseTreeProperty<Scope> scopes;
    Scope global;
    Scope currentScope;
    FunctionSymbol currentFunction;
    int numErrors;

    public RefPhase(ParseTreeProperty<Scope> scopes, Scope global) {
        this.scopes = scopes;
        this.global = global;
        this.currentFunction = null;
        this.numErrors = 0;
    }

    public void enterProg(marParser.ProgContext ctx) {
        this.currentScope = this.global;
    }

    public void enterBlock(marParser.BlockContext ctx) {
        this.currentScope = this.scopes.get(ctx);
    }

    public void exitBlock(marParser.BlockContext ctx) {
        this.currentScope = this.currentScope.getEnclosingScope();
    }

    public void enterFunctionDecl(marParser.FunctionDeclContext ctx) {
        this.currentFunction = (FunctionSymbol) this.currentScope.getSymbols().get(ctx.ID().getText());
    }

    public void exitFunctionDecl(marParser.FunctionDeclContext ctx) {
        this.currentFunction = null;
    }

    public void exitId(marParser.IdContext ctx) {
        String id = ctx.ID().getText();
        Symbol tVar = this.currentScope.resolve(id);
        if (tVar == null) {
            System.out.println("line: " + ctx.getStart().getLine() + ":" + ctx.getStop().getCharPositionInLine()
                    + " error: " + id + " is not defined");
            this.numErrors++;
        } else if (tVar instanceof VariableSymbol && !((VariableSymbol) tVar).isSet() && this.currentFunction == null) {
            System.out.println("line: " + ctx.getStart().getLine() + ":" + ctx.getStop().getCharPositionInLine()
                    + " error: " + id + " has not been initialized");
            this.numErrors++;
        }
        if (tVar instanceof FunctionSymbol) { //ver se funciona so a usar o else
            System.out.println("line: " + ctx.getStart().getLine() + ":" + ctx.getStop().getCharPositionInLine()
                    + " error: " + ctx.ID().getText() + " is not a variable");            
            this.numErrors++;
        }
    }

    public int getNumErrors() {
        return this.numErrors;
    }
}