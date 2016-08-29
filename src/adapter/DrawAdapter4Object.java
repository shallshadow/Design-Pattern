/**
 * @author shadow
 * @Date 2016年8月1日下午8:04:42
 * @Fun 对象适配器： 使用对象组合的方式，是动态组合的方式。
 * 		既能画方又能画圆。DrawAdapter是适配器，DrawRectangle属于Adapter，是被适配者，
 * 		适配器将被适配者和适配目标（DrawCircle）进行适配。
 **/
package adapter;

public class DrawAdapter4Object implements IDrawCircle {

	private DrawRectangle drawRectangle;
	
	public DrawAdapter4Object(DrawRectangle drawRectangle) {
		// TODO Auto-generated constructor stub
		this.drawRectangle = drawRectangle;
	}
	
	@Override
	public void drawCircle() {
		// TODO Auto-generated method stub
		System.out.println("DrawAdapter4Object:drawCircle");
	}
	
	public void drawRectangle(String msg){
		drawRectangle.drawRectangle(msg);
	}
	
}
