package nodes.controllers;

import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Variables extends Logic{
    List<Var> variables = new ArrayList<>();

    public List<Var> getVariables() {
        return variables;
    }

    public void setVariables(List<Var> variables) {
        this.variables = variables;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < variables.size() ; i++) {
            if (variables.get(i) != null)
                this.variables.get(i).accept(astVisitor);
        }
        System.out.println(";");
    }


    @Override
    public void CodeGenerate(int helper, String name) {
        try {
            File f = new File("C:\\xampp\\htdocs\\"+name + ".php");
            FileWriter fw = new FileWriter(f, true);  //Create filewriter object for the file descriptor with append options set as tru
            for (int i = 0; i < variables.size(); i++) {
                if (i == variables.size() - 1) variables.get(i).CodeGenerate(1, name);
                else {
                    variables.get(i).CodeGenerate(1, name);
                    fw.append(";");
                    fw.flush();
                }
            }
            fw.append( ";\n");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
