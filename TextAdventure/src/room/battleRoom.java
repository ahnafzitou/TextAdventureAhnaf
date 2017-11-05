package room;
import items.Clue;
import items.Monster;
import items.Item;
public class battleRoom implements Room
{

	private int x;
	private int y;
	
	public battleRoom(int x,int y)
	{

		this.x = x;
		this.y = y;
	}
	public String getType()
	{
		return "Battle";
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
