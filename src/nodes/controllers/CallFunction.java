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

public class CallFunction extends Logic {
    String name;
    List<Type> parameters = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Type> getParameters() {
        return parameters;
    }

    public void setParameters(List<Type> parameters) {
        this.parameters = parameters;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < parameters.size(); i++) {
            if (parameters.get(i) != null)
                this.parameters.get(i).accept(astVisitor);
        }
        System.out.print(");");
    }

    @Override
    public void check(Scope scope) throws IOException {
        ///اختبار اذا كان التابع المستدعى معرف مسبقا
        if (!scope.getFunctionScopeMap().containsKey(name))
            Main.fWriter.write("error in line " + this.getLine() + " ...this function " + name + " not found\n");

        ///اختبار اذا كانت الباراميترات متوافقة مع باراميترات التابع الاصلي او احد التوابع التي قامت بعمل override له
        if (scope.getFunctionScopeMap().containsKey(name)) {
            boolean check = false;
            FunctionScope functionSc = scope.getFunctionScopeMap().get(name);

            if (parameters.size() != scope.getFunctionScopeMap().get(name).getParameters().size()) {

                for (int i = 0; i < functionSc.getSimilar_functions().size(); i++) {
                    if (functionSc.getSimilar_functions().get(i).getParameters().size() == parameters.size()) {
                        check = true;
                        break;
                    }
                }
                if (!check)
                    Main.fWriter.write("error in line " + this.getLine() + " ...Parameters do not match, during function " + name + " call \n");

            }
        }
    }

    public void CodeGenerate(int helper, String name) {
        try {
            File f = new File( "C:\\xampp\\htdocs\\"+ name + ".php");
            FileWriter fw = new FileWriter(f, true);
            fw.append(this.getName() + "(");
            fw.flush();
            if (!parameters.isEmpty())
                for (int i = 0; i < parameters.size(); i++) {
                    if (i == this.parameters.size() - 1)
                        parameters.get(i).CodeGenerate(1, name);
                    else {
                        parameters.get(i).CodeGenerate(1, name);
                        fw.append(',');
                        fw.flush();
                    }
                }
            fw.append(")");
            fw.flush();

            if (helper == 0)
                fw.append(";\n");

            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
