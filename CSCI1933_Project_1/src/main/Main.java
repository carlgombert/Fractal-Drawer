package main;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	// main asks user for shape input, and then draws the corresponding
	// fractal.
	// prints area of fractal
	public static void main(String[] args) {
		
		boolean answer = false;
		
		FractalDrawer fd = new FractalDrawer();
		
		Scanner input = new Scanner(System.in);
		
		// Ask user to enter a shape and repeat until they enter an acceptable number
		while(answer == false) {
			System.out.println("Enter a number to choose a shape: ");
			System.out.println("\t1: circle\n\t2: triangle\n\t3:rectangle");
			int ans = input.nextInt();
			switch(ans) {
				case 1:
					answer = true;
					System.out.print("Total Area: ");
					System.out.println(fd.drawFractal("circle"));
					break;
				case 2:
					answer = true;
					System.out.print("Total Area: ");
					System.out.println(fd.drawFractal("triangle"));
					break;
				case 3:
					answer = true;
					System.out.print("Total Area: ");
					System.out.println(fd.drawFractal("rectangle"));
					break;
				default:
					System.out.println("Invalid shape");
			}
		}
	}
	
	// Generates a random color, used by the triangle fractal
	public static Color randCol() {
		int r = (int) (Math.random() * (255));
		int g = (int) (Math.random() * (255));
		int b = (int) (Math.random() * (255));
		return new Color(r, g, b);
	}
}
