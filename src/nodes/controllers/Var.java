package nodes.controllers;

import nodes.Node;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Var extends Node {
    String var_name ;
    Assigment assigment ;

    public Post getPost_var() {
        return post_var;
    }

    public void setPost_var(Post post_var) {
        this.post_var = post_var;
    }

    Post post_var ;

    public String getVar_name() {
        return var_name;
    }

    public void setVar_name(String var_name) {
        this.var_name = var_name;
    }

    public Assigment getAssigment() {
        return assigment;
    }

    public void setAssigment(Assigment assigment) {
        this.assigment = assigment;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (this.assigment != null)
            this.assigment.accept(astVisitor);
        System.out.print(", ");
    }


    @Override
    public void CodeGenerate(int helper, String name) {
        try {
            File f = new File("C:\\xampp\\htdocs\\"+ name + ".php");
            FileWriter fw = new FileWriter(f, true);
            if(post_var != null)post_var.CodeGenerate(1, name);
            if (assigment != null) assigment.CodeGenerate(1, name);
            if(var_name!=null)
                fw.append(" $" + var_name);
            fw.flush();
            if(helper==0)
                fw.append(";\n" );
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}