package strategy;
/**
 * @author shadow
 * @Date 2016年8月12日下午8:48:34
 * @Fun  策略模式：针对同一命令(或行为)，不同的策略做不同的动作。
 * 
 * 		商品促销
 * 		本接口为：收取现金的类
 **/
public interface ICashSuper {
	double acceptCash(double money);
}
