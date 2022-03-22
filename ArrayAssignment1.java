package ArrayAssignment1;

public class ArrayAssignment1 {

	public static void main(String[] args) {
		// Printing all elements in the array.
		System.out.println("All elements in the array in a single row:");
		double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		for (double element : values) {System.out.print(element + " "); }
		
		// Printing the maximum number in the array.
		double largest = values[0];
		for (int i = 1; i < values.length; i++) 
		{
			if (values[i] > largest) {
					largest = values[i]; }
		}
		System.out.println("\n");
		System.out.println("The maximum number of the array:");
		System.out.println(largest);
		
		// Printing how many negative numbers are in the array.
		int negative = 0;
		for (double num : values) {if (num < 0) {++negative; } }
		System.out.println("\n");
		System.out.println("The number of negative numbers in the array:");
		System.out.println(negative);
	}
}