package items;

public class Player 
{
	public static int health;
	private static int x;
	private static int y;
	public Player(int health,int x, int y)
	{
		Player.health = 20;
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
		if(str.equals("up"))
		{
			return(x != 0);
		}
		else if(str.equals("down"))
		{
			return(x != 4);
		}
		else if(str.equals("left"))
		{
			return(y != 0);
		}
		else
		{
			return(y != 4);
		}
	}
	public static int getX()
	{
		return x;
	}
	public static int getY()
	{
		return y;
	}

}
