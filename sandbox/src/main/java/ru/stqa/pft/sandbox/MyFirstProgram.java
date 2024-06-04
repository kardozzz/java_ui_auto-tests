package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	
	public static void main(String[] args) {
		hello("World");
		hello("User");
		hello("Andrey");

		Square s = new Square(5);
		System.out.println("Площадь квадрата со сторонй " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4,6);
		System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
		Point a = new Point(4,6);
		Point b = new Point(2,7);

		System.out.println("Расстояние между точкой а и точкой b = " + Point.distance(a,b));
		System.out.println("Расстояние между точкой a и точкой b = " + a.distance(b));

	}
	public static void hello(String somebody){
		System.out.println("Hello " + somebody + "!");
	}

	public static double area(Rectangle r){
		return r.a * r.b;
	}
	public static double area(double a, double b){
  return a * b;
	}
}