package state;
/**
 * @author shadow
 * @Date 2016年8月12日下午8:34:09
 * @Fun
 **/
public class WindowState {
	private String stateValue;
	
	public WindowState(String stateValue){
		this.stateValue = stateValue;
	}
	
	public String getStateValue(){
		return this.stateValue;
	}
	
	public void setStateValue(String stateValue){
		this.stateValue = stateValue;
	}
	
	public void handle(){
		if("窗口".equals(stateValue)){
			switchWindow();
			this.stateValue = "全屏";
		}else if("全屏".equals(stateValue)){
			switchFullscreen();
			this.stateValue = "窗口";
		}
	}
	
	private void switchWindow(){
		System.out.println("切换为窗口状态");
	}
	
	private void switchFullscreen(){
		System.out.println("切换为全屏状态");
	}
}
