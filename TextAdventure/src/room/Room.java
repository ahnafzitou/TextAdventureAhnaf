package room;

public abstract class Room 
	{
		private String type;
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
		public String getType()
		{
			for(int i = 0; i < type.length; i++)
			{
				Room.type =  type[i];
			}
		}

	}