package nodes.controllers;

import Symol_Table.Scope;
import com.company.Main;
import nodes.Node;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Assigment extends Logic {
    String var_name;
    List<OperandType> operandTypes = new ArrayList<>();
    Type left_op;
    ListUse listGet;
    ListUse listSize;


    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    CallFunction callFunction;

    public ListUse getListGet() {
        return listGet;
    }

    public void setListGet(ListGet listGet) {
        this.listGet = listGet;
    }

    public ListUse getListSize() {
        return listSize;
    }

    public void setListSize(ListSize listSize) {
        this.listSize = listSize;
    }

    public String getVar_name() {
        return var_name;
    }

    public void setVar_name(String var_name) {
        this.var_name = var_name;
    }

    public List<OperandType> getOperandTypes() {
        return operandTypes;
    }

    public void setOperandTypes(List<OperandType> operandTypes) {
        this.operandTypes = operandTypes;
    }

    public Type getLeft_op() {
        return left_op;
    }

    public void setLeft_op(Type left_op) {
        this.left_op = left_op;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (left_op != null)
            this.left_op.accept(astVisitor);
        for (int i = 0; i < operandTypes.size(); i++) {
            if (operandTypes.get(i) != null)
                this.operandTypes.get(i).accept(astVisitor);
        }
    }

    @Override
    public void check(Scope scope) throws IOException {

        if(left_op!=null)
        {
            if (left_op.getInt_type() != null) {
                for (int i = 0; i < operandTypes.size(); i++) {
                    if (operandTypes.get(i).getRight_op().getString_type() != null && operandTypes.get(i).getRight_op().getString_type().startsWith("\"")  && operandTypes.get(i).getRight_op().getString_type().endsWith("\"")) {
                        Main.fWriter.write("error in line  " + this.getLine() + " ..Casting Error cannot calculate Integer with String\n");
                        break;
                    }

                }
            } else if (left_op.getString_type() != null && left_op.getString_type().startsWith("\"")  && left_op.getString_type().endsWith("\""))  {
                for (int i = 0; i < operandTypes.size(); i++) {
                    if (operandTypes.get(i).getRight_op().getInt_type() != null) {
                        Main.fWriter.write("error in line  " + this.getLine() + " ..Casting Error cannot calculate String with Integer\n");
                        break;
                    }

                }
            }
        }

        else if(listGet!=null)
            listGet.check(scope);
        else if(listSize!=null)
            listSize.check(scope);
    }

    public void CodeGenerate(int helper, String name) {
        try {
            File f = new File("C:\\xampp\\htdocs\\"+ name +".php");
            FileWriter fw = new FileWriter(f, true);
            fw.append("$" + var_name + "=");

            fw.flush();
            if (left_op != null){
                left_op.CodeGenerate(1, name);}
            if (listGet != null) {
               // fw.append(listGet.getName());
               // fw.flush();
                listGet.CodeGenerate(1, name);
            }
            if (listSize != null) {
//                fw.append(listSize.getName());
//                fw.flush();
                listSize.CodeGenerate(1, name);
            }
            if (!operandTypes.isEmpty())
                for (int i = 0; i < operandTypes.size(); i++) {
                    operandTypes.get(i).CodeGenerate(1, name);
                }
            if (callFunction != null)
                callFunction.CodeGenerate(1, name);
            if (helper == 0)
                fw.append(";\n");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    @Override
    public void check_fun(Map<String , String> map) throws IOException {
        for (int i = 0; i < map.size(); i++) {
            System.out.println(map.keySet().toArray()[i]);
        }

        if(var_name!=null) {
            if(!map.containsKey(var_name))
                Main.fWriter.write("error in line  " + this.getLine() + " ..the variable " + var_name + " not define in scope function\n");

        }
        if(left_op!=null) {
            if(left_op.getString_type() != null)
                if(!left_op.getString_type().startsWith("\"") && !left_op.getString_type().endsWith("\""))
                {
                    if(!map.containsKey(left_op.getString_type()))
                        Main.fWriter.write("error in line  " + this.getLine() + " ..the variable " + left_op.getString_type() + " not define in scope function\n");

                }

        }

    }
}
