package room;

import items.Clue;
import items.Item;

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
	public int setItem() {
		// TODO Auto-generated method stub
		return 0;
	}

}
