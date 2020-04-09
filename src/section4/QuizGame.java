package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String A = JOptionPane.showInputDialog("How many miles per hour do tigers run on average");
		// 3.  Use an if statement to check if their answer is correct
		if (A.equals("30-40")){
			JOptionPane.showMessageDialog(null, "Correct");
		score=score+1;
		}
		// 4.  if the user's answer was correct, add one to their score 
		String B = JOptionPane.showInputDialog("Was this project made in 2020?");
		// 3.  Use an if statement to check if their answer is correct
		if (B.equals("yes")){
			JOptionPane.showMessageDialog(null, "Correct");
		score=score+1;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String C = JOptionPane.showInputDialog("Is coding fun?");
		// 3.  Use an if statement to check if their answer is correct
		if (C.equals("yes")){
			JOptionPane.showMessageDialog(null, "Correct");
		score=score+1;
		}
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Your final score is...");
		JOptionPane.showMessageDialog(null, score + "... Congragulations!" );
	}
}
