package observer;
/**
 * @author shadow
 * @Date 2016年8月12日下午7:44:53
 * @Fun	 抽象目标 Subject<br/>
 * 		提供注册和删除观察者对象的接口，以及通知观察者进行观察的接口及目标 自身被观察的业务的接口。<br/>
 **/
public interface IWathedSubject {
	
	void add(IWatcher watcher);
	
	void remove(IWatcher watcher);
	
	void notifyWatchers();
	
	//被观察业务变化的接口
	void update();
}
