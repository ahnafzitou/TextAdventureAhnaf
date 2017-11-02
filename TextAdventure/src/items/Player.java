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
	public static boolean canMove(String str)
	{
		if(str == "up")
		{
			return(x != 0);
		}
		else if(str == "down")
		{
			return(x != 4);
		}
		else if(str == "left")
		{
			return(y != 0);
		}
		else
		{
			return(y != 4);
		}
	}
	

}
