package util;
import java.util.*;

public enum OpCode {
    NUMBER(0, "number"),
    STRING(1, "string"),
    ADD(2, "add"),
    SUB(3, "sub"),
    MULT(4, "mult"),
    DIV(5,  "div"),
    UMINUS(6, "uminus"),
    HALT(7, "halt"),
    CONCAT(8, "concat"),
    NIL(9, "nil"),
    TRUE(10, "true"),
    FALSE(11, "false"),
    AND(12, "and"),
    OR(13, "or"),
    NOT(14, "not"),
    GT(15, "gt"),
    LT(16, "lt"),
    GEQ(17, "geq"),
    LEQ(18, "leq"),
    EQ_N(19, "eq_n"),
    EQ_B(20, "eq_b"),
    EQ_S(21, "eq_s"),
    EQ_NIL(22, "eq_nil"),
    NEQ_N(23, "neq_n"),
    NEQ_B(24, "neq_b"),
    NEQ_S(25, "neq_s"),
    NEQ_NIL(26, "neq_nil"),
    PRINT_N(27, "print_n"),
    PRINT_B(28, "print_b"),
    PRINT_S(29, "print_s"),
    PRINT_NIL(30, "print_nil"),
    CONST(31, "const"),
    JUMPF(32, "jumpf"),
    JUMP(33, "jump"),
    GLOBAL(34, "global"),
    STORE(35, "store"),
    LOAD(36, "load");

    private int value;
    private String text;
    private static Map<Integer, OpCode> map = new HashMap<>();

    private OpCode(int value, String text) {
        this.value = value;
        this.text = text;
    }

    static {
        for (OpCode op : OpCode.values()) {
            map.put(op.value, op);
        }
    }

    public static OpCode valueOf(int value) {
        return (OpCode) map.get(value);
    }

    public int getValue() {
        return this.value;
    }

    public String getText() {
        return this.text;
    }
}