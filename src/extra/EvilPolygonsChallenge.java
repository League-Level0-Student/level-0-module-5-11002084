package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
Robot bob=new Robot();
		//2. Set the speed to 100
bob.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "Choose a color.", "Color", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Red", "Orange", "Yellow", "Green", "Blue", "Purple"}, 0);
		
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if (colorChoice==0) {
			bob.setPenColor(255, 0, 0);
		}
		else if (colorChoice==1) {
			bob.setPenColor(255, 120, 0);
		}
		else if (colorChoice==2) {
			bob.setPenColor(255, 255, 0);
		}
		else if (colorChoice==3) {
			bob.setPenColor(0, 255, 0);
		}
		else if (colorChoice==4) {
			bob.setPenColor(0, 0, 255);
		}
		else if (colorChoice==5) {
			bob.setPenColor(173, 0, 255);
		}
		//4. Ask the use how many polygons they want to be drawn.
		String number= JOptionPane.showInputDialog("How many polygons do you want?");
		int polygon=Integer.parseInt(number);
		//5. Use the robot to draw the number of polygons the user requested.
		for(int i=0; i<polygon; i++) {
			for(int e=0; e<4; e++) {
				bob.penDown();
				bob.move(100);
				bob.turn(90);
			}
			bob.penUp();
			bob.move(110);
		}
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

