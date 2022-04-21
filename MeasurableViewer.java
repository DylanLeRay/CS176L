package Interface;

import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MeasurableViewer {
	public static void main(String[] args) {
		/**
		System.out.println("Countries Data");
		Measurable[] countries = new Measurable[3];
	    countries[0] = new Country("Uruguay", 176220);
	    countries[1] = new Country("Thailand", 513120);
	    countries[2] = new Country("Belgium", 30510);
	    double avg=Data.average(countries);
	    System.out.println("Average area: " + avg);
	    System.out.println("Expected: 239950");
	    System.out.println("");
	    double maxData = Data.max(countries);
	    System.out.println("Maximum area: " + maxData);
	    System.out.println("Expected: 513120");
	    System.out.println("");
	     
	    //Bank Accounts
	    System.out.println("Bank account data");
	    Measurable[] bank = new Measurable[3];
	    bank[0] = new BankAccount(176220);
	    bank[1] = new BankAccount(513120);
	    bank[2] = new BankAccount(30510);
	    avg=Data.average(bank);
	    System.out.println("Average balance: " + avg);
	    System.out.println("Expected: 239950");
	    System.out.println("");
	    maxData = Data.max(bank);
	    System.out.println("Maximum balance: " + maxData);
	    System.out.println("Expected: 513120");
	    System.out.println("");
	    
	    // Quiz Scores
	    System.out.println("Quiz score data");
	    Measurable[] quiz = new Measurable[5];
	    quiz[0] = new Quiz(95);
	    quiz[1] = new Quiz(80);
	    quiz[2] = new Quiz(90);
	    quiz[3] = new Quiz(50);
	    quiz[4] = new Quiz(75);
	    avg = Data.average(quiz);
	    System.out.println("Average quiz score: " + avg);
	    System.out.println("Expected: 78");
	    System.out.println("");
	    maxData = Data.max(quiz);
	    System.out.println("Maximum score: " + maxData);
	    System.out.println("Expected: 95");
	    System.out.println("");
	    double minData = Data.min(quiz);
	    System.out.println("Minimum score: " + minData);
	    System.out.println("Expected: 50");
	
	    System.out.println("");
		**/
		
		final int FRAME_WIDTH = 200;
		final int FRAME_HEIGHT = 200;
		
		Scanner in = new Scanner(System.in);
		
		Measurable[] accounts = new Measurable[3];
		Measurable[] country = new Measurable[3];
		Measurable[] quizes = new Measurable[5];
		
		accounts[0] = new BankAccount(176220);
		accounts[1] = new BankAccount(513120);
		accounts[2] = new BankAccount(30510);
		
		country[0] = new Country("Uruguay", 176220);
		country[1] = new Country("Thailand", 513120);
		country[2] = new Country("Belgium", 30510);
		
		quizes[0] = new Quiz(95);
		quizes[1] = new Quiz(80);
		quizes[2] = new Quiz(90);
		quizes[3] = new Quiz(50);
		quizes[4] = new Quiz(75);
		
		System.out.print("Enter metric to use, 1 for maximum, 2 for minimum, 3 for average: ");
		int numberChoice = in.nextInt();
		String solution = "";
		
		if (numberChoice == 1) {solution = "Maximum";}
		if (numberChoice == 2) {solution = "Minimum";}
		if (numberChoice == 3) {solution = "Average";}
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.add(panel);
		
		JButton button = new JButton("Get " + solution + " Balance");
		panel.add(button);
		ActionListener listener = new ButtonListener(accounts, solution);
		button.addActionListener(listener);
		
		JButton button2 = new JButton("Get " + solution + " Area");
		panel.add(button2);
		ActionListener listener2 = new ButtonListener(country, solution);
		button2.addActionListener(listener2);
		
		JButton button3 = new JButton("Get " + solution + " Score");
		panel.add(button3);
		ActionListener listener3 = new ButtonListener(quizes, solution);
		button3.addActionListener(listener3);
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		in.close();
	}
}