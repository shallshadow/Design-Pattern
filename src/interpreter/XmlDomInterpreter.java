package interpreter;
/**
 * @author shadow
 * @Date 2016年8月7日下午9:00:03
 * @Fun
 **/
public class XmlDomInterpreter implements Interpreter {
	@Override
	public void interpreter(Context context) {
		// TODO Auto-generated method stub
		System.out.println("xml dom Interpreter : " + context.getData());
	}
}
