package observer;
/**
 * @author shadow
 * @Date 2016年8月12日下午7:48:35
 * @Fun	 具体观察者
 **/
public class UpdateWatcher implements IWatcher{

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(this + " 观察到：目标已经更新了。");
	}

}
