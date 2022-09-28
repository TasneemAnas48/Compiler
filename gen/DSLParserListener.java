// Generated from E:/compiler/src\DSLParser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSLParser}.
 */
public interface DSLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DSLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DSLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#program_design}.
	 * @param ctx the parse tree
	 */
	void enterProgram_design(DSLParser.Program_designContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#program_design}.
	 * @param ctx the parse tree
	 */
	void exitProgram_design(DSLParser.Program_designContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(DSLParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(DSLParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(DSLParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(DSLParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(DSLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(DSLParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(DSLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(DSLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#controller}.
	 * @param ctx the parse tree
	 */
	void enterController(DSLParser.ControllerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#controller}.
	 * @param ctx the parse tree
	 */
	void exitController(DSLParser.ControllerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(DSLParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(DSLParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(DSLParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(DSLParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(DSLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(DSLParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(DSLParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(DSLParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DSLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DSLParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(DSLParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(DSLParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(DSLParser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(DSLParser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(DSLParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(DSLParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(DSLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(DSLParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#logic_body}.
	 * @param ctx the parse tree
	 */
	void enterLogic_body(DSLParser.Logic_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#logic_body}.
	 * @param ctx the parse tree
	 */
	void exitLogic_body(DSLParser.Logic_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DSLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DSLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#list_use}.
	 * @param ctx the parse tree
	 */
	void enterList_use(DSLParser.List_useContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#list_use}.
	 * @param ctx the parse tree
	 */
	void exitList_use(DSLParser.List_useContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#list_add}.
	 * @param ctx the parse tree
	 */
	void enterList_add(DSLParser.List_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#list_add}.
	 * @param ctx the parse tree
	 */
	void exitList_add(DSLParser.List_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#list_delete}.
	 * @param ctx the parse tree
	 */
	void enterList_delete(DSLParser.List_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#list_delete}.
	 * @param ctx the parse tree
	 */
	void exitList_delete(DSLParser.List_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#list_size}.
	 * @param ctx the parse tree
	 */
	void enterList_size(DSLParser.List_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#list_size}.
	 * @param ctx the parse tree
	 */
	void exitList_size(DSLParser.List_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#lang_Misc}.
	 * @param ctx the parse tree
	 */
	void enterLang_Misc(DSLParser.Lang_MiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#lang_Misc}.
	 * @param ctx the parse tree
	 */
	void exitLang_Misc(DSLParser.Lang_MiscContext ctx);
}