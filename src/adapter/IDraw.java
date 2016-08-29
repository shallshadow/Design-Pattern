/**
 * @author shadow
 * @Date 2016年8月1日下午8:13:10
 * @Fun 接口适配器：接口中有抽象方法，我们只想实现其中的几个，不想全部实现，所以提供
 * 		一个默认空实现，然后继承它，重写实现我们想实现的方法
 **/
package adapter;

public interface IDraw {
	void drawCircle();
	void drawRectangle();
}
