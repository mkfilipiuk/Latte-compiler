JAVAC=javac
JAVAC_FLAGS=-sourcepath . -cp "./../lib/antlr-4.8-complete.jar"
JAVA=java
JAVA_FLAGS=
PARSER=${JAVA} ${JAVA_FLAGS} org.antlr.v4.Tool
PARSER_FLAGS=-lib instant -package latte
LEXER=${JAVA} ${JAVA_FLAGS} org.antlr.v4.Tool
LEXER_FLAGS=-lib instant -package latte
all : test

test : absyn latte/latteLexer.class latte/PrettyPrinter.class latte/Test.class latte/VisitSkel.class latte/ComposVisitor.class latte/AbstractVisitor.class latte/FoldVisitor.class latte/AllVisitor.class latte/latteParser.class latte/Test.class

.PHONY : absyn

%.class : %.java
	${JAVAC} ${JAVAC_FLAGS} $^

absyn : latte/Absyn/Prog.java latte/Absyn/Program.java latte/Absyn/TopDef.java latte/Absyn/FnDef.java latte/Absyn/ListTopDef.java latte/Absyn/Arg.java latte/Absyn/Argument.java latte/Absyn/ListArg.java latte/Absyn/Block.java latte/Absyn/BlockOfStatements.java latte/Absyn/ListStmt.java latte/Absyn/Stmt.java latte/Absyn/Empty.java latte/Absyn/BStmt.java latte/Absyn/Decl.java latte/Absyn/Ass.java latte/Absyn/Incr.java latte/Absyn/Decr.java latte/Absyn/Ret.java latte/Absyn/VRet.java latte/Absyn/Cond.java latte/Absyn/CondElse.java latte/Absyn/While.java latte/Absyn/SExp.java latte/Absyn/Item.java latte/Absyn/NoInit.java latte/Absyn/Init.java latte/Absyn/ListItem.java latte/Absyn/Type.java latte/Absyn/Int.java latte/Absyn/Str.java latte/Absyn/Bool.java latte/Absyn/Void.java latte/Absyn/Fun.java latte/Absyn/ListType.java latte/Absyn/Expr.java latte/Absyn/EVar.java latte/Absyn/ELitInt.java latte/Absyn/ELitTrue.java latte/Absyn/ELitFalse.java latte/Absyn/EApp.java latte/Absyn/EString.java latte/Absyn/Neg.java latte/Absyn/Not.java latte/Absyn/EMul.java latte/Absyn/EAdd.java latte/Absyn/ERel.java latte/Absyn/EAnd.java latte/Absyn/EOr.java latte/Absyn/ListExpr.java latte/Absyn/AddOp.java latte/Absyn/Plus.java latte/Absyn/Minus.java latte/Absyn/MulOp.java latte/Absyn/Times.java latte/Absyn/Div.java latte/Absyn/Mod.java latte/Absyn/RelOp.java latte/Absyn/LTH.java latte/Absyn/LE.java latte/Absyn/GTH.java latte/Absyn/GE.java latte/Absyn/EQU.java latte/Absyn/NE.java
	${JAVAC} ${JAVAC_FLAGS} $^

latte/latteLexer.java : latte/latteLexer.g4
	${LEXER} ${LEXER_FLAGS} latte/latteLexer.g4

latte/latteParser.java : latte/latteParser.g4
	${PARSER} ${PARSER_FLAGS} latte/latteParser.g4

latte/latteLexer.class : latte/latteLexer.java latte/latteParser.java

latte/latteParser.class : latte/latteParser.java

latte/PrettyPrinter.class : latte/PrettyPrinter.java

