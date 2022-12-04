package OnThi;

import java.util.Scanner;

public class thiSinhKhoi_A extends QL_thiSinh{
	private float toan,ly,hoa; //diem cac mon tren la so thuc
	//Ham xay dung
	public thiSinhKhoi_A() {
		super();
		hoa = ly = toan =0;
	}
	public thiSinhKhoi_A(int soBD,int muc,String hten,String dchi,int hoa,int ly ,int toan) {
		super(soBD, muc, hten, dchi);
		this.hoa = hoa;
		this.ly = ly;
		this.toan = toan;
	}
	public thiSinhKhoi_A(thiSinhKhoi_A x) {
		super(x);
		this.hoa = x.hoa;
		this.ly = x.ly;
		this.toan = x.toan;
	}
	//Ham nhap
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap diem mon toan: "); toan = sc.nextFloat();
		System.out.println("Nhap diem mon ly: "); ly = sc.nextFloat();
		System.out.println("Nhap diem mon hoa: "); hoa = sc.nextFloat();
	}
	//in
	public void in() {
		super.in();
		System.out.println("\tThi sinh khoi A"+"\nDiem toan: "+toan+"\nDiem ly: "+ly+"\nDiem hoa: "+hoa);
	}
	public String toString() {
		return super.toString()+"\n\tThi sinh khoi A"+"\nDiem toan: "+toan+"\nDiem ly: "+ly+"\nDiem hoa: "+hoa;
	}
	//Diem tong 3 mon
	public void tongDiem(){
		System.out.println("Tong diem: "+(hoa+ly+toan));
	}
	//Get&Set
	public float getToan() {
		return toan;
	}
	public void setToan(float toan) {
		this.toan = toan;
	}
	public float getLy() {
		return ly;
	}
	public void setLy(float ly) {
		this.ly = ly;
	}
	public float getHoa() {
		return hoa;
	}
	public void setHoa(float hoa) {
		this.hoa = hoa;
	}
}
