package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyNextJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
		Robot Aether = new Robot();
	Aether.penDown();
	Aether.setSpeed(100);
	
	for (int i = 0; i < 4; i++) {
		Aether.move(100);
		Aether.turn(90);
	}
	
		
		
		
	}
}
