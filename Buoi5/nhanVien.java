package Buoi5;

import java.util.Scanner;

public class nhanVien {
	private String msnv,	//Ma so nhan vien
				cvu,		//Chuc vu nhan vien
				hten;		//Ho ten  nhan vien
	private int tnien;		//Tham nien va cong tac
	
	//Phuong thuc xay dung
	public nhanVien() {		//Phuong thuc xay dung khong doi so
		msnv = cvu = hten = new String();
		tnien=0;
	}
	public nhanVien(String masonv,String hoten,String chucvu,int thamnien) {
		this.msnv = new String(masonv);
		this.hten = new String(hoten);
		this.cvu = new String(chucvu);
		this.tnien = thamnien;
	}
	public nhanVien(nhanVien X) {//Phuong thuc xay dung sao chep sau
		this.cvu = new String(X.cvu);
		this.hten = new String(X.hten);
		this.msnv = new String(X.msnv);
		this.tnien = X.tnien;
	}
	//NHap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so nhan vien: "); msnv = sc.nextLine();
		System.out.print("Nhap ho ten cua nhan vien: "); hten = sc.nextLine();
		System.out.print("Nhap chuc vu cua nhan vien: "); cvu = sc.nextLine();
		System.out.print("Nhap tham nien cong tac cua nhan vien: "); tnien = sc.nextInt();
	}
	//in
	public void in() {
		System.out.println("Ho va Ten: "+hten+"\t.Ma so nhan vien: "+msnv);
		System.out.println("Chuc vu: "+cvu+"\nTham nien: "+tnien);
	}
	public String toString() {
		return "\nHo va Ten: "+hten+"\t.Ma so nhan vien: "+msnv+"\nChuc vu: "+cvu+"\nTham nien: "+tnien;
	}
	//Get & set
	public String getHoTen() {
		return hten;
	}
	public String getMSNV() {
		return msnv;
	}
	public String getChucVu() {
		return cvu;
	}
	public int getThamNien() {
		return tnien;
	}
	public void setHoTen(String hten) {
		this.hten = hten;
	}
	public void setMSNV(String msnv) {
		this.msnv = msnv;
	}
	public void setChucVu(String cvu) {
		this.cvu = cvu;
	}
	public void setHoTen(int tnien) {
		this.tnien = tnien;
	}
	public static void main(String[] args) {
		nhanVien nv1 = new nhanVien();
		nv1.nhap();
		nv1.in();
		nhanVien nv2 = new nhanVien("12345", "Tran Tue Chau", "", 30);
		nv2.in();
		nhanVien nv3 = new nhanVien(nv1);
		nv3.in();
	}
}
