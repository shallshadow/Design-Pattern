package facade;
/**
 * @author shadow
 * @Date 2016年8月4日下午9:45:26
 * @Fun 场景
 **/
public class Scene {
	public Scene(String name){
		System.out.println("创建了场景：" + name);
	}
	
	public void load(){
		System.out.println("场景加载。");
	}
	
	public void unload(){
		System.out.println("场景卸载。");
	}
}
