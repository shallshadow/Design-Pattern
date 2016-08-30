package visitor;
/**
 * @author shadow
 * @Date 2016年8月13日下午8:11:17
 * @Fun  访问者结构
 **/
public interface Visitor {
	void visit(Gladiolus g);
	
	void visit(Chrysanthemum c);
}
