package main;

//FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;

public class FractalDrawer {
	private double totalArea = 0; // member variable for tracking the total area

	public FractalDrawer() {
	} // contructor

	// TODO:
	// drawFractal creates a new Canvas object
	// and determines which shapes to draw a fractal by calling appropriate helper
	// function
	// drawFractal returns the area of the fractal
	public double drawFractal(String type) {
		Canvas cvs = new Canvas(800,800);
		Color c = Main.randCol();
		switch(type) {
			case "circle":
				drawCircleFractal(100, 0, 0, c, cvs, 0);
				break;
			case "triangle":
				drawTriangleFractal(200, 200, 400, 400, c, cvs, 0);
				break;
			case "rectangle":
				drawRectangleFractal(200, 200, 0, 0, c, cvs, 0);
				break;
		}
		return totalArea;
	}

	// TODO:
	// drawTriangleFractal draws a triangle fractal using recursive techniques
	public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
		if(level < 7) {
			//draw triangle
			//change position, color and whatever else for the next triangle
			//increase level by one
			//recursivley call this function
		}
	}

	// TODO:
	// drawCircleFractal draws a circle fractal using recursive techniques
	public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
	}

	// TODO:
	// drawRectangleFractal draws a rectangle fractal using recursive techniques
	public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
		if(level < 7) {
			//draw rectangle
			//change position, color and whatever else for the next rectangle
			//increase level by one
			//recursivley call this function
		}
	}
}
