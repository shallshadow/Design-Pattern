package proxy;
/**
 * @author shadow
 * @Date 2016年8月6日下午9:07:59
 * @Fun 具体玩家
 **/
public class GamePlayer implements IGamePlayer {

	private String name = "";
	
	public GamePlayer(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void login(String user, String password) {
		// TODO Auto-generated method stub
		System.out.println("登录名为" + user + "的角色 " + this.name + " 登录成功！");
	}

	@Override
	public void killBoss() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " 在打怪！");
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " 又升了一级！");
	}

}
