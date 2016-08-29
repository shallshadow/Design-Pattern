/**
 * @author shadow
 * @Date 2016年8月13日下午8:13:05
 * @Fun	菊花
 **/
package visitor;

public class Chrysanthemum implements Flower {

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}

}
