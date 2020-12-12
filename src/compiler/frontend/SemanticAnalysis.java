package compiler.frontend;

public class SemanticAnalysis {
    public static void analyse(latte.Absyn.Prog AST){
        CheckVariables.checkVariables(AST);
        //CheckReturns.checkReturns(AST);
    }
}
