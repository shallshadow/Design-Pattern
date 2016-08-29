package mediator;
/**
 * @author shadow
 * @Date 2016年8月8日下午7:45:56
 * @Fun	 中介者(Mediator)模式  Mediator的意思是中介者，调节者，传递物，顾名思义，这个模式在过程中必然负担一个中介，
 * 		调节，传递的工作中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 **/
public class MainTest {
	public static void main(String[] args) {
		IMediator mediator = new Mediator();
		//内部创建元素，维护元素
		mediator.creareMediator();
		//执行内部元素的work接口
		mediator.work();
	}
}
