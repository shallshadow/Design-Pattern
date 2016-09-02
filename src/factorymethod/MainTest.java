
package factorymethod;

import model.base.Maze;

/**
 * @fun 工厂方法模式 创建型设计模式
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

/**
 * 推荐博客：http://blog.csdn.net/hguisu/article/details/7505909
 * 
 * 适用情况：
 * 	1.当客户程序不需要知道要使用对象的创建过程。
 *  2.当客户程序使用的对象存在变动的可能，或者根本就不知道使用哪一个具体的对象。
 * */
