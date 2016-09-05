
package prototype;

import java.util.Iterator;

import model.base.Door;
import model.base.Maze;
import model.base.Room;
import model.base.Wall;

/**
 * @fun 原型模式测试<br/>
 * 		注意事项：1.使用原型模式复制对象不会调用类的构造方法。<br/>
 * 			   2.深拷贝和浅拷贝。<br/>
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
/**
 * 推荐博客：http://blog.csdn.net/jason0539/article/details/23158081
 */
