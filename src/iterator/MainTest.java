package iterator;
/**
 * @author shadow
 * @Date 2016年8月7日下午9:29:29
 * @Fun  迭代器(Iterator)模式又叫做游标(Cursor)模式
 * 		 提供一种方法访问一个容器(container)对象中各个元素，而又不需要暴露该对象的内部细节。
 * 		Iterator 模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以做到不暴露集合的内部结构，又可让外部代码透明的访问集合内部的数据。
 *  	例如Tree,HashSet等容器提供Iterator
 * 
 *  	若有新的存储结构，可new一个ICollection，对应的new 一个IIterator来实现它的遍历。
 **/ 
public class MainTest {
	public static void main(String[] args) {
		ICollection<Integer> collection = new MyCollection<>();
		add(collection, 3, 5, 6, 8, 9, 10, 56, 96, 5);
		for(IIterator<Integer> iterator = collection.iterator();iterator.hasNext();){
			System.out.println(iterator.next());
		}
		
		System.out.println("----------------------");
		
		ICollection<Object> collection2 = new MyCollection<>();
		add(collection2, "a", "b", "c", "d", 3, 5, 6, 7);
		for(IIterator<Object> iterator = collection2.iterator(); iterator.hasNext();){
			System.out.println(iterator.next());
		}
	}
	
	@SuppressWarnings("unchecked")
	static<T> void add(ICollection<T> c,T ...a){
		for(T t : a){
			c.add(t);
		}
	}
	/**
	 * 推荐博客：http://blog.csdn.net/zhengzhb/article/details/7610745
	 * 
	 */
}
