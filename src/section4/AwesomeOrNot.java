package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	Random rando = new Random();
	int randomNum = rando.nextInt(4);
	// 3. Print out this variable
System.out.println(randomNum);
	// 4. Get the user to enter something that they think is awesome
String A = JOptionPane.showInputDialog("What do you think is awesome?");
	// 5. If the random number is 0
if (randomNum == 0){
	JOptionPane.showMessageDialog(null, A + " is awesome!");
}

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
if (randomNum == 1){
	JOptionPane.showMessageDialog(null, A + " is ok.");
}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
if (randomNum == 2){
	JOptionPane.showMessageDialog(null, A + " is boring.");
}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
if (randomNum == 3){
	JOptionPane.showMessageDialog(null, A + " is pretty good I guess...");
}
	// -- write your own answer
}
}


