package games;

import java.util.Random;

public class Computer extends Human{
	
	private String[] nameBot = {"Jarvis", "Codec", "SmartBot", "AI"};
	
	public Computer(String name, int score) {
		super(name, score);
	}
	
	public int setNextMove()
    {
    	Random r = new Random();
    	return r.nextInt(9);
    }
	
	public void setRandomName() 
	{
		Random r = new Random();
		super.name = nameBot[r.nextInt(4)];
	}
}
