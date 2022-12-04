package OnThi;

import java.util.Scanner;

public class thiSinhKhoi_C extends QL_thiSinh{
	private float van,su,dia; //diem cac mon tren la so thuc
	//Ham xay dung
	public thiSinhKhoi_C() {
		super();
		dia = su = van =0;
	}
	public thiSinhKhoi_C(int soBD,int muc,String hten,String dchi,int hoa,int sinh ,int toan) {
		super(soBD, muc, hten, dchi);
		this.dia = hoa;
		this.su = sinh;
		this.van = toan;
	}
	public thiSinhKhoi_C(thiSinhKhoi_C x) {
		super(x);
		this.dia = x.dia;
		this.su = x.su;
		this.van = x.van;
	}
	//Ham nhap
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap diem mon van: "); van = sc.nextFloat();
		System.out.println("Nhap diem mon su: "); su = sc.nextFloat();
		System.out.println("Nhap diem mon dia: "); dia = sc.nextFloat();
	}
	//in
	public void in() {
		super.in();
		System.out.println("\tThi sinh khoi C"+"\nDiem van: "+van+"\nDiem su: "+su+"\nDiem dia: "+dia);
	}
	public String toString() {
		return super.toString()+"\tThi sinh khoi C"+"\nDiem van: "+van+"\nDiem su: "+su+"\nDiem dia: "+dia;
	}
	//Diem tong 3 mon
	public void tongDiem(){
		System.out.println("Tong diem: "+(dia+su+van));
	}
	//Get&Set
	public float getVan() {
		return van;
	}
	public void setVan(float toan) {
		this.van = toan;
	}
	public float getSu() {
		return su;
	}
	public void setSu(float ly) {
		this.su = ly;
	}
	public float getDia() {
		return dia;
	}
	public void setDia(float hoa) {
		this.dia = hoa;
	}
}
