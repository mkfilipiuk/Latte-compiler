package latte.Absyn; // Java Package generated by the BNF Converter.

public class GE extends RelOp {
    public int line_num, col_num, offset;

    public GE() {
    }

    public <R, A> R accept(latte.Absyn.RelOp.Visitor<R, A> v, A arg) {
        return v.visit(this, arg);
    }

    @Override
    public String toLLVMOperator() {
        return "sge";
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        return o instanceof GE;
    }

    public int hashCode() {
        return 37;
    }


}
