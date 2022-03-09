package Donations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class DonationsTester {

	public static void main(String[] args) throws FileNotFoundException {
		
		String category = "";
		double amt = 0.0;
		Donations giveToMe = new Donations();
		File inputFile = new File("Donations.txt");
		Scanner sc = new Scanner(inputFile); 
		Scanner ask = new Scanner(System.in);
		int question = 0;
		System.out.println("If you want to process donations, type '1'.");
		System.out.println("If you don't want to process donations, type '2' to end the program.");
		question = ask.nextInt();
		if (question == 1) {
			System.out.println("Processing donations.");
			while (sc.hasNextLine()) {
				String donations = sc.nextLine();
				if (donations.startsWith("<EOF>")) {
					break; }
				if (donations.startsWith("<individual donation>")) {
					category = "individual"; }
				if (donations.startsWith("<business donation>")) {
					category = "business"; }
				if (donations.startsWith("<other donation>")) {
					category = "other"; }
				amt = Double.parseDouble(donations.replaceAll("[^0-9|^-]","")); 
				giveToMe.processDonation(category, amt);
			}
			giveToMe.getStatistics();
			sc.close();
		}
		else {
			System.out.println("Ending program");
			System.exit(0);
			}
		ask.close();
		}
	}	

		