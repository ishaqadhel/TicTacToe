package games;

public class Human extends Player{

	private String name;
	
	public Human(String name, int score)
	{
		super(score);
		this.name = name;
	}
	
	public void setName(String n) 
	{
		this.name = n;
	}
	
	public String getName()
	{
		return this.name;
	}
	
}
