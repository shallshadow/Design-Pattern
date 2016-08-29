package factorymethod;

import model.base.Door;
import model.base.Maze;
import model.base.Room;
import model.base.Wall;
import model.bombed.BombedWall;
import model.bombed.RoomWithABomb;

/**
 * @Date 2016Äê7ÔÂ29ÈÕ21:05:59
 * @Fun Bombed Maze Game is created by Factory Method.
 * @author shadow
 *
 */
public class BombedMazeGame extends MazeGame {

//	public Maze CreateMaze(){
//		return MakeMaze();		
//	}
	
	public BombedMazeGame() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Maze MakeMaze() {
		// TODO Auto-generated method stub
		return new Maze();
	}

	@Override
	public Room MakeRoom(int number) {
		// TODO Auto-generated method stub
		return new RoomWithABomb(number);
	}

	@Override
	public Wall MakeWall() {
		// TODO Auto-generated method stub
		return new BombedWall();
	}

	@Override
	public Door MakeDoor(Room r1, Room r2) {
		// TODO Auto-generated method stub
		return new Door(r1, r2);
	}

	public static void main(String[] args) {
		MazeGame game = new BombedMazeGame();
		Maze aMaze = game.CreateMaze();
		Room room = aMaze.getRoom(1);
		System.err.println("Rooms : " + aMaze.getRoomCount());
		room.Enter();
	}
}
