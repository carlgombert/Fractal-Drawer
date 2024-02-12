package main;

import java.awt.Color;

public class Rectangle {

	private double x, y;
	private double width;
	private double height;
	
	private Color color;
	
	public Rectangle(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public double calculatePerimeter() {
		return 2*height + 2*width;
	}
	
	public double calculateArea() {
		return width*height;
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

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
