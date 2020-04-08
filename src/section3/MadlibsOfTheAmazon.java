package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {

	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		JOptionPane.showMessageDialog(null, "Enter The Following!");
		String adjective = JOptionPane.showInputDialog(null, "Adjective!");
		// Get the user to enter a type of liquid
		String B = JOptionPane.showInputDialog(null, "Type of Liquid!");
		// Get the user to enter a body part
		String C = JOptionPane.showInputDialog(null, "Body Part!");
		// Get the user to enter a verb
		String D = JOptionPane.showInputDialog(null, "Verb!");
		// Get the user to enter a place
		String E = JOptionPane.showInputDialog(null, "Place!");
		// Fit the user's words into this sentence, and save it in a String:
		JOptionPane.showMessageDialog(null, "Adjective = " + adjective + " Liquid = " + B + "\nBody Part = " + C + " " +
		" Verb = " + D + " Place = " + E);
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, "Piranhas are more " + adjective + " during the day, so cross the river at" + 
				 " night.\n Piranhas are attracted to fresh " + B + " and will most"  +
				 " likely\n take a bite out of your " + C + " if you " + D + ". Whatever" + 
				 " you do, if you have an open wound,\n try to find another way to get" +
				 " back to the " + E + ".\n Good luck!");

	}
}
