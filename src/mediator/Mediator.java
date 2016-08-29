package mediator;
/**
 * @author shadow
 * @Date 2016年8月8日下午7:10:09
 * @Fun 中介、调节实际上需要交互的两个元素，让其松耦合
 **/
public class Mediator implements IMediator {

	private XmlCode xmlCode;
	private XmlPreview xmlPreview;
	
	@Override
	public void creareMediator() {
		// TODO Auto-generated method stub
		this.xmlCode = new XmlCode();
		this.xmlPreview = new XmlPreview();
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		this.xmlCode.work();
		this.xmlPreview.work(); 
	}

}
