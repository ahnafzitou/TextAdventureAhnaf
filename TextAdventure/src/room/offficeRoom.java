package room;

import items.Clue;
import items.Item;
import ultilities.utilities;

public class offficeRoom implements Room
{
	private int x;
	private int y;
	
	public offficeRoom(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	public String getType()
	{
		return "Office";
	}
	

	 public int getX()
	 {
		 return x;
	 }
	    
	 public int getY()
	 {
	     return y;
	 }
	@Override
	public String print() 
	{
		return "[X]";
	}
	@Override
	public String setItem() {
		Item i = new Item(utilities.randomType());
		return i.getItem();
	}
	@Override
	public String getClue() {
		Clue temp = new Clue(utilities.randomType());
		return temp.getClue();
	}

}
