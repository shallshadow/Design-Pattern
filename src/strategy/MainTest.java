package strategy;

/**
 * @author shadow
 * @Date 2016年8月12日下午9:04:53
 * @Fun 策略(Strategy)模式 对象行为型 关注：行为的选择<br/>
 *      也称为政策模式(Policy)。 封装了一系列策略对象，用户来选择使用哪种策略对象<br/>
 *      与简单工厂的区别： 策略模式，传入策略对象的Context，由Context封装策略对象的方法调用，对外公开Context的方法接口<br/>
 *      简单工厂模式，传入一个简单的参数，创建对象，然后调用出厂对象的方法<br/>
 *      与装饰模式的区别：Context无需实现(Implements)业务接口，不需要增强已有的策略对象的功能。<br/>
 *      策略模式多用在算法决策系统中，比如工资结算。<br/>
 **/
public class MainTest {
	public static void main(String[] args) {
		double money = 998;
		CashContext cashContext = new CashContext(new CashNormal());
		System.out.println("原价：" + cashContext.acceptCash(money));

		cashContext.setCasher(new CashRebate(8.5));
		System.out.println("打85折：" + cashContext.acceptCash(money));

		cashContext.setCasher(new CashReturn(300, 50));
		System.out.println("满300返50：" + cashContext.acceptCash(money));
	}
}
/**
 * 分析和总结：<br/>
 * 1）策略模式是一个比较容易理解和使用的设计模式，策略模式是对算法的封装，它把算法的责任和算法本身分割开，委派给不同的对象管理。<br/>
 * 	策略模式通常把一个系列的算法封装到一系列的策略类里面，作为一个抽象策略类的子类。用一句话来说，就是“准备一组算法，并将每一个算法封装起来，使得它们可以互换”。<br/>
 * 2）在策略模式中，应当由客户端自己决定在什么情况下使用什么具体策略角色。<br/>
 * 3）策略模式仅仅封装算法，提供新算法插入到已有系统中，以及老算法从系统中“退休”的方便，策略模式并不决定在何时使用何种算法，算法的选择由客户端来决定。<br/>
 * 	这在一定程度上提高了系统的灵活性，但是客户端需要理解所有具体策略类之间的区别，以便选择合适的算法，这也是策略模式的缺点之一，<br/>
 * 	在一定程度上增加了客户端的使用难度。<br/>
 **/

/**
 * 推荐博客：http://design-patterns.readthedocs.io/zh_CN/latest/behavioral_patterns/strategy.html
 * */
 