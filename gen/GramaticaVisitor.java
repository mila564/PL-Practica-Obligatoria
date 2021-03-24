// Generated from D:/ESCRITORIO/PL/practica_obligatoria/src\Gramatica.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(GramaticaParser.RContext ctx);
}