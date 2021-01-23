package latte.Absyn; // Java Package generated by the BNF Converter.

import compiler.LLVMAST.Value;

public class ArrayT extends Type {
    public final Type type_;
    public int line_num, col_num, offset;

    public ArrayT(Type p1) {
        type_ = p1;
    }

    public <R, A> R accept(latte.Absyn.Type.Visitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public String toLLVM() {
        return null;
    }

    @Override
    public Value getDefaultLLVMValue() {
        return null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o instanceof latte.Absyn.ArrayT) {
            latte.Absyn.ArrayT x = (latte.Absyn.ArrayT) o;
            return this.type_.equals(x.type_);
        }
        return false;
    }

    public int hashCode() {
        return this.type_.hashCode();
  }


}
