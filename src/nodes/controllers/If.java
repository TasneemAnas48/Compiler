package nodes.controllers;

import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class If extends Logic{
    List<Compare> if_condition = new ArrayList<>();
    LogicBody logicBody;

    public LogicBody getLogicBody() {
        return logicBody;
    }

    public void setLogicBody(LogicBody logicBody) {
        this.logicBody = logicBody;
    }

    public List<Compare> getIf_condition() {
        return if_condition;
    }

    public void setIf_condition(List<Compare> if_condition) {
        this.if_condition = if_condition;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < if_condition.size(); i++) {
            if (if_condition.get(i) != null)
                this.if_condition.get(i).accept(astVisitor);
        }
        System.out.print(") [ ");
        this.logicBody.accept(astVisitor);
    }
    @Override
    public void CodeGenerate(int helper, String name) {
        try {
            File f = new File("C:\\xampp\\htdocs\\"+ name + ".php");
            FileWriter fw = new FileWriter(f, true);  //Create filewriter object for the file descriptor with append options set as tru
            fw.append("\nif(");
            fw.flush();
            if (!if_condition.isEmpty())
                for (int i = 0; i < if_condition.size(); i++) {
                    if_condition.get(i).CodeGenerate(1, name);

                }
            fw.append(") {\n");
            fw.flush();
            logicBody.CodeGenerate(0, name);
            fw.append("}\n");
            fw.flush();
            fw.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}
