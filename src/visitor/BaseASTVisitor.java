package visitor;

import nodes.Node;
import nodes.Program;
import nodes.ProgramDesign;
import nodes.controllers.*;
import nodes.pages.*;

public class BaseASTVisitor implements ASTVisitor{



    @Override
    public void visit(Program program) {
        System.out.println("Program { " );
        for (int i = 0; i < program.getProgramDesigns().size(); i++) {
            if ( program.getProgramDesigns().get(i) != null) {
                program.getProgramDesigns().get(i);
            }
        }
    }

    @Override
    public void visit(ProgramDesign programDesign) {
        if (programDesign.getPage()!= null)
           programDesign.getPage();
        if (programDesign.getController() != null)
            programDesign.getController();
    }

    @Override
    public void visit(Print print) {
        System.out.print("\n\t\t\tPrint ( ");
        for (int i = 0; i < print.getPrint_list().size(); i++) {
            if(print.getPrint_list() != null)
                print.getPrint_list();
        }
    }

    @Override
    public void visit(Variables variables) {
        System.out.print("var ");
        for (int i = 0; i < variables.getVariables().size(); i++) {
            if (variables.getVariables().get(i) != null)
                variables.getVariables().get(i);
        }
    }

    @Override
    public void visit(Var var) {
        if(var.getVar_name() != null)
            System.out.print(var.getVar_name());
        if (var.getAssigment() != null)
            var.getAssigment();
    }

    @Override
    public void visit(Assigment assigment) {
        if (assigment.getVar_name() != null)
            System.out.print("\t"+assigment.getVar_name() + " = ");
        if (assigment.getLeft_op() != null)
            assigment.getLeft_op();
        for (int i = 0; i < assigment.getOperandTypes().size(); i++) {
            if (assigment.getOperandTypes().get(i) != null)
                assigment.getOperandTypes().get(i);
        }
    }

    @Override
    public void visit(OperandType operandType) {
        if (operandType.getRight_op() != null)
            operandType.getRight_op();
        if (operandType.getOperand() != null)
            System.out.print(operandType.getOperand() + " ");

    }

    @Override
    public void visit(Parameter parameter) {
        for (int i = 0; i < parameter.getParameters().size(); i++) {
            if (parameter.getParameters().get(i) != null)
                System.out.print(parameter.getParameters().get(i)+ ", ");
        }
    }

    @Override
    public void visit(Operand operand) {
        if (operand.getType1() != null)
            operand.getType1();

        if (operand.getType2() != null)
            operand.getType2();
        if (operand.getGet_Left() != null)
            operand.getGet_Left();
    }

    @Override
    public void visit(LogicalOperand logicalOperand) {
        if(logicalOperand.getLogic_op() != null)
            System.out.print(logicalOperand.getLogic_op()+ " ");
    }

    @Override
    public void visit(Controller controller) {
        System.out.print("\n\n\tController " + controller.getName() + " control " + controller.getPage_name()+" {");
        for (int i = 0; i < controller.getLogicList().size(); i++) {
            if (controller.getLogicList()!= null)
                controller.getLogicList().get(i);
        }
    }

    @Override
    public void visit(Page page) {
        System.out.println("\tPage " + page.getName() + " {");
        if (page.getHeader() != null)
            page.getHeader();
        if (page.getBody() != null)
            page.getBody();

    }

    @Override
    public void visit(Header header) {
        System.out.print("\t\tHeader [" );
        for (int i = 0; i < header.getAttributeHeaderList().size(); i++) {
            if (header.getAttributeHeaderList().get(i) != null)
                header.getAttributeHeaderList().get(i);
        }
    }

    @Override
    public void visit(AttributeHeader attributeHeader) {
        System.out.print("\n\t\t\t");
        if (attributeHeader.getKey() != null && attributeHeader.getValue() != null)
            System.out.print(attributeHeader.getKey() + ":" + attributeHeader.getValue() + ";");
    }

    @Override
    public void visit(Body body) {
        System.out.print("\n\t\tBody [" );
        for (int i = 0; i < body.getInOutList().size() ; i++) {
            if(body.getInOutList().get(i) != null )
                body.getInOutList().get(i);
        }
    }

    @Override
    public void visit(InOut inOut) {
        System.out.print("\n\t\t\t "+ inOut.getInput() + ": " + inOut.getTypename() + " ( ");
        for (int i = 0; i < inOut.getAttributeList().size(); i++) {
            if (inOut.getAttributeList().get(i) != null)
                inOut.getAttributeList().get(i);
        }
    }

