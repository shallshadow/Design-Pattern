package model.bombed;

import model.base.Room;

/**
 * 
 * @author shadow
 *
 */
public class RoomWithABomb extends Room {

	public RoomWithABomb(int roomNo) {
		super(roomNo);
		// TODO Auto-generated constructor stub
	}
	
	public void Enter(){
		System.err.println("RoomWithABomb");
	}

}
