package Buoi5;

import java.util.Scanner;

public class ChiTiet {
	private int Soluong;	//So luong san pham
	private float donGia;	//Don gia cua 1 san pham
	private HangHoa HH;
	//Ham xay dung
	public ChiTiet() {
		Soluong = 0;
		donGia = 0f;
		HH = new HangHoa();
	}
	public ChiTiet(int Soluong,float donGia,HangHoa HH) {
		this.donGia = donGia;
		this.Soluong = Soluong;
		this.HH = new HangHoa(HH);
	}
	public ChiTiet(ChiTiet X) {
		this.donGia = X.donGia;
		this.Soluong = X.Soluong;
		this.HH = new HangHoa(X.HH);
	}
	//Ham nhap
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		HH.Nhap();
		System.out.print("Nhap so luong: "); Soluong = sc.nextInt();
		System.out.print("Nhap don gia cua mot loai san pham nay: "); donGia = sc.nextInt();
	}
	//Tong so tien cho 1 loai san pham nao do
	public float tongDonGia() {
		return (float)(donGia * Soluong);
	}
	//Ham in
	public void In() {
		System.out.println(HH+"\nSo luong: "+Soluong+ "\nDon gia: "+donGia);
	}
	public String toString() {
		return HH+"\nSo luong: "+Soluong+ "\nDon gia: "+donGia;
	}
	//Get & Set
	public int getSoluong() {
		return Soluong;
	}
	public void setSoluong(int soluong) {
		Soluong = soluong;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}
	public HangHoa getHH() {
		return HH;
	}
	public void setHH(HangHoa hH) {
		HH = hH;
	}
	
}
