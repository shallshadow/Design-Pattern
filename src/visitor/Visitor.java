/**
 * @author shadow
 * @Date 2016年8月13日下午8:11:17
 * @Fun
 **/
package visitor;

public interface Visitor {
	void visit(Gladiolus g);
	
	void visit(Chrysanthemum c);
}
