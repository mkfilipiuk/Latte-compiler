package compiler.frontend;

import compiler.LatteError;
import latte.Absyn.*;
import org.antlr.v4.runtime.misc.Pair;

import java.lang.Void;

public class CheckVariables {

    private static final Expr.Visitor<Type, VariableContext> exprVisitor = new Expr.Visitor<Type, VariableContext>() {
        @Override
        public Type visit(ENewArray p, VariableContext arg) {
            var lengthType = p.expr_.accept(exprVisitor, arg);
            if (!lengthType.equals(new Primitive(new Int()))) {
                throw new LatteError(String.format("The new array length must be an integer"), p.line_num, p.col_num);
            }
            return new ArrayT(p.type_);
        }

        @Override
        public Type visit(ENewObject p, VariableContext arg) {
            //TODO
            return null;
        }

        @Override
        public Type visit(EVar p, VariableContext arg) {
            var varName = getName(p.identp_);
            if (arg.get(varName) == null) {
                throw new LatteError(String.format("The variable %s doesn't exists", varName), p.line_num, p.col_num);
            }
            return arg.get(varName);
        }

        @Override
        public Type visit(EArrayElem p, VariableContext arg) {
            var varName = getName(p.identp_);
            if (arg.get(varName) == null) {
                throw new LatteError(String.format("The variable %s doesn't exists", varName), p.line_num, p.col_num);
            }
            if (!(arg.get(varName) instanceof ArrayT)) {
                throw new LatteError(String.format("The variable %s is not an array", varName), p.line_num, p.col_num);
            }
            p.expr_.accept(exprVisitor, arg);

            return ((ArrayT) arg.get(varName)).type_;
        }

        @Override
        public Type visit(ELitInt p, VariableContext arg) {
            return new Primitive(new Int());
        }

        @Override
        public Type visit(ELitTrue p, VariableContext arg) {
            return new Primitive(new Bool());
        }

        @Override
        public Type visit(ELitFalse p, VariableContext arg) {
            return new Primitive(new Bool());
        }

        @Override
        public Type visit(EAttr p, VariableContext arg) {
            //TODO
            return null;
        }

        @Override
        public Type visit(EMethod p, VariableContext arg) {
            //TODO
            return null;
        }

        @Override
        public Type visit(EApp p, VariableContext arg) {
            var varName = getName(p.identp_);
            if (arg.get(varName) == null) {
                throw new LatteError(String.format("The Function %s doesn't exists", varName), p.line_num, p.col_num);
            }
            if (!(arg.get(varName) instanceof Fun)) {
                throw new LatteError(String.format("The variable %s is not a function", varName), p.line_num, p.col_num);
            }
            var fun = ((Fun) arg.get(varName));

            int i = 0;

            if (p.listexpr_.size() != fun.listtype_.size()) {
                throw new LatteError(String.format("The function %s got an incorrect number of arguments.\nExpected %d, got %d", varName, fun.listtype_.size(), p.listexpr_.size()), p.line_num, p.col_num);
            }

            var argsIterator = p.listexpr_.iterator();
            var typesIterator = fun.listtype_.iterator();
            while (argsIterator.hasNext()) {
                var argType = argsIterator.next().accept(exprVisitor, arg);
                var expectedType = typesIterator.next();
                if (!argType.equals(expectedType)) {
                    throw new LatteError(String.format("The function %s got an argument of a wrong type.\nExpected %s, got %s", varName, expectedType.toString(), argType.toString()), p.line_num, p.col_num);
                }
            }
            return fun.type_;
        }

        @Override
        public Type visit(ECast p, VariableContext arg) {
            p.expr_.accept(exprVisitor, arg);
            //TODO Check casting
            return p.type_;
        }

        @Override
        public Type visit(EString p, VariableContext arg) {
            return new Primitive(new Str());
        }

        @Override
        public Type visit(Neg p, VariableContext arg) {
            var type = p.expr_.accept(exprVisitor, arg);
            if (!type.equals(new Primitive(new Int()))) {
                throw new LatteError(String.format("Cannot get negative of type %s.\nThe argument needs to be an integer", type.toString()), p.line_num, p.col_num);
            }
            return type;
        }

        @Override
        public Type visit(Not p, VariableContext arg) {
            var type = p.expr_.accept(exprVisitor, arg);
            if (!type.equals(new Primitive(new Bool()))) {
                throw new LatteError(String.format("Cannot get negation of type %s.\nThe argument needs to be a Boolean value.", type.toString()), p.line_num, p.col_num);
            }
            return type;
        }

        @Override
        public Type visit(EMul p, VariableContext arg) {
            var type1 = p.expr_1.accept(exprVisitor, arg);
            var type2 = p.expr_2.accept(exprVisitor, arg);
            if (!type1.equals(new Primitive(new Int()))) {
                throw new LatteError(String.format("Both expressions needs to be ints to be multiplied.\nThe first argument is %s", type1.toString()), p.line_num, p.col_num);
            }
            if (!type2.equals(new Primitive(new Int()))) {
                throw new LatteError(String.format("Both expressions needs to be ints to be multiplied.\nThe second argument is %s", type2.toString()), p.line_num, p.col_num);
            }
            return new Primitive(new Int());
        }

        @Override
        public Type visit(EAdd p, VariableContext arg) {
            var type1 = p.expr_1.accept(exprVisitor, arg);
            var type2 = p.expr_2.accept(exprVisitor, arg);
            if (!type1.equals(new Primitive(new Int())) && !type1.equals(new Primitive(new Str()))) {
                throw new LatteError(String.format("Both expressions needs to be ints or strings to be added.\nThe first argument is %s", type1.toString()), p.line_num, p.col_num);
            }
            if (!type2.equals(new Primitive(new Int())) && !type2.equals(new Primitive(new Str()))) {
                throw new LatteError(String.format("Both expressions needs to be ints or strings to be added.\nThe second argument is %s", type2.toString()), p.line_num, p.col_num);
            }
            if (!type2.equals(type1)) {
                throw new LatteError(String.format("Both expressions needs to be of the same type to be added.\nGot %s and %s", type1.toString(), type2.toString()), p.line_num, p.col_num);
            }
            return type1;
        }

        @Override
        public Type visit(ERel p, VariableContext arg) {
            var type1 = p.expr_1.accept(exprVisitor, arg);
            var type2 = p.expr_2.accept(exprVisitor, arg);
            if (!type1.equals(new Primitive(new Int())) && !type1.equals(new Primitive(new Bool()))) {
                throw new LatteError(String.format("Both expressions needs to be ints or Booleans to be compared.\nThe first argument is %s", type1.toString()), p.line_num, p.col_num);
            }
            if (!type2.equals(new Primitive(new Int())) && !type1.equals(new Primitive(new Bool()))) {
                throw new LatteError(String.format("Both expressions needs to be ints or Booleans to be compared.\nThe second argument is %s", type2.toString()), p.line_num, p.col_num);
            }
            if (!type2.equals(type1)) {
                throw new LatteError(String.format("Both expressions needs to be of the same type to be compared.\nThe first is %s and the second is %s", type1.toString(), type2.toString()), p.line_num, p.col_num);
            }
            return new Primitive(new Bool());
        }

        @Override
        public Type visit(EAnd p, VariableContext arg) {
            var type1 = p.expr_1.accept(exprVisitor, arg);
            var type2 = p.expr_2.accept(exprVisitor, arg);
            if (!type1.equals(new Primitive(new Bool()))) {
                throw new LatteError(String.format("Both expressions needs to be Boolean to apply `and` operator.\nThe first argument is %s", type1.toString()), p.line_num, p.col_num);
            }
            if (!type2.equals(new Primitive(new Bool()))) {
                throw new LatteError(String.format("Both expressions needs to be Boolean to apply `and` operator.\nThe second argument is %s", type2.toString()), p.line_num, p.col_num);
            }
            return new Primitive(new Bool());
        }

        @Override
        public Type visit(EOr p, VariableContext arg) {
            var type1 = p.expr_1.accept(exprVisitor, arg);
            var type2 = p.expr_2.accept(exprVisitor, arg);
            if (!type1.equals(new Primitive(new Bool()))) {
                throw new LatteError(String.format("Both expressions needs to be Boolean to apply `or` operator.\nThe first argument is %s", type1.toString()), p.line_num, p.col_num);
            }
            if (!type2.equals(new Primitive(new Bool()))) {
                throw new LatteError(String.format("Both expressions needs to be Boolean to apply `or` operator.\nThe second argument is %s", type2.toString()), p.line_num, p.col_num);
            }
            return new Primitive(new Bool());
        }
    };
    private static final Block.Visitor<Void, VariableContext> blockVisitor = new Block.Visitor<Void, VariableContext>() {
        @Override
        public Void visit(BlockOfStatements p, VariableContext arg) {
            for (var stmt : p.liststmt_) {
                stmt.accept(stmtVisitor, arg);
            }
            return null;
        }
    };
    private static final Stmt.Visitor<Void, VariableContext> stmtVisitor = new Stmt.Visitor<Void, VariableContext>() {
        @Override
        public Void visit(Empty p, VariableContext arg) {
            return null;
        }

        @Override
        public Void visit(BStmt p, VariableContext arg) {
            arg.pushNewContext();
            p.block_.accept(blockVisitor, arg);
            arg.popContext();
            return null;
        }

        @Override
        public Void visit(Decl p, VariableContext arg) {
            for (var v : p.listitem_) {
                var nameTypePair = v.accept(new Item.Visitor<Pair<String, Type>, VariableContext>() {
                    @Override
                    public Pair<String, Type> visit(NoInit p, VariableContext arg) {
                        return new Pair(getName(p.identp_), null);
                    }

                    @Override
                    public Pair<String, Type> visit(Init p, VariableContext arg) {
                        var type = p.expr_.accept(exprVisitor, arg);
                        return new Pair(getName(p.identp_), type);
                    }
                }, arg);
                if (arg.contains(nameTypePair.a)) {
                    int line = v.accept(new Item.Visitor<Integer, Object>() {
                        @Override
                        public Integer visit(NoInit p, Object arg) {
                            return p.line_num;
                        }

                        @Override
                        public Integer visit(Init p, Object arg) {
                            return p.line_num;
                        }
                    }, null);

                    int column = v.accept(new Item.Visitor<Integer, Object>() {
                        @Override
                        public Integer visit(NoInit p, Object arg) {
                            return p.line_num;
                        }

                        @Override
                        public Integer visit(Init p, Object arg) {
                            return p.col_num;
                        }
                    }, null);
                    throw new LatteError(String.format("The variable %s already exists", nameTypePair.a), line, column);
                }

                if (nameTypePair.b != null && !nameTypePair.b.equals(p.type_)) {
                    int line = v.accept(new Item.Visitor<Integer, Object>() {
                        @Override
                        public Integer visit(NoInit p, Object arg) {
                            return p.line_num;
                        }

                        @Override
                        public Integer visit(Init p, Object arg) {
                            return p.line_num;
                        }
                    }, null);

                    int column = v.accept(new Item.Visitor<Integer, Object>() {
                        @Override
                        public Integer visit(NoInit p, Object arg) {
                            return p.line_num;
                        }

                        @Override
                        public Integer visit(Init p, Object arg) {
                            return p.col_num;
                        }
                    }, null);
                    throw new LatteError(String.format("The declared type %s of variable %s doesn't match the type %s of an assigned expression.", p.type_, nameTypePair.a, p.type_, nameTypePair.b), line, column);
                }
                arg.add(nameTypePair.a, p.type_);
            }

            return null;
        }

        @Override
        public Void visit(Ass p, VariableContext arg) {
            var varName = getName(p.identp_);
            if (arg.get(varName) == null) {
                throw new LatteError(String.format("The variable %s doesn't exists", varName), p.line_num, p.col_num);
            }
            var declType = arg.get(varName);
            var exprType = p.expr_.accept(exprVisitor, arg);
            if (!declType.equals(exprType)) {
                throw new LatteError(String.format("The variable %s was assigned an expression of wrong type.\nExpected %s, got %s", varName, declType, exprType), p.line_num, p.col_num);
            }
            return null;
        }

        @Override
        public Void visit(AssArr p, VariableContext arg) {
            var varName = getName(p.identp_);
            if (arg.get(varName) == null) {
                throw new LatteError(String.format("The variable %s doesn't exists", varName), p.line_num, p.col_num);
            }
            if (!(arg.get(varName) instanceof ArrayT)) {
                throw new LatteError(String.format("The variable %s is not an array", varName), p.line_num, p.col_num);
            }
            return null;
        }

        @Override
        public Void visit(AssAttr p, VariableContext arg) {
            //TODO
            return null;
        }

        @Override
        public Void visit(Incr p, VariableContext arg) {
            var varName = getName(p.identp_);
            var type = arg.get(varName);
            if (type == null) {
                throw new LatteError(String.format("The variable %s doesn't exists", varName), p.line_num, p.col_num);
            }
            if (!type.equals(new Primitive(new Int()))) {
                throw new LatteError(String.format("The variable %s needs to be an integer to be incremented.", varName), p.line_num, p.col_num);
            }
            return null;
        }

        @Override
        public Void visit(Decr p, VariableContext arg) {
            var varName = getName(p.identp_);
            var type = arg.get(varName);
            if (type == null) {
                throw new LatteError(String.format("The variable %s doesn't exists", varName), p.line_num, p.col_num);
            }
            if (!type.equals(new Primitive(new Int()))) {
                throw new LatteError(String.format("The variable %s needs to be an integer to be decremented.", varName), p.line_num, p.col_num);
            }
            return null;
        }

        @Override
        public Void visit(Ret p, VariableContext arg) {
            var functionType = (Fun) arg.get(arg.currentFunction);
            var exprType = p.expr_.accept(exprVisitor, arg);
            if (!functionType.type_.equals(exprType)) {
                throw new LatteError(String.format("Tried to return %s from a function %s which is supposed to return %s", exprType.toString(), arg.currentFunction, functionType.type_.toString()), p.line_num, p.col_num);
            }
            return null;
        }

        @Override
        public Void visit(VRet p, VariableContext arg) {
            var functionType = (Fun) arg.get(arg.currentFunction);
            if (!functionType.type_.equals(new Primitive(new latte.Absyn.Void()))) {
                throw new LatteError(String.format("Tried to return void from a function %s which is supposed to return %s", arg.currentFunction, functionType.type_.toString()), p.line_num, p.col_num);
            }
            return null;
        }

        @Override
        public Void visit(Cond p, VariableContext arg) {
            var condType = p.expr_.accept(exprVisitor, arg);
            if (!condType.equals(new Primitive(new Bool()))) {
                throw new LatteError(String.format("The if condition must have the Boolean type. Got %s", condType.toString()), p.line_num, p.col_num);
            }
            p.stmt_.accept(stmtVisitor, arg);
            return null;
        }

        @Override
        public Void visit(CondElse p, VariableContext arg) {
            var condType = p.expr_.accept(exprVisitor, arg);
            if (!condType.equals(new Primitive(new Bool()))) {
                throw new LatteError(String.format("The if condition must have the Boolean type. Got %s", condType.toString()), p.line_num, p.col_num);
            }
            p.stmt_1.accept(stmtVisitor, arg);
            p.stmt_2.accept(stmtVisitor, arg);
            return null;
        }

        @Override
        public Void visit(While p, VariableContext arg) {
            var condType = p.expr_.accept(exprVisitor, arg);
            if (!condType.equals(new Primitive(new Bool()))) {
                throw new LatteError(String.format("The while condition must have the Boolean type. Got %s", condType.toString()), p.line_num, p.col_num);
            }
            p.stmt_.accept(stmtVisitor, arg);
            return null;
        }

        @Override
        public Void visit(For p, VariableContext arg) {
            //TODO
            return null;
        }

        @Override
        public Void visit(SExp p, VariableContext arg) {
            p.expr_.accept(exprVisitor, arg);
            return null;
        }
    };

