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
		int x = (int) Math.floor(Math.random()*2);
		return itemType[x];
	}
	public int dealtdamage()
	{
		return Monster.damage;
	}
	
	

}
