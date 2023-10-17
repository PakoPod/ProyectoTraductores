// Generated from c:/Users/voypa/OneDrive/Escritorio/proyecto/src/main/antlr4/Proyecto.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProyectoParser}.
 */
public interface ProyectoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProyectoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ProyectoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProyectoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ProyectoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProyectoParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(ProyectoParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProyectoParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(ProyectoParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProyectoParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(ProyectoParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProyectoParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(ProyectoParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ProyectoParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ProyectoParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProyectoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(ProyectoParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProyectoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(ProyectoParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProyectoParser#primitivo}.
	 * @param ctx the parse tree
	 */
	void enterPrimitivo(ProyectoParser.PrimitivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProyectoParser#primitivo}.
	 * @param ctx the parse tree
	 */
	void exitPrimitivo(ProyectoParser.PrimitivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProyectoParser#sentencia_while}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_while(ProyectoParser.Sentencia_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProyectoParser#sentencia_while}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_while(ProyectoParser.Sentencia_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProyectoParser#sentencia_if}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_if(ProyectoParser.Sentencia_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProyectoParser#sentencia_if}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_if(ProyectoParser.Sentencia_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProyectoParser#bloque_if}.
	 * @param ctx the parse tree
	 */
	void enterBloque_if(ProyectoParser.Bloque_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProyectoParser#bloque_if}.
	 * @param ctx the parse tree
	 */
	void exitBloque_if(ProyectoParser.Bloque_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProyectoParser#bloque_elseif}.
	 * @param ctx the parse tree
	 */
	void enterBloque_elseif(ProyectoParser.Bloque_elseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProyectoParser#bloque_elseif}.
	 * @param ctx the parse tree
	 */
	void exitBloque_elseif(ProyectoParser.Bloque_elseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProyectoParser#bloque_else}.
	 * @param ctx the parse tree
	 */
	void enterBloque_else(ProyectoParser.Bloque_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProyectoParser#bloque_else}.
	 * @param ctx the parse tree
	 */
	void exitBloque_else(ProyectoParser.Bloque_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProyectoParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(ProyectoParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProyectoParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(ProyectoParser.PrintContext ctx);
}