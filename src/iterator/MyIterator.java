package iterator;
/**
 * @author shadow
 * @Date 2016年8月7日下午9:20:52
 * @Fun  迭代器实现类
 **/
public class MyIterator<T> implements IIterator<T> {

	private ICollection<T> collection;
	private int index = 0;
	
	public MyIterator(ICollection<T> collection) {
		// TODO Auto-generated constructor stub
		this.collection = collection;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index < this.collection.size();
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return index > 0;
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub	
		return this.collection.get(index++);
	}

	@Override
	public T previous() {
		// TODO Auto-generated method stub
		return this.collection.get(index--);
	}

}
