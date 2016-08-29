package memento;
/**
 * @author shadow
 * @Date 2016年8月8日下午8:01:48
 * @Fun 
 **/
public class Originator {
	
	private DataState state;
	
	public Originator() {
		// TODO Auto-generated constructor stub
	}
	
	public Originator(DataState state){
		this.state = state;
	}
	
	public Memento getMemento(){
		return new Memento(this);
	}
	
	public void setMemento(Memento m){
		/**
		 * getMemento()创建的对象，保存在某个容器里，当需要恢复时，将其传入当前方法，再使用getState()得出 
		 */
		this.state = m.getState();
	}
	
	public DataState getState(){
		return this.state;
	}
	
	public void setState(DataState state){
		this.state = state;
	}
	
}
