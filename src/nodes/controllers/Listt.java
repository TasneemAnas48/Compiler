package nodes.controllers;

import nodes.Node;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Listt extends Logic {

    String name;
    List<Type> value;

    public Post getPost_var() {
        return post_var;
    }

    public void setPost_var(Post post_var) {
        this.post_var = post_var;
    }

    Post post_var;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Type> getValue() {
        return value;
    }

    public void setValue(List<Type> value) {

        this.value = value;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (value != null)
            for (int i = 0; i < value.size(); i++) {
                if (value.get(i) != null)
                    this.value.get(i).accept(astVisitor);

            }
        if (post_var != null)
            this.post_var.accept(astVisitor);
        System.out.println(");");
    }

    @Override
    public void CodeGenerate(int helper, String name) {
        try {
            File f = new File("C:\\xampp\\htdocs\\" + name + ".php");
            FileWriter fw = new FileWriter(f, true);
            if (post_var != null) {

                post_var.CodeGenerate(1, name);
                fw.append(";\n");

            } else {
                fw.append("\n$" + this.getName());
                fw.flush();

                fw.append("= array(");
                fw.flush();
                if (value != null) {

                    for (int i = 0; i < value.size(); i++) {
                        if (i == value.size() - 1)
                            value.get(i).CodeGenerate(1, name);
                        else {
                            value.get(i).CodeGenerate(1, name);
                            fw.append(",");
                            fw.flush();
                        }
                    }
                }
                fw.append(");\n");
            }

            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
