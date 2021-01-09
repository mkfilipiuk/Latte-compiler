package latte.Absyn; // Java Package generated by the BNF Converter.

public class LE extends RelOp {
    public int line_num, col_num, offset;

    public LE() {
    }

    public <R, A> R accept(latte.Absyn.RelOp.Visitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public String toLLVMOperator() {
        return "sle";
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        return o instanceof LE;
    }

    public int hashCode() {
        return 37;
    }


}
