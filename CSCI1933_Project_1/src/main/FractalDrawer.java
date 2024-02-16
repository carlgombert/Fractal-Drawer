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
		Color c = new Color(0, 0, 0);
		switch(type) {
			case "circle":
				drawCircleFractal(200, 400, 400, c, cvs, 0);
				break;
			case "triangle":
				drawTriangleFractal(300, 300, 400, 400, c, cvs, 0);
				break;
			case "rectangle":
				drawRectangleFractal(300, 300, 400, 400, c, cvs, 0);
				break;
		}
		return totalArea;
	}

	// TODO:
	// drawTriangleFractal draws a triangle fractal using recursive techniques
	public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
		if(level < 10) {
			//c = Main.colorset1.get(level%4);
			c = Main.randCol();
			
			Triangle tri = new Triangle(x - width/2, y, width, height);
			tri.setColor(c);
			can.drawShape(tri);
			
			Triangle tri2 = new Triangle(x - width/2, y, width, height*-1);
			tri2.setColor(c);
			can.drawShape(tri2);
			
			Triangle tri3 = new Triangle(x - width, y-height, width, -1*height);
			tri3.setColor(c);
			can.drawShape(tri3);
			
			Triangle tri4 = new Triangle(x, y-height, width, -1*height);
			tri4.setColor(c);
			can.drawShape(tri4);
			
			level++;
			
			drawTriangleFractal(width/2, height/2, x-width/2, y-height/2, c, can, level);
			drawTriangleFractal(width/2, height/2, x+width/2, y-height/2, c, can, level);
			drawTriangleFractal(width/2, height/2, x, y+height/2, c, can, level);
		}
	}

	// TODO:
	// drawCircleFractal draws a circle fractal using recursive techniques
	public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
		if(level < 7) {
			c = Main.colorset1.get(level%4);
			
			Circle cir = new Circle(x, y, radius);
			cir.setColor(c);
			can.drawShape(cir);
			
			c = Main.colorset1.get((level+1)%4);
			
			Circle cir2 = new Circle(x-radius, y, radius/2);
			cir2.setColor(c);
			can.drawShape(cir2);
			
			Circle cir3 = new Circle(x+radius, y, radius/2);
			cir3.setColor(c);
			can.drawShape(cir3);
			
			Circle cir4 = new Circle(x, y-radius, radius/2);
			cir4.setColor(c);
			can.drawShape(cir4);
			
			Circle cir5 = new Circle(x, y-radius, radius/2);
			cir5.setColor(c);
			can.drawShape(cir5);
			
			level++;
			
			drawCircleFractal(radius/2, x-radius, y, c, can, level);
			drawCircleFractal(radius/2, x+radius, y, c, can, level);
			drawCircleFractal(radius/2, x, y-radius, c, can, level);
			drawCircleFractal(radius/2, x, y+radius, c, can, level);
		}
	}

	// TODO:
	// drawRectangleFractal draws a rectangle fractal using recursive techniques
	public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
		if(level < 7) {
			c = Main.colorset1.get(level%4);
			
			Rectangle rec = new Rectangle(x - width/2, y - height/2, width, height);
			rec.setColor(c);
			can.drawShape(rec);
			
			c = Main.colorset1.get((level+1)%4);
			
			Rectangle rec2 = new Rectangle(x - (3*width)/4, y - (3*height)/4, width/2, height/2);
			rec2.setColor(c);
			can.drawShape(rec2);
			
			Rectangle rec3 = new Rectangle(x + (width)/4, y - (3*height)/4, width/2, height/2);
			rec3.setColor(c);
			can.drawShape(rec3);
			
			Rectangle rec4 = new Rectangle(x + (width)/4, y + (height)/4, width/2, height/2);
			rec4.setColor(c);
			can.drawShape(rec4);
			
			Rectangle rec5 = new Rectangle(x - (3*width)/4, y + (height)/4, width/2, height/2);
			rec5.setColor(c);
			can.drawShape(rec5);
			
			level++;
			
			drawRectangleFractal(width/2, height/2, x-width/2, y-height/2, c, can, level);
			drawRectangleFractal(width/2, height/2, x+width/2, y-height/2, c, can, level);
			drawRectangleFractal(width/2, height/2, x-width/2, y+height/2, c, can, level);
			drawRectangleFractal(width/2, height/2, x+width/2, y+height/2, c, can, level);
		}
	}
}
