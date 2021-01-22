package compiler.LLVMAST;

import java.util.List;

public class FunctionBlock extends SimpleBlock {
    public String functionType;
    public List<String> listOfArgumentTypes;
    public List<Register> listOfArguments;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        var name = this.labelName.equals("main") ? "main" : this.labelName + "_function";

        sb.append("define " + functionType + " @" + name + " (" + String.join(",", listOfArgumentTypes) + ") {\n");
        for (var i : this) {
            sb.append(i.toString());
        }

        if (functionType.equals("void")) {
            sb.append("\tret void\n");
        } else {
            sb.append("\tunreachable\n");
        }

        sb.append("}\n");
        return sb.toString();
    }

}
