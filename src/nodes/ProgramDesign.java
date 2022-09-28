package nodes;

import nodes.controllers.Controller;
import nodes.pages.Page;
import visitor.ASTVisitor;

public class ProgramDesign extends Node{

    Page page ;
    Controller controller ;

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void accept(ASTVisitor astVisitor) {
        astVisitor.visit(this);
        if (this.page != null)
            this.page.accept(astVisitor);
        if (this.controller != null)
            this.controller.accept(astVisitor);
    }

    @Override
    public  void  CodeGenerate(int helper, String name)  {
        if (this.page != null)
            this.page.CodeGenerate(0, name);
        if (this.controller != null)
            this.controller.CodeGenerate(0, name);
    }
}
