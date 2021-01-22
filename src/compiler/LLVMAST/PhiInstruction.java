package compiler.LLVMAST;

public class PhiInstruction implements Instruction {

    public Register register;
    public String type;
    public Value value1, value2;
    public String label1, label2;

    public PhiInstruction(Register register, String type, Value value1, String label1, Value value2, String label2) {
        this.register = register;
        this.type = type;
        this.value1 = value1;
        this.label1 = label1;
        this.value2 = value2;
        this.label2 = label2;
    }

    @Override
    public String toString() {
        return "\t" + register.toString() + " = " + "phi " + type + "[ " + value1 + ", %" + label1 + " ], [ " + value2 + ", %" + label2 + " ]\n";
    }
}
