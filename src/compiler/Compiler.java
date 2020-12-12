package compiler.frontend;

import latte.*;
import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.*;
import java.util.*;

import static compiler.frontend.SemanticAnalysis.analyse;

class LatteError extends RuntimeException
{
    int line;
    int column;
    public LatteError(String msg, int l, int c)
    {
        super(msg);
        line = l;
        column = c;
    }
}

class BNFCErrorListener implements ANTLRErrorListener
{
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object o, int i, int i1, String s, RecognitionException e)
    {
        throw new LatteError(s,i,i1);
    }
    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet)
    {
        throw new LatteError("Ambiguity at",i,i1);
    }
    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet)
    {
    }
    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet)
    {
    }
}

public class Compiler
{
    latteLexer l;
    latteParser p;

    public Compiler(String[] args)
    {
        try
        {
            Reader input;
            if (args.length == 0) input = new InputStreamReader(System.in);
            else input = new FileReader(args[0]);
            l = new latteLexer(new ANTLRInputStream(input));
            l.addErrorListener(new BNFCErrorListener());
        }
        catch(IOException e)
        {
            System.err.println("Error: File not found: " + args[0]);
            System.exit(1);
        }
        p = new latteParser(new CommonTokenStream(l));
        p.addErrorListener(new BNFCErrorListener());
    }

    public latte.Absyn.Prog parse() throws Exception
    {
        /* The default parser is the first-defined entry point. */
        latteParser.Start_ProgContext pc = p.start_Prog();
        latte.Absyn.Prog ast = pc.result;
        System.out.println();
        System.out.println("Parse Succesful!");
        System.out.println();
        System.out.println("[Abstract Syntax]");
        System.out.println();
        System.out.println(PrettyPrinter.show(ast));
        System.out.println();
        System.out.println("[Linearized Tree]");
        System.out.println();
        System.out.println(PrettyPrinter.print(ast));
        return ast;
    }

    public static void main(String args[]) throws Exception
    {
        latte.Test t = new latte.Test(args);
        try
        {
            var AST = t.parse();
            analyse(AST);
        }
        catch(LatteError e)
        {
            System.err.println("At line " + e.line + ", column " + e.column + " :");
            System.err.println("     " + e.getMessage());
            System.exit(1);
        }
    }
}
