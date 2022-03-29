package Medals;
import java.util.ArrayList;
public class Medals {

	public static void main(String[] args) {
		// %d%n
		ArrayList<String> total = new ArrayList();
		
		ArrayList<String> countries = new ArrayList();
		countries.add("Canada");
		countries.add("Italy");
		countries.add("Germany");
		countries.add("Japan");
		countries.add("Kazakhstan");
		countries.add("Russia");
		countries.add("South Korea");
		countries.add("United States");
		
		ArrayList<String> gold = new ArrayList();
		gold.add("0");
		gold.add("0");
		gold.add("0");
		gold.add("1");
		gold.add("0");
		gold.add("3");
		gold.add("0");
		gold.add("1");
		
		ArrayList<String> silver = new ArrayList();
		silver.add("3");
		silver.add("0");
		silver.add("0");
		silver.add("0");
		silver.add("0");
		silver.add("1");
		silver.add("1");
		silver.add("0");
		
		ArrayList<String> bronze = new ArrayList();
		bronze.add("0");
		bronze.add("1");
		bronze.add("1");
		bronze.add("0");
		bronze.add("1");
		bronze.add("1");
		bronze.add("0");
		bronze.add("1");
		
		ArrayList<ArrayList<String>> medals = new ArrayList();
		medals.add(countries);
		medals.add(gold);
		medals.add(silver);
		medals.add(bronze);
		
		System.out.println("        Country" + "    Gold" + "  Silver" +  "   Bronze" + " Total");
		for (int row = 0; row < medals.get(0).size(); row++) 
		{
			System.out.printf("%15s", medals.get(0).get(row));
			int g = Integer.parseInt(medals.get(1).get(row));
			int s = Integer.parseInt(medals.get(2).get(row));
			int b = Integer.parseInt(medals.get(3).get(row));
			System.out.printf("%8d", g);
			System.out.printf("%8d", s);
			System.out.println("        " + b);
		}
	}
}