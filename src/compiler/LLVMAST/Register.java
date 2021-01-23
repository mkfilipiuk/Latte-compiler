package compiler.LLVMAST;

public class Register implements Value {
    public Integer registerNumber;
    public String type;

    public Register(String type) {
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
    public String getType() {
        return type;
    }
}
