package SymbolTable;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    Scope enclosingScope;
    Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();

    public Scope(Scope enclosingScope) {
        this.enclosingScope = enclosingScope;
    }

    public boolean contains(String name) {
        return this.resolveLocal(name) != null;
    }

    public Symbol resolveLocal(String name) {
        return this.symbols.get(name);
    }

    public Symbol resolve(String name) {
        Symbol s = this.resolveLocal(name);
        if (s != null)
            return s;
        if (this.enclosingScope != null)
            return this.enclosingScope.resolve(name);
        return null;
    }

    public void define(Symbol sym) {
        sym.setScope(this);
        this.symbols.put(sym.getId(), sym);
    }

    public Map<String, Symbol> getSymbols() {
        return this.symbols;
    }

    public Scope getEnclosingScope() {
        return this.enclosingScope;
    }
}
