//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
robot.setSpeed(59);
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
String qaz=JOptionPane.showInputDialog("how many times should the robot spin");
 // 1. Use the dance method to make the robot spin.


int wsx= Integer.parseInt(qaz);
	
dance(wsx);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

