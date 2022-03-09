package Donations;

public class Donations {
	
	private double numIndividual;
	private double amtIndividual;
	private double numBusiness;
	private double amtBusiness;
	private double numOther;
	private double amtOther;
	
	public Donations() {
		numIndividual = 0;
		amtIndividual = 0;
		numBusiness = 0;
		amtBusiness = 0;
		numOther = 0;
		amtOther = 0;
	}
	
	public void processDonation(String category, double amt) {
		
		if (category.equals("individual")) {amtIndividual = amtIndividual + amt;}
		if (amt < 0) {numIndividual = numIndividual - 1;}
		else {numIndividual = numIndividual + 1;}
		
		if (category.equals("business")) {amtBusiness = amtBusiness + amt;}
		if (amt < 0) {numBusiness = numBusiness - 1;}
		else {numBusiness = numBusiness + 1;}
		
		if (category.equals("other")) {amtOther = amtOther + amt;}
		if (amt < 0) {numOther = numOther - 1;}
		else {numOther = numOther + 1;}
	}
	
	public void getStatistics() {
		System.out.println("Number of donations for individual donations: " + numIndividual);
		System.out.println("Total donations for individual donations: " + amtIndividual);
		System.out.println("Number of donations for business donations: " + numBusiness);
		System.out.println("Total doantions for business donations: " + amtBusiness);
		System.out.println("Number of donations for other donations: " + numOther);
		System.out.println("Total donations for other donations: " + amtOther);
	}
}
