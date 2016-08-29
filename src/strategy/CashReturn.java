package strategy;
/**
 * @author shadow
 * @Date 2016年8月12日下午8:58:25
 * @Fun  返现策略
 **/
public class CashReturn implements ICashSuper {

	//返现底限金额
	private double moneyCondition;
	//返现金额
	private double returnMoney;
	
	public CashReturn(double moneyCondition, double returnMoney) {
		// TODO Auto-generated constructor stub
		this.moneyCondition = moneyCondition;
		this.returnMoney = returnMoney;
	}
	
	//多重返利
	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		if(money >= moneyCondition){
			return money - Math.floor(money / moneyCondition) * returnMoney;
		}
		return 0;
	}

}
