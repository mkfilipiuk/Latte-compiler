package latte.Absyn; // Java Package generated by the BNF Converter.

public class Fun extends Type {
    public final Type type_;
    public final ListType listtype_;
    public int line_num, col_num, offset;

    public Fun(Type p1, ListType p2) {
        type_ = p1;
        listtype_ = p2;
    }

    public <R, A> R accept(latte.Absyn.Type.Visitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public String toLLVM() {
        return type_.toLLVM();
    }

    @Override
    public String getDefaultLLVMValue() {
        return null;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o instanceof latte.Absyn.Fun) {
            latte.Absyn.Fun x = (latte.Absyn.Fun) o;
            return this.type_.equals(x.type_) && this.listtype_.equals(x.listtype_);
        }
        return false;
    }

    public int hashCode() {
        return 37 * (this.type_.hashCode()) + this.listtype_.hashCode();
  }


}
