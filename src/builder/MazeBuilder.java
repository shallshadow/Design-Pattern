package builder;

import absfactory.MazeFactory;
import model.base.Maze;

/**
 * @Date 2016Äê7ÔÂ29ÈÕ19:49:01
 * @fun Builder
 * @author shadow
 *
 */
public abstract class MazeBuilder {
	public abstract void Buildmaze();
	public abstract void BuildRoom(int number);
	public abstract void BuildDoor(int roomFrom, int roomTo);
	public abstract Maze GetMaze();
	public abstract MazeFactory getMazeFactory();
	
	protected MazeBuilder(MazeFactory factory){
		this.factory = factory;
	}
	
	protected MazeFactory factory;
	protected Maze currentMaze;
}
