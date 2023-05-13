package SymbolTable;

import java.util.ArrayList;

public class FunctionSymbol extends Symbol {
    ArrayList<Symbol> arguments;

    public FunctionSymbol(String id, Type type) {
        super(id, type);
        this.arguments = new ArrayList<>();
    }

    public ArrayList<Symbol> getArguments() {
        return this.arguments;
    }

    public void addArgument(Symbol symbol) {
        this.arguments.add(symbol);
    }
}