package model.enchanted;

import absfactory.MazeFactory;
import model.base.Door;
import model.base.Room;

public class EnchantedMazeFactory extends MazeFactory {
	
	public EnchantedMazeFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public Room MakeRoom(int number){
		return new EnchantedRoom(number, CastSpell());
	}
	
	public Door MakeDoor(Room room1, Room room2){
		return new DoorNeedingSpell(room1, room2);
	}
	
	protected Spell CastSpell(){		
		return new Spell();		
	}
}
