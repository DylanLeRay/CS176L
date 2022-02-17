package Microwave;

public class Microwave {
	
	// Instance Variables
	private int time;
	private int power;
	
	// Constructor
	public Microwave()
	{
		time = 0;
		power = 1;
	}
	
	// Methods
	public void timeButton() // Adds 30 seconds to time
	{
		this.time = time + 30;	 		
	}
	
	public void powerButton() // Swaps power levels between 1 and 2
	{
		if (power == 1) 
		{this.power = 2;}
		else
		{this.power = 1;}
	}
	
	public void startButton() // Displays how long microwave will cook and what power level its at
	{
		System.out.println("Cooking for " + time + " seconds at level " + power + ".");
	}
	
	public void resetButton() // Resets the time and power to default
	{
		this.time = 0;
		this.power = 1;
	}
}
