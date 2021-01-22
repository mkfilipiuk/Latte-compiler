package latte.Absyn; // Java Package generated by the BNF Converter.

import compiler.LLVMAST.Register;
import compiler.LLVMAST.SimpleInstruction;

public class Void extends PrimitiveType {
    public int line_num, col_num, offset;

    public Void() {
    }

    public <R, A> R accept(latte.Absyn.PrimitiveType.Visitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public String toLLVM() {
        return "void";
    }

    @Override
    public SimpleInstruction getDefaultLLVMValue(Register register) {
        return null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        return o instanceof Void;
    }

    public int hashCode() {
        return 37;
    }

    @Override
    public String toString() {
        return "Void";
    }
}
