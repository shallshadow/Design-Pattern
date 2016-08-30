package visitor;
/**
 * @author shadow
 * @Date 2016年8月13日下午8:17:10
 * @Fun  蜜蜂访问
 **/
public class BeeVisitor implements Visitor {

	@Override
	public void visit(Gladiolus g) {
		// TODO Auto-generated method stub
		System.out.println("蜜蜂来访问：" + g.getClass().getName());
	}

	@Override
	public void visit(Chrysanthemum c) {
		// TODO Auto-generated method stub
		System.out.println("蜜蜂来访问：" + c.getClass().getName());
	}
	
}
