package absfactory;

import model.base.Door;
import model.base.Maze;
import model.base.Room;
import model.base.Wall;

/**
 * Abstract Factory 
 * @author shadow
 *
 */
public class MazeFactory {
	public MazeFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public Maze MakeMaze(){
		return new Maze();
	}
	
	public Wall MakeWall(){
		return new Wall();
	}
	
	public Room MakeRoom(final int number){
		return new Room(number);
	}
	
	public Door MakeDoor(final Room room1, final Room room2){
		return new Door(room1, room2);
	}
}
