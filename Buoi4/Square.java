package Buoi4;

import java.util.Scanner;

public class Square extends Shape{
	private double side;
	//Ham xay dung
	public Square(){
		side = 0;
	}
	public Square(double side) {
		this.side = side;
	}
	public Square(double side,String color,boolean filled) {
		super(color, filled);
		this.side = side;
	}
	public Square(Square X) {
		super((Square) X);
		this.side = X.side;
	}
	//Su dung phuong thuc truu tuong ben lop Shape
	public void inputValue() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side: "); side = sc.nextDouble();
	}
	public double getArea() {//dien tich
		return Math.pow(side, 2);
	}
	public double getPerimeter() {//Chu vi
		return 4*side;
	}
	//Ham in
	public String toString() {
		return "\tSquare: "+"\nColor: "+super.getColor()+"\t,Filled: "+super.getFilled()
		+"\nSide: "+side+"\nArea: "+getArea()+"\t.Perimeter: "+getPerimeter();
	}
}
