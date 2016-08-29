package facade;
/**
 * @author shadow
 * @Date 2016年8月4日下午9:46:58
 * @Fun  组合相关类
 **/
public class Facade {
	Actor actor;
	Scene scene;
	
	public Facade(){
		this.actor = new Actor("lisi");
		this.scene = new Scene("海天盛筵");
	}
	
	public void startGame(){
		actor.load();
		scene.load();
	}
	
	public void endGame(){
		actor.unload();
		scene.unload();
	}
}
