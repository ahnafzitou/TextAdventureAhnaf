package items;
import ultilities.utilities;

public class Item 
{
		private int type;
		public Item(int type)
		{
			this.type = type;
		}
		public int assignType()
		{
			int x = utilities.randomType();
			this.type = x;
			return this.type;
		}
		public String getItem()
		{
			if(this.assignType() == 0)
			{
				return "No items to be found here";
			}
			else if(this.assignType() == 1)
			{
				return "There is a note here, it reads(We barely made it out, they are all over the place but there are 2 of us left Ahnaf and Mr.Levin were killed. I don't even know where Sadman is, ugh this sucks so bad) you've seen this note around here alot, did the writer write the same thing that many times?";
			}
			else if(this.assignType() == 2)
			{
				return "It seems to be piece to the lock of the big door at the end of this ship";
			}
			else if(this.assignType() == 3)
			{
				return "It's a key to a lock, maybe it's for the big door";
			}
			else
				return "No items to be found here";
		}
}
