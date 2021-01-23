package latte.Absyn; // Java Package generated by the BNF Converter.

import compiler.LLVMAST.Value;

public class Class extends Type {
    public final ClassType classtype_;
    public int line_num, col_num, offset;

    public Class(ClassType p1) {
        classtype_ = p1;
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
        if (o instanceof latte.Absyn.Class) {
            latte.Absyn.Class x = (latte.Absyn.Class) o;
            return this.classtype_.equals(x.classtype_);
        }
        return false;
    }

    public int hashCode() {
        return this.classtype_.hashCode();
  }


}
