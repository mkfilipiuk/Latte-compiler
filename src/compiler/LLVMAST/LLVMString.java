package compiler.LLVMAST;

import java.util.Objects;

public class LLVMString extends SimpleInstruction implements Value {

    public String string;

    public LLVMString(String string) {
        super(null, null, null);
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LLVMString that = (LLVMString) o;
        return Objects.equals(string, that.string);
    }

    @Override
    public int hashCode() {
        return Objects.hash(string);
    }

    @Override
    public String toString() {
        LLVMContext.addString(string);
        return "\t" + lhs + String.format(" = getelementptr [%d x i8], [%d x i8]* @%s, i32 0, i32 0", string.length() + 1, string.length() + 1, LLVMContext.stringsToBeDeclared.get(string)) + "\n";
    }

    @Override
    public String getType() {
        return "i8*";
    }
}
