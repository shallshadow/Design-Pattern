package flyweight;
/**
 * @author shadow
 * @Date 2016年8月5日下午8:10:16
 * @Fun	 享元(Flyweight)模式  结构模式	主要目的是实现对象的共享<br/>
 * 		 字面上看就是一个  共享元件的模式，将系统中需要重复使用的对象，共享成单个元件。<br/>
 * 
 * 		<p>像JDBC数据库连接池、线程池等 都是应用了享元模式<br/>
 * 			数据库连接池：创建了一定数量的连接，存入池中，用到时取出，释放时再存入。<br/>
 * 			线程池：类似。<br/>
 * 		所以一般都会有一个集合存储元件；有一个享元工厂进行元件的管理。</p>
 **/
public class MainTest {
	public static void main(String[] args) {
		LetterFactory factory = LetterFactory.getInstance();
		String word = "easiness";
		addLetterByName(factory, word);
		
		getLetter(factory, word);
	}

	static void addLetterByName(LetterFactory factory, String word) {
		for (char c : word.toCharArray()) {
			factory.add(new Letter(c + ""));
		}
	}

	static void getLetter(LetterFactory factory, String word) {
		for (char c : word.toCharArray()) {
			System.out.println(factory.get(c + ""));
		}
	}
}
/**
 * 推荐博客：http://blog.csdn.net/hguisu/article/details/7535792
 * */

/**
 * 适用性：
 *  1.一个应用程序使用大量相同或者相似的对象，造成很大的存储开销。
 *  2.对象的大部分状态都可以外部化，可以将这些外部状态传入对象中。
 *  3.如果删除对象的外部状态，那么可以用相对较少的共享对象取代很多组对象。
 *  4.应用程序不依赖于对象标识。由于Flyweight对象可以被共享，对于概念上明显有别的对象，标识测试将返回真值。
 *  5.使用享元模式需要维护一个存储享元对象的享元池，而这需要消耗资源，因此，只要在多次重复使用享元对象时才值得使用享元模式。
 * **/
