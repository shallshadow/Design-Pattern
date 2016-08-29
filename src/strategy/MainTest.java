package strategy;
/**
 * @author shadow
 * @Date 2016年8月12日下午9:04:53
 * @Fun  策略(Strategy)模式  关注：行为的选择
 * 		  封装了一系列策略对象，用户来选择使用哪种策略对象
 * 		 与简单工厂的区别：
 * 			策略模式，传入策略对象的Context，由Context封装策略对象的方法调用，对外公开Context的方法接口
 * 			简单工厂模式，传入一个简单的参数，创建对象，然后调用出厂对象的方法
 * 		与装饰模式的区别：
 * 			Context无需实现(Implements)业务接口，不需要增强已有的策略对象的功能。
 * 			策略模式多用在算法决策系统中，比如工资结算。
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
