/**
 * @author shadow
 * @Date 2016年8月1日下午8:00:04
 * @Fun 类适配器 使用对象继承的方式，是静态的定义方式
 **/
package adapter;

public class DrawAdapter4Class extends DrawRectangle implements IDrawCircle {

	@Override
	public void drawCircle() {
		// TODO Auto-generated method stub
		System.out.println("DrawAdpater4Class : drawCircle" );
	}

}
