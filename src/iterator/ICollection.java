package iterator;
/**
 * @author shadow
 * @Date 2016年8月7日下午9:10:13
 * @Fun  自定义集合接口，类似java.util.Collection
 * 		 用于数据存储
 **/
public interface ICollection<T> {
	
	//返回迭代器
	IIterator<T> iterator();
	
	void add(T t); 
	
	T get(int index);
	
	int size();
}
