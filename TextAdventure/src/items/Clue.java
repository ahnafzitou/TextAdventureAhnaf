package items;
import ultilities.utilities;

public class Clue 
{
	private static String type;
	public Clue(String type, String clue)
	{
		this.type = type;
	}
	public static String assignType()
	{
		String[] itemType = {"Bullets","Blood","Body","Name Tag"};
		int x = utilities.randomType();
		Clue.type = itemType[x];
		return Clue.type;
	}
	public static String getClue()
	{
		String[] deadPeople = {"Sidney Phillips","Jason Zhang","Mr.Levin","Ahnaf Zitou","Sadman Hossain"};
		if(Clue.type.equals("Bullets"))
		{
			return "These bullets seem to have been shot from some sort of high velocity weapon.";
		}
		else if(Clue.type.equals("Blood"))
		{
			return "This blood seems to be human, but I don't see a body around.";
		}
		else if(Clue.type.equals("Body"))
		{
			return "This is the body of " +  deadPeople[1] + "." ;
		}
		return "This is the name tag of " + deadPeople[1] + ".";
		
	}

}
