package proxy;
/**
 * @author shadow
 * @Date 2016年8月6日下午9:11:26
 * @Fun  玩家代理<br/>
 * 		  普通的静态代理：客户端不知道被代理对象，由代理对象完成其功能的调用<br/>
 **/
public class GamePlayerProxy implements IGamePlayer {

	//被代理对象
	private IGamePlayer gamePlayer = null;
	
	//通过构造函数传递要对谁进行代理
	public GamePlayerProxy(String userName) {
		// TODO Auto-generated constructor stub
		this.gamePlayer = new GamePlayer(userName);
	}
	
	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		this.gamePlayer.login(user, password);
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		this.gamePlayer.killBoss();
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		this.gamePlayer.upgrade();
	}

}
