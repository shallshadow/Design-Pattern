/**
 * @author shadow
 * @Date 2016年8月13日下午8:14:15
 * @Fun
 **/
package visitor;

public class Gladiolus implements Flower {

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
