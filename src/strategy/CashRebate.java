package strategy;

import java.math.BigDecimal;
/**
 * @author shadow
 * @Date 2016年8月12日下午8:51:48
 * @Fun  打折收取现金
 **/
public class CashRebate implements ICashSuper {
	
	private double rebate;
	
	public CashRebate(double rebate) {
		// TODO Auto-generated constructor stub
		this.rebate = rebate;
	}
	
	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return new BigDecimal(money * rebate / 10).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}
