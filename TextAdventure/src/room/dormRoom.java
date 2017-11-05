package room;

import items.Clue;
import items.Item;

public class dormRoom implements Room 
{

	private int x;
	private int y;
	
	public dormRoom(int x,int y)
	{

		this.x = x;
		this.y = y;
	}
	public String getType()
	{
		return "Dorm";
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
