package room;

import items.Clue;
import items.Item;

public class dormRoom implements Room 
{
	private String type;
	private static Clue clue;
	private static Item item;
	private int x;
	private int y;
	
	public dormRoom(String type, Clue clue, Item item, int x,int y)
	{
		this.type = type;
		this.clue = clue;
		this.item = item;
		this.x = x;
		this.y = y;
	}
	public String getType()
	{
		return "";
	}
	public static void clue()
	{
		dormRoom.clue.assignType();
	}
	public String analyzeClue()
	{
		return this.clue.getClue();
	}

	public void discoverItem() 
	{
		dormRoom.item.assignType();
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
	public String print() {
		// TODO Auto-generated method stub
		return null;
	}


}
