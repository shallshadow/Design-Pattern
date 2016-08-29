package strategy;
/**
 * @author shadow
 * @Date 2016年8月12日下午9:02:11
 * @Fun  根据传递的策略类，执行相应的行为。
 **/
public class CashContext {
	private ICashSuper casher;
	
	public CashContext() {
		// TODO Auto-generated constructor stub
	}
	
	public CashContext(ICashSuper casher){
		this.casher = casher;
	}
	
	public void setCasher(ICashSuper casher){
		this.casher = casher;
	}
	
	//根据具体的策略对象，调用它的算法行为
	public double acceptCash(double money){
		return this.casher.acceptCash(money);
	}
}
