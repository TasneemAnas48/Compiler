package nodes.pages;

import nodes.Node;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Header extends Node {

    List<AttributeHeader> attributeHeaderList=new ArrayList<>();

    public List<AttributeHeader> getAttributeHeaderList() {
        return attributeHeaderList;
    }

    public void setAttributeHeaderList(List<AttributeHeader> attributeHeaderList) {
        this.attributeHeaderList = attributeHeaderList;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < attributeHeaderList.size(); i++) {
            if (attributeHeaderList.get(i) != null)
                this.attributeHeaderList.get(i).accept(astVisitor);
        }
        System.out.print("\n\t\t]");
    }

    @Override
    public void CodeGenerate(int helper, String name) {
        String lang_value = null, title_value = null;
        for (int i = 0; i < this.getAttributeHeaderList().size(); i++) {
            if (Objects.equals(this.getAttributeHeaderList().get(i).getKey(), "language"))
                lang_value = this.getAttributeHeaderList().get(i).getValue();
            else if (Objects.equals(this.getAttributeHeaderList().get(i).getKey(), "title"))
                title_value = this.getAttributeHeaderList().get(i).getValue();
        }
        File ff = new File("C:\\xampp\\htdocs\\"+name +".php");
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter(ff, true);
            myWriter.append(
                    "<html lang=" + lang_value + ">\n" +
                    "\n" +
                    "<head>\n" +
                    "    <meta charset=\"utf-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                    "    <title>" + title_value.substring(1,title_value.length()-1) + "</title>\n" +
                    "</head>\n");
            myWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}


