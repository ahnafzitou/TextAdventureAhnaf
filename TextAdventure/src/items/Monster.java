package items;

import ultilities.utilities;

public class Monster
{
	private static String type;
	private static int damage;
	private static boolean alive;
	public Monster(String type, int damage, boolean alive)
	{
		this.type = type;
		this.damage = damage;
		this.alive = alive;
	}
	public static String assignType()
	{
		String[] itemType = {"Alien","Advanced Alien","Alien Captain"};
		int x = utilities.randomType();
		Monster.type = itemType[x];
		return Monster.type;
	}
	public void createMonster()
	{
		Monster.damage = (int) Math.floor(3 * Math.random());
		Monster.alive = false;
	}
	

}
