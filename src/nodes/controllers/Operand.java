package nodes.controllers;

import Symol_Table.Scope;
import com.company.Main;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Operand extends Compare {

    Type type1, type2;
    String boolEx;
    ListGet Get_Left;
    ListGet Get_Right;
    ListSize Size_Left;
    ListSize Size_Right;

    public ListGet getGet_Left() {
        return Get_Left;
    }

    public void setGet_Left(ListGet get_Left) {
        Get_Left = get_Left;
    }

    public ListGet getGet_Right() {
        return Get_Right;
    }

    public void setGet_Right(ListGet get_Right) {
        Get_Right = get_Right;
    }

    public ListSize getSize_Left() {
        return Size_Left;
    }

    public void setSize_Left(ListSize size_Left) {
        Size_Left = size_Left;
    }

    public ListSize getSize_Right() {
        return Size_Right;
    }

    public void setSize_Right(ListSize size_Right) {
        Size_Right = size_Right;
    }

    public Type getType1() {
        return type1;
    }

    public void setType1(Type type1) {
        this.type1 = type1;
    }

    public Type getType2() {
        return type2;
    }

    public void setType2(Type type2) {
        this.type2 = type2;
    }

    public String getBoolEx() {
        return boolEx;
    }

    public void setBoolEx(String boolEx) {
        this.boolEx = boolEx;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (this.type1 != null) this.type1.accept(astVisitor);


        if (this.type2 != null) this.type2.accept(astVisitor);

        if (this.Get_Left != null) this.Get_Left.accept(astVisitor);

        if (this.Get_Right != null) this.Get_Right.accept(astVisitor);

        if (this.Size_Left != null) this.Size_Left.accept(astVisitor);

        if (boolEx != null) System.out.print(boolEx + " ");


        if (this.Size_Right != null) this.Size_Right.accept(astVisitor);

    }

    @Override
    public void check(Scope scope) throws IOException {
        /////اذا الطرفين type
        if (type1 != null && type2 != null) {
            ////اذا الطرف الاول سترينغ بفحص اذا هو متحول أو قيمة بين علامتين تنصيص
            if (type1.getString_type() != null) {

                /////اذا كان  متحول نوعه ليست
                if (check_var(type1.getString_type(), scope, scope.getParent(), "list") == 1) {
                    ///بشوف  الطرف التاني اذا كان سترينغ او انتجر مابقدر قارن وبعطيه ايرور
                    if (type2.getInt_type() != null)
                        Main.fWriter.write("error in line  " + this.getLine() + "..Cannot compare list " + type1.getString_type() + "  with integer " + type2.getInt_type() + "\n");

                    else if (type2.getString_type() != null)
                        Main.fWriter.write("error in line  " + this.getLine() + "..Cannot compare list " + type1.getString_type() + "  with string " + type2.getString_type() + "\n");
                }

                ////اذا كان الطرف الاول سترينغ عادية ومو متحول
                else if (type1.getString_type().startsWith("\"") && type1.getString_type().endsWith("\"")) {
                    ///بشوف اذا الطرف التاني انتيجر بعطيه ايرور مابيقدر يقارن انتجر مع سترينغ
                    if (type2.getInt_type() != null)
                        Main.fWriter.write("error in line  " + this.getLine() + "..Cannot compare integer " + type2.getInt_type() + "  with string " + type1.getString_type() + "\n");

                }

            }
            ////اذا كان الطرف التاني سترينغ
            if (type2.getString_type() != null) {
                ///بشوف  الطرف التاني اذا كان سترينغ او انتجر مابقدر قارن وبعطيه ايرور
                if (check_var(type2.getString_type(), scope, scope.getParent(), "list") == 1) {
                    if (type1.getInt_type() != null)
                        Main.fWriter.write("error in line  " + this.getLine() + "..Cannot compare list " + type2.getString_type() + "  with integer " + type1.getInt_type() + "\n");

                    if (type1.getString_type() != null)
                        Main.fWriter.write("error in line  " + this.getLine() + "..Cannot compare list " + type2.getString_type() + "  with string " + type1.getString_type() + "\n");
                }

                ////اذا كان الطرف الاول سترينغ عادية ومو متحول
                else if (type2.getString_type().startsWith("\"") && type2.getString_type().endsWith("\"")) {
                    if (type1.getInt_type() != null)
                        Main.fWriter.write("error in line  " + this.getLine() + "..Cannot compare integer " + type1.getInt_type() + "  with string " + type2.getString_type() + "\n");

                }

            }

        }
        if (Size_Left != null) {
            Size_Left.check(scope);
            if (type1 != null) {
                if (type1.getString_type() != null && type1.getString_type().startsWith("\"") && type1.getString_type().endsWith("\"")) {
                    Main.fWriter.write("error in line  " + this.getLine() + "..Cannot compare string " + type1.getString_type() + "  with integer(value of size())\n");

                }
            }
        }
        if (Size_Right != null) {
            Size_Right.check(scope);
            if (type1 != null) {
                if (type1.getString_type() != null && type1.getString_type().startsWith("\"") && type1.getString_type().endsWith("\"")) {
                    Main.fWriter.write("error in line  " + this.getLine() + "..Cannot compare string " + type1.getString_type() + "  with integer(value of size())\n ");

                }
            }

        }
        if (Get_Left != null) Get_Left.check(scope);
        if (Get_Right != null) Get_Right.check(scope);

    }

    @Override
    public void CodeGenerate(int helper, String name) {
        try {
            File f = new File("C:\\xampp\\htdocs\\"+ name + ".php");
            FileWriter fw = new FileWriter(f, true);


            if (this.type1 != null) {

                type1.CodeGenerate(1, name);
            }

            if (this.Get_Left != null)

                Get_Left.CodeGenerate(1, name);

            if (this.Size_Left != null) {

                Size_Left.CodeGenerate(1, name);
            }


            if (boolEx != null) {
                fw.append(" " + boolEx + " ");
                fw.flush();
            }


            if (this.type2 != null) {

                type2.CodeGenerate(1, name);
            }


            if (this.Get_Right != null) Get_Right.CodeGenerate(1, name);


            if (this.Size_Right != null) Size_Right.CodeGenerate(1, name);

            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
