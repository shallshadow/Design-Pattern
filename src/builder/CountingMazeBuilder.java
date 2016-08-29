package builder;

import absfactory.MazeFactory;
import model.base.Maze;

/**
 * @Date 2016Äê7ÔÂ29ÈÕ21:07:25
 * @Fun A counting Maze Builder is created by Builder.
 * @author shadow
 *
 */
public class CountingMazeBuilder extends MazeBuilder {	
	
	public CountingMazeBuilder(MazeFactory factory) {
		// TODO Auto-generated constructor stub
		super(factory);
		rooms = 0;
		doors = 0;
	}
	
	@Override
	public void Buildmaze() {
		// TODO Auto-generated method stub
		this.currentMaze = factory.MakeMaze();
	}

	@Override
	public void BuildRoom(int number) {
		// TODO Auto-generated method stub
		this.rooms++;
	}

	@Override
	public void BuildDoor(int roomFrom, int roomTo) {
		// TODO Auto-generated method stub
		this.doors++;
	}

	public void GetCounts(Integer[] rooms){
		System.err.println("Rooms : " + this.rooms + "\n Doors : " + this.doors);
		rooms[0] = new Integer(this.rooms);
		rooms[1] = new Integer(this.doors);
	}
	
	@Override
	public Maze GetMaze() {
		// TODO Auto-generated method stub
		return this.currentMaze;
	}	
	
	private int doors;
	private int rooms;
	@Override
	public MazeFactory getMazeFactory() {
		// TODO Auto-generated method stub
		return factory;
	}
}
