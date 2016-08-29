package memento;

import java.io.Serializable;
/**
 * @author shadow
 * @Date 2016年8月8日下午8:00:53
 * @Fun 一个保存另一个对象内部状态拷贝的对象，这样以后就可以将该对象恢复到原先保存的状态。
 **/
public class Memento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8121679932355414767L;
//	
//	private int number;
//	private File file = null;
	
	private DataState state;
	
	public Memento(Originator o){
		this.state = o.getState();
	}
	
	public DataState getState(){
		return this.state;
	}
	
	public void setState(DataState state){
		this.state = state;
	}
}
