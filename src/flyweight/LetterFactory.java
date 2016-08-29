package flyweight;

import java.util.HashMap;
import java.util.Map;
/**
 * @author shadow
 * @Date 2016年8月5日下午8:05:27
 * @Fun  一个产生字母对象的 享元工厂（单例工厂）
 **/
public class LetterFactory {
	private Map<String, Letter> map;
	private static LetterFactory instance = new LetterFactory();
	
	private LetterFactory(){
		map = new HashMap<>();
	}
	
	public static  LetterFactory getInstance(){
		return instance;
	}
	
	public void add(Letter letter){
		if(letter != null && !map.containsKey(letter.getName())){
			map.put(letter.getName(), letter);
		}
		
		System.out.println("map.size ==== " + map.size());
	}
	
	public Letter get(String name){
		return map.get(name);
	}
}
