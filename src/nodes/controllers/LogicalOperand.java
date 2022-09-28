package nodes.controllers;

import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LogicalOperand extends Compare {

    String logic_op ;

    public String getLogic_op() {
        return logic_op;
    }

    public void setLogic_op(String logic_op) {
        this.logic_op = logic_op;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    @Override
    public void CodeGenerate(int helper, String name) {
        try {
            File f = new File("C:\\xampp\\htdocs\\"+ name + ".php");
            FileWriter fw = new FileWriter(f, true);  //Create filewriter object for the file descriptor with append options set as tru
            fw.append(" "+logic_op+" ");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}

