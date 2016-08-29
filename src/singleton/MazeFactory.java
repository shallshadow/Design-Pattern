package singleton;
/**
 * @author shadow
 * @Date 2016年7月30日下午8:01:22
 * @Fun  单例模式
 **/
public class MazeFactory {
	private static MazeFactory instance;
	private MazeFactory(){
		
	}
	
	public static MazeFactory getInstance(){
		if(instance == null){
			synchronized (MazeFactory.class) {
				if(instance == null){
					instance = new MazeFactory();
				}
			}
		}
		
		return instance;
	}
	
}
