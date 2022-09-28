package nodes.controllers;

import Symol_Table.Scope;
import com.company.Main;
import nodes.Node;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Type extends Node {

    String string_type ;
    Integer int_type ;

    public String getString_type() {
        return string_type;
    }

    public void setString_type(String string_type) {
        this.string_type = string_type;
    }

    public Integer getInt_type() {
        return int_type;
    }

    public void setInt_type(Integer int_type) {
        this.int_type = int_type;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
    }

    @Override
    public void check(Scope scope) throws IOException {
        if(string_type != null && (!string_type.startsWith("\"") && !string_type.endsWith("\""))) {

            ///اختبار اذا كان المتحول غير معرف قبل استخدامه
            if (check_var(string_type, scope, scope.getParent(), "var") == 0)
                Main.fWriter.write( "error in line  " + this.getLine() + " ..The Variable " + string_type + "  not define\n");
            ///اختبار اذا كان المتحول معرف ولكن من نوع آخر
            else if (check_var(string_type, scope, scope.getParent(), "var") == 2)
                Main.fWriter.write( "error in line  " + this.getLine() + " ..The Variable " + string_type + "  not the type var\n" );
        }
    }

    @Override
    public void CodeGenerate(int helper, String name) {
        try {
            File f = new File("C:\\xampp\\htdocs\\"+ name + ".php");
            FileWriter fw = new FileWriter(f, true);
            if (string_type != null){
                if(string_type.startsWith("\""))
                    fw.append(string_type);
                else
                    fw.append("$"+string_type);

            }
            if (int_type != null) {

                fw.append(int_type.toString());

            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
