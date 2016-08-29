
package singleton;
/**
 *
 * @author shadow E-mail:zyydqpi@163.com
 * @Date 2016年8月28日下午7:21:32
 * @version 1.0
 * @since  单例模式
 **/
public class Singleton {
	private static Singleton instance;
	
	private Singleton(){
		
	}	
	public static Singleton getSingleton() {
		
		if(instance == null){
			synchronized (Singleton.class) {
				if(instance == null){
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}
}
