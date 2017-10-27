package games;
import item.Items;
import room.*;
import clue.Clues;

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
                String[] type = {"Office","Closet","Restroom","Dorm","Cafeteria","Jailcell","Cargohold","BattleStations"};
                Clues[] clue = {};
                Items[] item = {};

                row[i] = new Hallway(type,item,clue);
            }

        }
    }

}
