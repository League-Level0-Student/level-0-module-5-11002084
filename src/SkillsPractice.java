import java.util.Random;

import javax.swing.JOptionPane;

public class SkillsPractice {
	public static void main(String[] args) {

		SkillsPractice skills = new SkillsPractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
		// Use pop-ups for the following.
		// Ask the user how many dimes they have
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimes2 = Integer.parseInt(dimes);
		int cents = dimes2 * 10;
		String cents2 = Integer.toString(cents);
		JOptionPane.showMessageDialog(null, "You have " + cents2 + " cents.");

		// Tell them how many cents they have (hint multiply by 10)

		// Ask the user how tall they are (inches)
		String inches = JOptionPane.showInputDialog("How many inches tall are you?");
		int tall = Integer.parseInt(inches);
		if (tall < 36) {
			JOptionPane.showMessageDialog(null, "Eat your wheaties.");
		}

		// If they are shorter than 36 inches, tell them to eat their Wheaties

	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

	void skill3() { // Get a random number that is less than 20 and print it to the console

		int a = 0;
		Random b = new Random();
		a = b.nextInt(20);
		System.out.println(a);

		// Get another random number that is less than 10 and print it to the console
		int c = 0;
		Random d = new Random();
		c = d.nextInt(10);
		System.out.println(c);

		// Using a pop-up, tell the user the difference between the numbers // Hint: use
		// subtraction

		int difference = a - c;
		System.out.println("The difference between your two numbers is " + difference);

	}

	void skill4() { // In a pop-up, ask the user for the city they live in

		String city = JOptionPane.showInputDialog("Which city do you live in?");

		// If they answered "San Diego", tell them they live in America's Finest City
		if (city.equals("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's finest city.");
		}

		// Otherwise, tell them to move to San Diego
		else {
			JOptionPane.showMessageDialog(null, "Move to San Diego.");
		}

		// Create a variable - cars - and initialize it to the number of cars your
		// family has. // If there are 0 cars, use a pop-up to display, "I bet you use
		// public transportation."
		String cars = "2";

		// If there is 1 car, use a pop-up to display the make/model of the car

		// If there is more than 1 car, use a pop-up to display how many wheels the //
		// cars have between them.
		int cars2 = Integer.parseInt(cars);
		int wheels=cars2*4;
		String wheel2=Integer.toString(wheels);
		System.out.println(wheel2);
	}

	void skill5() { // In a pop-up, ask the user for the name of their school
String school=JOptionPane.showInputDialog("What is the name of your school?");
		// In another pop-up, tell the user, that their school is a fantastic school. //
JOptionPane.showMessageDialog(null, school+ " is the best school.");
		// You must include the name of the school in the message.

	}
}
