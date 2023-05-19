package util;

import SymbolTable.Type;

public class Const {
    private Type TYPE;
    private Object VALUE;

    public Const(Type type, Object value) {
        this.TYPE = type;
        this.VALUE = value;
    }

    public String toString() {
        if (this.VALUE == null)
            return "<NIL>";
        return "<" + this.TYPE.getText().toUpperCase() + ":" + this.VALUE + ">";
    }

    public boolean isString() {
        return this.TYPE == Type.tSTRING;
    }

    public boolean isNumber() {
        return this.TYPE == Type.tNUMBER;
    }

    public boolean isBool() {
        return this.TYPE == Type.tBOOL;
    }

    public boolean isNil() {
        return this.TYPE == Type.tNIL;
    }

    public void setType(Type type) {
        this.TYPE = type;
    }

    public void setValue(Object obj) {
        this.VALUE = obj;
    }

    public Type getType() {
        return this.TYPE;
    }

    public Object getValue() {
        return this.VALUE;
    }
}