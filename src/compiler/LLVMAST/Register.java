package compiler.LLVMAST;

import latte.Absyn.Type;

public class Register implements Value {
    public Integer registerNumber;
    public Type type;

    public Register(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        if (registerNumber == null) {
            registerNumber = LLVMContext.getNewVariable();
        }
        return "%" + registerNumber;
    }

    @Override
    public Type getType() {
        return type;
    }
}
