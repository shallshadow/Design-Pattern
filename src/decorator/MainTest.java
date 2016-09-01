package decorator;

/**
 * @author shadow
 * @Date 2016年8月4日下午9:29:49
 * @Fun  特点：1.装饰对象和真实对象有相同的接口。这样客户端对象就能以和真实对象相同的方法和装饰对象交互。<br/>
 * 			 2.装饰对象包含一个真实对象的引用(reference)。<br/>
 * 			 3.装饰对象所接受所有来自客户端的请求。它把这些请求转发给真实的对象。<br/>
 * 			 4.装饰对象可以在转发这些请求以前或以后增加一些附加功能。这样就确保了在运行时，不用修改给定对象的结构就可以在外部增加附加的功能。<br/>
 * 			  在面向对象的设计中，通常是通过继承来实现对特定类的功能扩展。而装饰后，持有了真实对象，用以增强其功能。<br/>
 * 
 * 		<p>装饰者与适配器模式的区别：<br/>
 * 			关于新职责：适配器也可以在转换时增加新的职责，但主要目的不在此。装饰者模式主要是给被装饰者增加新职责的。<br/>
 * 			关于其包裹的对象：适配器是知道被适配这得详细情况的（就是适配类）。装饰者只知道其接口是什么，至于其具体类型(是基类还是其他派生类）只有在运行期间才知道。<br/>
 * 		</p>
 **/
public class MainTest {
	public static void main(String[] args) {
		Reader reader = new Reader();
		reader.read();
		System.err.println("--------");
		BufferedReader reader2 = new BufferedReader(reader);
		reader2.read();
	}
}
/**
 * 推荐博客：http://www.cnblogs.com/bastard/archive/2012/02/02/2336150.html
 * **/
