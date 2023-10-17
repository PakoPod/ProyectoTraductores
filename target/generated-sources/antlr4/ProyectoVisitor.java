// Generated from Proyecto.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProyectoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProyectoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProyectoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ProyectoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(ProyectoParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(ProyectoParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code a}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(ProyectoParser.AContext ctx);
	/**
	 * Visit a parse tree produced by the {@code b}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitB(ProyectoParser.BContext ctx);
	/**
	 * Visit a parse tree produced by the {@code c}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC(ProyectoParser.CContext ctx);
	/**
	 * Visit a parse tree produced by the {@code d}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitD(ProyectoParser.DContext ctx);
	/**
	 * Visit a parse tree produced by the {@code e}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(ProyectoParser.EContext ctx);
	/**
	 * Visit a parse tree produced by the {@code f}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(ProyectoParser.FContext ctx);
	/**
	 * Visit a parse tree produced by the {@code g}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitG(ProyectoParser.GContext ctx);
	/**
	 * Visit a parse tree produced by the {@code h}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH(ProyectoParser.HContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aInicio}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAInicio(ProyectoParser.AInicioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link ProyectoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(ProyectoParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(ProyectoParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ProyectoParser#primitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ProyectoParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numero}
	 * labeled alternative in {@link ProyectoParser#primitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(ProyectoParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cadena}
	 * labeled alternative in {@link ProyectoParser#primitivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCadena(ProyectoParser.CadenaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoParser#sentencia_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_while(ProyectoParser.Sentencia_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoParser#sentencia_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_if(ProyectoParser.Sentencia_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoParser#bloque_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_if(ProyectoParser.Bloque_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoParser#bloque_elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_elseif(ProyectoParser.Bloque_elseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoParser#bloque_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_else(ProyectoParser.Bloque_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(ProyectoParser.PrintContext ctx);
}