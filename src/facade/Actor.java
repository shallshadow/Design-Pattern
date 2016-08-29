package facade;
/**
 * @author shadow
 * @Date 2016年8月4日下午9:43:24
 * @Fun 角色
 **/
public class Actor {
	public Actor(String name){
		System.out.println("创建了角色：" + name);
	}
	
	public void load(){
		System.out.println("角色加载。");
	}
	
	public void unload(){
		System.out.println("角色退出，存档");
	}
}
