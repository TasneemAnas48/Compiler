package nodes.controllers;
import Symol_Table.Scope;
import nodes.Node;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OperandType extends Node {
    String operand ;
    Type right_op ;

    public String getOperand() {
        return operand;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    public Type getRight_op() {
        return right_op;
    }

    public void setRight_op(Type right_op) {
        this.right_op = right_op;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        this.right_op.accept(astVisitor);
    }

    ////////////////////////////////////////////////////////////////////
    @Override
    public void CodeGenerate(int helper, String name) {
        try {
            File f = new File("C:\\xampp\\htdocs\\"+ name + ".php");
            FileWriter fw = new FileWriter(f, true);
            fw.append(operand);

            fw.flush();
            right_op.CodeGenerate(1, name);

            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }



}
