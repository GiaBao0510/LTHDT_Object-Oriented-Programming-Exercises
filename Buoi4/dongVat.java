package Buoi4;

import java.util.Scanner;

public abstract class dongVat {//Lớp trừu tượng
	private String giong,mauLong;
	private float canNang;
	
	//Phương thức trừu tượng
	public abstract void tiengKeu();
	//Phương thức xây dựng
	public dongVat() {
		giong = mauLong = new String();
		canNang=0f;
	}
	public dongVat(String giong,String mauLong,float w) {
		this.giong=new String(giong);
		this.mauLong=new String(mauLong);
		this.canNang=w;
	}
	public dongVat(dongVat X) {
		giong = new String(X.giong);
		mauLong = new String(X.mauLong);
		canNang = X.canNang;
	}
	//Nhập
	public void nhapLoaiDV() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập giống con vật: "); giong = sc.nextLine();
		System.out.println("Nhập màu lông con vật: "); mauLong = sc.nextLine();
		System.out.println("Nhập cân nặng con con vật: "); canNang = sc.nextFloat();
	}
	//In
	public void In() {
		System.out.println("Động vật: "+giong);
		System.out.println("Màu lông: "+mauLong);
		System.out.println("Cân nặng: "+ canNang);
	}
	public String toTring() {
		return "Động vật: "+giong+"\n"+ "Màu lông: "+mauLong+"\n"+"Cân nặng: "+ canNang+"\n";
	}
}
