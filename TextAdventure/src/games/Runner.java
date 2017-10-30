package games;
import item.Items;
import room.*;
import item.Clues;

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
                String[] type = {};
                Clues[] clue = {};
                Items[] item = {};

                row[i] = new Hallway(type,item,clue);
            }

        }
    }

}
