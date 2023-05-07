import org.antlr.v4.runtime.tree.*;
import SymbolTable.Scope;
import SymbolTable.Symbol;
import mar.marBaseListener;
import mar.marParser;

public class RefPhase extends marBaseListener {
    ParseTreeProperty<Scope> scopes;
    Scope global;
    Scope currentScope;
    int numErrors;

    public RefPhase(ParseTreeProperty<Scope> scopes, Scope global) {
        this.scopes = scopes;
        this.global = global;
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

    public void exitAssign(marParser.AssignContext ctx) {
        Symbol tVar = this.currentScope.resolve(ctx.ID().getText());
        if (tVar != null)
            tVar.assign();
    }

    public void exitId(marParser.IdContext ctx) {
        String id = ctx.ID().getText();
        Symbol tVar = this.currentScope.resolve(id);
        if (tVar == null) {
            System.out.println("line: " + ctx.getStart().getLine() + ":" + ctx.getStop().getCharPositionInLine()
                    + " error: " + id + " is not defined");
            this.numErrors++;
        } else if (!tVar.isSet()) {
            System.out.println("line: " + ctx.getStart().getLine() + ":" + ctx.getStop().getCharPositionInLine()
                    + " error: " + id + " has not been initialized");
            this.numErrors++;
        }
    }

    public int getNumErrors() {
        return this.numErrors;
    }
}