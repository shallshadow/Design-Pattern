
package factorymethod;

import model.base.Maze;

/**
 *
 * @author shadow E-mail:zyydqpi@163.com
 * @Date 2016年8月23日下午7:10:22
 * @version 1.0
 * @since 
 **/
public class MainTest {
	public static void main(String[] args) {
		MazeGame game = new BombedMazeGame();
		Maze aMaze =  game.CreateMaze();
		System.out.println("" + aMaze.getRoomCount());
		aMaze.getRoom(1).Enter();
		
		game = new EnchantedMazeGame();
		aMaze = game.CreateMaze();
		System.out.println("" + aMaze.getRoomCount());
		aMaze.getRoom(1).Enter();
		
	}
}
