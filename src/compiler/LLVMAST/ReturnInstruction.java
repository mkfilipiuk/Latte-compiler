package compiler.LLVMAST;

public class ReturnInstruction implements Instruction {
    public String type;
    public Value result;

    public ReturnInstruction() {
    }

    public ReturnInstruction(String type, Value result) {
        this.type = type;
        this.result = result;
    }

    @Override
    public String toString() {
        if (result == null) {
            return "ret void";
        }
        return "\tret " + type + " " + result + "\n";
    }
}
