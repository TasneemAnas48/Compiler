// Generated from C:/Users/hamza/OneDrive/Desktop/finalcomp2/compiler/src\DSLParser.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DSLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DSLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DSLParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DSLParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#program_design}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_design(DSLParser.Program_designContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(DSLParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(DSLParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#attribute_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_header(DSLParser.Attribute_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(DSLParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#in_out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_out(DSLParser.In_outContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(DSLParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#get_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_data(DSLParser.Get_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#controller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitController(DSLParser.ControllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(DSLParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#session}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSession(DSLParser.SessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(DSLParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(DSLParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#post}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost(DSLParser.PostContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(DSLParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(DSLParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(DSLParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DSLParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(DSLParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(DSLParser.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(DSLParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(DSLParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(DSLParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#logic_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_body(DSLParser.Logic_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DSLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#list_use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_use(DSLParser.List_useContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#list_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_add(DSLParser.List_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#list_delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_delete(DSLParser.List_deleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#list_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_size(DSLParser.List_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#list_get}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_get(DSLParser.List_getContext ctx);
	/**
	 * Visit a parse tree produced by {@link DSLParser#lang_Misc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLang_Misc(DSLParser.Lang_MiscContext ctx);
}