package room;

public abstract interface Room 
	{
		private String getType();
		private String discoverItem();
		private String analyzeClue();
		private boolean isVisited();

	}