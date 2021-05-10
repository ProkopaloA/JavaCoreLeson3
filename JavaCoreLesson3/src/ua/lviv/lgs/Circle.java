package ua.lviv.lgs;

public class Circle {
	private double diameter;
	private double radius;

	public Circle(double radius) {
		this.diameter = 2 * radius;
		this.radius = radius;
	}

	public double getAreaCircle() {
		return radius * radius * Math.PI;
	}

	public double getLengthCircle() {
		return diameter * Math.PI;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
