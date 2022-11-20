package Buoi5;

import java.util.Scanner;

public class moveableStudent implements moveable{
	private String name,id;
	//Ham xay dung
	public moveableStudent() {
		name = id = new String();  
	}
	public moveableStudent(String name,String id) {
		this.name = new String(name); 
		this.id = new String(id);
	}
	public moveableStudent(moveableStudent X) {
		this.name = new String(X.name); 
		this.id = new String(X.id);
	}
	//Ham nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten: "); name = sc.nextLine();
		System.out.print("Nhap ID: "); id = sc.nextLine();
	}
	//Ham in
	public String toString() {
		return "Name: "+name+"\nID: "+id;
	}
	public void moveUp() {
		System.out.println("Go up.");
	}
	public void moveDown() {
		System.out.println("Go down.");
	}
	public void moveLeft() {
		System.out.println("Go left.");
	}
	public void moveRight() {
		System.out.println("Go right.");
	}
	
}
