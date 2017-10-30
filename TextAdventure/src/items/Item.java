package items;
import ultilities.utilities;

public class Item 
{
		private static abstract String type;
		public Item(String type, String clue)
		{
			this.type = type;
		}
		public static String assignType()
		{
			String[] itemType = {""};
			int x = utilities.randomType();
			Item.type = itemType[x];
		}
}
