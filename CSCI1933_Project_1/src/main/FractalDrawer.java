package main;

//FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;

public class FractalDrawer {
	private double totalArea = 0; // member variable for tracking the total area

	public FractalDrawer() {
	}

	// drawFractal method initiates the drawing of a fractal based on the specified type
	public double drawFractal(String type) {
		Canvas cvs = new Canvas(800,800);
		Color c = new Color(0, 0, 0);
		switch(type) {
			case "circle":
				drawCircleFractal(200, 400, 400, c, cvs, 0);
				break;
			case "triangle":
				drawTriangleFractal(300, 300, 400, 400, c, cvs, 0);
				break;
			case "rectangle":
				drawRectangleFractal(350, 350, 400, 400, c, cvs, 0);
				break;
		}
		return totalArea;
	}

	// drawTriangleFractal draws a triangle fractal using recursive techniques
	public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
		// Only repeat process for 10 levels
		if(level < 10) {
			c = Main.randCol();
			
			// draw middle triangle
			Triangle tri = new Triangle(x - width/2, y, width, height);
			tri.setColor(c);
			can.drawShape(tri);
			totalArea += tri.calculateArea();
			
			// draw a triangle on all sides of the middle triangle
			Triangle tri2 = new Triangle(x - width/2, y, width, height*-1);
			tri2.setColor(c);
			can.drawShape(tri2);
			totalArea += tri2.calculateArea();
			
			Triangle tri3 = new Triangle(x - width, y-height, width, -1*height);
			tri3.setColor(c);
			can.drawShape(tri3);
			totalArea += tri3.calculateArea();
			
			Triangle tri4 = new Triangle(x, y-height, width, -1*height);
			tri4.setColor(c);
			can.drawShape(tri4);
			totalArea += tri4.calculateArea();
			
			level++;
			
			// Recursively repeat this inside each of the triangles surrounding the middle triangle
			drawTriangleFractal(width/2, height/2, x-width/2, y-height/2, c, can, level);
			drawTriangleFractal(width/2, height/2, x+width/2, y-height/2, c, can, level);
			drawTriangleFractal(width/2, height/2, x, y+height/2, c, can, level);
		}
	}

	// drawCircleFractal draws a circle fractal using recursive techniques
	public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
		// Only repeat process for 7 levels
		if(level < 7) {
			c = Main.colorset2.get(level%4);
			
			// Draw the main circle
			Circle cir = new Circle(x, y, radius);
			cir.setColor(c);
			can.drawShape(cir);
			totalArea += cir.calculateArea();
			
			c = Main.colorset2.get((level+1)%4);
			
			// Draw smaller circles on all sides of main circle
			Circle cir2 = new Circle(x-radius, y, radius/2);
			cir2.setColor(c);
			can.drawShape(cir2);
			totalArea += cir2.calculateArea();
			
			Circle cir3 = new Circle(x+radius, y, radius/2);
			cir3.setColor(c);
			can.drawShape(cir3);
			totalArea += cir3.calculateArea();
			
			Circle cir4 = new Circle(x, y-radius, radius/2);
			cir4.setColor(c);
			can.drawShape(cir4);
			totalArea += cir4.calculateArea();
			
			Circle cir5 = new Circle(x, y-radius, radius/2);
			cir5.setColor(c);
			can.drawShape(cir5);
			totalArea += cir5.calculateArea();
			
			level++;
			
			// Recursively repeat this inside each of the smaller circles
			drawCircleFractal(radius/2, x-radius, y, c, can, level);
			drawCircleFractal(radius/2, x+radius, y, c, can, level);
			drawCircleFractal(radius/2, x, y-radius, c, can, level);
			drawCircleFractal(radius/2, x, y+radius, c, can, level);
		}
	}

	// drawRectangleFractal draws a rectangle fractal using recursive techniques
	public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
		// Only repeat process for 8 levels
		if(level < 8) {
			c = Main.colorset1.get(level%4);
			
			// Draw main rectangle in the center
			Rectangle rec = new Rectangle(x - width/2, y - height/2, width, height);
			rec.setColor(c);
			can.drawShape(rec);
			totalArea += rec.calculateArea();
			
			c = Main.colorset1.get((level+1)%4);
			
			// Draw smaller rectangles on all four corners of the main rectangle
			Rectangle rec2 = new Rectangle(x - (3*width)/4, y - (3*height)/4, width/2, height/2);
			rec2.setColor(c);
			can.drawShape(rec2);
			totalArea += rec2.calculateArea();
			
			Rectangle rec3 = new Rectangle(x + (width)/4, y - (3*height)/4, width/2, height/2);
			rec3.setColor(c);
			can.drawShape(rec3);
			totalArea += rec3.calculateArea();
			
			Rectangle rec4 = new Rectangle(x + (width)/4, y + (height)/4, width/2, height/2);
			rec4.setColor(c);
			can.drawShape(rec4);
			totalArea += rec4.calculateArea();
			
			Rectangle rec5 = new Rectangle(x - (3*width)/4, y + (height)/4, width/2, height/2);
			rec5.setColor(c);
			can.drawShape(rec5);
			totalArea += rec5.calculateArea();
			
			level++;
			
			// Recursively repeat this inside each of the smaller rectangles
			drawRectangleFractal(width/2, height/2, x-width/2, y-height/2, c, can, level);
			drawRectangleFractal(width/2, height/2, x+width/2, y-height/2, c, can, level);
			drawRectangleFractal(width/2, height/2, x-width/2, y+height/2, c, can, level);
			drawRectangleFractal(width/2, height/2, x+width/2, y+height/2, c, can, level);
		}
	}
}
