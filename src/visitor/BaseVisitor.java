package visitor;

import Symol_Table.Scope;
import com.company.Main;
import gen.DSLParser;
import gen.DSLParserBaseVisitor;
import nodes.Program;
import nodes.ProgramDesign;
import nodes.controllers.*;
import nodes.pages.*;
import java.io.IOException;
import java.util.*;

public class BaseVisitor<T> extends DSLParserBaseVisitor {

    Stack<Scope> scopeStack = new Stack<>();
    static Map<String, String> var_fun = new HashMap<>();

    @Override
    public ListGet visitList_get(DSLParser.List_getContext ctx) {
        ListGet listGet = new ListGet();
        listGet.setLine(ctx.getStart().getLine());
        if (ctx.LOGIC_NAME() != null)
            listGet.setVar_name(ctx.LOGIC_NAME().toString());

        if (ctx.LOGIC_DIGIT() != null)
            listGet.setIndex(Integer.parseInt(ctx.LOGIC_DIGIT().getText()));

        try {

            listGet.check(scopeStack.peek());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return listGet;
    }

    @Override
    public Session visitSession(DSLParser.SessionContext ctx) {
        Session session = new Session();


        if (ctx.LOGIC_NAME().get(0) != null) {
            session.setKey(ctx.LOGIC_NAME().get(0).toString());
        }

        if (ctx.type() != null)
            session.setTypevalue(visitType(ctx.type()));

        else if (ctx.call_function() == null)
        {
            if (ctx.LOGIC_NAME().get(1) != null) {
                session.setName(ctx.LOGIC_NAME().get(1).toString());
                if (ctx.list_size() != null) {
                    session.setListSize(visitList_size(ctx.list_size()));
                    session.getListSize().setName(ctx.LOGIC_NAME().get(1).toString());
                } else if (ctx.list_get() != null) {
                    session.setListGet(visitList_get(ctx.list_get()));
                }
            }


        }
        else if (ctx.call_function() != null) {
            session.setCallFunction(visitCall_function(ctx.call_function()));
        }

        return session;
    }

    @Override
    public Compare visitCompare(DSLParser.CompareContext ctx) {
        Compare compare;

        //operand object
        Operand operand = new Operand();
        operand.setLine(ctx.getStart().getLine());

        if (ctx.type(0) != null) {
            operand.setType1(visitType(ctx.type(0)));
            if (ctx.list_get(0) != null) {
                operand.setGet_Right(visitList_get(ctx.list_get(0)));
                operand.getGet_Right().setName(ctx.LOGIC_NAME(0).toString());
            } else if (ctx.list_size(0) != null) {
                operand.setSize_Right(visitList_size(ctx.list_size(0)));
                operand.getSize_Right().setName(ctx.LOGIC_NAME(0).toString());
            } else if (ctx.type(1) != null) {
                operand.setType2(visitType(ctx.type(1)));
            }

        } else if (ctx.list_get(0) != null) {
            operand.setGet_Left(visitList_get(ctx.list_get(0)));
            operand.getGet_Left().setName(ctx.LOGIC_NAME(0).toString());
            if (ctx.list_get(1) != null) {
                operand.setGet_Right(visitList_get(ctx.list_get(1)));
                operand.getGet_Right().setName(ctx.LOGIC_NAME(1).toString());
            } else if (ctx.list_size(0) != null) {
                operand.setSize_Right(visitList_size(ctx.list_size(0)));
                operand.getSize_Right().setName(ctx.LOGIC_NAME(0).toString());
            } else if (ctx.type(0) != null) {
                operand.setType1(visitType(ctx.type(0)));
            }

        } else if (ctx.list_size(0) != null) {
            operand.setSize_Left(visitList_size(ctx.list_size(0)));
            operand.getSize_Left().setName(ctx.LOGIC_NAME(0).toString());

            if (ctx.list_get(0) != null) {
                operand.setGet_Right(visitList_get(ctx.list_get(0)));
                operand.getGet_Right().setName(ctx.LOGIC_NAME(0).toString());
            } else if (ctx.list_size(1) != null) {
                operand.setSize_Right(visitList_size(ctx.list_size(1)));
                operand.getSize_Right().setName(ctx.LOGIC_NAME(1).toString());
            } else if (ctx.type(0) != null) {
                operand.setType1(visitType(ctx.type(0)));
            }

        }


        if (ctx.BOOLEN() != null) {
            operand.setBoolEx(ctx.BOOLEN().getText());
        }

        try {
            operand.check(scopeStack.peek());
        } catch (IOException e) {
            System.out.println("error");
        }

        compare = operand;
        return compare;
    }

    @Override
    public Parameter visitParameter(DSLParser.ParameterContext ctx) {
        Parameter parameter = new Parameter();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < ctx.LOGIC_NAME().size(); i++) {
            stringList.add(ctx.LOGIC_NAME(i).toString());
            var_fun.put(ctx.LOGIC_NAME(i).toString(), "var");
        }
        parameter.setParameters(stringList);
        return parameter;
    }

