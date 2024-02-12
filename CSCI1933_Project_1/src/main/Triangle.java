package main;

import java.awt.Color;

public class Triangle {

	private double x, y;
	private double width;
	private double height;
	
	private Color color;

	public Triangle(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public double calculatePerimeter() {
		double sideLeng = Math.sqrt(Math.pow((width/2), 2) + Math.pow(height, 2));
		return width + 2 * sideLeng;
	}
	
	public double calculateArea() {
		return (width*height)/2;
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

	public double getXPos() {
		return x;
	}

	public double getYPos() {
		return y;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}	
}
