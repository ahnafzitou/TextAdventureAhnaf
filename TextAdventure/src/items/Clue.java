package items;


public class Clue extends Item
{
	private static int type;
	public Clue(int type)
	{
		super(type);
		Clue.type = type;
	}
	/*public static String assignType()
	{
		String[] itemType = {"Bullets","Blood","Body","Name Tag"};
		int x = utilities.randomType();
		Clue.type = itemType[x];
		return Clue.type;
	}*/
	public static String getClue()
	{
		String[] deadPeople = {"Sidney Phillips","Jason Zhang","Mr.Levin","Ahnaf Zitou","Sadman Hossain","John Cena","Taylor Swift","Batman","Lebron James"};
		int y = (int) Math.floor(Math.random()*8);
		if(Clue.type == 1)
		{
			return "You  found a clue: bullets that seem to have been shot from some sort of high velocity weapon.";
		}
		else if(Clue.type == 2)
		{
			return "You found a clue: blood that looks human, but you don't see a body around.";
		}
		else if(Clue.type == 3)
		{
			return "This is the body of " +  deadPeople[y] + ", OW it shocked you when you touched it, what could have fully charged a human body";
		}
		return "This is the name tag of " + deadPeople[y] + ", never met them but heard they were awesome";
		
	}

}
