package Buoi5;

import java.util.Scanner;

public class moveablePoint implements moveable{//Su dung giao dien tua nhu lop - phuong thuc truu tuong nhung no co the dung nhueu giao dien
	private int x,y;
	//Ham xay dung
	public moveablePoint() {
		x = y = 0;
	}
	public moveablePoint(int x ,int y) {
		this.x = x;
		this.y = y;
	}
	public moveablePoint(moveablePoint X) {
		this.x = X.x;
		this.y = X.y;
	}
	//Ham nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("X: "); x = sc.nextInt();
		System.out.print("Y: "); y = sc.nextInt();
	}
	//Ham in
	public String toString() {
		return "\n("+x+","+y+")";
	}
	//Nhung phai su dung het phuong thuc trong giao dien da goi 
	public void moveUp() {
		x++;
	}
	public void moveDown() {
		x--;
	}
	public void moveLeft() {
		y--;
	}
	public void moveRight() {
		y++;
	}
}
