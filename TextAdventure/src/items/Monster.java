package items;

import ultilities.utilities;

public class Monster 
{
	private static String type;
	public Monster(String type, String clue)
	{
		this.type = type;
	}
	public static String assignType()
	{
		String[] itemType = {"Alien","Advanced Alien","Alien Captain"};
		int x = utilities.randomType();
		Monster.type = itemType[x];
		return Monster.type;
	}

}
