package proxy;

import java.util.Date;
/**
 * @author shadow
 * @Date 2016年8月6日下午9:14:10
 * @Fun 客户端 对被代理对象不可见<br/>
 * 		代理对象，增强了被代理对象的功能<br/>
 **/
public class GamePlayerProxy2 implements IGamePlayer {

	private IGamePlayer gamePlayer = null;
	
	public GamePlayerProxy2(String userName) {
		// TODO Auto-generated constructor stub
		this.gamePlayer = new GamePlayer(userName);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		System.out.println("登录时间是：" + new Date().toLocaleString());
		this.gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		this.gamePlayer.killBoss();
	}

	@SuppressWarnings("deprecation")
	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		this.gamePlayer.upgrade();
		System.out.println("升级时间是：" + new Date().toLocaleString());
	}

}
