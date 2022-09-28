package nodes.pages;

import Symol_Table.Scope;
import com.company.Main;
import nodes.Node;
import visitor.ASTVisitor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InOut extends Node {
    String input;
    String typename;
    List<Attribute> attributeList = new ArrayList<>();
    List<GetData> getDataList = new ArrayList<>();

    public List<GetData> getGetDataList() {
        return getDataList;
    }

    public void setGetDataList(List<GetData> getDataList) {
        this.getDataList = getDataList;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public List<Attribute> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<Attribute> attributeList) {
        this.attributeList = attributeList;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        for (int i = 0; i < attributeList.size(); i++) {
            if (attributeList.get(i) != null)
                this.attributeList.get(i).accept(astVisitor);
        }
        System.out.print(");");
    }

    public void Radio(InOut inOut, FileWriter myWriter) throws IOException{
        String name = null;
        String required = null;
        String label = null;
        List<String> labels = new ArrayList<>();
        if (!inOut.getAttributeList().isEmpty()) {
            for (int i = 0; i < inOut.getAttributeList().size(); i++) {
                if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "name"))
                    name = inOut.getAttributeList().get(i).getAttribute_list().get(0);
                if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "label"))
                    for (int j = 0; j < inOut.getAttributeList().get(i).getAttribute_list().size(); j++)
                        labels.add(j, inOut.getAttributeList().get(i).getAttribute_list().get(j));
                if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "required"))
                    required = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            }
            for (int i = 0; i < labels.size(); i++) {
                myWriter.append("\n<input type= " + inOut.getTypename() + " name=" + name + " value=" + labels.get(i) + " id= " + labels.get(i));
                if (Objects.equals(required, "\"true\""))
                    myWriter.append(" required ");
                myWriter.append(">\n");
                myWriter.append("<label for= " + labels.get(i) + ">" + labels.get(i).substring(1, labels.get(i).length() - 1) + "</label><br>");
                myWriter.flush();
            }
        }
        if (!inOut.getGetDataList().isEmpty()) {
            for (int i = 0; i < inOut.getGetDataList().size(); i++) {
                if (Objects.equals(inOut.getGetDataList().get(i).getAttribute_name(), "label"))
                    if (Objects.equals(inOut.getGetDataList().get(i).getType(), "getList")) {
                        label = inOut.getGetDataList().get(i).getAttribute_value();
                        myWriter.append("<?php foreach ($" + label.substring(1, label.length() - 1) + " as $item) { ?>");
                        myWriter.append("\n\t<input type= " + inOut.getTypename() + " name=" + name + " value=" + "<?php echo $item ; ?>" + " id= " + "<?php echo $item ; ?>");
                        if (Objects.equals(required, "\"true\""))
                            myWriter.append(" required ");
                        myWriter.append(">\n");
                        myWriter.append("\t<label for= " + "<?php echo $item ; ?>" + ">" + "<?php echo $item ; ?>" + "</label><br>");
                        myWriter.append("\n<?php } ?>");
                        myWriter.flush();
                    }
            }
        }
    }
    public void Checkbox(InOut inOut, FileWriter myWriter) throws IOException{
        String name = null;
        String label = null;
        List<String> labels = new ArrayList<>();
        if (!inOut.getAttributeList().isEmpty()) {
            for (int i = 0; i < inOut.getAttributeList().size(); i++) {
                if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "name"))
                    name = inOut.getAttributeList().get(i).getAttribute_list().get(0);
                if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "label"))
                    for (int j = 0; j < inOut.getAttributeList().get(i).getAttribute_list().size(); j++)
                        labels.add(j, inOut.getAttributeList().get(i).getAttribute_list().get(j));
            }
            for (int i = 0; i < labels.size(); i++) {
                myWriter.append("\n<input type= " + inOut.getTypename() + " name= \"" + name.substring(1, name.length() - 1) + "[]\"" + " value=" + labels.get(i) + " id= " + labels.get(i));
                myWriter.append(">\n");
                myWriter.append("<label for= " + labels.get(i) + ">" + labels.get(i).substring(1, labels.get(i).length() - 1) + "</label>");
                myWriter.flush();
            }
        }
        if (!inOut.getGetDataList().isEmpty()) {
            for (int i = 0; i < inOut.getGetDataList().size(); i++) {
                if (Objects.equals(inOut.getGetDataList().get(i).getAttribute_name(), "label"))
                    if (Objects.equals(inOut.getGetDataList().get(i).getType(), "getList")) {
                        label = inOut.getGetDataList().get(i).getAttribute_value();
                        myWriter.append("<?php foreach ($" + label.substring(1, label.length() - 1) + " as $item) { ?>");
                        myWriter.append("\n\t<input type= " + inOut.getTypename() + " name= \"" + name.substring(1, name.length() - 1) + "[]\"" + " value=" + "<?php echo $item ; ?>" + " id= " + "<?php echo $item ; ?>");
                        myWriter.append(">\n");
                        myWriter.append("\t<label for= " + "<?php echo $item ; ?>" + ">" + "<?php echo $item ; ?>" + "</label>");
                        myWriter.append("\n<?php } ?>");
                        myWriter.flush();
                    }
            }
        }
    }

    public void image_in(InOut inOut, FileWriter myWriter) throws IOException{
        String name = null, label = null;
        String required = null;
        for (int i = 0; i < inOut.getAttributeList().size(); i++) {
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "name"))
                name = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "label"))
                label = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "required"))
                required = inOut.getAttributeList().get(i).getAttribute_list().get(0);
        }
        if (label != null)
            myWriter.append("\n<label for= " + label + ">" + label.substring(1,label.length()-1) + "</label>");
        myWriter.append("\n<input type= \"file\"");
        if (name != null)
            myWriter.append(" name=" + name);
        if (Objects.equals(required, "\"true\""))
            myWriter.append(" required ");
        myWriter.append(">\n");
        myWriter.flush();
    }

    public void submit(InOut inOut, FileWriter myWriter) throws IOException{
        String label = null;
        if (Objects.equals(inOut.getAttributeList().get(0).getAttribute_name(), "label"))
            label = inOut.getAttributeList().get(0).getAttribute_list().get(0);
        myWriter.append("\n<button type=\"submit\">" + label.substring(1,label.length()-1) +"</button>\n");
        myWriter.flush();
    }

    public void number(InOut inOut, FileWriter myWriter) throws IOException{
        String name = null, label = null, placeholder = null, min = null, max = null, step = null;
        String required = null, readonly = null;
        for (int i = 0; i < inOut.getAttributeList().size(); i++) {
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "name"))
                name = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "label"))
                label = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "placeholder"))
                placeholder = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "max"))
                max = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "min"))
                min = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "step"))
                step = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "required"))
                required = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "readonly"))
                readonly = inOut.getAttributeList().get(i).getAttribute_list().get(0);
        }
        if (label != null)
            myWriter.append("\n<label for= " + label + ">" + label.substring(1,label.length()-1) + "</label>");
        myWriter.append("\n<input type= " + inOut.getTypename() );
        if (name != null)
            myWriter.append(" name=" + name);
        if (placeholder != null)
            myWriter.append(" placeholder=" + placeholder);
        if (max != null)
            myWriter.append(" max=" + max);
        if (min != null)
            myWriter.append(" min=" + min);
        if (step != null)
            myWriter.append(" step=" + step);
        if (Objects.equals(required, "\"true\""))
            myWriter.append(" required ");
        if (Objects.equals(readonly, "\"true\""))
            myWriter.append(" readonly ");
        myWriter.append("> \n");
        myWriter.flush();
    }

    public void otherInput(InOut inOut, FileWriter myWriter) throws IOException{
        String name = null, label = null, placeholder = null, maxlength = null, minlength = null;
        String required = null, readonly = null;
        for (int i = 0; i < inOut.getAttributeList().size(); i++) {
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "name"))
                name = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "label"))
                label = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "placeholder"))
                placeholder = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "maxlength"))
                maxlength = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "minlength"))
                minlength = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "required"))
                required = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "readonly"))
                readonly = inOut.getAttributeList().get(i).getAttribute_list().get(0);

        }
        if (label != null)
            myWriter.append("\n<label for= " + label + ">" + label.substring(1,label.length()-1) + "</label>");
        myWriter.append("\n<input type= " + inOut.getTypename() );
        if (name != null)
            myWriter.append(" name=" + name);
        if (placeholder != null)
            myWriter.append(" placeholder=" + placeholder);
        if (maxlength != null)
            myWriter.append(" maxlength=" + maxlength);
        if (minlength != null)
            myWriter.append(" minlength=" + minlength);
        if (Objects.equals(required, "\"true\""))
            myWriter.append(" required ");
        if (Objects.equals(readonly, "\"true\""))
            myWriter.append(" readonly ");
        myWriter.append("> \n");
        myWriter.flush();
    }

    public void input(InOut inOut, FileWriter myWriter) throws IOException {

        if ("radio".equals(inOut.getTypename()))
            Radio(inOut, myWriter);
        else if ("checkbox".equals(inOut.getTypename()))
            Checkbox(inOut, myWriter);

        else if ("image_in".equals(inOut.getTypename()))
            image_in(inOut, myWriter);

        else if ("submit".equals(inOut.getTypename()))
            submit(inOut, myWriter);

        else if ("number".equals(inOut.getTypename()))
            number(inOut, myWriter);

        else
            otherInput(inOut, myWriter);

    }

    public void paragraph(InOut inOut, FileWriter myWriter) throws IOException {
        String label = null;
        if (!inOut.getAttributeList().isEmpty()) {
            if (Objects.equals(inOut.getAttributeList().get(0).getAttribute_name(), "label")) {
                label = inOut.getAttributeList().get(0).getAttribute_list().get(0);
                myWriter.append("\n<p>" + label.substring(1, label.length() - 1) + "</p>\n");
                myWriter.flush();
            }
        }
        else if (!inOut.getGetDataList().isEmpty()){
            if (Objects.equals(inOut.getGetDataList().get(0).getAttribute_name(), "label"))
            {
                if (Objects.equals(inOut.getGetDataList().get(0).getType(), "getVar")){
                    label = inOut.getGetDataList().get(0).getAttribute_value();
                    myWriter.append("\n<p>" + "<?php echo $" + label.substring(1, label.length() - 1) + "; ?>" + "</p>\n");
                    myWriter.flush();
                }
                else if (Objects.equals(inOut.getGetDataList().get(0).getType(), "getList")) {
                    label = inOut.getGetDataList().get(0).getAttribute_value();
                    myWriter.append("<?php foreach ($" + label.substring(1, label.length() - 1) + " as $item) { ?>");
                    myWriter.append("\n\t<p>" + "<?php echo $item ; ?>" + "</p>\n");
                    myWriter.append("<?php } ?>");
                    myWriter.flush();
                }
            }
        }
    }

    public void header(InOut inOut, FileWriter myWriter, int id) throws IOException {
        String label = null;
        if (!inOut.getAttributeList().isEmpty()) {
            if (Objects.equals(inOut.getAttributeList().get(0).getAttribute_name(), "label")) {
                label = inOut.getAttributeList().get(0).getAttribute_list().get(0);
                myWriter.append("\n<h" + id + ">" + label.substring(1, label.length() - 1) + "</h" + id + ">\n");
                myWriter.flush();
            }
        }
        else if (!inOut.getGetDataList().isEmpty()){
            if (Objects.equals(inOut.getGetDataList().get(0).getAttribute_name(), "label"))
            {
                if (Objects.equals(inOut.getGetDataList().get(0).getType(), "getVar")){
                    label = inOut.getGetDataList().get(0).getAttribute_value();
                    myWriter.append("\n<h" + id + ">" + "<?php echo $" + label.substring(1, label.length() - 1) + "; ?>" + "</h" + id + ">\n");
                    myWriter.flush();
                }
                else if (Objects.equals(inOut.getGetDataList().get(0).getType(), "getList")) {
                    label = inOut.getGetDataList().get(0).getAttribute_value();
                    myWriter.append("<?php foreach ($" + label.substring(1, label.length() - 1) + " as $item) { ?>");
                    myWriter.append("\n\t<h" + id + ">" + "<?php echo $item ; ?>" + "</h" + id + ">\n");
                    myWriter.append("<?php } ?>");
                    myWriter.flush();
                }
            }
        }
    }

    public void image_out(InOut inOut, FileWriter myWriter) throws IOException{
        String src = null, alt = null;
        int width = 0, height = 0;
        myWriter.append("\n<img ");
        if (!inOut.getAttributeList().isEmpty()) {
            for (int i = 0; i < inOut.getAttributeList().size(); i++) {
                if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "src"))
                {
                    src = inOut.getAttributeList().get(i).getAttribute_list().get(0);
                    myWriter.append(" src=" + src);
                }
                if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "width"))
                {
                    width = inOut.getAttributeList().get(i).getAttribute_int();
                    if (width != 0)
                        myWriter.append(" width=\"" + width + "px\"");
                }
                if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "height"))
                {
                    height = inOut.getAttributeList().get(i).getAttribute_int();
                    if (height != 0)
                        myWriter.append(" height=\"" + height + "px\"");
                }
                if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "alt"))
                {
                    alt = inOut.getAttributeList().get(i).getAttribute_list().get(0);
                    if (alt != null)
                        myWriter.append(" alt=" + alt);
                }
            }
        }
        if (!inOut.getGetDataList().isEmpty()) {
            for (int i = 0; i < inOut.getGetDataList().size(); i++) {
                if (Objects.equals(inOut.getGetDataList().get(i).getAttribute_name(), "src"))
                {
                    src = inOut.getGetDataList().get(i).getAttribute_value();
                    if (Objects.equals(inOut.getGetDataList().get(i).getType(), "getVar")){
                        myWriter.append(" src=" + "\"<?php echo $" + src.substring(1, src.length() - 1) + "; ?>\"");
                        myWriter.flush();
                    }
                }
                if (Objects.equals(inOut.getGetDataList().get(i).getAttribute_name(), "alt"))
                {
                    alt = inOut.getGetDataList().get(i).getAttribute_value();
                    if (Objects.equals(inOut.getGetDataList().get(i).getType(), "getVar")){
                        myWriter.append(" alt=" + "\"<?php echo $" + alt.substring(1, alt.length() - 1) + "; ?>\"");
                        myWriter.flush();
                    }
                }
                if (Objects.equals(inOut.getGetDataList().get(i).getAttribute_name(), "width"))
                {
                    String width2 = inOut.getGetDataList().get(i).getAttribute_value();
                    if (Objects.equals(inOut.getGetDataList().get(i).getType(), "getVar")){
                        myWriter.append(" width=" + "\"<?php echo $" + width2.substring(1, width2.length() - 1) + "; ?>px\"");
                        myWriter.flush();
                    }
                }
                if (Objects.equals(inOut.getGetDataList().get(i).getAttribute_name(), "height"))
                {
                    String height2 = inOut.getGetDataList().get(i).getAttribute_value();
                    if (Objects.equals(inOut.getGetDataList().get(i).getType(), "getVar")){
                        myWriter.append(" height=" + "\"<?php echo $" + height2.substring(1, height2.length() - 1) + "; ?>px\"");
                        myWriter.flush();
                    }
                }
            }
        }
        myWriter.append("/>\n");
        myWriter.flush();
    }

    public void link(InOut inOut, FileWriter myWriter) throws IOException{
        String label = null, url = null;
        boolean get_label = false, get_url = false;
        if (!inOut.getAttributeList().isEmpty()) {
            for (int i = 0; i < inOut.getAttributeList().size(); i++) {
                if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "label"))
                    label = inOut.getAttributeList().get(i).getAttribute_list().get(0);
                if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "url"))
                    url = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            }
        }
        if (!inOut.getGetDataList().isEmpty()) {
            for (int i = 0; i < inOut.getGetDataList().size(); i++) {
                if (Objects.equals(inOut.getGetDataList().get(i).getAttribute_name(), "label"))
                {
                    if (Objects.equals(inOut.getGetDataList().get(i).getType(), "getVar")) {
                        get_label = true;
                        label = inOut.getGetDataList().get(i).getAttribute_value();
                    }
                }
                if (Objects.equals(inOut.getGetDataList().get(i).getAttribute_name(), "url"))
                {
                    if (Objects.equals(inOut.getGetDataList().get(i).getType(), "getVar")) {
                        get_url = true;
                        url = inOut.getGetDataList().get(i).getAttribute_value();
                    }
                }
            }
        }
        myWriter.append("\n<a ");
        if (!get_url && url != null)
            myWriter.append("href=" + url + "> ");
        else if (get_url && url != null)
            myWriter.append("href=" + "\"<?php echo $" + url.substring(1, url.length() - 1) + "; ?>\" > " );
        if (!get_label && label != null)
            myWriter.append(label.substring(1, label.length() - 1) + " </a>\n");
        else if (get_label && label != null)
            myWriter.append("<?php echo $" + label.substring(1, label.length() - 1) + "; ?> </a> ");
        myWriter.flush();
    }

    public void button(InOut inOut, FileWriter myWriter) throws IOException {
        String label = null, url = null;
        boolean get_label = false, get_url = false;
        if (!inOut.getAttributeList().isEmpty()) {
            for (int i = 0; i < inOut.getAttributeList().size(); i++) {
                if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "label"))
                    label = inOut.getAttributeList().get(i).getAttribute_list().get(0);
                if (Objects.equals(inOut.getAttributeList().get(i).getAttribute_name(), "url"))
                    url = inOut.getAttributeList().get(i).getAttribute_list().get(0);
            }
        }
        if (!inOut.getGetDataList().isEmpty()) {
            for (int i = 0; i < inOut.getGetDataList().size(); i++) {
                if (Objects.equals(inOut.getGetDataList().get(i).getAttribute_name(), "label"))
                {
                    if (Objects.equals(inOut.getGetDataList().get(i).getType(), "getVar")) {
                        get_label = true;
                        label = inOut.getGetDataList().get(i).getAttribute_value();
                    }
                }
                if (Objects.equals(inOut.getGetDataList().get(i).getAttribute_name(), "url"))
                {
                    if (Objects.equals(inOut.getGetDataList().get(i).getType(), "getVar")) {
                        get_url = true;
                        url = inOut.getGetDataList().get(i).getAttribute_value();
                    }
                }
            }
        }
        myWriter.append("\n<button type=\"button\">");
        if (url != null & get_url)
            myWriter.append("<a href= "+  "\"<?php echo $" + url.substring(1, url.length() - 1) + "; ?>\" >");
        else if (url != null && !get_url)
            myWriter.append("<a href= "+ url + ">");
        if (get_label && label != null)
            myWriter.append("<?php echo $" + label.substring(1, label.length() - 1) + "; ?>");
        else if (!get_label && label != null)
            myWriter.append(label.substring(1,label.length()-1));
        if (url != null)
            myWriter.append(" </a></button>\n");
        else
            myWriter.append("</button>\n");
        myWriter.flush();
    }

    public void output(InOut inOut, FileWriter myWriter) throws IOException{

        if ("paragraph".equals(inOut.getTypename()))
            paragraph(inOut, myWriter);

        else if("header1".equals(inOut.getTypename()))
            header(inOut, myWriter, 1);

        else if("header2".equals(inOut.getTypename()))
            header(inOut, myWriter, 2);

        else if("header3".equals(inOut.getTypename()))
            header(inOut, myWriter, 3);

        else if("image_out".equals(inOut.getTypename()))
            image_out(inOut, myWriter);

        else if ("link".equals(inOut.getTypename()))
            link(inOut, myWriter);

        else if ("button".equals(inOut.getTypename()))
            button(inOut, myWriter);

    }

    public void form(InOut inOut, FileWriter myWriter) throws IOException{
        if ("action".equals(inOut.getTypename())) {
            String controller = null;
            if (Objects.equals(inOut.getAttributeList().get(0).getAttribute_name(), "controller")) {
                controller = inOut.getAttributeList().get(0).getAttribute_list().get(0);
                myWriter.append("<form method=\"post\" action=" + controller+ " > \n");
                myWriter.flush();
            }
        }
    }

    public void get(InOut inOut, FileWriter myWriter) throws IOException{
        if ("data".equals(inOut.getTypename())) {
            String controller = null;
            if (Objects.equals(inOut.getAttributeList().get(0).getAttribute_name(), "controller")) {
                controller = inOut.getAttributeList().get(0).getAttribute_list().get(0);
                myWriter.append("<?php include " + controller+ " ;?> \n");
                myWriter.flush();
            }
        }
    }

    @Override
    public void CodeGenerate(int helper, String name) {
        File ff = new File("C:\\xampp\\htdocs\\"+name + ".php");
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter(ff, true);

            if (Objects.equals(this.getInput(), "input"))
                input(this, myWriter);

            else if (Objects.equals(this.getInput(), "output"))
                output(this, myWriter);

            else if (Objects.equals(this.getInput(), "Start Form"))
                form(this, myWriter);

            else if (Objects.equals(this.getInput(), "End Form"))
            {
                myWriter.append("</form> \n" );
                myWriter.flush();
            }

            else if (Objects.equals(this.getInput(), "Enter"))
            {
                myWriter.append("<br> \n" );
                myWriter.flush();
            }

            else if (Objects.equals(this.getInput(), "get"))
                get(this, myWriter);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void check(Scope scope) throws IOException {

        if(input.equals("input"))
        {

            if(typename.equals("paragraph") || typename.equals("header1") || typename.equals("header2")
                    || typename.equals("header3") || typename.equals("link") || typename.equals("image_out") || typename.equals("button") )
            {
                Main.fWriter.write("error in line  " + this.getLine() + "..The Attribute  " + this.typename+ "  is not a type of input attributes... \n");

            }
            if(!typename.equals("checkbox") && !typename.equals("radio"))
            {
                if(getDataList.size()>0)
                    Main.fWriter.write("error in line  " + this.getLine() + "..The Attribute  getData is not valid with " + typename +" attributes... \n");
            }
        }
        else if(input.equals("output"))
        {
            if(typename.equals("radio") || typename.equals("text") || typename.equals("number")
                    || typename.equals("password") || typename.equals("email") || typename.equals("checkbox")
                    || typename.equals("image_in") || typename.equals("submit") )
            {
                Main.fWriter.write("error in line  " + this.getLine() + "..The Attribute  " + this.typename+ "  is not a type of output attributes... \n");

            }
        }

        if(typename!=null)
        {

            if(typename.equals("radio"))
            {
                for (int i = 0; i < attributeList.size(); i++) {
                    if(attributeList.get(i).attribute_name.equals("name") || attributeList.get(i).attribute_name.equals("label") || attributeList.get(i).attribute_name.equals("required"))
                        continue;
                    else
                    {
                        Main.fWriter.write("error in line  " + this.getLine() + "..The Attribute  " + attributeList.get(i).attribute_name+ "  is not a type of radio attributes... \n");

                    }
                }
            }
            if(typename.equals("checkbox"))
            {
                for (int i = 0; i < attributeList.size(); i++) {
                    if(attributeList.get(i).attribute_name.equals("name") || attributeList.get(i).attribute_name.equals("label") )
                        continue;
                    else
                    {
                        Main.fWriter.write("error in line  " + this.getLine() + "..The Attribute  " + attributeList.get(i).attribute_name+ "  is not a type of checkbox attributes... \n");

                    }
                }
            }
            if(typename.equals("image_in"))
            {
                for (int i = 0; i < attributeList.size(); i++) {
                    if(attributeList.get(i).attribute_name.equals("name") || attributeList.get(i).attribute_name.equals("label") || attributeList.get(i).attribute_name.equals("required") )
                        continue;
                    else
                    {
                        Main.fWriter.write("error in line  " + this.getLine() + "..The Attribute  " + attributeList.get(i).attribute_name+ "  is not a type of image_in attributes... \n");

                    }
                }
            }
            if(typename.equals("submit"))
            {
                for (int i = 0; i < attributeList.size(); i++) {
                    if( attributeList.get(i).attribute_name.equals("label")  )
                        continue;
                    else
                    {
                        Main.fWriter.write("error in line  " + this.getLine() + "..The Attribute  " + attributeList.get(i).attribute_name+ "  is not a type of submit attributes... \n");

                    }
                }
            }
            if(typename.equals("number"))
            {
                for (int i = 0; i < attributeList.size(); i++) {
                    if(attributeList.get(i).attribute_name.equals("name") || attributeList.get(i).attribute_name.equals("label") || attributeList.get(i).attribute_name.equals("required")||
                            attributeList.get(i).attribute_name.equals("placeholder")||attributeList.get(i).attribute_name.equals("max")||
                            attributeList.get(i).attribute_name.equals("min")|| attributeList.get(i).attribute_name.equals("step")
                            ||attributeList.get(i).attribute_name.equals("readonly"))
                        continue;
                    else
                    {
                        Main.fWriter.write("error in line  " + this.getLine() + "..The Attribute  " + attributeList.get(i).attribute_name+ "  is not a type of number attributes... \n");

                    }
                }
            }
            if(typename.equals("text") || typename.equals("email") || typename.equals("password"))
            {
                for (int i = 0; i < attributeList.size(); i++) {
                    if(attributeList.get(i).attribute_name.equals("name") || attributeList.get(i).attribute_name.equals("label") || attributeList.get(i).attribute_name.equals("required")||
                            attributeList.get(i).attribute_name.equals("placeholder")||attributeList.get(i).attribute_name.equals("maxlength")||
                            attributeList.get(i).attribute_name.equals("minlength")
                            ||attributeList.get(i).attribute_name.equals("readonly"))
                        continue;
                    else
                    {
                        Main.fWriter.write("error in line  " + this.getLine() + "..The Attribute  " + attributeList.get(i).attribute_name+ "  is not a type of " + typename + " attributes... \n");

                    }
                }
            }

            if(typename.equals("paragraph"))
            {
                for (int i = 0; i < attributeList.size(); i++) {
                    if(attributeList.get(i).attribute_name.equals("label") )
                        continue;
                    else
                    {
                        Main.fWriter.write("error in line  " + this.getLine() + "..The Attribute  " + attributeList.get(i).attribute_name+ "  is not a type of paragraph attributes... \n");

                    }
                }
            }
            if(typename.equals("header1") || typename.equals("header2") || typename.equals("header3"))
            {
                for (int i = 0; i < attributeList.size(); i++) {
                    if(attributeList.get(i).attribute_name.equals("label") )
                        continue;
                    else
                    {
                        Main.fWriter.write("error in line  " + this.getLine() + "..The Attribute  " + attributeList.get(i).attribute_name+ "  is not a type of " + typename + " attributes... \n");

                    }
                }
            }

            if(typename.equals("image_out"))
            {
                for (int i = 0; i < attributeList.size(); i++) {
                    if( attributeList.get(i).attribute_name.equals("width")||  attributeList.get(i).attribute_name.equals("height"))
                    {
                        if(attributeList.get(i).getAttribute_list().size() > 0 ) {
                            Main.fWriter.write("error in line  " + this.getLine() + "..The Attribute  " + attributeList.get(i).attribute_name + "  can not receive string... \n");
                            attributeList.get(i).setAttribute_int(100);
                        }
                    }
                    else if(attributeList.get(i).attribute_name.equals("src")|| attributeList.get(i).attribute_name.equals("alt"))
                        continue;
                    else
                    {
                        Main.fWriter.write("error in line  " + this.getLine() + "..The Attribute  " + attributeList.get(i).attribute_name+ "  is not a type of image_out attributes... \n");

                    }
                }
            }

            if(typename.equals("link") || typename.equals("button"))
            {
                for (int i = 0; i < attributeList.size(); i++) {
                    if(attributeList.get(i).attribute_name.equals("label") ||attributeList.get(i).attribute_name.equals("url"))
                        continue;
                    else
                    {
                        Main.fWriter.write("error in line  " + this.getLine() + "..The Attribute  " + attributeList.get(i).attribute_name+ "  is not a type of " + typename + " attributes... \n");

                    }
                }
            }

        }


    }
}
