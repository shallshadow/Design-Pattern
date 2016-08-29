package state;
/**
 * @author shadow
 * @Date 2016年8月12日下午8:39:00
 * @Fun  状态的使用
 **/
public class WindowContext {
	private WindowState state;
	
	public WindowContext(WindowState state){
		this.state = state;
	}
	
	public WindowState getState(){
		return state;
	}
	
	public void setState(WindowState state){
		this.state = state;
	}
	
	public void switchState(){
		this.state.handle();
	}
}
