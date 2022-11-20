package OnThi;

import java.util.Scanner;

public class TapChi extends TaiLieu{
	private int soPH,		//So phat hanh
				thangPH;	//Thang phat hanh
	//Ham xay dung
	public TapChi() {
		super();
		soPH = thangPH =0;
	}
	public TapChi(String mtl,String tenNXB,int soBPH,int soPH,int thngPH) {
		super(mtl, tenNXB, soBPH);
		this.soPH = soPH;
		this.thangPH = thngPH;
	}
	public TapChi(TapChi x) {
		super(x);
		soPH = x.soPH;
		thangPH = x.thangPH;
	}
	//NHap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		//Kiem tra so phat hanh
		do {
			System.out.print("Nhap so phat hanh: "); soPH = sc.nextInt();
			if(soPH<0) {
				System.out.println("\tSo phat hanh phai lon hon 0.Xin vui long nhap lai.");
			}
		}while(soPH<0);
		//Kiem tra thang phat hanh
		do {
			System.out.print("Nhap thang phat hanh: "); thangPH = sc.nextInt(); 
			if(thangPH<1 || thangPH>12) {
				System.out.println("Thang phat hang khong hop le.Xin vui long nhap lai.");
			}
		}while(thangPH<1 || thangPH>12);
		
	}
	//In
	public void in() {
		super.in();
		System.out.println("So phat hanh: "+soPH+"\nThang phat hanh: "+thangPH);
	}
	public String toString() {
		return super.toString()+"\nSo phat hanh: "+soPH+"\nThang phat hanh: "+thangPH;
	}
	//Get&Set
	public int getSoPH() {
		return soPH;
	}
	public void setSoPH(int soPH) {
		this.soPH = soPH;
	}
	public int getThangPH() {
		return thangPH;
	}
	public void setThangPH(int thangPH) {
		this.thangPH = thangPH;
	}
	
}
