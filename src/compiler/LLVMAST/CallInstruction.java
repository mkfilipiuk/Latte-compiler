package compiler.LLVMAST;

import java.util.List;
import java.util.stream.Collectors;

public class CallInstruction implements Instruction {
    public Register resultLHSRegister;
    public String functionName;
    public String functionType;
    public List<Value> listOfArguments;

    public CallInstruction(Register resultLHSRegister, String functionName, String functionType, List<Value> listOfArguments) {
        this.resultLHSRegister = resultLHSRegister;
        this.functionName = functionName;
        this.functionType = functionType;
        this.listOfArguments = listOfArguments;

        LLVMContext.usedFunctions.add(functionName);
    }

    @Override
    public String toString() {
        var call = "call " + functionType + " @" + functionName + " ( " + String.join(" , ", listOfArguments.stream().map(x -> x.getType() + " " + x.toString()).collect(Collectors.toList())) + " )\n";
        if (resultLHSRegister != null) {
            return "\t" + resultLHSRegister.toString() + " = " + call;
        }
        return "\t" + call;
    }
}
