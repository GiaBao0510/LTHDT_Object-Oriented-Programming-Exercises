package Buoi5;
import java.util.Scanner;
import Buoi2.Date;
public class HangHoa {
	private String tenHH,NhaSX;
	private Date NSX, NHH;
	//Ham muc tieu
	public HangHoa() {
		tenHH = NhaSX = new String();
		NSX = NHH = new Date();
	}
	public HangHoa(String tenHH, String NhaSX,Date NSX,Date NHH) {
		this.tenHH = new String(tenHH);
		this.NhaSX = new String(NhaSX);
		this.NSX = new Date(NSX);
		this.NHH = new Date(NHH);
	}
	public HangHoa(HangHoa X) {
		this.tenHH = new String(X.tenHH);
		this.NhaSX = new String(X.NhaSX);
		this.NSX = new Date(X.NSX);
		this.NHH = new Date(X.NHH);
	}
	//Ham nhap
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten hang hoa: "); tenHH=sc.nextLine();
		System.out.print("Nhap ten nha san xuat: "); NhaSX=sc.nextLine();
		System.out.println("\tNgay san xuat:");
		NSX.EnterDate();
		System.out.println("\tNgay het han:");
		NHH.EnterDate();
	}
	//Ham in
	public void In() {
		System.out.println("Ten hang hoa: "+tenHH+"\t.NHa san xuat: "+NhaSX);
		System.out.println("Ngay san xuat: "+NSX+"\nNgay het han: "+NHH);
	}
	public String toString() {
		return "\nTen hang hoa: "+tenHH+"\t.Nha san xuat: "+NhaSX+
				"\n\tNgay san xuat: "+NSX+"\n\tNgay het han: "+NHH;
	}
	//Get & Set
	public String getTenHH() {
		return tenHH;
	}
	public void setTenHH(String tenHH) {
		this.tenHH = tenHH;
	}
	public String getNhaSX() {
		return NhaSX;
	}
	public void setNhaSX(String nhaSX) {
		NhaSX = nhaSX;
	}
	public Date getNSX() {
		return NSX;
	}
	public void setNSX(Date nSX) {
		NSX = nSX;
	}
	public Date getNHH() {
		return NHH;
	}
	public void setNHH(Date nHH) {
		NHH = nHH;
	}
}
