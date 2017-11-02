package board;
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
			if(j < 4)
			{
				System.out.print(shipMap[i][j].print());
			}
			else
			{
				System.out.print(shipMap[i][j].print() + "\n");
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
