package observer;

import java.util.Observable;
import java.util.Observer;
/**
 * @author shadow
 * @Date 2016年8月12日下午7:38:19
 * @Fun 观察者
 **/
public class UpdateObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("接受到数据变化的通知：");
		
		if(o instanceof UpdateObservable) {
			UpdateObservable uObservable = (UpdateObservable)o;
			System.out.println("数据变更为：" + uObservable.getData());
		}
		
	}

}
