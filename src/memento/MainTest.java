package memento;
/**
 * @author shadow
 * @Date 2016年8月8日下午8:26:30
 * @Fun  备忘录(Memento)模式   行为模式
 * 	 	 流程：Memento用于保存 数据状态
 * 			Originator用于加载数据，建立Memento对象，及通过Memento恢复原始数据
 **/
public class MainTest {
	public static void main(String[] args) {
		//创建数据对象		
		DataState state = new DataState();
		state.setAction("copy a character");
		//
		Originator originator = new Originator();
		System.out.println("创建原始数据");
		originator.setState(state);
		Memento memento = originator.getMemento();
		System.out.println(memento.getState());
		
		System.out.println("创建备忘录对象，保存原始数据状态");
		originator.setState(new DataState());
		
		System.out.println("创建了一个新数据");
		originator.setState(new DataState());
		
		System.out.println("创建新数据后：" + originator.getState().getAction());
		
		/**
		 * memento 需要保存在某地，需要时取出，以恢复它内部所保存的数据
		 */
		System.out.println("创建新数据后，恢复原数据");
		originator.setMemento(memento);
		System.out.println(originator.getState().getAction());
	}
}
