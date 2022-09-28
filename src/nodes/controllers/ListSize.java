package nodes.controllers;

import Symol_Table.Scope;
import com.company.Main;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ListSize extends ListUse {


    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        System.out.println("); ");

    }

    @Override
    public void check(Scope scope) throws IOException {
        if (check_var(name, scope, scope.getParent(), "list") == 0)
            Main.fWriter.write("error in line  " + this.getLine() + " ..The List " + name + "  not define\n");
        else if (check_var(name, scope, scope.getParent(), "list") == 2)
            Main.fWriter.write("error in line  " + this.getLine() + " .." + name + "  not the type list\n");
    }

    @Override
    public void CodeGenerate(int helper, String n) {
        try {
            File f = new File("C:\\xampp\\htdocs\\"+ n + ".php");
            FileWriter fw = new FileWriter(f, true);
            fw.append( "count( $"+name+")");
            fw.flush();
            if (helper == 0) {
                fw.append(";\n");
                fw.flush();
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
