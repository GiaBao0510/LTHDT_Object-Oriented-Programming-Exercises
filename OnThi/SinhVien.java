package OnThi;

import java.util.Scanner;

import Buoi2.Date;

public class SinhVien implements Comparable<SinhVien> {
	private String mssv		//Ma so sinh vien
				   ,hten;	//Ho ten
	private Date Nsinh;		//Ngay thang nam sinh
	private float dtb;		//Diem trung binh
	static Scanner sc = new Scanner(System.in);
	//Cac phuong thuc xay dung
	public SinhVien() {
		mssv = hten = new String();
		Nsinh = new Date();
		dtb=0;
	}
	public SinhVien(String mssv ,String hten, Date Nsinh, float dtb) {
		this.mssv = new String(mssv);
		this.hten = new String(hten);
		this.Nsinh = new Date(Nsinh);
		this.dtb = dtb;
	}
	public SinhVien(SinhVien x) {
		this.mssv = new String(x.mssv);
		this.hten = new String(x.hten);
		this.Nsinh = new Date(x.Nsinh);
		this.dtb = x.dtb;
	}
	public SinhVien(String Mssv) {
		this.mssv = new String(Mssv);
	}
	//Ham nhap
	public void nhap() {
		sc.nextLine();//Bo qua xuong dong.Sau khi cac bien co kieu so da duoc nhap 
		System.out.print("Nhap ma so sinh vien: "); mssv = sc.nextLine();
		System.out.print("Nhap ho ten: "); hten = sc.nextLine();
		System.out.print("Nhap ngay sinh: "); Nsinh.EnterDate();
		System.out.print("Nhap diem trung binh: "); dtb = sc.nextFloat();
	}
	//Ham in
	public void in() {
		System.out.println("Ho ten: "+hten+"\t ;MSSV: "+mssv);
		System.out.println("Ngay sinh: "+Nsinh);
		System.out.println("Diem trung binh: "+dtb);
	}
	public String toString() {
		return "\nHo ten: "+hten+"\t ;MSSV: "+mssv+"\nNgay sinh: "+Nsinh+"\nDiem trung binh: "+dtb;
	}
	//Get&Set
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public String getHten() {
		return hten;
	}
	public void setHten(String hten) {
		this.hten = hten;
	}
	public Date getNsinh() {
		return Nsinh;
	}
	public void setNsinh(Date nsinh) {
		Nsinh = nsinh;
	}
	public float getDtb() {
		return dtb;
	}
	public void setDtb(float dtb) {
		this.dtb = dtb;
	}
	@Override
	public int compareTo(SinhVien o) {
		return this.mssv.compareTo(o.mssv);	//So sanh 2 ma so sinh vien giua 2 doi tuong
	}
}
