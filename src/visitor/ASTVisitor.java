package visitor;

import nodes.Node;
import nodes.Program;
import nodes.ProgramDesign;
import nodes.controllers.*;
import nodes.pages.*;

import javax.lang.model.util.SimpleElementVisitor7;

public interface ASTVisitor {


    void visit(Compare compare);

    void visit(Controller controller);
    void visit(Session session);

    void visit(Assigment assigment);

    void visit(CallFunction callFunction);

    void visit(For aFor);

    void visit(Function function);

    void visit(If anIf);

    void visit(ListAdd listAdd);

    void visit(ListDelete listDelete);

    void visit(ListSize listSize);

    void visit(Listt listt);

    void visit(ListUse listUse);

    void visit(Logic logic);

    void visit(LogicBody logicBody);

    void visit(OperandType operandType);

    void visit(Parameter parameter);

    void visit(Type type);

    void visit(Var var);

    void visit(Attribute attribute);

    void visit(AttributeHeader attributeHeader);

    void visit(Body body);

    void visit(Header header);

    void visit(InOut inOut);

    void visit(Page page);

    void visit(Node node);

    void visit(Program program);

    void visit(ProgramDesign programDesign);

    void visit(Print print);

    void visit(Variables variables);

    void visit(Operand operand);

    void visit(LogicalOperand logicalOperand);



}
