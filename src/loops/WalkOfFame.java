
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import java.beans.XMLEncoder;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left.
		// You also need to show the robot to see the result of this line.
		rob.setAngle(90);
		rob.setSpeed(200);
		rob.setX(144);
		// 2. Make the robot draw a star shape. Hint: 144.
		
		// 3. Set the size of the star to 30.
		rob.penDown();
		for (int i = 0; i < 10; i++) {
			rob.penDown(); rob.setRandomPenColor();
			for (int i1 = 0; i1 < 10; i1++) {

				rob.move(30);
				rob.turn(144);

			}
			rob.setAngle(90);
			rob.penUp();
			
			rob.move(50);

		}
		rob.move(1000);

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this: http://bit.ly/walkOfFame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
