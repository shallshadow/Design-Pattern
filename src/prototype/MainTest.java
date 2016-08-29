
package prototype;

import java.util.Iterator;

import model.base.Door;
import model.base.Maze;
import model.base.Room;
import model.base.Wall;

/**
 *
 * @author shadow E-mail:zyydqpi@163.com
 * @Date 2016年8月26日下午7:13:54
 * @version 1.0
 * @since 
 **/
public class MainTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Maze maze = new Maze();
		Room room = new Room(1);
		Wall wall = new Wall();
		Door door = new Door(room, room);
		MazeGame game = new MazePrototypeFactory(maze, wall, room, door);
		//创建原型对象
		Maze maze2 = game.CreateMaze();
		
		System.err.println(maze.getRoomCount());
		System.err.println(maze2.getRoomCount());
		
		Iterator<Room> iterator = maze2.iterator();
		
		while(iterator.hasNext()){
			System.err.println("RoomNumber : " + iterator.next().getRoomNumber());
		}
	}
}
