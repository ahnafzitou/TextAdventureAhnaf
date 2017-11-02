package games;
import room.Room;
import ultilities.utilities;
import board.Board;
import java.util.Scanner;
import items.Player;


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
                int z = (int) (Math.floor(Math.random()*3));
                if(z == 0)
                {
                	row[i] = utilities.chooseRoom(i,j);
                }
                else if(z == 1)
                {
                	row[i] = utilities.chooseRoom(i,j);
                }
                else if(z == 2)
                {
                	row[i] = utilities.chooseRoom(i,j);
                }
                else
                {
                	row[i] = utilities.chooseRoom(i,j);
                }
            }

        }
        Board ship = new Board(map);
        boolean gameOn = true;
        Player player1 = new Player(10,true,0,0);
        Scanner in = new Scanner(System.in);
        System.out.println("We have recieved word that there have been strange things happening on this ship we need you to go take a look.");
        while(gameOn)
        {
            System.out.println("\nType to move in a direction.");
            String input = in.nextLine();
            if(input.equals("up") && Player.canMove("up"))
            {
            	Player.move("up");
            }
            else if(input.equals("down") && Player.canMove("down"))
            {
            	Player.move("down");
            }
            else if(input.equals("left") && Player.canMove("left"))
            {
            	Player.move("left");
            }
            else if(input.equals("right") && Player.canMove("right"))
            {
            	Player.move("right");
            }
            else if(input.equals("clue"))
            {
            	map[Player.getX()][Player.getY()].analyzeClue();
            }
            ship.printMap();
            
            System.out.print("You entered a " + map[Player.getX()][Player.getY()].getType() + "room");
            
            //print array with print()

           // gameOn = false;
       }
    }


}
