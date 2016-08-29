package model.base;

/**
 * 
 * @author shadow
 *
 */
public class Room extends MapSite {
	
	public Room(int roomNo) {
		// TODO Auto-generated constructor stub
		this.sides = new MapSite[4];
		this.roomNumber = roomNo;
	}
	
	public void Initialize(int roomNo){
		this.roomNumber = roomNo;
	}
	
	public void Enter(){
		System.err.println("Room");
	}
	
	public MapSite GetSide(Direction direction){
		if(sides == null){
			return null;
		}		
		return sides[direction.getValue()];
	}
	public void SetSide(Direction direction, MapSite mapSite){
		this.sides[direction.getValue()] = mapSite;
	}
	
	public int getRoomNumber(){
		return this.roomNumber;
	}
	
	private MapSite[] sides;
	private int roomNumber;
	
	private void clone(Room room){	
		room.sides = new MapSite[4];
		System.arraycopy(room.sides, 0, this.sides, 0, room.sides.length);
	}	
	
	@Override
	public Room clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Room cloneRoom = (Room) super.clone();
		clone(cloneRoom);
		return cloneRoom;
	}
}
