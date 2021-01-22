package compiler.LLVMAST;

public class IntValue implements Value {

    public int value;

    public IntValue(int value) {
        this.value = value;
    }

    @Override
    public String getType() {
        return "i32";
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
