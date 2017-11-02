package room;

import items.Clue;
import items.Item;

public class offficeRoom implements Room
{
	private String type;
	private static Clue clue;
	private static Item item;
	private int x;
	private int y;
	
	public offficeRoom(String type, Clue clue, Item item, int x,int y)
	{
		this.type = type;
		this.clue = clue;
		this.item = item;
		this.x = x;
		this.y = y;
	}
	public String getType()
	{
		return "Office";
	}
	public static void clue()
	{
		offficeRoom.clue.assignType();
	}
	public String analyzeClue()
	{
		return this.clue.getClue();
	}

	public void discoverItem() 
	{
		offficeRoom.item.assignType();
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
