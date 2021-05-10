package ua.lviv.lgs;

public class Rectangle {
	private double length;
	private double width;

	Rectangle() {
		this.length = 10;
		this.width = 5.1;
	}

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getAreaRecrangle() {
		return length * width;
	}

	public double getPerimeterRecrangle() {
		return 2 * (length + width);
	}

}