    @Override
    public Program visitProgram(DSLParser.ProgramContext ctx) {
        List<ProgramDesign> programDesignList = new ArrayList<>();
        for (int i = 0; i < ctx.program_design().size(); i++) {
            programDesignList.add(visitProgram_design(ctx.program_design(i)));
        }
        Program program = new Program();
        program.setProgramDesigns(programDesignList);
        return program;
    }

    @Override
    public ProgramDesign visitProgram_design(DSLParser.Program_designContext ctx) {
        ProgramDesign programDesign = new ProgramDesign();
        if (ctx.page() != null)
            programDesign.setPage(visitPage(ctx.page()));
        if (ctx.controller() != null)
            programDesign.setController(visitController(ctx.controller()));

        Main.symbolTable.setPage_controller(programDesign.getPage().getName(), programDesign.getController().getName());
        return programDesign;
    }

    @Override
    public Page visitPage(DSLParser.PageContext ctx) {
        Page page = new Page();
        page.setLine(ctx.getStart().getLine());
        if (ctx.body() != null)
            page.setBody(visitBody(ctx.body()));
        if (ctx.header() != null)
            page.setHeader(visitHeader(ctx.header()));
        if (ctx.NAME() != null) {
            page.setName(ctx.NAME().toString());

            try {
                page.check(null);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        return page;
    }

    @Override
    public Header visitHeader(DSLParser.HeaderContext ctx) {
        //  System.out.println("visitHeader");
        Header header = new Header();
        List<AttributeHeader> attributeHeaderList = new ArrayList<>();
        for (int i = 0; i < ctx.attribute_header().size(); i++) {
            attributeHeaderList.add(visitAttribute_header(ctx.attribute_header(i)));
        }
        header.setAttributeHeaderList(attributeHeaderList);
        return header;
    }

    @Override
    public AttributeHeader visitAttribute_header(DSLParser.Attribute_headerContext ctx) {
        // System.out.println("visitAttribute_header");
        AttributeHeader attributeHeader = new AttributeHeader();
        if (ctx.INPUT() != null)
            attributeHeader.setKey(ctx.INPUT().toString());
        if (ctx.STRING() != null)
            attributeHeader.setValue(ctx.STRING().toString());
        return attributeHeader;
    }

    @Override
    public GetData visitGet_data(DSLParser.Get_dataContext ctx) {
        GetData getData = new GetData();
        if (ctx.ATTRIBUTE() != null)
            getData.setAttribute_name(ctx.ATTRIBUTE().toString());
        if (ctx.STRING() != null)
            getData.setAttribute_value(ctx.STRING().toString());
        if (ctx.GET() != null)
            getData.setType(ctx.GET().toString());
        return getData;
    }

    @Override
    public InOut visitIn_out(DSLParser.In_outContext ctx) {
//        System.out.println("visitIn_out");
        InOut inOut = new InOut();
        inOut.setLine(ctx.getStart().getLine());

        if (ctx.INPUT() != null)
            inOut.setInput(ctx.INPUT().toString());
        if (ctx.TYPE_NAME() != null)
            inOut.setTypename(ctx.TYPE_NAME().toString());

        List<Attribute> attributeList = new ArrayList<>();
        for (int i = 0; i < ctx.attribute().size(); i++) {
            attributeList.add(visitAttribute(ctx.attribute(i)));
        }
        inOut.setAttributeList(attributeList);

        List<GetData> getDataList = new ArrayList<>();
        for (int i = 0; i < ctx.get_data().size(); i++){
            getDataList.add(visitGet_data(ctx.get_data(i)));
        }
        inOut.setGetDataList(getDataList);

        try {
            inOut.check(null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return inOut;
    }

    @Override
    public Body visitBody(DSLParser.BodyContext ctx) {
        // System.out.println("visitBody");
        Body body = new Body();
        List<InOut> inOutList = new ArrayList<>();
        for (int i = 0; i < ctx.in_out().size(); i++) {
            inOutList.add(visitIn_out(ctx.in_out(i)));
        }
        body.setInOutList(inOutList);
        return body;
    }

    @Override
    public Attribute visitAttribute(DSLParser.AttributeContext ctx) {
        // System.out.println("visitAttribute");
        Attribute attribute = new Attribute();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < ctx.STRING().size(); i++) {
            stringList.add(ctx.STRING(i).toString());
        }
        if (ctx.ATTRIBUTE() != null) {
            attribute.setAttribute_name(ctx.ATTRIBUTE().toString());
        }

        if (ctx.TYPE_DIGIT() != null)
            attribute.setAttribute_int(Integer.parseInt(ctx.TYPE_DIGIT().getText()));
        attribute.setAttribute_list(stringList);
        return attribute;
    }

    @Override
    public Controller visitController(DSLParser.ControllerContext ctx) {
        Controller controller = new Controller();
        List<Logic> logicList = new ArrayList<>();
        List<Function> functions = new ArrayList<>();
        SessionSingltone sessionSingltone = SessionSingltone.getInstance();

        controller.setLine(ctx.getStart().getLine());

        Scope scope = new Scope();
        scope.setParent(null);
        scope.setID(1);
        scope.setController_name(ctx.CONTROLLER_NAME(0).toString());
        scope.setName_scope("controller");
        scopeStack.push(scope);

        if (ctx.CONTROLLER_NAME(0) != null) {
            controller.setName(ctx.CONTROLLER_NAME(0).toString());
        }

        if (ctx.CONTROLLER_NAME(1) != null) {
            controller.setPage_name(ctx.CONTROLLER_NAME(1).toString());
        }

        try {
            controller.check(scopeStack.peek());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < ctx.function().size(); i++) {
            functions.add(visitFunction(ctx.function(i)));
        }
        controller.setFunctions(functions);

        for (int i = 0; i < ctx.logic().size(); i++) {
            logicList.add(visitLogic(ctx.logic(i)));
        }
        controller.setLogicList(logicList);

        for (int i = 0; i < ctx.session().size(); i++) {
            sessionSingltone.setSessionList(visitSession(ctx.session().get(i)));
        }
        controller.setSession(sessionSingltone);

        Main.symbolTable.setdef_controllers(controller.getName());
        scopeStack.pop();

        return controller;
    }

    @Override
    public Logic visitLogic(DSLParser.LogicContext ctx) {
        Logic logic = new Logic();
        logic.setLine(ctx.getStart().getLine());

        if (ctx.variables() != null) {
            logic = visitVariables(ctx.variables());
        }

        if (ctx.assignment() != null) {
            if (!scopeStack.peek().getName_scope().equals("function")) {
                // //يتم اختبار المتحول الذي سنستخدمه ونسند اليه قيمة اذا كان معرف مسبقا أم لا
                if (logic.check_var(ctx.assignment().LOGIC_NAME(0).toString(), scopeStack.peek(), scopeStack.peek().getParent(), "var") == 0)
                    System.out.println("error in line  " + logic.getLine() + " ..The Variable " + ctx.assignment().LOGIC_NAME(0).toString() + " not define");
                else if (logic.check_var(ctx.assignment().LOGIC_NAME(0).toString(), scopeStack.peek(), scopeStack.peek().getParent(), "var") == 2)
                    System.out.println("error in line  " + logic.getLine() + " ..The Variable " + ctx.assignment().LOGIC_NAME(0).toString() + "  not the type var");

            }

            logic = visitAssignment(ctx.assignment());
            if (scopeStack.peek().getName_scope().equals("function")) {
                try {
                    logic.check_fun(var_fun);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        ////
        if (ctx.print() != null)
            logic = visitPrint(ctx.print());
        if (ctx.list() != null)
            logic = visitList(ctx.list());
        if (ctx.call_function() != null)
            logic = visitCall_function(ctx.call_function());
        if (ctx.list_use() != null)
            logic = visitList_use(ctx.list_use());

        if (ctx.if_() != null) {

            Scope scope = new Scope();
            scope.setParent(scopeStack.peek());
            scope.setID(scopeStack.peek().getID() + 1);
            scope.setController_name(scopeStack.peek().getController_name());
            scope.setName_scope("if");
            scopeStack.push(scope);
            logic = visitIf(ctx.if_());
            Main.symbolTable.setAll_controllers(scopeStack.peek().getController_name(), scopeStack.peek());
            scopeStack.pop();
        }
        if (ctx.for_() != null) {
            Scope scope = new Scope();
            scope.setParent(scopeStack.peek());
            scope.setID(scopeStack.peek().getID() + 1);
            scope.setController_name(scopeStack.peek().getController_name());
            scope.setName_scope("for");
            scopeStack.push(scope);
            logic = visitFor(ctx.for_());
            Main.symbolTable.setAll_controllers(scopeStack.peek().getController_name(), scopeStack.peek());
            scopeStack.pop();
        }

        return logic;
    }

    @Override
    public Listt visitList(DSLParser.ListContext ctx) {
        Listt listt = new Listt();

        if (ctx.post() != null) {
            scopeStack.peek().setVariables(ctx.post().LOGIC_NAME(0).toString(), "list");
            listt.setPost_var(visitPost(ctx.post()));
        }
        if (ctx.LOGIC_NAME() != null) {

            listt.setName(ctx.LOGIC_NAME().toString());
            scopeStack.peek().setVariables(listt.getName(), "list");
            if (scopeStack.peek().getName_scope().equals("function"))
                var_fun.put(listt.getName(), "list");
        }

        if (ctx.type(0) != null) {

            List<Type> typeList = new ArrayList<>();
            scopeStack.peek().initValues_list(ctx.LOGIC_NAME().toString(), new ArrayList<>());
            typeList.add(visitType(ctx.type(0)));
            scopeStack.peek().setValues_list(ctx.LOGIC_NAME().toString(), typeList.get(0).getString_type());
            for (int i = 1; i < ctx.type().size(); i++) {
                typeList.add(visitType(ctx.type(i)));
                scopeStack.peek().setValues_list(ctx.LOGIC_NAME().toString(), typeList.get(i).getString_type());
            }
            listt.setValue(typeList);
        }




        return listt;
    }

    @Override
    public Assigment visitAssignment(DSLParser.AssignmentContext ctx) {
        Assigment assigment = new Assigment();
        assigment.setLine(ctx.getStart().getLine());
        List<OperandType> operandTypeList = new ArrayList<OperandType>();

        if (ctx.LOGIC_NAME().get(0) != null) {
            assigment.setVar_name(ctx.LOGIC_NAME().get(0).toString());
            scopeStack.peek().setVariables(ctx.LOGIC_NAME().get(0).toString(), "var");
            if (scopeStack.peek().getName_scope().equals("function"))
                var_fun.put(assigment.getVar_name(), "var");

        }

        if (ctx.list_get() != null || ctx.list_size() != null) {
            if (ctx.list_get() != null) {
                assigment.setListGet(visitList_get(ctx.list_get()));
                assigment.getListGet().setName(ctx.LOGIC_NAME(1).toString());

            } else if (ctx.list_size() != null) {
                assigment.setListSize(visitList_size(ctx.list_size()));
                assigment.getListSize().setName(ctx.LOGIC_NAME(1).toString());
            }

            scopeStack.peek().setValues_integer(ctx.LOGIC_NAME(0).toString(), 10);

            try {
                assigment.check(scopeStack.peek());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        } else if (ctx.type(0) != null) {

            assigment.setLeft_op(visitType(ctx.type(0)));
            ///تخزين قيمة المتحول
            if (assigment.getLeft_op().getInt_type() != null) {
                scopeStack.peek().setValues_integer(ctx.LOGIC_NAME(0).toString(), assigment.getLeft_op().getInt_type());
            }


            for (int i = 0; i < ctx.type().size(); i++) {
                if (ctx.OPERAND(i) != null) {
                    OperandType operandType = new OperandType();
                    operandType.setOperand(ctx.OPERAND(i).toString());
                    operandType.setRight_op(visitType(ctx.type(i + 1)));


                    if (assigment.getLeft_op().getInt_type() != null) {
                        ////حساب قيمة المتحول وتخزينها
                        if (operandType.getOperand().equals("+")) {
                            if (operandType.getRight_op().getInt_type() != null)
                                scopeStack.peek().setValues_integer(ctx.LOGIC_NAME(0).toString(), scopeStack.peek().getValues_integer().get(ctx.LOGIC_NAME(0).toString()) + operandType.getRight_op().getInt_type());

                        } else if (operandType.getOperand().equals("-")) {
                            if (operandType.getRight_op().getInt_type() != null)
                                scopeStack.peek().setValues_integer(ctx.LOGIC_NAME(0).toString(), scopeStack.peek().getValues_integer().get(ctx.LOGIC_NAME(0).toString()) - operandType.getRight_op().getInt_type());

                        } else if (operandType.getOperand().equals("*")) {
                            if (operandType.getRight_op().getInt_type() != null)
                                scopeStack.peek().setValues_integer(ctx.LOGIC_NAME(0).toString(), scopeStack.peek().getValues_integer().get(ctx.LOGIC_NAME(0).toString()) * operandType.getRight_op().getInt_type());

                        } else if (operandType.getOperand().equals("/")) {
                            if (operandType.getRight_op().getInt_type() != null)
                                scopeStack.peek().setValues_integer(ctx.LOGIC_NAME(0).toString(), scopeStack.peek().getValues_integer().get(ctx.LOGIC_NAME(0).toString()) / operandType.getRight_op().getInt_type());

                        } else if (operandType.getOperand().equals("%")) {
                            if (operandType.getRight_op().getInt_type() != null)
                                scopeStack.peek().setValues_integer(ctx.LOGIC_NAME().toString(), scopeStack.peek().getValues_integer().get(ctx.LOGIC_NAME(0).toString()) % operandType.getRight_op().getInt_type());

                        }
                    } else if (assigment.getLeft_op().getString_type() != null && !assigment.getLeft_op().getString_type().startsWith("\"") && !assigment.getLeft_op().getString_type().endsWith("\"")) {
                        scopeStack.peek().setValues_integer(ctx.LOGIC_NAME(0).toString(), 10);
                    }

                    operandTypeList.add(operandType);
                }
            }
            assigment.setOperandTypes(operandTypeList);

            try {
                assigment.check(scopeStack.peek());

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else if (ctx.call_function() != null)
            assigment.setCallFunction(visitCall_function(ctx.call_function()));

        return assigment;
    }

    @Override
    public CallFunction visitCall_function(DSLParser.Call_functionContext ctx) {
        CallFunction callFunction = new CallFunction();
        callFunction.setLine(ctx.getStart().getLine());

        if (ctx.LOGIC_NAME() != null) {
            callFunction.setName(ctx.LOGIC_NAME().toString());
        }
        List<Type> parameterList = new ArrayList<>();
        for (int i = 0; i < ctx.type().size(); i++) {
            parameterList.add(visitType(ctx.type(i)));
        }
        callFunction.setParameters(parameterList);
        try {
            callFunction.check(scopeStack.peek());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return callFunction;
    }

    @Override
    public If visitIf(DSLParser.IfContext ctx) {
        If if_ = new If();
        if_.setLine(ctx.getStart().getLine());
        List<Compare> compareList = new ArrayList<>();
        Compare compare;
        int j = 0;

        for (int i = 0; i < ctx.compare().size(); i++) {
            compareList.add(visitCompare(ctx.compare(i)));

            if (ctx.LOGICAL(j) != null) {
                LogicalOperand logicalOperand = new LogicalOperand();
                logicalOperand.setLogic_op(ctx.LOGICAL(j).toString());
                j++;
                compare = logicalOperand;
                compareList.add(compare);
            }
        }
        if_.setIf_condition(compareList);

        if (ctx.logic_body() != null)
            if_.setLogicBody(visitLogic_body(ctx.logic_body()));

        return if_;
    }

    @Override
    public For visitFor(DSLParser.ForContext ctx) {
        For for_ = new For();
        for_.setLine(ctx.getStart().getLine());

        if (ctx.LOGIC_NAME(0) != null) {
            for_.setVar_name(ctx.LOGIC_NAME(0).toString());
        }
        if (ctx.type() != null) {
            for_.setEnd(visitType(ctx.type()));

        } else if (ctx.LOGIC_NAME(1) != null) {
            if (ctx.list_size() != null) {
                for_.setSize_Right(visitList_size(ctx.list_size()));
                for_.getSize_Right().setName(ctx.LOGIC_NAME(1).toString());
            }
            if (ctx.list_get() != null) {
                for_.setGet_Right(visitList_get(ctx.list_get()));
                for_.getGet_Right().setName(ctx.LOGIC_NAME(1).toString());
            }
        }

        if (ctx.OPERAND() != null)
            for_.setOperand(ctx.OPERAND().toString());

        if (ctx.LOGIC_DIGIT() != null)
            for_.setIncrease(Integer.parseInt(ctx.LOGIC_DIGIT().getText()));

        if (ctx.logic_body() != null)
            for_.setLogicBody(visitLogic_body(ctx.logic_body()));

        try {


            if (scopeStack.peek().getParent().getName_scope().equals("function"))
                for_.check_fun(var_fun);
            else
                for_.check(scopeStack.peek());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return for_;
    }

    @Override
    public Function visitFunction(DSLParser.FunctionContext ctx) {
        var_fun = new HashMap<>();
        Function function = new Function();
        function.setLine(ctx.getStart().getLine());

        Scope scope = new Scope();
        scope.setParent(scopeStack.peek());
        scope.setID(scopeStack.peek().getID() + 1);
        scope.setController_name(scopeStack.peek().getController_name());
        scope.setName_scope("function");

        if (ctx.LOGIC_NAME() != null) {
            function.setName(ctx.LOGIC_NAME().toString());
        }

        if (ctx.parameter() != null) {
            function.setParameter(visitParameter(ctx.parameter()));
        }

        try {
            function.check(scopeStack.peek());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        scopeStack.push(scope);
        if (ctx.logic_body() != null) {
            function.setLogicBody(visitLogic_body(ctx.logic_body()));
        }

        if (ctx.RETURN() != null)
            function.setReturn_value(visitType(ctx.type()));

        Main.symbolTable.setAll_controllers(scopeStack.peek().getController_name(), scopeStack.peek());
        scopeStack.pop();
        return function;
    }

    @Override
    public Print visitPrint(DSLParser.PrintContext ctx) {
        Print print = new Print();
        List<Type> typeList = new ArrayList<>();
        for (int i = 0; i < ctx.type().size(); i++) {
            typeList.add(visitType(ctx.type(i)));
        }
        print.setPrint_list(typeList);
        return print;
    }

    @Override
    public LogicBody visitLogic_body(DSLParser.Logic_bodyContext ctx) {
        LogicBody logicBody = new LogicBody();
        List<Logic> logicList = new ArrayList<>();
        for (int i = 0; i < ctx.logic().size(); i++) {
            logicList.add(visitLogic(ctx.logic(i)));
        }
        logicBody.setLogicList(logicList);

        return logicBody;
    }

    @Override
    public Type visitType(DSLParser.TypeContext ctx) {

        Type type = new Type();
        type.setLine(ctx.getStart().getLine());
        if (ctx.LOGIC_DIGIT() != null)
            type.setInt_type(Integer.parseInt(ctx.LOGIC_DIGIT().getText()));

        if (ctx.LOGIC_NAME() != null)
            type.setString_type(ctx.LOGIC_NAME().toString());

        if (ctx.LOGIC_STRING() != null)
            type.setString_type(ctx.LOGIC_STRING().toString());
        try {
            type.check(scopeStack.peek());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return type;
    }

    @Override
    public ListUse visitList_use(DSLParser.List_useContext ctx) {
        ListUse listUse = new ListUse();
        listUse.setLine(ctx.getStart().getLine());


        if (ctx.list_add() != null) {
            listUse = visitList_add(ctx.list_add());
        }
        if (ctx.list_get() != null)
            listUse = visitList_get(ctx.list_get());

        if (ctx.list_delete() != null)
            listUse = visitList_delete(ctx.list_delete());

        if (ctx.list_size() != null)
            listUse = visitList_size(ctx.list_size());

        if (ctx.LOGIC_NAME() != null)
            listUse.setName(ctx.LOGIC_NAME().toString());

        try {
            listUse.check(scopeStack.peek());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return listUse;
    }

    @Override
    public ListAdd visitList_add(DSLParser.List_addContext ctx) {
        ListAdd listAdd = new ListAdd();
        listAdd.setLine(ctx.getStart().getLine());
        if (ctx.type() != null)
            listAdd.setList_add(visitType(ctx.type()));
        return listAdd;
    }

    @Override
    public ListDelete visitList_delete(DSLParser.List_deleteContext ctx) {
        ListDelete listDelete = new ListDelete();
        listDelete.setLine(ctx.getStart().getLine());
        if (ctx.LOGIC_NAME() != null) {
            listDelete.setVar_name(ctx.LOGIC_NAME().toString());
        }
        if (ctx.LOGIC_DIGIT() != null) {
            listDelete.setIndex(Integer.parseInt(ctx.LOGIC_DIGIT().getText()));
        }

        return listDelete;
    }

    @Override
    public ListSize visitList_size(DSLParser.List_sizeContext ctx) {
        ListSize listSize = new ListSize();
        listSize.setLine(ctx.getStart().getLine());

        return listSize;
    }

    @Override
    public Var visitVar(DSLParser.VarContext ctx) {
        Var var = new Var();
        var.setLine(ctx.getStart().getLine());
        if (ctx.LOGIC_NAME() != null) {
            var.setVar_name(ctx.LOGIC_NAME().toString());
            scopeStack.peek().setVariables(var.getVar_name(), "var");
            if (scopeStack.peek().getName_scope().equals("function"))
                var_fun.put(var.getVar_name(), "var");
        }
        if (ctx.assignment() != null) {
            var.setAssigment(visitAssignment(ctx.assignment()));
        }
        if (ctx.post() != null) {
            var.setPost_var(visitPost(ctx.post()));
        }

        return var;
    }

    @Override
    public Variables visitVariables(DSLParser.VariablesContext ctx) {
        Variables variables = new Variables();
        List<Var> varList = new ArrayList<>();

        for (int i = 0; i < ctx.var().size(); i++) {
            varList.add(visitVar(ctx.var(i)));
        }
        variables.setVariables(varList);
        return variables;
    }

    @Override
    public Object visitLang_Misc(DSLParser.Lang_MiscContext ctx) {
        //  System.out.println("visitLang_Misc");
        return super.visitLang_Misc(ctx);
    }

    @Override
    public Post visitPost(DSLParser.PostContext ctx) {
        Post post = new Post();
        if (ctx.LOGIC_NAME(0) != null) {
            post.setName(ctx.LOGIC_NAME(0).toString());
            scopeStack.peek().setVariables(post.getName(), "var");
        }

        if (ctx.LOGIC_NAME(1) != null)
            post.setKey(ctx.LOGIC_NAME(1).toString());

        return post;
    }

}
