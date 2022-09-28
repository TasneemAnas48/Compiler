package nodes.controllers;

import Symol_Table.Scope;
import com.company.Main;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ListAdd extends  ListUse{
    Type list_add ;


    public Type getList_add() {
        return list_add;
    }

    public void setList_add(Type list_add) {
        this.list_add = list_add;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        this.list_add.accept(astVisitor);
        System.out.println("); ");
    }

    @Override
    public void check(Scope scope) throws IOException {
        ///اختبار اذا كانت المصفوفة المستخدمة مع تابع add معرفة مسبقا
        if(check_var(name ,scope ,scope.getParent() , "list")==0)
            Main.fWriter.write("error in line  " + this.getLine() + " ..The List " + name + "  not define\n");
        else if(check_var(name ,scope , scope.getParent() , "list")==2)
            Main.fWriter.write("error in line  " + this.getLine() + " .." + name + "  not the type list\n");
    }

    @Override
    public void CodeGenerate(int helper, String n) {
        try {
            File f = new File("C:\\xampp\\htdocs\\"+ n + ".php");
            FileWriter fw = new FileWriter(f, true);
            fw.append("$"+name+"[]=");
            fw.flush();
            list_add.CodeGenerate(1, n);
            fw.append(";\n");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
