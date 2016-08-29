package model.base;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author shadow
 *
 */
public class Maze implements Cloneable {
	public Maze(){
		rooms = new ArrayList<>();
	}
	
	public void AddRoom(Room room){
		if(room == null){
			throw new RuntimeException("The room is null.");
		}
		
		rooms.add(room);
		
	}
	
	public Room getRoom(final int number){		
		for(int i = 0; i < rooms.size(); i++){
			if(rooms.get(i).getRoomNumber() == number){
				return rooms.get(i);
			}
		}
		return null;
	}
	
	public Iterator<Room> iterator(){
		return rooms.iterator();
	}
	
	public int getRoomCount(){
		return this.rooms.size();
	}
	
	private ArrayList<Room> rooms;
	
	private void clone(Maze maze) throws CloneNotSupportedException{
		maze.rooms = new ArrayList<>();
		for(int i = 0; i < this.rooms.size(); i++){
			maze.rooms.add(this.rooms.get(i).clone());
		}
	}
	
	@Override
	public Maze clone() throws CloneNotSupportedException{
		Maze cloneMaze = (Maze) super.clone();
		clone(cloneMaze);
		return cloneMaze;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Room room = new Room(1);
		Maze maze = new Maze();
		maze.AddRoom(room);
		System.err.println(maze.rooms);
		System.err.println(maze);
		System.err.println(maze.getRoomCount());
		
		Maze maze2 = maze.clone();
		maze2.AddRoom(room.clone());
		System.err.println(maze.rooms);
		System.err.println(maze2);
		System.err.println(maze2.getRoomCount());
		
		System.err.println(maze.rooms);
		System.err.println(maze.getRoomCount());
	}
}
