package Buoi2;

import java.util.Scanner;

public class CBCC {//Day la lop can bo cong chuc
	private String masocb,		//Ma so can bo
					hoten;		//Ho ten can bo
	protected float hesoluong;	//He so luong cua can bo
	int namsinh;				//nam sinh cua can bo
	//Ham xay dung
	public CBCC() {
		masocb = hoten = new String();
		hesoluong = namsinh =0;
	}
	public CBCC(String masocb,String hoten,float hesoluong,int namsinh) {
		this.hoten = new String(hoten);
		this.masocb = new String(masocb);
		this.hesoluong = hesoluong;
		this.namsinh = namsinh;
	}
	public CBCC(CBCC x) {
		this.hoten = new String(x.hoten);
		this.masocb = new String(x.masocb);
		this.hesoluong = x.hesoluong;
		this.namsinh = x.namsinh;
	}
	//Ham nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma so: "); masocb = sc.nextLine();
		System.out.print("Ho & ten: "); hoten = sc.nextLine();
		System.out.print("He so luong: "); hesoluong = sc.nextFloat();
		System.out.print("Nam sinh: "); namsinh = sc.nextInt();
	}
	//Ham in
	public void in() {
		System.out.println("Ho ten: "+hoten+"\t Ma so: "+masocb);
		System.out.println("Nam sinh: "+namsinh);
		System.out.println("He so luong: "+hesoluong);
	}
	public String toString() {
		return "\nHo ten: "+hoten+"\t Ma so: "+masocb+"\nNam sinh: "+namsinh+"\nHe so luong: "+hesoluong;
	}
	//Tinh tien luong
	public float tienLuong() {
		return (hesoluong*210000);
	}
	//Tang luong
	public void tangLuong(float h) {
		hesoluong+=h;
	}
	//Get & Set
	public String getMasocb() {
		return masocb;
	}
	public void setMasocb(String masocb) {
		this.masocb = masocb;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public float getHesoluong() {
		return hesoluong;
	}
	public void setHesoluong(float hesoluong) {
		this.hesoluong = hesoluong;
	}
	public int getNamsinh() {
		return namsinh;
	}
	public void setNamsinh(int namsinh) {
		this.namsinh = namsinh;
	}
}
