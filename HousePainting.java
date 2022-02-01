package HousePainting;
import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		//Variables
		double lengthOfBase = 0;
		double widthOfHouse = 0;
		double heightOfHouse = 0;
		double numberOfWindows = 0;
		double windowLength = 0;
		double windowWidth = 0;
		double numberOfDoors = 0;
		double doorLength = 0;
		double doorWidth = 0;
		double costPerSquareFoot = 0;
		
		//Inputs
		System.out.println("Please enter the length of the base: ");
		lengthOfBase = sc.nextDouble();
		System.out.println("Please enter the width of the house: ");
		widthOfHouse = sc.nextDouble();
		System.out.println("Please enter the height of the house: ");
		heightOfHouse = sc.nextDouble();
		System.out.println("Please enter the number of windows: ");
		numberOfWindows = sc.nextDouble();
		System.out.println("Please enter the window length: ");
		windowLength = sc.nextDouble();
		System.out.println("Please enter the window width: ");
		windowWidth = sc.nextDouble();
		System.out.println("Please enter the number of doors: ");
		numberOfDoors = sc.nextDouble();
		System.out.println("Please enter the door length: ");
		doorLength = sc.nextDouble();
		System.out.println("Please enter the door width: ");
		doorWidth = sc.nextDouble();
		System.out.println("Please enter the cost per square foot: ");
		costPerSquareFoot = sc.nextDouble();
		
		//Calculations
		double normalSide = lengthOfBase * widthOfHouse;
		double tallSide = normalSide + 0.5 * (lengthOfBase * (heightOfHouse-widthOfHouse));
		double normalSide2 = normalSide * 2;
		double tallSide2 = tallSide * 2;
		double doorSubtraction = numberOfDoors * (doorLength * doorWidth);
		double windowSubtraction = numberOfWindows * (windowLength * windowWidth);
		double squareFeetToPaint = normalSide2 + tallSide2 - doorSubtraction - windowSubtraction;
		System.out.println("Your total paintable surface area is " + squareFeetToPaint + " square feet");
		double costToPaint = costPerSquareFoot * squareFeetToPaint;
		System.out.println("Your estimate is $" + costToPaint);
		
		
	}

}