    private static String getName(IdentP identP) {
        return identP.accept(new IdentP.Visitor<String, Void>() {
            @Override
            public String visit(IdentPos p, Void arg) {
                return p.ident_;
            }
        }, null);
    }

    private static ListType getListOfTypes(Function f) {
        return f.accept(new Funct.Visitor<ListType, Void>() {
            @Override
            public ListType visit(Function p, Void arg) {
                ListType listType = new ListType();
                for (var argument : p.listarg_) {
                    listType.add(argument.accept(new Arg.Visitor<Type, Void>() {
                        @Override
                        public Type visit(Argument p, Void arg) {
                            return p.type_;
                        }
                    }, null));
                }
                return listType;
            }
        }, null);
    }

    public static void checkVariables(latte.Absyn.Prog AST) {
        var variables = new VariableContext();
        AST.accept(new Prog.Visitor<Void, VariableContext>() {
            @Override
            public Void visit(Program p, VariableContext arg) {
                for (var def : p.listtopdef_) {
                    def.accept(new TopDef.Visitor<Void, VariableContext>() {
                        @Override
                        public Void visit(FnDef p, VariableContext arg) {
                            p.funct_.accept(new Funct.Visitor<Void, VariableContext>() {
                                @Override
                                public Void visit(Function p, VariableContext arg) {
                                    arg.add(getName(p.identp_), new Fun(p.type_, getListOfTypes(p)));
                                    return null;
                                }
                            }, arg);
                            return null;
                        }

                        @Override
                        public Void visit(ClassDef p, VariableContext arg) {
                            // TODO
                            return null;
                        }

                        @Override
                        public Void visit(ClassDefExtend p, VariableContext arg) {
                            // TODO
                            return null;
                        }
                    }, variables);
                }

                for (var def : p.listtopdef_) {
                    def.accept(new TopDef.Visitor<Void, VariableContext>() {
                        @Override
                        public Void visit(FnDef p, VariableContext arg) {
                            p.funct_.accept(new Funct.Visitor<Void, VariableContext>() {
                                @Override
                                public Void visit(Function p, VariableContext arg) {
                                    arg.currentFunction = getName(p.identp_);
                                    arg.pushNewContext();
                                    for (var variable : p.listarg_) {
                                        variable.accept(new Arg.Visitor<Void, VariableContext>() {
                                            @Override
                                            public Void visit(Argument p, VariableContext arg) {
                                                if (arg.contains(getName(p.identp_))) {
                                                    throw new LatteError(String.format("The variable %s is already declared", getName(p.identp_)), p.line_num, p.col_num);
                                                }
                                                arg.add(getName(p.identp_), p.type_);
                                                return null;
                                            }
                                        }, arg);
                                    }

                                    p.block_.<Void, VariableContext>accept(blockVisitor, arg);
                                    arg.popContext();
                                    return null;
                                }
                            }, arg);
                            return null;
                        }

                        @Override
                        public Void visit(ClassDef p, VariableContext arg) {
                            return null;
                        }

                        @Override
                        public Void visit(ClassDefExtend p, VariableContext arg) {
                            return null;
                        }
                    }, variables);
                }
                return null;
            }
        }, variables);

        if (variables.get("main") == null) {
            throw new LatteError(String.format("The main function doesn't exists"), 0, 0);
        }
        if (!((Fun) variables.get("main")).type_.equals(new Primitive(new Int()))) {
            throw new LatteError(String.format("The main function should return integer. Returns %s", ((Fun) variables.get("main")).type_.toString()), 0, 0);
        }
    }
}
