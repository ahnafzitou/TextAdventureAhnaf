package games;
import items.Item;
import room.*;
import items.Clue;
import room.battleRoom;

public class Runner 
{
	public static void main (String[] args)
    {
        Room[][] map = new Room[5][5];
        for (int j = 0; j<map.length; j++)
        {
        	Room[] row = map[j];
            for (int i = 0; i<row.length;i++)
            {
            	String type = "";
                Clue clue = null;
                Item item = null;
                row[i] = new battleRoom(type,clue,item,i,j);

            }

        }
    }

}
