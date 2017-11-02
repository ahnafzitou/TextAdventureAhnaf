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
		return (int) Math.floor(10 * Math.random());
	}
	public static Room chooseRoom(int x, int y)
	{
		String type = "";
        Clue clue = null;
        Item item = null;
        int z = (int) (Math.floor(Math.random()*3));
        if(z == 0)
        {
        	return new battleRoom(type,clue,item,x,y);
        }
        else if(z == 1)
        {
        	return new offficeRoom(type,clue,item,x,y);
        }
        else if(z == 2)
        {
        	return new dormRoom(type,clue,item,x,y);
        }
        else
        {
        	return new restroomRoom(type,clue,item,x,y);
        }
	}
}
