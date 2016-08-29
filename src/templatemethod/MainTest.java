/**
 * @author shadow
 * @Date 2016年8月12日下午9:34:26
 * @Fun  模板方法(TemplateMethod)模式：行为型模式，定义了一系列操作的骨架，将模块的实现，延迟到实现类或者子类中进行。
 * 		 跟建造者模式的比较：
 * 			建造者模式，使用组合方式，由指挥者Director指挥组合的Builder建造，建造流程由Director控制，建造的模块
 * 			方法由Builder实现。
 * 			模板方法模式，由模板定义操作流程，由子类或实现类实现具体的模块方法。
 * 			综上，建造者模式灵活于模板方法模式。
 **/
package templatemethod;

public class MainTest {
	public static void main(String[] args) {
		BaseTemplate template = new TemplateMethod();
		template.useTemplateMethod();
		
		System.out.println();
		
		template = new TemplateMethod2();
		template.useTemplateMethod();
	}
}
