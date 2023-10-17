// Generated from Proyecto.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by the {@code a}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterA(ProyectoParser.AContext ctx);
	/**
	 * Exit a parse tree produced by the {@code a}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitA(ProyectoParser.AContext ctx);
	/**
	 * Enter a parse tree produced by the {@code b}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterB(ProyectoParser.BContext ctx);
	/**
	 * Exit a parse tree produced by the {@code b}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitB(ProyectoParser.BContext ctx);
	/**
	 * Enter a parse tree produced by the {@code c}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterC(ProyectoParser.CContext ctx);
	/**
	 * Exit a parse tree produced by the {@code c}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitC(ProyectoParser.CContext ctx);
	/**
	 * Enter a parse tree produced by the {@code d}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterD(ProyectoParser.DContext ctx);
	/**
	 * Exit a parse tree produced by the {@code d}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitD(ProyectoParser.DContext ctx);
	/**
	 * Enter a parse tree produced by the {@code e}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterE(ProyectoParser.EContext ctx);
	/**
	 * Exit a parse tree produced by the {@code e}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitE(ProyectoParser.EContext ctx);
	/**
	 * Enter a parse tree produced by the {@code f}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterF(ProyectoParser.FContext ctx);
	/**
	 * Exit a parse tree produced by the {@code f}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitF(ProyectoParser.FContext ctx);
	/**
	 * Enter a parse tree produced by the {@code g}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterG(ProyectoParser.GContext ctx);
	/**
	 * Exit a parse tree produced by the {@code g}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitG(ProyectoParser.GContext ctx);
	/**
	 * Enter a parse tree produced by the {@code h}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterH(ProyectoParser.HContext ctx);
	/**
	 * Exit a parse tree produced by the {@code h}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitH(ProyectoParser.HContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aInicio}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAInicio(ProyectoParser.AInicioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aInicio}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAInicio(ProyectoParser.AInicioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(ProyectoParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(ProyectoParser.IdExprContext ctx);
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
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ProyectoParser#primitivo}.
	 * @param ctx the parse tree
	 */
	void enterBool(ProyectoParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ProyectoParser#primitivo}.
	 * @param ctx the parse tree
	 */
	void exitBool(ProyectoParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numero}
	 * labeled alternative in {@link ProyectoParser#primitivo}.
	 * @param ctx the parse tree
	 */
	void enterNumero(ProyectoParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numero}
	 * labeled alternative in {@link ProyectoParser#primitivo}.
	 * @param ctx the parse tree
	 */
	void exitNumero(ProyectoParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cadena}
	 * labeled alternative in {@link ProyectoParser#primitivo}.
	 * @param ctx the parse tree
	 */
	void enterCadena(ProyectoParser.CadenaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cadena}
	 * labeled alternative in {@link ProyectoParser#primitivo}.
	 * @param ctx the parse tree
	 */
	void exitCadena(ProyectoParser.CadenaContext ctx);
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