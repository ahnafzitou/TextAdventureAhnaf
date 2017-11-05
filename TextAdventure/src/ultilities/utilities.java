package ultilities;

import items.Clue;
import items.Item;
import items.Player;
import room.Room;
import room.battleRoom;
import room.dormRoom;
import room.offficeRoom;
import room.restroomRoom;

public class utilities 
{
	int x = 0;
	int y = 0;
	public static int randomType()
	{
		return (int) Math.floor(Math.random()*4);
	}
	public static Room chooseRoom(int x, int y)
	{
        int z = (int) (Math.floor(Math.random()*4));
        if(z == 0)
        {
        	return new battleRoom(x,y);
        }
        else if(z == 1)
        {
        	return new offficeRoom(x,y);
        }
        else if(z == 2)
        {
        	return new dormRoom(x,y);
        }
        else
        {
        	return new restroomRoom(x,y);
        }
	}
}
