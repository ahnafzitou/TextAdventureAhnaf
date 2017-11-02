package room;

public abstract interface Room 
	{
		public abstract String getType();
		public abstract void discoverItem();
		public abstract String analyzeClue();
		public abstract boolean isVisited();
		public abstract String print();

	}