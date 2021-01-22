package compiler.LLVMAST;

import latte.Absyn.Type;

public class FunctionRegister extends Register {

    public String name;

    public FunctionRegister(Type type, String name) {
        super(type);
        this.name = name;
    }

    @Override
    public String toString() {
        return "@" + name + "_function";
    }
}
