/**
 * @author shadow
 * @Date 2016年8月12日下午9:29:03
 * @Fun  业务流程模板，提供基本框架
 **/
package templatemethod;

public abstract class BaseTemplate {
	public abstract void part1();
	
	public abstract void part2();
	
	public abstract void part3();
	
	//为了严格实验结果，使用final不可被覆写
	public final void useTemplateMethod(){
		part1();
		part2();
		part3();
	}
}
