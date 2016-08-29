package chainofresponsibility;

/**
 * @author shadow
 * @Date 2016年8月7日下午7:58:16
 * @Fun 抽象责任
 **/
public abstract class IFilter {
	private IFilter successor;
	
	//获取下一级处理单元
	public IFilter getSuccessor(){
		return successor;
	}
	//设置下一级处理单元
	public void setSuccessor(IFilter successor){
		this.successor = successor;
	}
	/**
	 * 处理事件
	 */
	public abstract void handleFilter();
	
	public abstract void handleFilter2();
}
