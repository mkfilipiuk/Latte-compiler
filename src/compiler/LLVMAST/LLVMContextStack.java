package compiler.LLVMAST;

import java.util.ArrayList;

public class LLVMContextStack {
    public ArrayList<LLVMContextStackElement> stack;

    public LLVMContextStack() {
        stack = new ArrayList<LLVMContextStackElement>();
        stack.add(new LLVMContextStackElement());
    }

    public LLVMContextStack clone() {
        var newStack = new LLVMContextStack();
        newStack.stack = new ArrayList<>();
        for (var e : stack) {
            newStack.stack.add(e.clone());
        }
        return newStack;
    }
}
