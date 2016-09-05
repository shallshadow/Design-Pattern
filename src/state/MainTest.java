package state;
/**
 * @author shadow
 * @Date 2016年8月12日下午8:42:27
 * @Fun  状态(State)模式  行为模式
 * 	     既改变对象的状态，又改变对象的行为，在运行期 根据状态改变行为。
 **/
public class MainTest {
	/**
	 * 本例的状态值只有两个，由状态类自身控制，也可以把状态值的控制，交由客户端来设置。
	 */
	public static void main(String[] args) {
		WindowContext context = new WindowContext(new WindowState("窗口"));
		context.switchState();
		context.switchState();
		context.switchState();
	}	
}
/**
 * 推荐博客：http://www.cnblogs.com/java-my-life/archive/2012/06/08/2538146.html
 */
