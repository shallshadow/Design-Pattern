
package builder;
/**
 * 指挥者：指导 如何 建造
 * @author shadow E-mail:zyydqpi@163.com
 * @Date 2016年8月20日下午7:29:25
 * @version 1.0
 * @since 
 **/
public class Director {
	private MazeBuilder builder;
	
	public Director(MazeBuilder builder) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
	}
	
	/**
	 * 建造方法：定义了建造的流程
	 */
	public void construct(){
		builder.Buildmaze();
		builder.BuildRoom(1);
		builder.BuildRoom(2);
		builder.BuildDoor(1, 2);
	}
}
