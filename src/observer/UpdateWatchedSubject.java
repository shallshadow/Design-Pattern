package observer;

import java.util.ArrayList;
import java.util.List;
/**
 * @author shadow
 * @Date 2016年8月12日下午7:50:13
 * @Fun  具体被观察者目标
 **/
public class UpdateWatchedSubject implements IWathedSubject {

	private List<IWatcher> list;
	
	public UpdateWatchedSubject() {
		// TODO Auto-generated constructor stub
		this.list = new ArrayList<>();
	}
	@Override
	public void add(IWatcher watcher) {
		// TODO Auto-generated method stub
		this.list.add(watcher);	
	}

	@Override
	public void remove(IWatcher watcher) {
		// TODO Auto-generated method stub
		this.list.add(watcher);
	}

	@Override
	public void notifyWatchers() {
		// TODO Auto-generated method stub
		for(IWatcher watcher : list){
			watcher.update();
		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("目标更新中....");
		notifyWatchers();
	}

}
