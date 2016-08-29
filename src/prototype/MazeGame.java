package prototype;

import model.base.Direction;
import model.base.Door;
import model.base.Maze;
import model.base.Room;
import model.base.Wall;

/**
 * @Date 2016Äê7ÔÂ29ÈÕ20:47:40
 * @fun Factory Method
 * @author shadow
 *
 */
public abstract class MazeGame {
	public Maze CreateMaze() throws CloneNotSupportedException{
		Maze aMaze = MakeMaze();
		Room r1 = MakeRoom(1);
		Room r2 = MakeRoom(2);
		Door theDoor = MakeDoor(r1, r2);
		
		aMaze.AddRoom(r1);
		aMaze.AddRoom(r2);
		
		 r1 = MakeRoom(3);
		 r2 = MakeRoom(4);
		 theDoor = MakeDoor(r1, r2);
		
		aMaze.AddRoom(r1);
		aMaze.AddRoom(r2);
		
		r1.SetSide(Direction.North, MakeWall());
		r1.SetSide(Direction.East, theDoor);
		r1.SetSide(Direction.South, MakeWall());
		r1.SetSide(Direction.West, MakeWall());
		
		r1.SetSide(Direction.North, MakeWall());
		r1.SetSide(Direction.East, MakeWall());
		r1.SetSide(Direction.South, MakeWall());
		r1.SetSide(Direction.West, theDoor);
		return aMaze;
	}
	
	public abstract int GetRoomCount();
	public abstract Maze MakeMaze() throws CloneNotSupportedException;
	public abstract Room MakeRoom(int number) throws CloneNotSupportedException;
	public abstract Wall MakeWall() throws CloneNotSupportedException;
	public abstract Door MakeDoor(Room room1, Room room2) throws CloneNotSupportedException;
	
}

