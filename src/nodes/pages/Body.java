package nodes.pages;

import nodes.Node;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Body extends Node {

    List<InOut>inOutList = new ArrayList<>();

    public List<InOut> getInOutList() {
        return inOutList;
    }

    public void setInOutList(List<InOut> inOutList) {
        this.inOutList = inOutList;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < inOutList.size(); i++) {
            if (inOutList.get(i) != null)
                this.inOutList.get(i).accept(astVisitor);
        }
        System.out.print("\n\t\t]");
    }

    @Override
    public void CodeGenerate(int helper, String name) {

        File ff = new File("C:\\xampp\\htdocs\\"+name + ".php");
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter(ff, true);
            myWriter.append("<body>\n");
            myWriter.flush();

            for (int i = 0; i < this.inOutList.size(); i++) {
                if (this.inOutList.get(i) != null)
                    this.inOutList.get(i).CodeGenerate(0, name);
            }

            myWriter.append("</body>\n");
            myWriter.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
