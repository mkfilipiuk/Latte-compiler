package compiler.LLVMAST;

public class FunctionRegister extends Register {

    public String name;

    public FunctionRegister(String type, String name) {
        super(type);
        this.name = name;
    }

    @Override
    public String toString() {
        return "@" + name + "_function";
    }
}
