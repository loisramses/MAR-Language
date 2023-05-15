package SymbolTable;

import java.util.ArrayList;

public class FunctionSymbol extends Symbol {
    private ArrayList<Symbol> arguments;
    private int pos;

    public FunctionSymbol(String id, Type type) {
        super(id, type);
        this.arguments = new ArrayList<>();
        this.pos = -1;
    }

    public ArrayList<Symbol> getArguments() {
        return this.arguments;
    }

    public void mapArguments() {
        int i = 0;
        for (Symbol symbol : arguments) {
            ((VariableSymbol) symbol).setIndex(i++ - this.arguments.size());
        }
    }

    public void addArgument(Symbol symbol) {
        this.arguments.add(symbol);
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getPos() {
        return this.pos;
    }
}