    @Override
    public void visit(Attribute attribute) {
        System.out.print(attribute.getAttribute_name() + " ( " );
        for (int i = 0; i < attribute.getAttribute_list().size() ; i++) {
            if (attribute.getAttribute_list().get(i) != null)
                System.out.print(attribute.getAttribute_list().get(i) );
        }
        if (attribute.getAttribute_int() != null)
            System.out.print(attribute.getAttribute_int());
        System.out.print(" )");
    }

    @Override
    public void visit(Type type) {
        if (type.getString_type() != null)
            System.out.print(type.getString_type() + " ");
        if (type.getInt_type() != null)
            System.out.print(type.getInt_type() + " ");
    }

    @Override
    public void visit(CallFunction callFunction) {
        if(callFunction.getName() != null)
            System.out.print("\n\t\t"+callFunction.getName()+"( ");
        for (int i = 0; i < callFunction.getParameters().size() ; i++) {
            if (callFunction.getParameters().get(i) != null)
                callFunction.getParameters().get(i);
        }
    }

    @Override
    public void visit(For aFor) {
        System.out.print("\n\t\tfor ( ");
        if (aFor.getVar_name() != null)
            aFor.getVar_name();
        if (aFor.getEnd() != null)
            aFor.getEnd();
        if (aFor.getLogicBody() != null)
            aFor.getLogicBody();

    }

    @Override
    public void visit(Function function) {
        System.out.print("\n\n\t\tfunction ");
        if (function.getName() != null)
            System.out.print(function.getName() + " ( ");
        if (function.getParameter() != null)
            function.getParameter();
        if (function.getLogicBody() != null)
            function.getLogicBody();

    }

    @Override
    public void visit(If anIf) {
        System.out.print("\n\n\t\tif ( ");
        for (int i = 0; i < anIf.getIf_condition().size(); i++) {
            if (anIf.getIf_condition().get(i) != null)
                anIf.getIf_condition().get(i);
        }
        if (anIf.getLogicBody() != null)
            anIf.getLogicBody();
    }

    @Override
    public void visit(LogicBody logicBody) {
        System.out.print("\t\t\t");
        for (int i = 0; i < logicBody.getLogicList().size() ; i++) {
            if(logicBody.getLogicList().get(i) != null)
                logicBody.getLogicList().get(i);
        }
    }

    @Override
    public void visit(ListAdd listAdd) {
        System.out.print("\t\t" + listAdd.getName() +".add( ");
        if (listAdd.getList_add() != null)
            listAdd.getList_add();
    }

    @Override
    public void visit(ListDelete listDelete) {
        System.out.print("\t\t" + listDelete.getName() +".delete( ");
        if (listDelete.getIndex() != null)
            System.out.print(listDelete.getIndex());

    }

    @Override
    public void visit(Session session) {
        System.out.print("\t\t" + "session var  ");
        System.out.print( session.getKey() +"= ");
        if(session.getName()!=null)
        {
            System.out.print(session.getName());
            if(session.getListSize()!=null)
                System.out.println(".size()");
            if(session.getListGet()!=null)
                System.out.print(".get(");

        }
        else if (session.getCallFunction()!=null) {
            //  System.out.print("\t\t" + session.getCallFunction().getName() +"(");
        }

        else {


            if (session.getTypevalue().getString_type() != null)
                System.out.print("\t\t" + session.getTypevalue().getString_type());

            else  if (session.getTypevalue().getInt_type() != null)
                System.out.print("\t\t" + session.getTypevalue().getInt_type());



        }
    }

    public void visit(Listt listt) {
        System.out.print("\n\t\tList ");
        if (listt.getName() != null)
            System.out.print(listt.getName() + " = ( ");
        for (int i = 0; i < listt.getValue().size() ; i++) {
            if (listt.getValue().get(i) != null)
                listt.getValue().get(i);
        }
    }

    @Override
    public void visit(ListUse listUse) {
        //not used
    }

    @Override
    public void visit(Logic logic) {
        //not used
    }

    @Override
    public void visit(Compare compare) {
        //not used
    }

    @Override
    public void visit(ListSize listSize) {
        System.out.print("\t\t" + listSize.getName() +".size( ");
    }

    @Override
    public void visit(Node node) {
        //not used
    }
}
