package SymbolTable;

public class Symbol {
    private String id;
    private Type type;
    private Scope scope;
    private boolean isSet;
    private int index;

    public Symbol(String id) {
        this.id = id;
        this.isSet = false;
        this.index = -1;
    }

    public Symbol(String id, Type type) {
        this(id);
        this.type = type;
    }

    public void assign() {
        this.isSet = true;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public String getId() {
        return this.id;
    }

    public Type getType() {
        return this.type;
    }

    public Scope getScope() {
        return this.scope;
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

    /*
     * public String toString() {
     * if (this.type != Type.tNIL)
     * return '<' + lexeme() + ":" + type + '>';
     * return lexeme();
     * }
     */
}
