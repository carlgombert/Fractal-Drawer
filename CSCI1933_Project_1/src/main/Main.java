package main;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static ArrayList<Color> colorset1 = new ArrayList<Color>();
	
	// TODO:
	// main should ask user for shape input, and then draw the corresponding
	// fractal.
	// should print area of fractal
	public static void main(String[] args) {
		
		colorset1.add(new Color(75,0,130));
		colorset1.add(new Color(240,230,140));
		colorset1.add(new Color(34,139,34));
		colorset1.add(new Color(0,0,0));
		
		boolean answer = false;
		
		FractalDrawer fd = new FractalDrawer();
		
		Scanner input = new Scanner(System.in);
		while(answer == false) {
			System.out.println("Enter a number to choose a shape: ");
			System.out.println("\t1: circle\n\t2: triangle\n\t3:rectangle");
			int ans = input.nextInt();
			switch(ans) {
				case 1:
					answer = true;
					fd.drawFractal("circle");
					break;
				case 2:
					answer = true;
					fd.drawFractal("triangle");
					break;
				case 3:
					answer = true;
					fd.drawFractal("rectangle");
					break;
				default:
					System.out.println("Invalid shape");
			}
		}
	}
	
	public static Color randCol() {
		int r = (int) (Math.random() * (255));
		int g = (int) (Math.random() * (255));
		int b = (int) (Math.random() * (255));
		return new Color(r, g, b);
	}
}
