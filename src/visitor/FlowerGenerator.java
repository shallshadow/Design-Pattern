package visitor;

import java.util.Random;
/**
 * @author shadow
 * @Date 2016年8月13日下午8:18:55
 * @Fun  花生产器
 **/
public class FlowerGenerator {
	private static Random random = new Random();
	
	public static Flower newFlower(){
		switch (random.nextInt(2)) {
		default:
		case 0:			
			return new Gladiolus();
		case 1:
			return new Chrysanthemum();
		}
	}
}
