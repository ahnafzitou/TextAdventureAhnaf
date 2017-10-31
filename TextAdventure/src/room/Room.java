package room;

public abstract interface Room 
	{
		private String getType();
		private void discoverItem();
		private String analyzeClue();
		private boolean isVisited();
		public abstract void print();

	}