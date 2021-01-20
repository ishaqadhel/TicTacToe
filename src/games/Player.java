package games;

public class Player {
	
	private int score;
	
	public Player(int score)
	{
		this.score = score;
	}
	
	public void setScore(int s)
	{
		this.score = s;
	}
	
	public int getScore()
	{
		return this.score;
	}
	
	public void addScore(int s)
	{
		this.score += s;
	}

}
