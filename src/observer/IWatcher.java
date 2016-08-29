package observer;
/**
 * @author shadow
 * @Date 2016年8月12日下午7:42:11
 * @Fun	抽象观察者 Observer
 * 		观察 更新
 **/
public interface IWatcher {
	/**
	 * 通知接口：
	 * 	1.简单通知。
	 * 	2.观察者需要目标的变化的数据，那么可以将目标用作参数，见java的Observer和Observable
	 */
	
	void update();
}
