package model.enchanted;

import model.base.Door;
import model.base.Room;

public class DoorNeedingSpell extends Door {

	public DoorNeedingSpell(Room room1, Room room2) {
		super(room1, room2);
		// TODO Auto-generated constructor stub
		super.close();
	}
	
	public void Enter(){
		
	}
}
