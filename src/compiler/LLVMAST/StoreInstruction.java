package compiler.LLVMAST;

public class StoreInstruction implements Instruction {
    public Value value;
    public String type;
    public Register destination;

    public StoreInstruction(Value value, String type, Register destination) {
        this.value = value;
        this.type = type;
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "\tstore " + type + " " + value.toString() + ", " + type + "* " + destination.toString() + "\n";
    }
}
