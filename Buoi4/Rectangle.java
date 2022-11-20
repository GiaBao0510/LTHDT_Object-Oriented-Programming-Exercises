package Buoi4;

import java.util.Scanner;

public class Rectangle extends Shape{
	private double length,width;
	public Rectangle() {
		length = width = 0;
	}public Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
	}
	public Rectangle(double length,double width,String color,boolean filled) {
		super(color, filled);
		this.length = length;
		this.width = width;
	}
	public Rectangle(Rectangle X) {
		super((Rectangle) X);
		this.length = X.length;
		this.width = X.width;
	}
	//Ham nhap su dung phuong thuc truu tuong tu lop Shape
	public void inputValue() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: "); length = sc.nextDouble();
		System.out.print("Enter width: "); width = sc.nextDouble();
		super.nhap();
	}
	public double getArea() { //Dien tich
		return length * width;
	}
	public double getPerimeter() {
		return (length + width)*2;
	}
	//ham in
	public String toString() {
		return "\tRectangle: "+"\nColor: "+super.getColor()+"\t,Filled: "+super.getFilled()
		+"\nLength: "+length+",\tWidth: "+width+"\nArea: "+getArea()+"\t.Perimeter: "+getPerimeter();
	}
}
