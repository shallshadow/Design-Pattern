package model.base;

/**
 * 
 * @author shadow
 *
 */
public class Door extends MapSite {
	
	public Door(Room room1, Room room2) {
		// TODO Auto-generated constructor stub
		this.room1 = room1;
		this.room2 = room2;
		this.isOpen = true;
	}
	
	public void Enter(){
		
	}
	
	public Room OtherSideFrom(Room room){		
		if(room == null){
			throw new RuntimeException("The room is null.");
		}
		if(room1.equals(room)){
			return room2;
		}else{
			return room1;
		}
	}
	
	public boolean getIsOpen(){
		return this.isOpen;
	}
	
	protected void close(){
		this.isOpen = false;
	}
	
	protected void open(){
		this.isOpen = true;
	}
	
	public void Initialize(Room room1, Room room2){
		this.room1 =room1;
		this.room2 = room2;
	}
	
	@Override
	public Door clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Door) super.clone();
	}
	
	private Room room1;
	private Room room2;
	private boolean isOpen;
}
