/**
 * @author shadow
 * @Date 2016年8月18日下午7:05:50
 * @Fun  抽象工厂 创建不同的抽象产品
 **/
package absfactory;

public interface IFactory {
	public IProduct1 createProduct1A();
	public IProduct1 createProduct1B();
	public IProduct2 createProduct2A();
	public IProduct2 createProduct2B();
}
