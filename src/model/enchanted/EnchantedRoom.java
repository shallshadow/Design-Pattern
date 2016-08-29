package model.enchanted;

import model.base.Room;

public class EnchantedRoom extends Room {

	public EnchantedRoom(int roomNo) {
		super(roomNo);
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public void Enter() {
		// TODO Auto-generated method stub
		super.Enter();
		System.err.println("EnchatedRoom");
	}
	
	public EnchantedRoom(int roomNo, Spell spell){
		super(roomNo);
		this.spell = spell;
	}
	
	public Spell getSpell(){
		return this.spell;
	}
	
	private Spell spell;
}
