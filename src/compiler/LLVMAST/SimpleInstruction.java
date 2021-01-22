package compiler.LLVMAST;


public class SimpleInstruction implements Instruction {
    public Register lhs;
    public String op, type;
    public Value arg1, arg2;

    public String rhs;

    public SimpleInstruction(Register lhs, String rhs, String type) {
        this.lhs = lhs;
        this.rhs = rhs;
        this.type = type;
    }

    public SimpleInstruction(Register lhs, String op, Value arg1, Value arg2, String type) {
        this.lhs = lhs;
        this.op = op;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.type = type;
    }

    @Override
    public String toString() {
        if (rhs != null) {
            return '\t' + lhs.toString() + " = " + rhs;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('\t');
        if (lhs != null) {
            sb.append(lhs + " = ");
        }
        if (op != null) {
            sb.append(op);
        }
        if (arg1 != null) {
            sb.append(" " + arg1);
        }
        if (arg2 != null) {
            sb.append(", " + arg2);
        }
        sb.append("\n");
        return sb.toString();
    }
}
