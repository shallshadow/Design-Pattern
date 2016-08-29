package interpreter;
/**
 * @author shadow
 * @Date 2016年8月7日下午8:58:43
 * @Fun
 **/
public class XmlSaxInterpreter implements Interpreter {

	@Override
	public void interpreter(Context context) {
		// TODO Auto-generated method stub
		System.out.println("xml sax Interpreter : " + context.getData());
	}

}
