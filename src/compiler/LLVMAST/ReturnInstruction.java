package compiler.LLVMAST;

public class ReturnInstruction implements Instruction {
    public String type;
    public Value result;

    public ReturnInstruction() {
        LLVMContext.registerCounter++;
    }

    public ReturnInstruction(String type, Value result) {
        this();
        this.type = type;
        this.result = result;
    }

    @Override
    public String toString() {
        if (result == null) {
            return "\tret void\n";
        }
        return "\tret " + type + " " + result + "\n";
    }
}
