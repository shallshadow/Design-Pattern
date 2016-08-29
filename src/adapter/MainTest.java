/**
 * @author shadow
 * @Date 2016年8月1日下午8:01:07
 * @Fun 适配器：对象适配器、类适配器、接口适配器
 **/
package adapter;

public class MainTest {
	public static void main(String[] args) {
		//对象适配器
		DrawAdapter4Object objAdapter = new DrawAdapter4Object(new DrawRectangle());
		objAdapter.drawCircle();
		objAdapter.drawRectangle(" in DrawAdapter4Object");
		
		//类适配器
		DrawAdapter4Class adapter4 = new DrawAdapter4Class();
		adapter4.drawCircle();
		adapter4.drawRectangle(" in DrawAdapter4Class ");
		
		//接口适配器
		MyDrawAdapter adapter = new MyDrawAdapter();
		adapter.drawCircle();
		adapter.drawRectangle();
	}
	
	static class MyDrawAdapter extends DefaultDrawAdapter{
		@Override
		public void drawCircle() {
			// TODO Auto-generated method stub
			System.out.println("My DrawAdapter:Draw CirCle");
		}
		
		@Override
		public void drawRectangle() {
			// TODO Auto-generated method stub
			super.drawRectangle();
			System.out.println("My DrawAdapter:Draw Rectangle");
		}
	}
}
