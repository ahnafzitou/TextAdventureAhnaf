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


    for(Room[] row : shipMap)
    {
        for (Room room : row)
        {
            room.print();
        }
        System.out.println();
    }
}
public Room[][] getshipMap() {
    return shipMap;
}

public void setShipMap(Room[][] shipMap) {
    this.shipMap = shipMap;
}
}
