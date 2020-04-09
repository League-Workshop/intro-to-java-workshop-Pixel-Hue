package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		Random randy = new Random();
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int playerHealth = 101;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth = 101;
		// 4. Create a variable to hold the damage the player's attack does each round
		int dmg = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int Ddmg = 0;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String Answer = JOptionPane.showInputDialog("Attack the dragon! KICK or YELL?");
		// 9. If they typed in "yell":
		if (Answer.equals("yell")){
			int randomNum = randy.nextInt(11);
			dragonHealth=dragonHealth-randomNum;
			Ddmg=Ddmg+randomNum;
		}
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		if (Answer.equals("kick")){
			int randomNum = randy.nextInt(26);
			dragonHealth=dragonHealth-randomNum;
			dmg=dmg+randomNum;
		}
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			int randomNum = randy.nextInt(26);
			dragonHealth=dragonHealth-randomNum;
			Ddmg=Ddmg+randomNum;
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
			int randomNum1 = randy.nextInt(36);
			playerHealth=playerHealth-randomNum1;
			dmg=dmg+randomNum1;
			
		// 12. Subtract this number from the player's health
		
		
		
		// 13. If the user's health is less than or equal to 0
		if (playerHealth < 1) {
			JOptionPane.showMessageDialog(null, "You lost... But hey, at least you tried!");
		
		}
			//-- Tell the user that they lost
			
		
		// 14. Else if the dragon's health is less than or equal to 0
		if (dragonHealth < 1) {
			JOptionPane.showMessageDialog(null, "You won! You slayed the dragon now your rich!");
		
		}
		else {
			JOptionPane.showMessageDialog(null, " Dragon Health = " + dragonHealth + " | Dragon Damage = " + Ddmg + "\n Player Health " + playerHealth + " | Player Damage = " + dmg);
					
			
			
		}
		}
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
		}
		}
	

