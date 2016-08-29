package observer;

import java.util.Observable;
import java.util.Observer;
/**
 * @author shadow
 * @Date 2016年8月12日下午7:29:31
 * @Fun 观察目标
 **/
public class UpdateObservable extends Observable {
	private int data;
	
	public UpdateObservable(Observer obserer) {
		// TODO Auto-generated constructor stub
		addObserver(obserer);
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setData(int data){
		if(data != this.data){
			this.data = data;
			//标记 改变 只有标记后才能通知到
			setChanged();
			//通知
			notifyObservers();
		}
	}
}