clean :
	rm -f latte/Absyn/*.class latte/*.class

distclean : vclean

vclean :
	 rm -f latte/Absyn/Prog.java latte/Absyn/Program.java latte/Absyn/TopDef.java latte/Absyn/FnDef.java latte/Absyn/ListTopDef.java latte/Absyn/Arg.java latte/Absyn/Argument.java latte/Absyn/ListArg.java latte/Absyn/Block.java latte/Absyn/BlockOfStatements.java latte/Absyn/ListStmt.java latte/Absyn/Stmt.java latte/Absyn/Empty.java latte/Absyn/BStmt.java latte/Absyn/Decl.java latte/Absyn/Ass.java latte/Absyn/Incr.java latte/Absyn/Decr.java latte/Absyn/Ret.java latte/Absyn/VRet.java latte/Absyn/Cond.java latte/Absyn/CondElse.java latte/Absyn/While.java latte/Absyn/SExp.java latte/Absyn/Item.java latte/Absyn/NoInit.java latte/Absyn/Init.java latte/Absyn/ListItem.java latte/Absyn/Type.java latte/Absyn/Int.java latte/Absyn/Str.java latte/Absyn/Bool.java latte/Absyn/Void.java latte/Absyn/Fun.java latte/Absyn/ListType.java latte/Absyn/Expr.java latte/Absyn/EVar.java latte/Absyn/ELitInt.java latte/Absyn/ELitTrue.java latte/Absyn/ELitFalse.java latte/Absyn/EApp.java latte/Absyn/EString.java latte/Absyn/Neg.java latte/Absyn/Not.java latte/Absyn/EMul.java latte/Absyn/EAdd.java latte/Absyn/ERel.java latte/Absyn/EAnd.java latte/Absyn/EOr.java latte/Absyn/ListExpr.java latte/Absyn/AddOp.java latte/Absyn/Plus.java latte/Absyn/Minus.java latte/Absyn/MulOp.java latte/Absyn/Times.java latte/Absyn/Div.java latte/Absyn/Mod.java latte/Absyn/RelOp.java latte/Absyn/LTH.java latte/Absyn/LE.java latte/Absyn/GTH.java latte/Absyn/GE.java latte/Absyn/EQU.java latte/Absyn/NE.java latte/Absyn/Prog.class latte/Absyn/Program.class latte/Absyn/TopDef.class latte/Absyn/FnDef.class latte/Absyn/ListTopDef.class latte/Absyn/Arg.class latte/Absyn/Argument.class latte/Absyn/ListArg.class latte/Absyn/Block.class latte/Absyn/BlockOfStatements.class latte/Absyn/ListStmt.class latte/Absyn/Stmt.class latte/Absyn/Empty.class latte/Absyn/BStmt.class latte/Absyn/Decl.class latte/Absyn/Ass.class latte/Absyn/Incr.class latte/Absyn/Decr.class latte/Absyn/Ret.class latte/Absyn/VRet.class latte/Absyn/Cond.class latte/Absyn/CondElse.class latte/Absyn/While.class latte/Absyn/SExp.class latte/Absyn/Item.class latte/Absyn/NoInit.class latte/Absyn/Init.class latte/Absyn/ListItem.class latte/Absyn/Type.class latte/Absyn/Int.class latte/Absyn/Str.class latte/Absyn/Bool.class latte/Absyn/Void.class latte/Absyn/Fun.class latte/Absyn/ListType.class latte/Absyn/Expr.class latte/Absyn/EVar.class latte/Absyn/ELitInt.class latte/Absyn/ELitTrue.class latte/Absyn/ELitFalse.class latte/Absyn/EApp.class latte/Absyn/EString.class latte/Absyn/Neg.class latte/Absyn/Not.class latte/Absyn/EMul.class latte/Absyn/EAdd.class latte/Absyn/ERel.class latte/Absyn/EAnd.class latte/Absyn/EOr.class latte/Absyn/ListExpr.class latte/Absyn/AddOp.class latte/Absyn/Plus.class latte/Absyn/Minus.class latte/Absyn/MulOp.class latte/Absyn/Times.class latte/Absyn/Div.class latte/Absyn/Mod.class latte/Absyn/RelOp.class latte/Absyn/LTH.class latte/Absyn/LE.class latte/Absyn/GTH.class latte/Absyn/GE.class latte/Absyn/EQU.class latte/Absyn/NE.class
	 rm -f latte/Absyn/*.class
	 rmdir latte/Absyn/
	 rm -f latte/latteLexer.g4 latte/latteParser.g4 latte/latteLexer.java latte/VisitSkel.java latte/ComposVisitor.java latte/AbstractVisitor.java latte/FoldVisitor.java latte/AllVisitor.java latte/PrettyPrinter.java latte/Skeleton.java latte/Test.java latte/latteParser.java latte/*.class latte/latteLexer.tokens latte/latteLexerBaseListener.java latte/latteLexerListener.java latte/latteParser.tokens latte/latteParserBaseListener.java latte/latteParserListener.java
	 rm -f Makefile
	 rmdir -p latte/
