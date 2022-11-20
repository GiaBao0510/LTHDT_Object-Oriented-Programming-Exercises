package Buoi2;

import java.util.Scanner;

public class hinhTron {
	private double banKinh;
	private String mauSac;
	//Hàm xây dựng mặc
	public hinhTron(){
		banKinh=0;
		mauSac = new String();
	}
	public hinhTron(double r,String mau) {
		banKinh=r;
		mauSac = new String(mau);
	}
	public hinhTron(hinhTron X) { //Phương thức xây dựng sao chép
		banKinh = X.banKinh;
		mauSac = new String(X.mauSac);
	}
	//Hàm nhập 
	public void nhapHinhTron() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập bán kính của hình tròn: "); banKinh=sc.nextDouble();
		sc.nextLine();
		System.out.print("Nhập màu sắc của hình tròn: ");
		mauSac = new String();
		mauSac = sc.nextLine();
	}
	//hàm hiển thị
	public void hienThi() {
		System.out.println("Hình tròn với bán kính là: "+banKinh+"\t.Vậy đường kính là: "+(banKinh*2));
		System.out.println("Màu sắc: "+mauSac);
	}
	public String toString() {
		return "Hình tròn với bán kính là: "+banKinh+"\n"+"Màu sắc: "+mauSac;
	}
	//Hàm in ra tính diện tích va chu vi hình tròn
	public void dienTich_ChuVi() {
		System.out.println("Diện tích của hình tròn là: "+(Math.pow(banKinh,2)* Math.PI));
		System.out.println("Chu vi hình tròn là: "+(Math.PI*2*banKinh));
	}
	//Get & Set
	public double getBanKinh() {
		return banKinh;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setBanKinh(double x) {
		banKinh = x;
	}
	public void setMauSac(String mau) {
		mauSac= new String(mau);
	}
}

