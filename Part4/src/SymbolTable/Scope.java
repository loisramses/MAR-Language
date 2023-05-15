package SymbolTable;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    private Scope enclosingScope;
    private Map<String, Symbol> symbols = new LinkedHashMap<String, Symbol>();
    private int numVars;

    public Scope(Scope enclosingScope) {
        this.enclosingScope = enclosingScope;
        this.numVars = 0;
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
        if (sym instanceof VariableSymbol)
            this.numVars++;
        sym.setScope(this);
        this.symbols.put(sym.getId(), sym);
    }

    public void mapVars(int start) {
        int index = start;
        Symbol temp;
        for (Map.Entry<String, Symbol> entry : this.symbols.entrySet()) {
            temp = entry.getValue();
            if (temp instanceof VariableSymbol && !((VariableSymbol) temp).isFuncArg())
                ((VariableSymbol) temp).setIndex(index++);
        }
    }

    public Map<String, Symbol> getSymbols() {
        return this.symbols;
    }

    public Scope getEnclosingScope() {
        return this.enclosingScope;
    }

    public int getNVars() {
        return this.numVars;
    }

    public boolean isGlobal() {
        return this.enclosingScope == null;
    }
}
