package util;
import java.util.*;

public enum OpCode {
    NUMBER(0),
    STRING(1),
    ADD(2),
    SUB(3),
    MULT(4),
    DIV(5),
    UMINUS(6),
    HALT(7),
    CONCAT(8),
    NIL(9),
    TRUE(10),
    FALSE(11),
    AND(12),
    OR(13),
    NOT(14),
    GT(15),
    LT(16),
    GEQ(17),
    LEQ(18),
    EQ_N(19),
    EQ_B(20),
    EQ_S(21),
    EQ_NIL(22),
    NEQ_N(23),
    NEQ_B(24),
    NEQ_S(25),
    NEQ_NIL(26),
    PRINT_N(27),
    PRINT_B(28),
    PRINT_S(29),
    PRINT_NIL(30);

    private int value;
    private static Map<Integer, OpCode> map = new HashMap<>();

    private OpCode(int value) {
            this.value = value;
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
}
