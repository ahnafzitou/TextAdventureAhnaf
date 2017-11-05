package room;

import items.Clue;
import items.Item;

public class offficeRoom implements Room
{
	private int x;
	private int y;
	
	public offficeRoom(String type, Clue clue, Item item, int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	public String getType()
	{
		return "Office";
	}
	
	@Override
	public boolean isVisited() {
		// TODO Auto-generated method stub
		return false;
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

}
