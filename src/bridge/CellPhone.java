package bridge;
/**
 * @author shadow
 * @Date 2016年8月4日下午7:44:26
 * @Fun 手机的实现
 **/
public class CellPhone extends BaseCellphone {
	
	@Override
	public void mapping() {
		// TODO Auto-generated method stub
		System.out.println("本手机对应的壳是：");
		getShell().mapping();
	}
}
