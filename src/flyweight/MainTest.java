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
