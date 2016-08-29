package proxy;
/**
 * @author shadow
 * @Date 2016年8月6日下午9:05:42
 * @Fun 玩家接口
 **/
public interface IGamePlayer {
	
	public void login(String user, String password);
	
	// 杀怪，网络游戏的主要特色
	public void killBoss();
	
	//升级
	public void upgrade();
}
