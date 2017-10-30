package room;
import items.Clue;

public class battleRoom implements Room
{
	private String type;
	private Clue clue;
	private String item;
	private boolean visited;
	
	public battleRoom(String type, String clue, String item, boolean visited)
	{
		this.type = type;
		this.clue = clue;
		this.item = item;
		this.visited = visited;
	}
	public String getType()
	{
		return "This is a Battlestation there are usually weapons here";
	}
	public void clue()
	{
		this.clue = Clue.assignType();
	}
	public static String analyzeClue()
	{
		return battleRoom.clue.getClue();
	}

}
