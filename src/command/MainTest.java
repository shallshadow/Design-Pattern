package command;

/**
 * @author shadow
 * @Date 2016年8月7日下午8:48:11
 * @Fun  命令(Command)模式		请求与执行  分离
 * 		 可以多个命令接口的实现类，隐藏真实的被调用方法。
 **/
public class MainTest {
	public static void main(String[] args) {
		//真正的执行者
		Receiver receiver = new Receiver();
		//用于的隔离的命令
		ICommand command = new ConcreteCommand(receiver);
		//调用者
		Invoker invoker = new Invoker(command);
		invoker.invoke();
	}
}
