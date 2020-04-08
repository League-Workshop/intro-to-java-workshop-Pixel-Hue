package section3;

import javax.swing.JOptionPane;

public class Greet {
	public static void main(String[] args) {
	String Ether = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Hello " + Ether);
		String R = JOptionPane.showInputDialog("How was your day?");
		JOptionPane.showMessageDialog(null, "Same here, I also had a " + R + " day too!");
		String input = JOptionPane.showInputDialog("Bye now!");
		if(input.equals("Bye")){
			JOptionPane.showMessageDialog(null, "Bye :D");
		
		}
		else {
		JOptionPane.showMessageDialog(null, "Bye :(");
			
		}
	}
}
	
