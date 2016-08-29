package observer;
/**
 * @author shadow
 * @Date 2016年8月12日下午8:02:58
 * @Fun  监听器 是观察者模式的一种实现
 * 		 一些需要监听的业务接口上添加 监听器，调用监听器的相应方法，实现监听。
 **/
public class User {
	public void register(IRegisterListener register){
		/**
		 * do ... register
		 */
		System.out.println("正在注册中....");
		//注册后
		register.onRegistered();
	}
	
	public void login(ILoginListener login){
		/**
		 * do ... login
		 */
		System.out.println("正在登录中....");
		//登录后
		login.onLogined();
	}
}
