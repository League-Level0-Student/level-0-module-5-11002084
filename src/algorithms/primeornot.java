package algorithms;

import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
	String number=JOptionPane.showInputDialog("Give me a number and I will tell you if it is prime or not.");
	int x=Integer.parseInt(number);
	for(int i=2; i<x; i++) {
		if(x%i==0) {
			JOptionPane.showMessageDialog(null, "Your number is not prime.");
			System.exit(0);
		}
	}
	JOptionPane.showMessageDialog(null, "Your number is prime woo-hoo!!!");
	
}
}
