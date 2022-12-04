package OnThi;

import java.util.Scanner;

public class thiSinhKhoi_B extends QL_thiSinh{
	private float toan,sinh,hoa; //diem cac mon tren la so thuc
	//Ham xay dung
	public thiSinhKhoi_B() {
		super();
		hoa = sinh = toan =0;
	}
	public thiSinhKhoi_B(int soBD,int muc,String hten,String dchi,int hoa,int sinh ,int toan) {
		super(soBD, muc, hten, dchi);
		this.hoa = hoa;
		this.sinh = sinh;
		this.toan = toan;
	}
	public thiSinhKhoi_B(thiSinhKhoi_B x) {
		super(x);
		this.hoa = x.hoa;
		this.sinh = x.sinh;
		this.toan = x.toan;
	}
	//Ham nhap
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap diem mon toan: "); toan = sc.nextFloat();
		System.out.println("Nhap diem mon sinh: "); sinh = sc.nextFloat();
		System.out.println("Nhap diem mon hoa: "); hoa = sc.nextFloat();
	}
	//in
	public void in() {
		super.in();
		System.out.println("\tThi sinh khoi B"+"\nDiem toan: "+toan+"\nDiem sinh: "+sinh+"\nDiem hoa: "+hoa);
	}
	public String toString() {
		return super.toString()+"\tThi sinh khoi B"+"\nDiem toan: "+toan+"\nDiem sinh: "+sinh+"\nDiem hoa: "+hoa;
	}
	//Diem tong 3 mon
	public void tongDiem(){
		System.out.println("Tong diem: "+(hoa+sinh+toan));
	}
	//Get&Set
	public float getToan() {
		return toan;
	}
	public void setToan(float toan) {
		this.toan = toan;
	}
	public float getSinh() {
		return sinh;
	}
	public void setSinh(float ly) {
		this.sinh = ly;
	}
	public float getHoa() {
		return hoa;
	}
	public void setHoa(float hoa) {
		this.hoa = hoa;
	}
}
