package main;

import java.awt.Color;
import java.lang.Math;

//Circle class represents a circle with specified position, dimensions, and color
public class Circle {
	
	private double x, y;
	private double radius;
	
	private Color color;
	
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double calculatePerimeter() {
		return 2*radius;
	}
	
	public double calculateArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public void setPos(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getXPos() {
		return x;
	}

	public double getYPos() {
		return y;
	}
}
