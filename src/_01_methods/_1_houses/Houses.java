package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

public class Houses {
	Robot rob;
		
	public void run() {
		
		// Check the recipe to find out what code to put here
		rob = new Robot();
		rob.penDown();
		rob.setSpeed(9);
		rob.moveTo(50, 550);
		rob.turn(90);
		drawTriangleHouse(50);
	}
	
	public void drawTriangleHouse(int height) {
		Random random = new Random();
		rob.setPenColor(1, 20, 1);
		rob.move(30);
		rob.turn(-90);
		rob.move(height);
		
		

		
		
	}
	
}
