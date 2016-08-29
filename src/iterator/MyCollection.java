package iterator;

import java.util.Arrays;
/**
 * @author shadow
 * @Date 2016年8月7日下午9:15:55
 * @Fun  实现的存储数据集合类
 **/
public class MyCollection<T> implements ICollection<T> {

	private T[] arys;
	private int index = -1;
	private int capacity = 6;
	
	@SuppressWarnings("unchecked")
	public MyCollection() {
		// TODO Auto-generated constructor stub
		this.arys = (T[])new Object[capacity];
	}
	
	@Override
	public IIterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<>(this);
	}

	@Override
	public void add(T t) {
		// TODO Auto-generated method stub
		index++;
		if(index == capacity){
			capacity += 6;
			this.arys = Arrays.copyOf(arys, capacity);
		}
		this.arys[index] = t;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		if(index < size()){
			return this.arys[index];
		}
		
		return null;		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return index + 1;
	}

}
