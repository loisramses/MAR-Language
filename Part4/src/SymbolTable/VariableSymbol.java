package SymbolTable;

public class VariableSymbol extends Symbol {
    private boolean isSet;
    private boolean isFuncArg;
    private int index;

    public VariableSymbol(String id, Type type) {
        super(id, type);
        this.isSet = false;
        this.isFuncArg = false;
        this.index = -1;
    }

    public void assign() {
        this.isSet = true;
    }

    public void setFuncArg() {
        this.isFuncArg = true;
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

    public boolean isFuncArg() {
        return this.isFuncArg;
    }
}