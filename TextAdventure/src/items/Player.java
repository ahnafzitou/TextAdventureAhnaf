package items;

public class Player 
{
	private static int health;
	private static boolean alive;
	private static int x;
	private static int y;
	public Player(int health, boolean alive, int x, int y)
	{
		this.health = health;
		this.alive = alive;
	}
	public static void move(String string)
	{
		if(string == "up")
		{
			x -= 1;
		}
		if(string == "down")
		{
			x += 1;
		}
		if(string == "left")
		{
			y -= 1;
		}
		if(string == "right")
		{
			y += 1;
		}
	}

}
