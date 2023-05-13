package SymbolTable;

public class VariableSymbol extends Symbol {
    private boolean isSet;
    private int index;

    public VariableSymbol(String id, Type type) {
        super(id, type);
        this.isSet = false;
        this.index = -1;
    }

    public void assign() {
        this.isSet = true;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isSet() {
        return this.isSet;
    }
}