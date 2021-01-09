package compiler.LLVMAST;


public class SimpleInstruction implements Instruction {
    public String lhs, rhs;
    public String type;

    public SimpleInstruction(String lhs, String rhs, String type) {
        this.lhs = lhs;
        this.rhs = rhs;
        this.type = type;
    }

    @Override
    public String toString() {
        if (lhs != null) {
            return "\t" + lhs + " = " + rhs + "\n";
        } else {
            return "\t" + rhs + "\n";
        }
    }
}
