package compiler.LLVMAST;

import java.util.ArrayList;

public class SimpleBlock extends ArrayList<Instruction> implements Instruction {

    public String labelName;
    public Instruction terminalCommand;
    public SimpleBlock next1, next2;
    public ArrayList<SimpleBlock> previous;

    public SimpleBlock() {
        super();
        previous = new ArrayList<>();
    }

    public SimpleBlock(String labelName) {
        this();
        this.labelName = labelName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (labelName != null) {
            sb.append(labelName + ":\n");
        }

        for (var i : this) {
            sb.append(i.toString());
        }

        return sb.toString();
    }
}
