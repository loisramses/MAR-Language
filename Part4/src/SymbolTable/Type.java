package SymbolTable;

import mar.marParser;

public enum Type {
    tNUMBER("number"),
    tSTRING("string"),
    tBOOL("bool"),
    tNIL("nil"),
    tINT("int");

    private String stringValue;
    
    private Type(String text) {
        this.stringValue = text;
    }

    public String getText() {
        return this.stringValue;
    }

    public static Type getType(int type) {
        switch (type) {
            case marParser.T_NUMBER:
                return Type.tNUMBER;
            case marParser.T_STRING:
                return Type.tSTRING;
            case marParser.T_BOOL:
                return Type.tBOOL;
            case marParser.T_NIL:
                return Type.tNIL;
        }
        return null;
    }
}