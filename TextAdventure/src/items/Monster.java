package items;

import ultilities.utilities;

public class Monster
{
	private static int damage;
	private String statement;
	public Monster(int damage)
	{
		this.damage = damage;

	}
	public Monster(int damage,String statement)
	{
		this.damage = 20;
		this.statement = "";
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
	public String findOut()
	{
		return "";
	}
	
	

}
