package iterator;
/**
 * @author shadow
 * @Date 2016年8月7日下午9:10:56
 * @Fun 自定义迭代器接口 类似java.util.Iterator
 * 		用于遍历集合类ICollection的数据
 **/
public interface IIterator<T> {
	boolean hasNext();
	boolean hasPrevious();
	
	T next();
	T previous();
}
