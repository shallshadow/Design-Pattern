/**
 * @author shadow
 * @Date 2016年8月13日下午8:15:25
 * @Fun  名称访问
 **/
package visitor;

public class StringVisitor implements Visitor {

	String s;
	
	public String toString(){
		return s;
	}
	
	@Override
	public void visit(Gladiolus g) {
		// TODO Auto-generated method stub
		s = "That's Gladiolus";
	}

	@Override
	public void visit(Chrysanthemum c) {
		// TODO Auto-generated method stub
		s = "That's Chrysanthemum";
	}

}
