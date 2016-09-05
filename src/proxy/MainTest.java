package proxy;

import java.util.Date;
/**
 * @author shadow
 * @Date 2016年8月6日下午9:24:31
 * @Fun  代理模式	(结构型模式)：为其他对象提供一种代理以控制对这个对象的访问。 <br/>
 * 		 在某些情况下，一个对象不适合或者不能直接引用另一个对象，而代理对象可以在客户端和目标对象之间起到中介的作用。<br/>
 * <p>
 * 优点：<br/>
 * 		1.职责清晰:真实的角色就是实现实际的业务逻辑，不用关心其他非本职的事务，通过后期的代理完成一件完成事务，附带的结果就是编程简洁清晰。<br/>
 * 		2.代理对象可以在客户端和目标对象之间起到中介的作用，这样起到了方便客户端用户的作用和保护了目标对象的作用。<br/>
 * 		3.高扩展性。<br/>
 * </p>
 * 
 * <p>
 * 模式结构：<br/>
 * 		一个是真正的你要访问的对象（目标类），一个是代理对象，真正对象与代理对象实现同一个接口，先访问代理类再访问真正要访问的对象。<br/>  
 * 		在装饰器模式和代理模式之间还是有很多差别的。装饰器模式关注于在一个对象上动态的添加方法，然而代理模式关注于控制对对象的访问。<br/>
 * 		用代理模式，代理类（proxy class）可以对它的客户隐藏一个对象的具体信息。因此，当使用代理模式的时候，我们常常在一个代理类中创建一个对象的实例。<br/>
 * 		用装饰器模式的时候，我们通常的做法是将原始对象作为一个参数传给装饰者的构造器。<br/>
 * 		使用代理模式，代理和真实对象之间的关系通常在编译时就已经确定了，而装饰者能够在运行时递归地被构造。<br/>
 * </p>
 **/
public class MainTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		/**
		 * 普通的静态代理：客户端不知道被代理对象，由代理对象完成其功能的调用
		 */
		IGamePlayer proxy = new GamePlayerProxy("x");
		System.out.println("开始时间是：" + new Date().toLocaleString());
		proxy.login("zz", "zz");
		proxy.killBoss();
		proxy.upgrade();
		System.out.println("结束时间是："+ new Date().toLocaleString());
		
		System.out.println();
		
		/**
		 * 代理对象，增强了被代理对象的功能
		 */
		IGamePlayer proxy2 = new GamePlayerProxy2("y");
		proxy2.login("zhao", "y");
		proxy2.killBoss();
		proxy2.upgrade();
		
		System.out.println();
		
		/**
		 * 动态代理：使用jdk提供的InvocationHandler，反射调用被代理对象的方法，结合java.reflect.Proxy产生代理对象
		 * 
		 * 动态传入被代理对象构造InvocationHandler，在handler中的invoke时可以增强被代理对象的方法的功能
		 * 或者说：（面向切面：）在什么地方（连接点），执行什么行为（通知）
		 * GamePlayerProxy3中是方法名为login时通知开始时间，upgrade时通知结束时间。
		 */
		GamePlayerProxy3 dynamic = new GamePlayerProxy3(new GamePlayer("z"));
		IGamePlayer dynamicPlayer = dynamic.getProxy();
		dynamicPlayer.login("some", "jone");
		dynamicPlayer.killBoss();
		dynamicPlayer.upgrade();
		
		System.out.println();
		/**
		 * 面向切面：一些相似的业务逻辑需要加在众多的地方，我们就可以把它提取到切面中，切面也就是事务切面：如日志切面，权限切面，业务切面。
		 */
	}
}
/**
 * 推荐博客：http://blog.csdn.net/jackiehff/article/details/8621517
 */