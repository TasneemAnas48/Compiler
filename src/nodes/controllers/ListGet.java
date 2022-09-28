package nodes.controllers;

import Symol_Table.Scope;
import com.company.Main;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ListGet extends ListUse {

    String var_name;
    Integer index = -1;


    public String getVar_name() {
        return var_name;
    }

    public void setVar_name(String var_name) {
        this.var_name = var_name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (index != null)
            System.out.print(index);
        System.out.println("); ");
    }

    @Override
    public void check(Scope scope) throws IOException {

        if (name != null) {
            ///اختبار اذا كان اسم المصفوفة المستخدم مع تابع Get معرف مسبقا
            if (check_var(name, scope, scope.getParent(), "list") == 0)
                Main.fWriter.write("error in line  " + this.getLine() + " ..The list " + name + "  not define\n");
            else if (check_var(name, scope, scope.getParent(), "list") == 2)
                Main.fWriter.write("error in line  " + this.getLine() + " .." + name + "  not the type list\n");

        }

        if (check_var(name, scope, scope.getParent(), "list") == 1) {
            ///اختبار في حال كان الباراميتر الممر هو رقم
            if (index != -1) {
                ////نختبر اذا كان ضمن مجال ايندكسات المصفوفة

                if (index > list_value(name, scope, scope.getParent(), new ArrayList<>()).size() - 1)
                    Main.fWriter.write("error in line " + this.getLine() + " ...IndexOfBounded\n");
            }
            ////اختبار اذا كان الباراميتر الممر هو متحول
            else if (var_name != null) {
                //احضار قيمة المتحول
                int temp = check_int(var_name, scope, scope.getParent(), -100);

                ///اذا كان المتحول غير مهيأ مسبقا سيعطي ايرور
                if (temp == -100)
                    Main.fWriter.write("error in line  " + this.getLine() + " ..The Variable " + var_name + "  not initialized\n");
                else {
                    ////اختبار اذا كانت قيمة المتحول أكبر من مجال ايندكسات المصفوفة
                    if (temp > list_value(name, scope, scope.getParent(), new ArrayList<>()).size() - 1)
                        Main.fWriter.write("error in line " + this.getLine() + " ...IndexOfBounded\n");

                }
            }
        }
    }

    @Override
    public void CodeGenerate(int helper, String n) {
        try {
            File f = new File("C:\\xampp\\htdocs\\"+ n + ".php");
            FileWriter fw = new FileWriter(f, true);
//            fw.append("\n"+getName() + ".get(");
            if (name != null) {
                fw.append("$"+name + "[");
                fw.flush();
            }
            if (var_name != null) {
                fw.append("$" + var_name);
                fw.flush();
            }
            if (index != -1)
                fw.append(index.toString());


            fw.append("] ");
            if (helper ==0) {
                fw.append(";\n");
                fw.flush();
            }
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
