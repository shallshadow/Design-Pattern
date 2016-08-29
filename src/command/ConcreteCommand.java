/**
 * @author shadow
 * @Date 2016年8月7日下午8:44:23
 * @Fun
 **/
package command;

public class ConcreteCommand implements ICommand {

	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver) {
		// TODO Auto-generated constructor stub
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.receiver.action();
	}

}
