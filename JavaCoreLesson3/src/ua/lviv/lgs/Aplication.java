package ua.lviv.lgs;

public class Aplication {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println("����� ������������ = " + r1.getAreaRecrangle());
		System.out.println("�������� ������������ = " + r1.getPerimeterRecrangle());
		System.out.println();
		Rectangle r2 = new Rectangle(3.2, 10);
		System.out.println("����� ������������ = " + r2.getAreaRecrangle());
		System.out.println("�������� ������������ = " + r2.getPerimeterRecrangle());
		System.out.println();
		Circle circle1 = new Circle(3);
		System.out.println("������� ���� " + circle1.getLengthCircle());
		System.out.println("����� ���� " + circle1.getAreaCircle());

	}
}
