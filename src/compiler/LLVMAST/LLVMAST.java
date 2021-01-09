package compiler.LLVMAST;

import latte.Absyn.*;

import java.lang.Void;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LLVMAST {
    private final Expr.Visitor<String, SimpleBlock> exprVisitor = new Expr.Visitor<String, SimpleBlock>() {
        @Override
        public String visit(ENewArray p, SimpleBlock arg) {
            return null; //TODO
        }

        @Override
        public String visit(ENewObject p, SimpleBlock arg) {
            return null; //TODO
        }

        @Override
        public String visit(EVar p, SimpleBlock arg) {
            return LLVMContext.getVariable(getName(p.identp_));
        }

        @Override
        public String visit(EArrayElem p, SimpleBlock arg) {
            return null; //TODO
        }

        @Override
        public String visit(ELitInt p, SimpleBlock arg) {
            var v = LLVMContext.getNewVariable();
            arg.add(new SimpleInstruction(v, "add i32 0, " + p.integer_, "i32"));
            return v;
        }

        @Override
        public String visit(ELitTrue p, SimpleBlock arg) {
            var v = LLVMContext.getNewVariable();
            arg.add(new SimpleInstruction(v, "add i1 0, 1", "i1"));
            return v;
        }

        @Override
        public String visit(ELitFalse p, SimpleBlock arg) {
            var v = LLVMContext.getNewVariable();
            arg.add(new SimpleInstruction(v, "add i1 0, 0", "i1"));
            return v;
        }

        @Override
        public String visit(EAttr p, SimpleBlock arg) {
            return null; //TODO
        }

        @Override
        public String visit(EMethod p, SimpleBlock arg) {
            return null; //TODO
        }

        @Override
        public String visit(EApp p, SimpleBlock arg) {
            StringBuilder sb = new StringBuilder();
            sb.append("call " + LLVMContext.getType(getName(p.identp_) + "_function") + " @" + getName(p.identp_) + "_function ( ");
            sb.append(String.join(" , ", p.listexpr_.stream().map(x -> x.type.toLLVM() + " " + x.accept(exprVisitor, arg)).collect(Collectors.toList())));
            sb.append(" )");

            if (LLVMContext.getType(getName(p.identp_) + "_function").equals("void")) {
                arg.add(new SimpleInstruction(null, sb.toString(), p.type.toLLVM()));
                return null;
            } else {
                var v = LLVMContext.getNewVariable();
                arg.add(new SimpleInstruction(v, sb.toString(), p.type.toLLVM()));
                return v;
            }
        }

        @Override
        public String visit(ECast p, SimpleBlock arg) {
            return null; //TODO
        }

        @Override
        public String visit(EString p, SimpleBlock arg) {
            LLVMContext.addString(p.string_);
            var v = LLVMContext.getNewVariable();
            arg.add(new SimpleInstruction(v, String.format("getelementptr [%d x i8], [%d x i8]* @%s, i32 0, i32 0", p.string_.length() + 1, p.string_.length() + 1, LLVMContext.stringsToBeDeclared.get(p.string_)), "i8*"));
            return v;
        }

        @Override
        public String visit(Neg p, SimpleBlock arg) {
            var x = p.expr_.accept(exprVisitor, arg);
            var v = LLVMContext.getNewVariable();
            arg.add(new SimpleInstruction(v, "mul i32 -1, " + x, "i32"));
            return v;
        }

        @Override
        public String visit(Not p, SimpleBlock arg) {
            var x = p.expr_.accept(exprVisitor, arg);
            var v = LLVMContext.getNewVariable();
            arg.add(new SimpleInstruction(v, "add i1 -1, " + x, "i1"));
            return v;
        }

        @Override
        public String visit(EMul p, SimpleBlock arg) {
            var x1 = p.expr_1.accept(exprVisitor, arg);
            var x2 = p.expr_2.accept(exprVisitor, arg);
            var v = LLVMContext.getNewVariable();
            p.mulop_.accept(new MulOp.Visitor<Void, SimpleBlock>() {
                @Override
                public Void visit(Times p, SimpleBlock arg) {
                    arg.add(new SimpleInstruction(v, "mul i32 " + x1 + ", " + x2, "i32"));
                    return null;
                }

                @Override
                public Void visit(Div p, SimpleBlock arg) {
                    arg.add(new SimpleInstruction(v, "sdiv i32 " + x1 + ", " + x2, "i32"));
                    return null;
                }

                @Override
                public Void visit(Mod p, SimpleBlock arg) {
                    arg.add(new SimpleInstruction(v, "srem i32 " + x1 + ", " + x2, "i32"));
                    return null;
                }
            }, arg);
            return v;
        }

        @Override
        public String visit(EAdd p, SimpleBlock arg) {
            var x1 = p.expr_1.accept(exprVisitor, arg);
            var x2 = p.expr_2.accept(exprVisitor, arg);
            if (p.expr_1.type.equals(new Primitive(new Str()))) {
                var length1 = LLVMContext.getNewVariable();
                arg.add(new SimpleInstruction(length1, "call i32 @strlen(i8* " + x1 + ")", "i32"));
                var length2 = LLVMContext.getNewVariable();
                arg.add(new SimpleInstruction(length2, "call i32 @strlen(i8* " + x2 + ")", "i32"));
                var totalLength = LLVMContext.getNewVariable();
                arg.add(new SimpleInstruction(totalLength, "add i32 " + length1 + ", " + length2, "i32"));
                var totalLength2 = LLVMContext.getNewVariable();
                arg.add(new SimpleInstruction(totalLength2, "add i32 " + totalLength + ", 1", "i32"));
                var malloc = LLVMContext.getNewVariable();
                arg.add(new SimpleInstruction(malloc, "call i8* @malloc( i32 " + totalLength2 + ")", "i8*"));
                arg.add(new SimpleInstruction(null, "store i8 0, i8* " + malloc, null));
                var firstString = LLVMContext.getNewVariable();
                arg.add(new SimpleInstruction(firstString, "call i8* @strcat( i8* " + malloc + ", i8* " + x1 + ")", "i8*"));
                var secondString = LLVMContext.getNewVariable();
                arg.add(new SimpleInstruction(secondString, "call i8* @strcat( i8* " + malloc + ", i8* " + x2 + ")", "i8*"));
                return secondString;
            } else {
                var v = LLVMContext.getNewVariable();
                if (p.addop_ instanceof Plus) {
                    arg.add(new SimpleInstruction(v, "add i32 " + x1 + ", " + x2, "i32"));
                } else {
                    arg.add(new SimpleInstruction(v, "sub i32 " + x1 + ", " + x2, "i32"));
                }
                return v;
            }
        }

        @Override
        public String visit(ERel p, SimpleBlock arg) {
            var x1 = p.expr_1.accept(exprVisitor, arg);
            var x2 = p.expr_2.accept(exprVisitor, arg);
            var v = LLVMContext.getNewVariable();
            arg.add(new SimpleInstruction(v, "icmp " + p.relop_.toLLVMOperator() + " " + p.expr_1.type.toLLVM() + " " + x1 + ", " + x2, "i1"));
            return v;
        }

        @Override
        public String visit(EAnd p, SimpleBlock arg) {
            var x1 = p.expr_1.accept(exprVisitor, arg);
            var labelDoubleSuccess = LLVMContext.getNewLabel("label_double_success");
            var labelFirstSuccess = LLVMContext.getNewLabel("label_first_success");
            var labelFailure = LLVMContext.getNewLabel("label_failure");
            var labelDone = LLVMContext.getNewLabel("label_done");
            arg.add(new SimpleInstruction(null, "br i1 " + x1 + ", label %" + labelFirstSuccess + ", label %" + labelFailure, null));
            var successBlock = new SimpleBlock(labelFirstSuccess);
            var x2 = p.expr_2.accept(exprVisitor, successBlock);
            successBlock.add(new SimpleInstruction(null, "br i1 " + x2 + ", label %" + labelDoubleSuccess + ", label %" + labelFailure, null));
            arg.add(successBlock);

            var doubleSuccessBlock = new SimpleBlock(labelDoubleSuccess);
            doubleSuccessBlock.add(new SimpleInstruction(null, "br label %" + labelDone, null));
            arg.add(doubleSuccessBlock);

            var failureBlock = new SimpleBlock(labelFailure);
            failureBlock.add(new SimpleInstruction(null, "br label %" + labelDone, null));
            arg.add(failureBlock);

            var doneBlock = new SimpleBlock(labelDone);
            var v = LLVMContext.getNewVariable();
            doneBlock.add(new SimpleInstruction(v, "phi i1 [ 1, %" + labelDoubleSuccess + "], [ 0, %" + labelFailure + "]", "i1"));
            arg.add(doneBlock);
            return v;
        }

        @Override
        public String visit(EOr p, SimpleBlock arg) {
            var x1 = p.expr_1.accept(exprVisitor, arg);
            var labelDoubleFailure = LLVMContext.getNewLabel("label_double_failure");
            var labelFirstFailure = LLVMContext.getNewLabel("label_first_failure");
            var labelSuccess = LLVMContext.getNewLabel("label_success");
            var labelDone = LLVMContext.getNewLabel("label_done");
            arg.add(new SimpleInstruction(null, "br i1 " + x1 + ", label %" + labelSuccess + ", label %" + labelFirstFailure, null));
            var firstFailureBlock = new SimpleBlock(labelFirstFailure);
            var x2 = p.expr_2.accept(exprVisitor, firstFailureBlock);
            firstFailureBlock.add(new SimpleInstruction(null, "br i1 " + x2 + ", label %" + labelSuccess + ", label %" + labelDoubleFailure, null));
            arg.add(firstFailureBlock);

            var successBlock = new SimpleBlock(labelSuccess);
            successBlock.add(new SimpleInstruction(null, "br label %" + labelDone, null));
            arg.add(successBlock);

            var failureBlock = new SimpleBlock(labelDoubleFailure);
            failureBlock.add(new SimpleInstruction(null, "br label %" + labelDone, null));
            arg.add(failureBlock);

            var doneBlock = new SimpleBlock(labelDone);
            var v = LLVMContext.getNewVariable();
            doneBlock.add(new SimpleInstruction(v, "phi i1 [ 1, %" + labelSuccess + "], [ 0, %" + labelDoubleFailure + "]", "i1"));
            arg.add(doneBlock);
            return v;
        }
    };
    private final Block.Visitor<Void, SimpleBlock> blockVisitor = new Block.Visitor<Void, SimpleBlock>() {
        @Override
        public Void visit(BlockOfStatements p, SimpleBlock arg) {
            LLVMContext.addNewContext();
            for (var stmt : p.liststmt_) {
                stmt.accept(stmtVisitor, arg);
            }
            LLVMContext.removeContext();
            return null;
        }
    };
    private final Stmt.Visitor<Void, SimpleBlock> stmtVisitor = new Stmt.Visitor<Void, SimpleBlock>() {
        @Override
        public Void visit(Empty p, SimpleBlock arg) {
            return null;
        }

        @Override
        public Void visit(BStmt p, SimpleBlock arg) {
            LLVMContext.addNewContext();
            var block = new SimpleBlock();
            p.block_.accept(blockVisitor, block);
            arg.add(block);
            LLVMContext.removeContext();
            return null;
        }

        @Override
        public Void visit(Decl p, SimpleBlock arg) {
            var type = p.type_;
            for (var newVar : p.listitem_) {
                newVar.accept(new Item.Visitor<Void, SimpleBlock>() {
                    @Override
                    public Void visit(NoInit p, SimpleBlock arg) {
                        var v = LLVMContext.addVariable(type, getName(p.identp_));
                        arg.add(new SimpleInstruction(v, type.getDefaultLLVMValue(), type.toLLVM()));
                        return null;
                    }

                    @Override
                    public Void visit(Init p, SimpleBlock arg) {
                        var v = p.expr_.accept(exprVisitor, arg);
                        if (isRegister(v)) {
                            var variable = LLVMContext.addVariable(type, getName(p.identp_), v);
                        } else {
                            var variable = LLVMContext.addVariable(type, getName(p.identp_));
                            arg.add(new SimpleInstruction(variable, v, type.toLLVM()));
                        }
                        return null;
                    }
                }, arg);
            }
            return null;
        }

        @Override
        public Void visit(Ass p, SimpleBlock arg) {
            var x = p.expr_.accept(exprVisitor, arg);
            if (isRegister(x)) {
                LLVMContext.updateVariable(getName(p.identp_), x);
                return null;
            }
            var newVar = LLVMContext.updateVariable(getName(p.identp_));
            arg.add(new SimpleInstruction(newVar, x, LLVMContext.getType(getName(p.identp_))));
            return null;
        }

        @Override
        public Void visit(AssArr p, SimpleBlock arg) {
            return null; // TODO
        }

        @Override
        public Void visit(AssAttr p, SimpleBlock arg) {
            return null; //TODO
        }

        @Override
        public Void visit(Incr p, SimpleBlock arg) {
            var v = LLVMContext.getVariable(getName(p.identp_));
            var newVar = LLVMContext.updateVariable(getName(p.identp_));
            arg.add(new SimpleInstruction(newVar, "add i32 1, " + v, LLVMContext.getType(getName(p.identp_))));
            return null;
        }

        @Override
        public Void visit(Decr p, SimpleBlock arg) {
            var v = LLVMContext.getVariable(getName(p.identp_));
            var newVar = LLVMContext.updateVariable(getName(p.identp_));
            arg.add(new SimpleInstruction(newVar, "add i32 -1, " + v, LLVMContext.getType(getName(p.identp_))));
            return null;
        }

        @Override
        public Void visit(Ret p, SimpleBlock arg) {
            var e = p.expr_.accept(exprVisitor, arg);
            arg.add(new SimpleInstruction(null, "ret " + p.expr_.type.toLLVM() + " " + e, p.expr_.type.toLLVM()));
            LLVMContext.registerCounter++;
            return null;
        }

        @Override
        public Void visit(VRet p, SimpleBlock arg) {
            arg.add(new SimpleInstruction(null, "ret void", null));
            LLVMContext.registerCounter++;
            return null;
        }

        @Override
        public Void visit(Cond p, SimpleBlock arg) {
            var expr = p.expr_.accept(exprVisitor, arg);
            var labelIfStart = LLVMContext.getNewLabel("if_start");
            var labelIfBody = LLVMContext.getNewLabel("if_body");
            var labelIfBodyEnd = LLVMContext.getNewLabel("if_body_end");
            var labelFi = LLVMContext.getNewLabel("fi");
            var contextBefore = LLVMContext.contextStack.clone();
            arg.add(new SimpleInstruction(null, "br label %" + labelIfStart, null));

            var ifBlock = new SimpleBlock(labelIfStart);
            ifBlock.add(new SimpleInstruction(null, "br i1 " + expr + ", label %" + labelIfBody + ", label %" + labelFi, null));
            arg.add(ifBlock);

            var ifBodyBlock = new SimpleBlock(labelIfBody);
            p.stmt_.accept(stmtVisitor, ifBodyBlock);
            ifBodyBlock.add(new SimpleInstruction(null, "br label %" + labelIfBodyEnd, null));
            arg.add(ifBodyBlock);


            var ifBodyEndBlock = new SimpleBlock(labelIfBodyEnd);
            ifBodyEndBlock.add(new SimpleInstruction(null, "br label %" + labelFi, null));
            arg.add(ifBodyEndBlock);

            var fiBody = new SimpleBlock(labelFi);

            for (int i = 0; i < contextBefore.stack.size(); ++i) {
                for (var v : contextBefore.stack.get(i).variableToRegister.keySet()) {
                    var registerBefore = contextBefore.stack.get(i).variableToRegister.get(v);
                    var registerAfter = LLVMContext.contextStack.stack.get(i).variableToRegister.get(v);
                    if (!registerAfter.equals(registerBefore)) {
                        var newVar = LLVMContext.getNewVariable();
                        var varType = LLVMContext.getType(v);
                        fiBody.add(new SimpleInstruction(newVar, "phi " + varType + " [ " + registerBefore + ", %" + labelIfStart + "], [ " + registerAfter + ", %" + labelIfBodyEnd + "]", varType));
                        LLVMContext.updateVariable(v, newVar);
                    }
                }
            }

            arg.add(fiBody);

            return null;
        }

        @Override
        public Void visit(CondElse p, SimpleBlock arg) {
            var expr = p.expr_.accept(exprVisitor, arg);
            var labelIfStart = LLVMContext.getNewLabel("if_start");
            var labelIfBodyTrue = LLVMContext.getNewLabel("if_body_true");
            var labelIfBodyTrueEnd = LLVMContext.getNewLabel("if_body_true_end");
            var labelIfBodyFalse = LLVMContext.getNewLabel("if_body_false");
            var labelIfBodyFalseEnd = LLVMContext.getNewLabel("if_body_false_end");
            var labelFi = LLVMContext.getNewLabel("fi");
            var contextBefore = LLVMContext.contextStack.clone();
            arg.add(new SimpleInstruction(null, "br label %" + labelIfStart, null));

            var ifBlock = new SimpleBlock(labelIfStart);
            ifBlock.add(new SimpleInstruction(null, "br i1 " + expr + ", label %" + labelIfBodyTrue + ", label %" + labelIfBodyFalse, null));
            arg.add(ifBlock);

            var ifBodyTrueBlock = new SimpleBlock(labelIfBodyTrue);
            p.stmt_1.accept(stmtVisitor, ifBodyTrueBlock);
            ifBodyTrueBlock.add(new SimpleInstruction(null, "br label %" + labelIfBodyTrueEnd, null));
            arg.add(ifBodyTrueBlock);

            var ifBodyTrueEndBlock = new SimpleBlock(labelIfBodyTrueEnd);
            ifBodyTrueEndBlock.add(new SimpleInstruction(null, "br label %" + labelFi, null));
            arg.add(ifBodyTrueEndBlock);

            var contextAfterTrue = LLVMContext.contextStack.clone();
            LLVMContext.contextStack = contextBefore;

            var ifBodyFalseBlock = new SimpleBlock(labelIfBodyFalse);
            p.stmt_2.accept(stmtVisitor, ifBodyFalseBlock);
            ifBodyFalseBlock.add(new SimpleInstruction(null, "br label %" + labelIfBodyFalseEnd, null));
            arg.add(ifBodyFalseBlock);

            var ifBodyFalseEndBlock = new SimpleBlock(labelIfBodyFalseEnd);
            ifBodyFalseEndBlock.add(new SimpleInstruction(null, "br label %" + labelFi, null));
            arg.add(ifBodyFalseEndBlock);

            var fiBody = new SimpleBlock(labelFi);

            for (int i = 0; i < contextAfterTrue.stack.size(); ++i) {
                for (var v : contextAfterTrue.stack.get(i).variableToRegister.keySet()) {
                    var registerBefore = contextAfterTrue.stack.get(i).variableToRegister.get(v);
                    var registerAfter = LLVMContext.contextStack.stack.get(i).variableToRegister.get(v);
                    if (!registerAfter.equals(registerBefore)) {
                        var newVar = LLVMContext.getNewVariable();
                        var varType = LLVMContext.getType(v);
                        fiBody.add(new SimpleInstruction(newVar, "phi " + varType + " [ " + registerBefore + ", %" + labelIfBodyTrueEnd + "], [ " + registerAfter + ", %" + labelIfBodyFalseEnd + "]", varType));
                        LLVMContext.updateVariable(v, newVar);
                    }
                }
            }

            arg.add(fiBody);

            return null;
        }

        @Override
        public Void visit(While p, SimpleBlock arg) {
            var labelEntry = LLVMContext.getNewLabel("while_entry");
            var labelPhi = LLVMContext.getNewLabel("while_phi");
            var labelCond = LLVMContext.getNewLabel("while_condition");
            var labelCondEnd = LLVMContext.getNewLabel("while_condition_end");
            var labelBody = LLVMContext.getNewLabel("while_body");
            var labelBodyEnd = LLVMContext.getNewLabel("while_body_end");
            var labelEnd = LLVMContext.getNewLabel("while_end");

            arg.add(new SimpleInstruction(null, "br label %" + labelEntry, null));

            var entryBlock = new SimpleBlock(labelEntry);
            entryBlock.add(new SimpleInstruction(null, "br label %" + labelPhi, null));
            arg.add(entryBlock);

            var phiBlock = new SimpleBlock(labelPhi);

            Map<String, String> stringsToBeDeclared = new HashMap<>();
            for (var k : LLVMContext.stringsToBeDeclared.keySet()) {
                stringsToBeDeclared.put(k, LLVMContext.stringsToBeDeclared.get(k));
            }
            LLVMContextStack contextStack = LLVMContext.contextStack.clone();
            int registerCounter = LLVMContext.registerCounter;
            int stringCounter = LLVMContext.stringCounter;
            int labelCounter = LLVMContext.labelCounter;
            p.expr_.accept(exprVisitor, new SimpleBlock());
            p.stmt_.accept(stmtVisitor, new SimpleBlock());

            var afterBodyContext = LLVMContext.contextStack;
            LLVMContext.contextStack = contextStack;
            LLVMContext.registerCounter = registerCounter;
            LLVMContext.stringCounter = stringCounter;
            LLVMContext.labelCounter = labelCounter;
            LLVMContext.stringsToBeDeclared = stringsToBeDeclared;

            int counter = 0;
            for (int i = 0; i < LLVMContext.contextStack.stack.size(); ++i) {
                for (var v : LLVMContext.contextStack.stack.get(i).variableToRegister.keySet()) {
                    var registerBefore = LLVMContext.contextStack.stack.get(i).variableToRegister.get(v);
                    var registerAfter = afterBodyContext.stack.get(i).variableToRegister.get(v);
                    if (!registerAfter.equals(registerBefore)) {
                        counter++;
                    }
                }
            }
            var variablesToBeUpdated = new HashMap<String, String>();

            for (int i = 0; i < LLVMContext.contextStack.stack.size(); ++i) {
                for (var v : LLVMContext.contextStack.stack.get(i).variableToRegister.keySet()) {
                    var registerBefore = LLVMContext.contextStack.stack.get(i).variableToRegister.get(v);
                    var registerAfter = afterBodyContext.stack.get(i).variableToRegister.get(v);
                    if (!registerAfter.equals(registerBefore)) {
                        var newVar = LLVMContext.getNewVariable();
                        var varType = LLVMContext.getType(v);
                        registerAfter = "%" + (Integer.parseInt(registerAfter.substring(1)) + counter);
                        phiBlock.add(new SimpleInstruction(newVar, "phi " + varType + " [ " + registerBefore + ", %" + labelEntry + "], [ " + registerAfter /*TODO trzeba dodać i wziąć jeszcze cond pod uwagę*/ + ", %" + labelBodyEnd + "]", varType));
                        variablesToBeUpdated.put(v, newVar);
                        LLVMContext.updateVariable(v, newVar);
                    }
                }
            }
            phiBlock.add(new SimpleInstruction(null, "br label %" + labelCond, null));
            arg.add(phiBlock);

            var condBlock = new SimpleBlock(labelCond);
            var v = p.expr_.accept(exprVisitor, condBlock);
            condBlock.add(new SimpleInstruction(null, "br label %" + labelCondEnd, null));
            arg.add(condBlock);

            var condEndBlock = new SimpleBlock(labelCondEnd);
            condEndBlock.add(new SimpleInstruction(null, "br i1 " + v + ", label %" + labelBody + ", label %" + labelEnd, null));
            arg.add(condEndBlock);

            var bodyBlock = new SimpleBlock(labelBody);
            p.stmt_.accept(stmtVisitor, bodyBlock);
            bodyBlock.add(new SimpleInstruction(null, "br label %" + labelBodyEnd, null));
            arg.add(bodyBlock);

            var bodyEndBlock = new SimpleBlock(labelBodyEnd);
            bodyEndBlock.add(new SimpleInstruction(null, "br label %" + labelPhi, null));
            arg.add(bodyEndBlock);

            var endBlock = new SimpleBlock(labelEnd);
            arg.add(endBlock);

            for (var x : variablesToBeUpdated.keySet()) {
                LLVMContext.updateVariable(x, variablesToBeUpdated.get(x));
            }

            return null;
        }

        @Override
        public Void visit(For p, SimpleBlock arg) {
            return null; //TODO
        }

        @Override
        public Void visit(SExp p, SimpleBlock arg) {
            var exp = p.expr_.accept(exprVisitor, arg);
            return null;
        }
    };
    public ArrayList<FunctionBlock> listOfBlocks;
    private final TopDef.Visitor topDefVisitor = new TopDef.Visitor<Void, LLVMAST>() {
        @Override
        public Void visit(FnDef p, LLVMAST arg) {
            p.funct_.accept(new Funct.Visitor<Void, LLVMAST>() {
                @Override
                public Void visit(Function p, LLVMAST arg) {
                    LLVMContext.registerCounter = 0;
                    LLVMContext.addNewContext();

                    var functionBlock = new FunctionBlock();
                    functionBlock.name = getName(p.identp_);
                    functionBlock.functionType = p.type_.toLLVM();

                    var typeList = new ArrayList<String>();
                    for (var a : p.listarg_) {
                        typeList.add(a.accept(new Arg.Visitor<String, Void>() {
                            @Override
                            public String visit(Argument p, Void arg) {
                                LLVMContext.addVariable(p.type_, getName(p.identp_));
                                return p.type_.toLLVM();
                            }
                        }, null));
                    }
                    functionBlock.listOfArgumentTypes = typeList;
                    LLVMContext.registerCounter++;

                    p.block_.accept(blockVisitor, functionBlock);
                    arg.listOfBlocks.add(functionBlock);

                    //TODO test if block is finished with a terminal command

                    LLVMContext.removeContext();
                    return null;
                }
            }, arg);
            return null;
        }

        @Override
        public Void visit(ClassDef p, LLVMAST arg) {
            return null; //TODO
        }

        @Override
        public Void visit(ClassDefExtend p, LLVMAST arg) {
            return null; //TODO
        }
    };

    public LLVMAST(Prog AST) {
        listOfBlocks = new ArrayList<FunctionBlock>();
        convert(AST);
    }

    private boolean isRegister(String s) {
        return s.startsWith("%");
    }

    private void convert(Prog ast) {
        ast.accept(new Prog.Visitor<Void, LLVMAST>() {
            @Override
            public Void visit(Program p, LLVMAST arg) {
                for (var f : p.listtopdef_) {
                    f.accept(new TopDef.Visitor<Void, LLVMAST>() {
                        @Override
                        public Void visit(FnDef p, LLVMAST arg) {
                            var name = p.funct_.accept(
                                new Funct.Visitor<String, Void>() {
                                    @Override
                                    public String visit(Function p, Void arg) {
                                        return getName(p.identp_);
                                    }
                                }, null
                            );
                            var type = p.funct_.accept(
                                new Funct.Visitor<Type, Void>() {
                                    @Override
                                    public Type visit(Function p, Void arg) {
                                        return p.type_;
                                    }
                                }, null
                            );
                            LLVMContext.addVariable(new Fun(type, null), name);
                            return null;
                        }

                        @Override
                        public Void visit(ClassDef p, LLVMAST arg) {
                            return null; //TODO
                        }

                        @Override
                        public Void visit(ClassDefExtend p, LLVMAST arg) {
                            return null; //TODO
                        }
                    }, arg);
                }

                for (var f : p.listtopdef_) {
                    f.accept(topDefVisitor, arg);
                }
                return null;
            }
        }, this);
    }

    private String getName(IdentP identp_) {
        return identp_.accept(new IdentP.Visitor<String, Void>() {
            @Override
            public String visit(IdentPos p, Void arg) {
                return p.ident_;
            }
        }, null);
    }

    public String toLLVMIR() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("declare void @printInt_function(i32)\n");
        stringBuilder.append("declare void @printString_function(i8*)\n");
        stringBuilder.append("declare i32 @readInt_function()\n");
        stringBuilder.append("declare i8* @readString_function()\n");
        stringBuilder.append("declare void @error_function()\n");
        stringBuilder.append("declare i8* @malloc(i32)\n");
        stringBuilder.append("declare i32 @strlen(i8*)\n");
        stringBuilder.append("declare i8* @strcat(i8*, i8*)\n");


        stringBuilder.append(LLVMContext.generateStrings());

        for (var b : listOfBlocks) {
            stringBuilder.append(b.toString());
        }
        return stringBuilder.toString();
    }
}
