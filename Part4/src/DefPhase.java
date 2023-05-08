import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import mar.marBaseListener;
import mar.marParser;
import SymbolTable.*;

public class DefPhase extends marBaseListener {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
    Scope global;
    Scope currentScope;
    int numErrors;

    public void mapGlobals() {
        int index = 0;
        Symbol temp;
        for (Map.Entry<String, Symbol> entry : global.getSymbols().entrySet()) {
            temp = entry.getValue();
            temp.setIndex(index++);
        }
    }

    public void enterProg(marParser.ProgContext ctx) {
        this.global = new Scope(currentScope);
        this.currentScope = this.global;
        this.numErrors = 0;
    }

    public void saveScope(ParserRuleContext ctx, Scope scope) {
        this.scopes.put(ctx, scope);
    }

    public void enterBlock(marParser.BlockContext ctx) {
        this.currentScope = new Scope(currentScope);
        this.saveScope(ctx, currentScope);
    }

    public void exitBlock(marParser.BlockContext ctx) {
        this.currentScope = this.currentScope.getEnclosingScope();
    }

    public void exitVarDecl(marParser.VarDeclContext ctx) {
        if (!this.defineVar(ctx.type(), ctx.ID().getText())) {
            System.out.println("line: " + ctx.getStart().getLine() + ":" + ctx.getStop().getCharPositionInLine()
                    + " error: " + ctx.ID().getText() + " is already defined");
            this.numErrors++;
        }
        if (ctx.AFFECT() != null)
            this.currentScope.getSymbols().get(ctx.ID().getText()).assign();
    }

    public boolean defineVar(marParser.TypeContext typeCtx, String id) {
        Type type = Type.getType(typeCtx.start.getType());
        Symbol var = new Symbol(id, type);
        if (!this.currentScope.contains(id)) {
            this.currentScope.define(var);
            return true;
        }
        return false;
    }

    public int getNumErrors() {
        return this.numErrors;
    }
}