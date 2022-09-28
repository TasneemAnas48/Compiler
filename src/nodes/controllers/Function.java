package nodes.controllers;

import Symol_Table.FunctionScope;
import Symol_Table.Scope;
import com.company.Main;
import nodes.Node;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Function extends Node {
    String name;
    Parameter parameter;
    LogicBody logicBody;
    Type return_value;

    public Type getReturn_value() {
        return return_value;
    }

    public void setReturn_value(Type return_value) {
        this.return_value = return_value;
    }

    public LogicBody getLogicBody() {
        return logicBody;
    }

    public void setLogicBody(LogicBody logicBody) {
        this.logicBody = logicBody;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        this.parameter.accept(astVisitor);
        System.out.println(") [");
        this.logicBody.accept(astVisitor);
    }

    @Override
    public void check(Scope scope) throws IOException {
        FunctionScope functionScope = new FunctionScope();

        functionScope.setName(name);
        functionScope.setReturn_(return_value);
        if (parameter != null) for (int i = 0; i < parameter.getParameters().size(); i++)
            functionScope.setParameters(parameter.getParameters().get(i), "function");

        ///اختبار اذا كان اسم التابع معرف سابقا بنفس الاسم وبنفس عدد الباراميترات
        if (scope.getFunctionScopeMap().containsKey(name) && scope.getFunctionScopeMap().get(name).getParameters().size() == functionScope.getParameters().size()) {
            Main.fWriter.write("error in line  " + this.getLine() + "..The function name  " + this.name + "  is already in use. \n");
        } else if (scope.getFunctionScopeMap().containsKey(name) && scope.getFunctionScopeMap().get(name).getParameters().size() != functionScope.getParameters().size()) {
            ///نقوم بتخزينه كتابع قام بعمل override
            scope.getFunctionScopeMap().get(name).setSimilar_functions(functionScope);
        } else {
            ///نقوم بتخزينه
            scope.setFunctionScopeMap(name, functionScope);
        }
    }

    @Override
    public void CodeGenerate(int helper, String name) {
        try {
            File f = new File("C:\\xampp\\htdocs\\"+ name + ".php");
            FileWriter fw = new FileWriter(f, true);  //Create filewriter object for the file descriptor with append options set as tru
            fw.append("\nfunction " + this.getName() + "(");
            fw.flush();
            if (parameter != null) parameter.CodeGenerate(1, name);
            fw.append(") {\n");
            fw.flush();
            if (logicBody != null) logicBody.CodeGenerate(0, name);

            if (return_value != null) {
                fw.append("return");
                fw.flush();
                return_value.CodeGenerate(1, name);
                fw.append(";");
                fw.flush();


            }

            fw.append("}\n");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
