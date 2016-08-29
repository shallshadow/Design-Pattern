package model.bombed;

import model.base.Wall;

/**
 * 
 * @author shadow
 *
 */
public class BombedWall extends Wall {
	public void Enter(){
		System.err.println("BombedWall");
	}
	
	@Override
	public Wall clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
