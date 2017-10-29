package room;

public abstract class Room 
	{
		private static String type;
		private Items[] item;
		private Clues[] clue;
		public boolean visited;

		public Room(String type,Items[] item,Clues[] clue)
		{
			this.type = type;
			this.item = item;
			this.clue = clue;
			this.visited = false;
		}
		
		public Room assignType()
		{
			int i = 0;
			while(Room.type != "")
			{
				Room.type =
				i++;
			}
		}

	}