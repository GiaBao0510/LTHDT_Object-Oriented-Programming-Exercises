package OnThi;

import java.util.Scanner;

public class NhanVien extends CanBo{
	private String CongViec; //Nganh dao tao
	//Ham xay dung
	public NhanVien() {
		super();
		CongViec = new String();
	}
	public NhanVien(String HoTen, String dchi, int Tuoi, int sex,String CongViec) {
		super(HoTen, dchi, Tuoi, sex);
		this.CongViec = new String(CongViec);
	}
	public NhanVien(NhanVien x) {
		super(x);
		this.CongViec = new String();
	}
	//Ham xay dung
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap cong viec: "); CongViec = sc.nextLine();
	}
	//in 
	public void in() {
		
		super.in();
		System.out.println("Cong viec: "+CongViec);
	}
	public String toString() {
		String S = new String();
		S+= super.toString();
		S+="\nCong viec: "+CongViec;
		return S;
	}
	//Get & Set
	public String getCongViec() {
		return CongViec;
	}
	public void setCongViec(String congViec) {
		CongViec = congViec;
	}
}
