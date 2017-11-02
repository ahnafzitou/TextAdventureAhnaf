package board;
import items.Player;
import room.Room;

public class Board 
{
	private Room[][] shipMap;


public Board(Room[][] shipMap)
{
	this.shipMap = shipMap;
}
public void printMap()
{
	for(int i = 0; i < shipMap.length; i++)
	{
		for(int j = 0; j < shipMap.length; j++)
		{
			if(shipMap[i][j] == shipMap[Player.getX()][Player.getY()])
			{
				System.out.print("[i]");
			}
			else
			{
				System.out.print(shipMap[i][j].print());
			}
			if(!(j < 4))
			{
				System.out.print("\n");
			}
		}
		
	}
}
public Room[][] getshipMap() {
    return shipMap;
}

public void setShipMap(Room[][] shipMap) {
    this.shipMap = shipMap;
}
}
