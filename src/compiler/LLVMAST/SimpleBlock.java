package compiler.LLVMAST;

import java.util.ArrayList;

public class SimpleBlock extends ArrayList<Instruction> implements Instruction {

    public String labelName;
    public String name;
    public Instruction terminalCommand;

    public SimpleBlock() {
        super();
    }

    public SimpleBlock(String name) {
        this();
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (name != null) {
            sb.append(name + ":\n");
        }

        for (var i : this) {
            sb.append(i.toString());
        }

        return sb.toString();
    }
}
