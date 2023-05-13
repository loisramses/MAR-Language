package SymbolTable;

public class Symbol {
    private String id;
    private Type type;
    private Scope scope;

    public Symbol(String id) {
        this.id = id;
    }

    public Symbol(String id, Type type) {
        this(id);
        this.type = type;
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
}
