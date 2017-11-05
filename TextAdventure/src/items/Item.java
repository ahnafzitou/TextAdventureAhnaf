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
}
