package Microwave;

public class MicrowaveTester {

	public static void main(String[] args) {
		
		// Microwave Object	
		Microwave myMicrowave = new Microwave();
		
		// Press time button
		myMicrowave.timeButton();
		myMicrowave.timeButton();
		myMicrowave.timeButton();

		// Press power button
		myMicrowave.powerButton();
		
		// Press start button
		myMicrowave.startButton();
		
		// Press reset button
		myMicrowave.resetButton();
		
	}
}
