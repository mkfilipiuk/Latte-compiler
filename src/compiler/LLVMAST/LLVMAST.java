package compiler.LLVMAST;

import latte.Absyn.*;

import java.lang.Void;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LLVMAST {

    private final Expr.Visitor<Value, SimpleBlock> exprVisitor = new Expr.Visitor<Value, SimpleBlock>() {
        @Override
        public Value visit(ENewArray p, SimpleBlock arg) {
            return null; //TODO
        }

        @Override
        public Value visit(ENewObject p, SimpleBlock arg) {
            return null; //TODO
        }

        @Override
        public Value visit(EVar p, SimpleBlock arg) {
            return LLVMContext.getVariable(getName(p.identp_));
        }

        @Override
        public Value visit(EArrayElem p, SimpleBlock arg) {
            return null; //TODO
        }

        @Override
        public Value visit(ELitInt p, SimpleBlock arg) {
            return new IntValue(p.integer_);
        }

        @Override
        public Value visit(ELitTrue p, SimpleBlock arg) {
            return new BooleanValue(true);
        }

        @Override
        public Value visit(ELitFalse p, SimpleBlock arg) {
            return new BooleanValue(false);
        }

        @Override
        public Value visit(EAttr p, SimpleBlock arg) {
            return null; //TODO
        }

        @Override
        public Value visit(EMethod p, SimpleBlock arg) {
            return null; //TODO
        }

        @Override
        public Value visit(EApp p, SimpleBlock arg) {
            List<Value> listOfArgs = p.listexpr_.stream().map(x -> x.accept(exprVisitor, arg)).collect(Collectors.toList());
            listOfArgs = listOfArgs.stream().map(x -> x instanceof LLVMString ? addIfAbsent((LLVMString) x, "i8*", arg) : x).collect(Collectors.toList());

            if (LLVMContext.getType(getName(p.identp_) + "_function").equals("void")) {
                arg.add(new CallInstruction(null, getName(p.identp_) + "_function", "void", listOfArgs));
                return null;
            } else {
                var v = new Register(p.type.toLLVM());
                arg.add(new CallInstruction(v, getName(p.identp_) + "_function", v.type, listOfArgs));
                return v;
            }
        }

        @Override
        public Value visit(ECast p, SimpleBlock arg) {
            return null; //TODO
        }

        @Override
        public Value visit(EString p, SimpleBlock arg) {
            return new LLVMString(p.string_);
        }

        @Override
        public Value visit(Neg p, SimpleBlock arg) {
            var x = p.expr_.accept(exprVisitor, arg);
            if (x instanceof IntValue) {
                return new IntValue(((IntValue) x).value * -1);
            } else {
                var instruction = new SimpleInstruction(null, "mul i32", new IntValue(-1), x, "i32");
                return addIfAbsent(instruction, p.type.toLLVM(), arg);
            }
        }

        @Override
        public Value visit(Not p, SimpleBlock arg) {
            var x = p.expr_.accept(exprVisitor, arg);
            if (x instanceof BooleanValue) {
                var val = ((BooleanValue) x).b;
                if (val) {
                    return new BooleanValue(false);
                } else {
                    return new BooleanValue(true);
                }
            } else {
                var instruction = new SimpleInstruction(null, "add i1", new IntValue(-1), x, "i1");
                return addIfAbsent(instruction, p.type.toLLVM(), arg);
            }
        }

        @Override
        public Value visit(EMul p, SimpleBlock arg) {
            var x1 = p.expr_1.accept(exprVisitor, arg);
            var x2 = p.expr_2.accept(exprVisitor, arg);
            var instruction = p.mulop_.accept(new MulOp.Visitor<String, Void>() {
                @Override
                public String visit(Times p, Void arg) {
                    return "mul i32";
                }

                @Override
                public String visit(Div p, Void arg) {
                    return "sdiv i32";
                }

                @Override
                public String visit(Mod p, Void arg) {
                    return "srem i32";
                }
            }, null);
            if (x1 instanceof IntValue && x2 instanceof IntValue) {
                switch (instruction) {
                    case "mul i32":
                        return new IntValue(((IntValue) x1).value * ((IntValue) x2).value);
                    case "sdiv i32":
                        return new IntValue(((IntValue) x1).value / ((IntValue) x2).value);
                    case "srem i32":
                        return new IntValue(((IntValue) x1).value % ((IntValue) x2).value);
                }
            } else {
                var i = new SimpleInstruction(null, instruction, x1, x2, "i32");
                return addIfAbsent(i, p.type.toLLVM(), arg);
            }
            return null;
        }

        @Override
        public Value visit(EAdd p, SimpleBlock arg) {
            var x1 = p.expr_1.accept(exprVisitor, arg);
            var x2 = p.expr_2.accept(exprVisitor, arg);
            if (p.expr_1.type.equals(new Primitive(new Str()))) {
                if (x1 instanceof LLVMString && x2 instanceof LLVMString) {
                    return new LLVMString(((LLVMString) x1).string + ((LLVMString) x2).string);
                }
                if (x1 instanceof LLVMString) {
                    x1 = addIfAbsent((LLVMString) x1, "i8*", arg);
                }
                if (x2 instanceof LLVMString) {
                    x2 = addIfAbsent((LLVMString) x2, "i8*", arg);
                }

                var length1 = new Register("i32");
                var args = new ArrayList<Value>();
                args.add(x1);
                arg.add(new CallInstruction(length1, "strlen", "i32", args));

                var length2 = new Register("i32");
                args = new ArrayList<Value>();
                args.add(x2);
                arg.add(new CallInstruction(length2, "strlen", "i32", args));

                var lengthInstruction = new SimpleInstruction(null, "add i32", length1, length2, "i32");
                var totalLength = addIfAbsent(lengthInstruction, "i32", arg);

                var length2Instruction = new SimpleInstruction(null, "add i32", totalLength, new IntValue(1), "i32");
                var totalLength2 = addIfAbsent(length2Instruction, "i32", arg);

                var malloc = new Register("i8*");
                args = new ArrayList<Value>();
                args.add(totalLength2);
                arg.add(new CallInstruction(malloc, "malloc", "i8*", args));
                arg.add(new StoreInstruction(new IntValue(0), "i8", malloc));

                var firstString = new Register("i8*");
                args = new ArrayList<Value>();
                args.add(malloc);
                args.add(x1);
                arg.add(new CallInstruction(firstString, "strcat", "i8*", args));

                var secondString = new Register("i8*");
                args = new ArrayList<Value>();
                args.add(malloc);
                args.add(x2);
                arg.add(new CallInstruction(secondString, "strcat", "i8*", args));

                return secondString;
            } else {
                if (x1 instanceof IntValue && x2 instanceof IntValue) {
                    if (p.addop_ instanceof Plus) {
                        return new IntValue(((IntValue) x1).value + ((IntValue) x2).value);
                    } else {
                        return new IntValue(((IntValue) x1).value - ((IntValue) x2).value);
                    }

                } else {
                    SimpleInstruction instruction;
                    if (p.addop_ instanceof Plus) {
                        instruction = new SimpleInstruction(null, "add i32", x1, x2, "i32");
                    } else {
                        instruction = new SimpleInstruction(null, "sub i32", x1, x2, "i32");
                    }
                    return addIfAbsent(instruction, p.type.toLLVM(), arg);
                }
            }
        }

        @Override
        public Value visit(ERel p, SimpleBlock arg) {
            var x1 = p.expr_1.accept(exprVisitor, arg);
            var x2 = p.expr_2.accept(exprVisitor, arg);
            if (x1 instanceof IntValue && x2 instanceof IntValue) {
                if (p.relop_.equals(new EQU())) {
                    return new BooleanValue(((IntValue) x1).value == ((IntValue) x2).value);
                }
                if (p.relop_.equals(new GE())) {
                    return new BooleanValue(((IntValue) x1).value >= ((IntValue) x2).value);
                }
                if (p.relop_.equals(new GTH())) {
                    return new BooleanValue(((IntValue) x1).value > ((IntValue) x2).value);
                }
                if (p.relop_.equals(new LE())) {
                    return new BooleanValue(((IntValue) x1).value <= ((IntValue) x2).value);
                }
                if (p.relop_.equals(new LTH())) {
                    return new BooleanValue(((IntValue) x1).value < ((IntValue) x2).value);
                }
                if (p.relop_.equals(new NE())) {
                    return new BooleanValue(((IntValue) x1).value != ((IntValue) x2).value);
                }
                return null;
            }
            if (x1 instanceof BooleanValue && x2 instanceof BooleanValue) {
                if (p.relop_.equals(new EQU())) {
                    return new BooleanValue(((BooleanValue) x1).b == ((BooleanValue) x2).b);
                }
                if (p.relop_.equals(new NE())) {
                    return new BooleanValue(((BooleanValue) x1).b != ((BooleanValue) x2).b);
                }
                return null;
            }
            if (p.expr_1.type.equals(new Primitive(new Str()))) {
                if (x1 instanceof LLVMString && x2 instanceof LLVMString) {
                    return new BooleanValue(((LLVMString) x1).string.equals(((LLVMString) x2).string));
                }
                if (x1 instanceof LLVMString) {
                    x1 = addIfAbsent((LLVMString) x1, "i8*", arg);
                }
                if (x2 instanceof LLVMString) {
                    x2 = addIfAbsent((LLVMString) x2, "i8*", arg);
                }
                var args = new ArrayList<Value>();
                args.add(x1);
                args.add(x2);
                var cmpVar = new Register("i32");
                arg.add(new CallInstruction(cmpVar, "strcmp", "i32", args));
                var cmpInstruction = new SimpleInstruction(null, "icmp eq i32", cmpVar, new IntValue(0), "i1");
                return addIfAbsent(cmpInstruction, "i1", arg);
            } else {
                var cmpInstruction = new SimpleInstruction(null, "icmp " + p.relop_.toLLVMOperator() + " " + p.expr_1.type.toLLVM(), x1, x2, "i1");
                return addIfAbsent(cmpInstruction, "i1", arg);
            }
        }

        @Override
        public Value visit(EAnd p, SimpleBlock arg) {
            var x1 = p.expr_1.accept(exprVisitor, arg);
            if (x1 instanceof BooleanValue && ((BooleanValue) x1).b == false) {
                return x1;
            }
            if (x1 instanceof BooleanValue && ((BooleanValue) x1).b == true) {
                return p.expr_2.accept(exprVisitor, arg);
            }
            var labelFirstSuccess = LLVMContext.getNewLabel("label_first_success");
            var successBlock = new SimpleBlock(labelFirstSuccess);
            var labelDoubleSuccess = LLVMContext.getNewLabel("label_double_success");
            var doubleSuccessBlock = new SimpleBlock(labelDoubleSuccess);
            var labelFailure = LLVMContext.getNewLabel("label_failure");
            var failureBlock = new SimpleBlock(labelFailure);
            var labelDone = LLVMContext.getNewLabel("label_done");
            var doneBlock = new SimpleBlock(labelDone);

            var currentlyUsedExpressions = new HashMap<>(LLVMContext.currentlyUsedExpressions);

            arg.add(new BranchInstruction(x1, labelFirstSuccess, labelFailure));
            arg.next1 = successBlock;
            arg.next2 = failureBlock;
            successBlock.previous.add(arg);
            failureBlock.previous.add(arg);

            var x2 = p.expr_2.accept(exprVisitor, successBlock);
            successBlock.add(new BranchInstruction(x2, labelDoubleSuccess, labelFailure));
            successBlock.next1 = doubleSuccessBlock;
            successBlock.next2 = failureBlock;
            failureBlock.previous.add(successBlock);
            doubleSuccessBlock.previous.add(successBlock);
            arg.add(successBlock);

            doubleSuccessBlock.add(new BranchInstruction(labelDone));
            doubleSuccessBlock.next1 = doneBlock;
            doneBlock.previous.add(doubleSuccessBlock);
            arg.add(doubleSuccessBlock);

            failureBlock.add(new BranchInstruction(labelDone));
            arg.add(failureBlock);

            LLVMContext.currentlyUsedExpressions = currentlyUsedExpressions;

            var v = new Register("i1");
            doneBlock.add(new PhiInstruction(v, "i1", new BooleanValue(true), labelDoubleSuccess, new BooleanValue(false), labelFailure));
            arg.add(doneBlock);
            return v;
        }

        @Override
        public Value visit(EOr p, SimpleBlock arg) {
            var x1 = p.expr_1.accept(exprVisitor, arg);
            if (x1 instanceof BooleanValue && ((BooleanValue) x1).b == true) {
                return x1;
            }
            if (x1 instanceof BooleanValue && ((BooleanValue) x1).b == false) {
                return p.expr_2.accept(exprVisitor, arg);
            }
            var labelDoubleFailure = LLVMContext.getNewLabel("label_double_failure");
            var labelFirstFailure = LLVMContext.getNewLabel("label_first_failure");
            var labelSuccess = LLVMContext.getNewLabel("label_success");
            var labelDone = LLVMContext.getNewLabel("label_done");
            arg.add(new BranchInstruction(x1, labelSuccess, labelFirstFailure));

            var currentlyUsedExpressions = new HashMap<>(LLVMContext.currentlyUsedExpressions);

            var firstFailureBlock = new SimpleBlock(labelFirstFailure);
            var x2 = p.expr_2.accept(exprVisitor, firstFailureBlock);
            firstFailureBlock.add(new BranchInstruction(x2, labelSuccess, labelDoubleFailure));
            arg.add(firstFailureBlock);

            var successBlock = new SimpleBlock(labelSuccess);
            successBlock.add(new BranchInstruction(labelDone));
            arg.add(successBlock);

            var failureBlock = new SimpleBlock(labelDoubleFailure);
            failureBlock.add(new BranchInstruction(labelDone));
            arg.add(failureBlock);

            LLVMContext.currentlyUsedExpressions = currentlyUsedExpressions;

            var doneBlock = new SimpleBlock(labelDone);
            var v = new Register("i1");
            doneBlock.add(new PhiInstruction(v, "i1", new BooleanValue(true), labelSuccess, new BooleanValue(false), labelDoubleFailure));
            arg.add(doneBlock);
            return v;
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
                        if (type.equals(new Primitive(new Str()))) {
                            var value = new LLVMString("");
                            LLVMContext.addVariable(type, getName(p.identp_), value);
                        } else {
                            LLVMContext.addVariable(type, getName(p.identp_), type.getDefaultLLVMValue());
                        }
                        return null;
                    }

                    @Override
                    public Void visit(Init p, SimpleBlock arg) {
                        var v = p.expr_.accept(exprVisitor, arg);
                        LLVMContext.addVariable(type, getName(p.identp_), v);
                        return null;
                    }
                }, arg);
            }
            return null;
        }

        @Override
        public Void visit(Ass p, SimpleBlock arg) {
            var x = p.expr_.accept(exprVisitor, arg);
            LLVMContext.updateVariable(getName(p.identp_), x);
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
            if (LLVMContext.getVariable(getName(p.identp_)) instanceof IntValue) {
                LLVMContext.updateVariable(getName(p.identp_), new IntValue(((IntValue) LLVMContext.getVariable(getName(p.identp_))).value + 1));
            } else {
                var instruction = new SimpleInstruction(null, "add i32", new IntValue(1), LLVMContext.getVariable(getName(p.identp_)), "i32");
                var v = addIfAbsent(instruction, "i32", arg);
                LLVMContext.updateVariable(getName(p.identp_), v);
            }
            return null;
        }

        @Override
        public Void visit(Decr p, SimpleBlock arg) {
            if (LLVMContext.getVariable(getName(p.identp_)) instanceof IntValue) {
                LLVMContext.updateVariable(getName(p.identp_), new IntValue(((IntValue) LLVMContext.getVariable(getName(p.identp_))).value - 1));
            } else {
                var instruction = new SimpleInstruction(null, "add i32", new IntValue(-1), LLVMContext.getVariable(getName(p.identp_)), "i32");
                var v = addIfAbsent(instruction, "i32", arg);
                LLVMContext.updateVariable(getName(p.identp_), v);
            }
            return null;
        }

        @Override
        public Void visit(Ret p, SimpleBlock arg) {
            var e = p.expr_.accept(exprVisitor, arg);
            if (e instanceof LLVMString) {
                e = addIfAbsent((LLVMString) e, "i8*", arg);
            }
            arg.add(new ReturnInstruction(p.expr_.type.toLLVM(), e));
            return null;
        }

        @Override
        public Void visit(VRet p, SimpleBlock arg) {
            arg.add(new ReturnInstruction());
            return null;
        }

        @Override
        public Void visit(Cond p, SimpleBlock arg) {
            var expr = p.expr_.accept(exprVisitor, arg);
            if (expr instanceof BooleanValue) {
                if (((BooleanValue) expr).b) {
                    p.stmt_.accept(stmtVisitor, arg);
                }
                return null;
            }
            var labelIfStart = LLVMContext.getNewLabel("if_start");
            var labelIfBody = LLVMContext.getNewLabel("if_body");
            var labelIfBodyEnd = LLVMContext.getNewLabel("if_body_end");
            var labelFi = LLVMContext.getNewLabel("fi");
            var contextBefore = LLVMContext.contextStack.clone();
            arg.add(new BranchInstruction(labelIfStart));

            var ifBlock = new SimpleBlock(labelIfStart);
            ifBlock.add(new BranchInstruction(expr, labelIfBody, labelFi));
            arg.add(ifBlock);

            var currentlyUsedExpressions = new HashMap<>(LLVMContext.currentlyUsedExpressions);

            var ifBodyBlock = new SimpleBlock(labelIfBody);
            p.stmt_.accept(stmtVisitor, ifBodyBlock);
            ifBodyBlock.add(new BranchInstruction(labelIfBodyEnd));
            arg.add(ifBodyBlock);

            var ifBodyEndBlock = new SimpleBlock(labelIfBodyEnd);
            ifBodyEndBlock.add(new BranchInstruction(labelFi));
            arg.add(ifBodyEndBlock);

            var fiBody = new SimpleBlock(labelFi);

            LLVMContext.currentlyUsedExpressions = currentlyUsedExpressions;

            for (int i = 0; i < contextBefore.stack.size(); ++i) {
                for (var v : contextBefore.stack.get(i).variableToRegister.keySet()) {
                    var registerBefore = contextBefore.stack.get(i).variableToRegister.get(v);
                    var registerAfter = LLVMContext.contextStack.stack.get(i).variableToRegister.get(v);
                    if (!registerAfter.equals(registerBefore)) {
                        var varType = LLVMContext.getType(v);
                        if (registerBefore instanceof LLVMString) {
                            registerBefore = addIfAbsent((LLVMString) registerBefore, "i8*", ifBlock);
                            var br = ifBlock.remove(ifBlock.size() - 2);
                            ifBlock.add(br);
                        }
                        if (registerAfter instanceof LLVMString) {
                            registerAfter = addIfAbsent((LLVMString) registerAfter, "i8*", ifBodyEndBlock);
                            var br = ifBodyEndBlock.remove(ifBodyEndBlock.size() - 2);
                            ifBodyEndBlock.add(br);
                        }
                        var newVar = new Register(varType);
                        fiBody.add(new PhiInstruction(newVar, varType, registerBefore, labelIfStart, registerAfter, labelIfBodyEnd));
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
            if (expr instanceof BooleanValue) {
                if (((BooleanValue) expr).b) {
                    p.stmt_1.accept(stmtVisitor, arg);
                } else {
                    p.stmt_2.accept(stmtVisitor, arg);
                }
                return null;
            }
            var labelIfStart = LLVMContext.getNewLabel("if_start");
            var labelIfBodyTrue = LLVMContext.getNewLabel("if_body_true");
            var labelIfBodyTrueEnd = LLVMContext.getNewLabel("if_body_true_end");
            var labelIfBodyFalse = LLVMContext.getNewLabel("if_body_false");
            var labelIfBodyFalseEnd = LLVMContext.getNewLabel("if_body_false_end");
            var labelFi = LLVMContext.getNewLabel("fi");
            var contextBefore = LLVMContext.contextStack.clone();
            arg.add(new BranchInstruction(labelIfStart));

            var currentlyUsedExpressions = new HashMap<>(LLVMContext.currentlyUsedExpressions);

            var ifBlock = new SimpleBlock(labelIfStart);
            ifBlock.add(new BranchInstruction(expr, labelIfBodyTrue, labelIfBodyFalse));
            arg.add(ifBlock);

            var ifBodyTrueBlock = new SimpleBlock(labelIfBodyTrue);
            p.stmt_1.accept(stmtVisitor, ifBodyTrueBlock);
            ifBodyTrueBlock.add(new BranchInstruction(labelIfBodyTrueEnd));
            arg.add(ifBodyTrueBlock);

            var ifBodyTrueEndBlock = new SimpleBlock(labelIfBodyTrueEnd);
            ifBodyTrueEndBlock.add(new BranchInstruction(labelFi));
            arg.add(ifBodyTrueEndBlock);

            var contextAfterTrue = LLVMContext.contextStack.clone();
            LLVMContext.contextStack = contextBefore;
            LLVMContext.currentlyUsedExpressions = currentlyUsedExpressions;

            var ifBodyFalseBlock = new SimpleBlock(labelIfBodyFalse);
            p.stmt_2.accept(stmtVisitor, ifBodyFalseBlock);
            ifBodyFalseBlock.add(new BranchInstruction(labelIfBodyFalseEnd));
            arg.add(ifBodyFalseBlock);

            var ifBodyFalseEndBlock = new SimpleBlock(labelIfBodyFalseEnd);
            ifBodyFalseEndBlock.add(new BranchInstruction(labelFi));
            arg.add(ifBodyFalseEndBlock);

            LLVMContext.currentlyUsedExpressions = currentlyUsedExpressions;

            var fiBody = new SimpleBlock(labelFi);

            for (int i = 0; i < contextAfterTrue.stack.size(); ++i) {
                for (var v : contextAfterTrue.stack.get(i).variableToRegister.keySet()) {
                    var registerBefore = contextAfterTrue.stack.get(i).variableToRegister.get(v);
                    var registerAfter = LLVMContext.contextStack.stack.get(i).variableToRegister.get(v);
                    if (!registerAfter.equals(registerBefore)) {
                        var varType = LLVMContext.getType(v);
                        if (registerBefore instanceof LLVMString) {
                            registerBefore = addIfAbsent((LLVMString) registerBefore, "i8*", ifBodyTrueEndBlock);
                            var br = ifBodyTrueEndBlock.remove(ifBodyTrueEndBlock.size() - 2);
                            ifBodyTrueEndBlock.add(br);
                        }
                        if (registerAfter instanceof LLVMString) {
                            registerAfter = addIfAbsent((LLVMString) registerAfter, "i8*", ifBodyFalseEndBlock);
                            var br = ifBodyFalseEndBlock.remove(ifBodyFalseEndBlock.size() - 2);
                            ifBodyFalseEndBlock.add(br);
                        }
                        var newVar = new Register(varType);
                        fiBody.add(new PhiInstruction(newVar, varType, registerBefore, labelIfBodyTrueEnd, registerAfter, labelIfBodyFalseEnd));
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

            arg.add(new BranchInstruction(labelEntry));

            var entryBlock = new SimpleBlock(labelEntry);
            entryBlock.add(new BranchInstruction(labelPhi));
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
            var currentlyUsedExpressions = new HashMap<>(LLVMContext.currentlyUsedExpressions);
            p.expr_.accept(exprVisitor, new SimpleBlock());
            p.stmt_.accept(stmtVisitor, new SimpleBlock());

            var afterBodyContext = LLVMContext.contextStack;
            LLVMContext.contextStack = contextStack;
            LLVMContext.registerCounter = registerCounter;
            LLVMContext.stringCounter = stringCounter;
            LLVMContext.labelCounter = labelCounter;
            LLVMContext.stringsToBeDeclared = stringsToBeDeclared;
            LLVMContext.currentlyUsedExpressions = currentlyUsedExpressions;

            var variablesToBeUpdated = new HashMap<String, Register>();
            var vars = new ArrayList<String>();
            for (int i = 0; i < LLVMContext.contextStack.stack.size(); ++i) {
                for (var v : LLVMContext.contextStack.stack.get(i).variableToRegister.keySet()) {
                    var registerBefore = LLVMContext.contextStack.stack.get(i).variableToRegister.get(v);
                    var registerAfter = afterBodyContext.stack.get(i).variableToRegister.get(v);
                    if (registerAfter != registerBefore) {
                        var varType = LLVMContext.getType(v);
                        vars.add(v);
                        if (registerBefore instanceof LLVMString) {
                            registerBefore = addIfAbsent((LLVMString) registerBefore, "i8*", entryBlock);
                            var br = entryBlock.remove(entryBlock.size() - 2);
                            entryBlock.add(br);
                        }
                        var newVar = new Register(varType);
                        LLVMContext.updateVariable(v, newVar);
                        variablesToBeUpdated.put(v, newVar);
                        phiBlock.add(new PhiInstruction(newVar, varType, registerBefore, labelEntry, null, labelBodyEnd));
                    }
                }
            }

            phiBlock.add(new BranchInstruction(labelCond));
            arg.add(phiBlock);

            var condBlock = new SimpleBlock(labelCond);
            var v = p.expr_.accept(exprVisitor, condBlock);
            condBlock.add(new BranchInstruction(labelCondEnd));
            arg.add(condBlock);

            var condEndBlock = new SimpleBlock(labelCondEnd);
            condEndBlock.add(new BranchInstruction(v, labelBody, labelEnd));
            arg.add(condEndBlock);

            currentlyUsedExpressions = new HashMap<>(LLVMContext.currentlyUsedExpressions);

            var bodyBlock = new SimpleBlock(labelBody);
            p.stmt_.accept(stmtVisitor, bodyBlock);
            bodyBlock.add(new BranchInstruction(labelBodyEnd));
            arg.add(bodyBlock);

            var bodyEndBlock = new SimpleBlock(labelBodyEnd);
            bodyEndBlock.add(new BranchInstruction(labelPhi));
            arg.add(bodyEndBlock);

            LLVMContext.currentlyUsedExpressions = currentlyUsedExpressions;

            var endBlock = new SimpleBlock(labelEnd);
            arg.add(endBlock);

            var j = 0;
            for (int i = 0; i < vars.size(); ++i) {
                var variable = LLVMContext.getVariable(vars.get(i));
                if (variable instanceof LLVMString) {
                    variable = addIfAbsent((LLVMString) variable, "i8*", phiBlock);
                    var br = phiBlock.remove(phiBlock.size() - 2);
                    phiBlock.add(br);
                }
                while (!(phiBlock.get(j) instanceof PhiInstruction)) ++j;
                ((PhiInstruction) phiBlock.get(j)).value2 = variable;
                ++j;
            }

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
            p.expr_.accept(exprVisitor, arg);
            return null;
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
    private final TopDef.Visitor topDefVisitor = new TopDef.Visitor<Void, LLVMAST>() {
        @Override
        public Void visit(FnDef p, LLVMAST arg) {
            p.funct_.accept(new Funct.Visitor<Void, LLVMAST>() {
                @Override
                public Void visit(Function p, LLVMAST arg) {
                    LLVMContext.registerCounter = 0;
                    LLVMContext.currentlyUsedExpressions = new HashMap<>();
                    LLVMContext.labelCounter = 0;
                    LLVMContext.addNewContext();

                    var functionBlock = new FunctionBlock(getName(p.identp_));
                    functionBlock.functionType = p.type_.toLLVM();

                    var typeList = new ArrayList<String>();
                    var argList = new ArrayList<Register>();
                    for (var a : p.listarg_) {
                        typeList.add(a.accept(new Arg.Visitor<String, Void>() {
                            @Override
                            public String visit(Argument p, Void arg) {
                                var register = new Register(p.type_.toLLVM());
                                argList.add(register);
                                LLVMContext.addVariable(p.type_, getName(p.identp_), register);
                                return p.type_.toLLVM();
                            }
                        }, null));
                    }
                    functionBlock.listOfArguments = argList;
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
    public ArrayList<FunctionBlock> listOfBlocks;

    private Register addIfAbsent(SimpleInstruction instruction, String type, SimpleBlock block) {
        if (LLVMContext.currentlyUsedExpressions.containsKey(instruction)) {
            return LLVMContext.currentlyUsedExpressions.get(instruction);
        } else {
            var v = new Register(type);
            instruction.lhs = v;
            block.add(instruction);
            LLVMContext.currentlyUsedExpressions.put(instruction, v);
            return v;
        }
    }

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
                            LLVMContext.addVariable(new Fun(type, null), name, null);
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

        StringBuilder stringBuilder2 = new StringBuilder();
        for (var b : listOfBlocks) {
            if (LLVMContext.usedFunctions.contains(b.name)) {
                LLVMContext.registerCounter = 0;
                for (var arg : b.listOfArguments) {
                    arg.toString();
                }
                LLVMContext.registerCounter++;
                b.assignRegisters();
                stringBuilder2.append(b.toString());
            }
        }

        stringBuilder.append(LLVMContext.generateStrings());

        stringBuilder.append(stringBuilder2.toString());

        return stringBuilder.toString();
    }
}
