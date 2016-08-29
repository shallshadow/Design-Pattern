/**
 * @author shadow
 * @Date 2016年8月7日下午8:46:46
 * @Fun
 **/
package command;

public class Invoker {

	private ICommand command;
	
	public Invoker(ICommand command){
		this.command = command;
	}
	
	public void invoke(){
		this.command.execute();
	}
}
