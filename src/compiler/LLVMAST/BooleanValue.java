package compiler.LLVMAST;

public class BooleanValue implements Value {
    public boolean b;

    public BooleanValue(boolean b) {
        this.b = b;
    }

    @Override
    public String getType() {
        return "i1";
    }
}
