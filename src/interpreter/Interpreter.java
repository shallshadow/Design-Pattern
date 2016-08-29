package interpreter;
/**
 * @author shadow
 * @Date 2016年8月7日下午8:55:04
 * @Fun 解释操作
 **/
public interface Interpreter {
	//实际中，可以有个返回的类型，定义解释出的数据对象。
	public void interpreter(Context context);
}
