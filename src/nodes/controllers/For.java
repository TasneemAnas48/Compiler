package nodes.controllers;

import Symol_Table.Scope;
import com.company.Main;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class For extends Logic {
    String operand;
    Type end;
    String var_name;
    Integer increase;
    LogicBody logicBody;
    ListGet Get_Right;

    ListSize Size_Right;


    public ListGet getGet_Right() {
        return Get_Right;
    }

    public void setGet_Right(ListGet get_Right) {
        Get_Right = get_Right;
    }


    public ListSize getSize_Right() {
        return Size_Right;
    }

    public void setSize_Right(ListSize size_Right) {
        Size_Right = size_Right;
    }


    public LogicBody getLogicBody() {
        return logicBody;
    }

    public void setLogicBody(LogicBody logicBody) {
        this.logicBody = logicBody;
    }

    public String getOperand() {
        return operand;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    public Type getEnd() {
        return end;
    }

    public void setEnd(Type end) {
        this.end = end;
    }

    public String getVar_name() {
        return var_name;
    }

    public void setVar_name(String var_name) {
        this.var_name = var_name;
    }

    public Integer getIncrease() {
        return increase;
    }

    public void setIncrease(Integer increase) {
        this.increase = increase;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        this.end.accept(astVisitor);
        System.out.print("-> ");
        if (var_name != null)
            System.out.println(this.var_name + " ");
        if (operand != null)
            System.out.print(" , " + operand);
        if (increase != null)
            System.out.println(increase + " ) [ ");
        if (this.logicBody != null)
            this.logicBody.accept(astVisitor);
    }

    @Override
    public void check(Scope scope) throws IOException {

        ///اختبار اذا كان المتحول غير معرف قبل استخدامه
        if (check_var(var_name, scope, scope.getParent(), "var") == 0)
            Main.fWriter.write( "error in line  " + this.getLine() + " ..The Variable " + var_name + "  not define\n");
            ///اختبار اذا كان المتحول معرف ولكن من نوع آخر
        else if (check_var(var_name, scope, scope.getParent(), "var") == 2)
            Main.fWriter.write( "error in line  " + this.getLine() + " ..The Variable " + var_name + "  not the type var\n" );

        ///اختبار اذا كان المتحول المستخدم كعداد مهيأ مسبقا
        if (check_int(var_name, scope, scope.getParent(), -1000) == -1000)
            Main.fWriter.write("error in line  " + this.getLine() + " ..The Variable " + var_name + "  not initialized\n");

        if (Get_Right != null) {
            Get_Right.check(scope);
        } else if (Size_Right != null) {
            Size_Right.check(scope);
        }
    }

    public void CodeGenerate(int helper, String name) {
        try {
            File f = new File("C:\\xampp\\htdocs\\"+ name + ".php");
            FileWriter fw = new FileWriter(f, true);  //Create filewriter object for the file descriptor with append options set as tru
            fw.append("\nfor( $"+var_name);
            fw.flush();
         //   var_name.CodeGenerate(1);
            fw.append("; $"+var_name);
            fw.flush();
          //  var_name.CodeGenerate(1);
            if (operand.equals("+")  || operand.equals("*")) fw.append("<");
            else fw.append(">");
            fw.flush();
            if (end != null)
                end.CodeGenerate(1, name);
            else if (Get_Right != null) {
                Get_Right.CodeGenerate(1, name);
            } else if (Size_Right != null) {
                Size_Right.CodeGenerate(1, name);
            }
            fw.append("; $"+var_name);
            fw.flush();
            //var_name.CodeGenerate(1);
            fw.append(operand + "=" + increase.toString() + "){\n");
            fw.flush();
            logicBody.CodeGenerate(0, name);
            fw.append("\n}");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    @Override
    public void check_fun(Map<String, String> map ) throws IOException {
        if(var_name!=null) {
            if(!map.containsKey(var_name))
                Main.fWriter.write("error in line  " + this.getLine() + " ..the variable " + var_name + " not define in scope function\n");

        }
        if(end!=null) {
            if(end.getString_type() != null)
                if(!end.getString_type().startsWith("\"") && !end.getString_type().endsWith("\""))
                {
                    if(!map.containsKey(end.getString_type()))
                        Main.fWriter.write("error in line  " + this.getLine() + " ..the variable " + end.getString_type() + " not define in scope function\n");

                }

        }
        if(Get_Right!=null)
        {
            Get_Right.check_fun(map);
        }
        if(Size_Right!=null)
        {
            Size_Right.check_fun(map);
        }

    }
}
