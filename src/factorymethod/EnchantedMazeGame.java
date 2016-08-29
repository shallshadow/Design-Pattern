package factorymethod;

import model.base.Door;
import model.base.Maze;
import model.base.Room;
import model.base.Wall;
import model.enchanted.DoorNeedingSpell;
import model.enchanted.EnchantedRoom;
import model.enchanted.Spell;

/**
 * @Date 2016Äê7ÔÂ29ÈÕ21:05:07
 * @Fun Enchanted Maze Game created by Factory Method.
 * @author shadow
 *
 */
public class EnchantedMazeGame extends MazeGame {

	@Override
	public Maze MakeMaze() {
		// TODO Auto-generated method stub
		return new Maze();
	}

	@Override
	public Room MakeRoom(int number) {
		// TODO Auto-generated method stub
		return new EnchantedRoom(number, new Spell());
	}

	@Override
	public Wall MakeWall() {
		// TODO Auto-generated method stub
		return new Wall();
	}

	@Override
	public Door MakeDoor(Room r1, Room r2) {
		// TODO Auto-generated method stub
		return new DoorNeedingSpell(r1, r2);
	}
	
	public static void main(String[] args) {
		MazeGame game = new EnchantedMazeGame();
		Maze aMaze = game.CreateMaze();
		Room room = aMaze.getRoom(1);
		System.err.println("Rooms : " + aMaze.getRoomCount());
		room.Enter();
	}

}
