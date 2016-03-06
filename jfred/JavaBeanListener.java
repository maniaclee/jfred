// Generated from JavaBean.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaBeanParser}.
 */
public interface JavaBeanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaBeanParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(JavaBeanParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBeanParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(JavaBeanParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBeanParser#clazz}.
	 * @param ctx the parse tree
	 */
	void enterClazz(JavaBeanParser.ClazzContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBeanParser#clazz}.
	 * @param ctx the parse tree
	 */
	void exitClazz(JavaBeanParser.ClazzContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBeanParser#ignore}.
	 * @param ctx the parse tree
	 */
	void enterIgnore(JavaBeanParser.IgnoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBeanParser#ignore}.
	 * @param ctx the parse tree
	 */
	void exitIgnore(JavaBeanParser.IgnoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBeanParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(JavaBeanParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBeanParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(JavaBeanParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBeanParser#methodParam}.
	 * @param ctx the parse tree
	 */
	void enterMethodParam(JavaBeanParser.MethodParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBeanParser#methodParam}.
	 * @param ctx the parse tree
	 */
	void exitMethodParam(JavaBeanParser.MethodParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBeanParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(JavaBeanParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBeanParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(JavaBeanParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBeanParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaBeanParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBeanParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaBeanParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBeanParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaBeanParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBeanParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaBeanParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBeanParser#pack}.
	 * @param ctx the parse tree
	 */
	void enterPack(JavaBeanParser.PackContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBeanParser#pack}.
	 * @param ctx the parse tree
	 */
	void exitPack(JavaBeanParser.PackContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBeanParser#importExpr}.
	 * @param ctx the parse tree
	 */
	void enterImportExpr(JavaBeanParser.ImportExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBeanParser#importExpr}.
	 * @param ctx the parse tree
	 */
	void exitImportExpr(JavaBeanParser.ImportExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBeanParser#classModifer}.
	 * @param ctx the parse tree
	 */
	void enterClassModifer(JavaBeanParser.ClassModiferContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBeanParser#classModifer}.
	 * @param ctx the parse tree
	 */
	void exitClassModifer(JavaBeanParser.ClassModiferContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBeanParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JavaBeanParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBeanParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JavaBeanParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBeanParser#classImplements}.
	 * @param ctx the parse tree
	 */
	void enterClassImplements(JavaBeanParser.ClassImplementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBeanParser#classImplements}.
	 * @param ctx the parse tree
	 */
	void exitClassImplements(JavaBeanParser.ClassImplementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaBeanParser#classExtend}.
	 * @param ctx the parse tree
	 */
	void enterClassExtend(JavaBeanParser.ClassExtendContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaBeanParser#classExtend}.
	 * @param ctx the parse tree
	 */
	void exitClassExtend(JavaBeanParser.ClassExtendContext ctx);
}