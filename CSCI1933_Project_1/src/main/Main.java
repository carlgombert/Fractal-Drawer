package main;

import java.util.Scanner;

public class Main {
	// TODO:
	// main should ask user for shape input, and then draw the corresponding
	// fractal.
	// should print area of fractal
	public static void main(String[] args) {
		boolean answer = false;
		
		FractalDrawer fd = new FractalDrawer();
		
		Scanner input = new Scanner(System.in);
		while(answer = false) {
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
}
