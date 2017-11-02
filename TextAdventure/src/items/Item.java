package items;
import ultilities.utilities;

public class Item 
{
		private static String type;
		public Item(String type)
		{
			this.type = type;
		}
		public static String assignType()
		{
			String[] itemType = {""};
			int x = utilities.randomType();
			Item.type = itemType[x];
			return Item.type;
		}
}
