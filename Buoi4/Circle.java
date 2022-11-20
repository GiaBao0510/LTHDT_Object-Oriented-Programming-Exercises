package Buoi4;

import java.util.Scanner;

public class Circle extends Shape{
	private double radius;
	//Ham xay dung
	public Circle() {
		radius =0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(double radius,String color,boolean filled) {
		super(color, filled);
		this.radius = radius;
	}
	public Circle(Circle X) {
		super((Circle) X);
		this.radius = X.radius;
	}
	//Ham nhap su dung phuong thuc truu tuong tu lop Shape
		public void inputValue() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter radius: "); radius = sc.nextDouble();
			super.nhap();
		}
		public double getArea() {//Tinh chu vi
			return Math.pow(radius, 2) * Math.PI;
		}
		public double getPerimeter() {
			return 2*radius*Math.PI;
		}
		//ham in
		public String toString() {
			return "\tCircle: "+"\nColor: "+super.getColor()+"\t,Filled: "+super.getFilled()
			+"\nRadius: "+radius+"\nArea: "+getArea()+"\t.Perimeter: "+getPerimeter();
		}
	//Set & Get
		public double getRadius() {
			return radius;
		}
		public void setRadius(double radius) {
			this.radius = radius;
		}
}
