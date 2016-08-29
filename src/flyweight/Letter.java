package flyweight;
/**
 * @author shadow
 * @Date 2016年8月5日下午8:04:08
 * @Fun 字母
 **/
public class Letter {
	private String name;
	
	public Letter(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}
