package Microwave;

public class Microwave {
	
	// Instance Variables
	private int time = 0;
	private int power = 1;
	
	// Methods
	public void timeButton() {
		this.time = time + 30;	 		
	}
	
	public void powerButton() {
		if (power == 1) 
			this.power = 2;
		else
			this.power = 1;
	}
	
	public void resetButton() {
		this.time = 0;
		this.power = 1;
	}
	
	public void startButton() {
		System.out.println("Cooking for " + time + " seconds at level " + power + ".");
	}
	
}
