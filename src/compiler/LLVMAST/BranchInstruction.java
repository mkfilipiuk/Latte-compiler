package compiler.LLVMAST;

public class BranchInstruction implements Instruction {

    public String label, label2;
    public Value cond;

    public BranchInstruction(String label) {
        this.label = label;
    }

    public BranchInstruction(Value cond, String label1, String label2) {
        this.cond = cond;
        this.label = label1;
        this.label2 = label2;
    }

    @Override
    public String toString() {
        if (label2 == null) {
            return "\tbr label %" + label + "\n";
        } else {
            return "\tbr i1 " + cond.toString() + ", label %" + label + ", label %" + label2 + "\n";
        }
    }
}
