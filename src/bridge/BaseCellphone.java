package bridge;
/**
 * @author shadow
 * @Date 2016年8月4日下午7:42:45
 * @Fun 手机类
 **/
public abstract class BaseCellphone {
	
	private BaseCellphoneShell shell;
	
	public void setShell(BaseCellphoneShell shell){
		this.shell = shell;
	}
	
	public BaseCellphoneShell getShell(){
		return this.shell;
	}
	
	//对应哪种壳
	public abstract void mapping();
}
