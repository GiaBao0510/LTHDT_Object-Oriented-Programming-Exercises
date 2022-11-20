package Buoi4;

import java.util.Scanner;

public abstract class Shape {//Lop truu tuong
	private String color;
	private boolean filled = true;
	//Ham xay dung
	public Shape() {
		color = new String();
		filled = false;
	}
	public Shape(String color,boolean filled) {
		this.color = color;
		this.filled =filled;
	}
	public Shape(Shape X) {
		this.color = X.color;
		this.filled =X.filled;
	}
	//Ham nhap
	public void nhap() {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter color: "); color = sc.nextLine();
		System.out.print("filled: 1.true - other.false: "); x = sc.nextInt();
		if(x==1) {
			filled = true;
		}else {
			filled= false;
		}
	}
	//Ham in 
	public String toString() {
		return "\n\tUnknow shape.\n";
	}
	//Get & set
	public void setColor(String X) {
		color = new  String(X);
	}
	public String getColor() {
		return color;
	}
	public void setFilled(boolean X) {
		filled = X;
	}
	public boolean getFilled() {
		return filled;
	}
	//phuong thhuc truu tuong
	public abstract void inputValue();//Dau vao
	public abstract double getArea();//Tra ve gia tri nao do cua mot hinh bat ky
	public abstract double getPerimeter();
	
}
