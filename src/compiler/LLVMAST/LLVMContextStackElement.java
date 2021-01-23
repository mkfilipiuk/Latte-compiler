package compiler.LLVMAST;

import java.util.HashMap;

public class LLVMContextStackElement {
    public HashMap<String, Value> variableToRegister = new HashMap<>();
    public HashMap<String, String> variableToType = new HashMap<>();

    public LLVMContextStackElement clone() {
        var newElement = new LLVMContextStackElement();
        newElement.variableToRegister = (HashMap<String, Value>) variableToRegister.clone();
        newElement.variableToType = (HashMap<String, String>) variableToType.clone();
        return newElement;
    }
}
