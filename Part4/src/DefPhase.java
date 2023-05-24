import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import mar.marBaseListener;
import mar.marParser;
import SymbolTable.*;

public class DefPhase extends marBaseListener {
    ParseTreeProperty<Scope> scopes = new ParseTreeProperty<>();
    ParseTreeProperty<Boolean> hasReturn = new ParseTreeProperty<>();
    Scope global;
    Scope currentScope;
    FunctionSymbol currentFunction;
    int numErrors;

    public void mapGlobals() {
        int index = 0;
        Symbol temp;
        for (Map.Entry<String, Symbol> entry : global.getSymbols().entrySet()) {
            temp = entry.getValue();
            if (temp instanceof VariableSymbol)
                ((VariableSymbol) temp).setIndex(index++);
        }
    }

    public void enterProg(marParser.ProgContext ctx) {
        this.global = new Scope(null);
        this.currentScope = this.global;
        this.numErrors = 0;
        this.currentFunction = null;
    }

    public void saveScope(ParserRuleContext ctx, Scope scope) {
        this.scopes.put(ctx, scope);
    }

    public void exitUseless(marParser.UselessContext ctx) {
        this.hasReturn.put(ctx, false);
    }

    public void exitReturn(marParser.ReturnContext ctx) {
        this.hasReturn.put(ctx, true);
    }

    public void exitWhile(marParser.WhileContext ctx) {
        this.hasReturn.put(ctx, false);
    }

    public void exitIf(marParser.IfContext ctx) {
        if (ctx.getChildCount() == 4) this.hasReturn.put(ctx, false);
        else this.hasReturn.put(ctx, this.hasReturn.get(ctx.getChild(3)) && this.hasReturn.get(ctx.getChild(5)));
    }

    public void exitPrint(marParser.PrintContext ctx) {
        this.hasReturn.put(ctx, false);
    }

    public void enterFunctionDecl(marParser.FunctionDeclContext ctx) {
        String id = ctx.ID().getText();
        Type funcType;
        if (ctx.type() != null) funcType = Type.getType(ctx.type().start.getType());
        else funcType = Type.tNIL; // void
        FunctionSymbol func = new FunctionSymbol(id, funcType);
        this.currentScope.define(func);
        this.currentFunction = func;
    }

    public void exitFunctionDecl(marParser.FunctionDeclContext ctx) {
        this.hasReturn.put(ctx, this.hasReturn.get(ctx.block()));
        this.currentFunction = null;
    }

    public void enterBlock(marParser.BlockContext ctx) {
        this.currentScope = new Scope(currentScope);
        if (this.currentFunction != null) {
            for (Symbol symb : currentFunction.getArguments()) {
                if (!this.currentScope.contains(symb.getId()))
                    this.currentScope.define(symb);
                else {
                    System.out.println("line: " + ctx.getStart().getLine() + ":" + ctx.getStop().getCharPositionInLine()
                            + " error: formal parameter " + symb.getId() + " is defined more than once in function");
                    this.numErrors++;
                }
            }
        }
        this.currentFunction = null;
        this.saveScope(ctx, this.currentScope);
    }
    
    public void exitAssign(marParser.AssignContext ctx) {
        Symbol tVar = this.currentScope.resolve(ctx.ID().getText());
        if (tVar != null && tVar instanceof VariableSymbol)
            ((VariableSymbol) tVar).assign();
        this.hasReturn.put(ctx, false);
    }

    public void exitInstBlock(marParser.InstBlockContext ctx) {
        this.hasReturn.put(ctx, this.hasReturn.get(ctx.block()));
    }

    public void exitBlock(marParser.BlockContext ctx) {
        this.currentScope = this.currentScope.getEnclosingScope();
        boolean hasReturn = false;
        for (ParserRuleContext inst : ctx.inst())
            hasReturn = hasReturn || this.hasReturn.get(inst);
        this.hasReturn.put(ctx, hasReturn);
    }

    public void exitFormalParam(marParser.FormalParamContext ctx) {
        Type varType = Type.getType(ctx.type().start.getType());
        VariableSymbol var = new VariableSymbol(ctx.ID().getText(), varType);
        var.assign();
        var.setFuncArg();
        this.currentFunction.addArgument(var);
    }

    public void exitVarDecl(marParser.VarDeclContext ctx) {
        if (!this.defineVar(ctx.type(), ctx.ID().getText())) {
            System.out.println("line: " + ctx.getStart().getLine() + ":" + ctx.getStop().getCharPositionInLine()
                    + " error: " + ctx.ID().getText() + " is already defined");
            this.numErrors++;
        }
        if (ctx.AFFECT() != null)
            ((VariableSymbol) this.currentScope.getSymbols().get(ctx.ID().getText())).assign();
    }

    public boolean defineVar(marParser.TypeContext typeCtx, String id) {
        Type type = Type.getType(typeCtx.start.getType());
        VariableSymbol var = new VariableSymbol(id, type);
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