package facade;
/**
 * @author shadow
 * @Date 2016年8月4日下午9:49:14
 * @Fun  外观(Facade)模式
 * 		 简单的说就是降低了类与类之间的耦合度，使用一个Facade类来持有原有类的引用。它使用的频率其实非常的高，跟静态代理在实现上有些类似，
 * 		不同的是，外观模式中可以持有多个实体对象的引用，进行组合实现业务功能。
 **/
public class MainTest {
	public static void main(String[] args) {
		/**
		 * 如果不使用外观模式，那么在Actor和Scene可能至少一方需要持有对方的引用
		 * 当需要添加新的具体功能类时，只需要在Facade中添加一个引用，在相应的周期函数中使用即可。
		 */
		Facade facade = new Facade();
		facade.startGame();
		System.out.println("-------");
		facade.endGame();
	}
}
