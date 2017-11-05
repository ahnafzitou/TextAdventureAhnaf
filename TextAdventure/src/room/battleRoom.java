package room;
import items.Clue;
import items.Monster;
import items.Item;
public class battleRoom implements Room
{

	private int x;
	private int y;
	
	public battleRoom(String type, Clue clue, Item item, int x,int y)
	{

		this.x = x;
		this.y = y;
	}
	public String getType()
	{
		return "Battle";
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
	public Monster spawnMonster()
	{
		String type = Monster.assignType();
		return new Monster(type,3,true);
	}

	

}
