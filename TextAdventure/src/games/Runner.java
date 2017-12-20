package games;
import room.Room;
import ultilities.utilities;
import board.Board;
import java.util.Scanner;

import items.Clue;
import items.Item;
import items.Player;
import items.Monster;

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
        boolean finale = false;
        boolean valid = true;
        int finaleReady = 0;
        Player player1 = new Player(10,0,0);
        Scanner in = new Scanner(System.in);
        System.out.println("We have recieved word that there have been strange things happening on this ship we need you to go take a look.");
        while(gameOn)
        {
            System.out.println("\nType up,down,left, or right move in a direction.");
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
	            else
	            {
	            	valid = false;
	            }
	         if(valid == true)
	         {
	            ship.printMap(); 
	            Room theRoom = map[Player.getX()][Player.getY()];
	            Monster mon = new Monster((int) Math.floor(Math.random()*4));
	            System.out.println("You entered a " + theRoom.getType() + "room");
	            System.out.println(theRoom.getClue());
	            System.out.println(theRoom.setItem());
	            if(map[Player.getX()][Player.getY()].getType().equals("Battle"))
	            {
	            	player1.health = player1.health - mon.dealtdamage();
	            	System.out.println("You encountered an " + mon.assignType() + "," + " you took " + mon.dealtdamage() + " damage, your health is at " + player1.health );
	            }
	            finaleReady++;
	            if(finaleReady == 8)
	            {
	            	System.out.println("I think I know how to access the final room. Type finale to enter that room");
	            }
	            if(input.equals("finale"))
	            {
	            	gameOn = false;
	            	finale = true;
	            }
	            //print array with print()
	            if(player1.health <= 0)
	            {
	            	gameOn = false;
	            }
	         }
	         valid = true;
        }
        while(finale)
        {
        	System.out.println("");
        	System.out.println("");
        	System.out.println("");
        	System.out.println("You fidget with the door and the items you collect eventually opening it");
        	Monster end = new Monster(20,"");
        	System.out.println("You come accross a gigantic alien about 8 feet tall standing in the middle of the room. It is looking through folders of information, every few folders it will pick up a device and scan the folder");
        	System.out.println("It turns to you");
        	System.out.println("SO THE HUMANS KNOW NOW, WELL THAT IS QUITE A SHAME. HMMM ARE YOU ALONE?");
        	System.out.println("You grip your gun waiting for any move from the beast");
        	System.out.println("You hear a strange noise like the sound of air moving quickly through pipes. Then out of the fingertips of the alien you see white sparks before that is all you can see as you are consumed by them.");
        	player1.health = player1.health - end.dealtdamage();
        	System.out.println("You encountered an Alien Warlock" + "," + " you took " + end.dealtdamage() + ", your health is at " + player1.health );
        	finale = false;
        }
        System.out.print("You are dead");
    }
	


}
