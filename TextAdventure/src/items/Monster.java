package items;

import ultilities.utilities;

public class Monster
{
	private static int damage;
	public Monster(int damage)
	{
		this.damage = damage;

	}
	public static String assignType()
	{
		String[] itemType = {"Alien","Advanced Alien","Alien Captain"};
		int x = utilities.randomType();
		return itemType[x];
	}
	public int dealtdamage()
	{
		return Monster.damage;
	}
	
	

}
