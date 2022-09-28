package nodes.controllers;

import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Print extends Logic {
    List<Type> print_list = new ArrayList<>();

    public List<Type> getPrint_list() {
        return print_list;
    }

    public void setPrint_list(List<Type> print_list) {
        this.print_list = print_list;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < print_list.size(); i++) {
            if(print_list.get(i) != null)
                this.print_list.get(i).accept(astVisitor);
        }
        System.out.print(");");
    }

    @Override
    public void CodeGenerate(int helper, String name) {
        try {
            File f = new File("C:\\xampp\\htdocs\\"+ name + ".php");
            FileWriter fw = new FileWriter(f, true);
            fw.append("\n");
            fw.append("echo ");
            fw.flush();
            for (int i = 0; i < print_list.size(); i++) {
                if (i == print_list.size() - 1) {
                    print_list.get(i).CodeGenerate(1, name);
                    fw.append(".\"<br>\"");
                }
                else {
                    print_list.get(i).CodeGenerate(1, name);
                    fw.append(".\"<br>\".");
                    fw.flush();
                }
            }
            fw.append(";");
            fw.flush();
            fw.append("\n");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
