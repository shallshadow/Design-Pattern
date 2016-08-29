package absfactory;
/**
 * @author shadow
 * @Date 2016年8月18日下午7:07:15
 * @Fun  实体工厂 创建实体产品，返回类型为抽象产品
 **/
public class Factory implements IFactory {

	@Override
	public IProduct1 createProduct1A() {
		// TODO Auto-generated method stub
		return new GradeProduct1A();
	}

	@Override
	public IProduct1 createProduct1B() {
		// TODO Auto-generated method stub
		return new GradeProduct1B();
	}

	@Override
	public IProduct2 createProduct2A() {
		// TODO Auto-generated method stub
		return new GradeProduct2A();
	}

	@Override
	public IProduct2 createProduct2B() {
		// TODO Auto-generated method stub
		return new GradeProduct2B();
	}

}
