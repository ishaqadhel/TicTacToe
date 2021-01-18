package games;

public class Score {
	private int point;
	
	public Score(int point)
	{
		this.point = point;
	}
	
	public void setScore(int p)
	{
		this.point = p;
	}
	
	public int getScore()
	{
		return this.point;
	}
	
	public void addScore(int p)
	{
		this.point += p;
	}
}
