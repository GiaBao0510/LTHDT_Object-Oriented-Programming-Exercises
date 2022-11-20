package OnThi;

import java.util.Scanner;

public class CongNhan extends CanBo{
	private int bac;
	//Ham xay dung
	public CongNhan() {
		super();
		bac=1;
	}
	public CongNhan(String HoTen, String dchi, int Tuoi, int sex,int rank) {
		super(HoTen, dchi, Tuoi, sex);
		bac=rank;
	}
	public CongNhan(CongNhan x) {
		super(x);
		bac=x.bac;
	}
	//Ham Nhap
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap cap bac: "); this.bac = sc.nextInt();
			if(bac<1 || bac>10) {
				System.out.println("\tCap bac vua nhap khong hop le. Xin vui long nhap lai");
			}
		}while(bac<1 || bac>10);
	}
	//Ham in
	public void in() {
		super.in();
		System.out.println("Bac cua cong nhan: "+bac);
	}
	public String toString() {
		String S = new String();
		S+= super.toString();
		S+="\nBac cua cong nhan: "+bac;
		return S;
	}
	//Get & Set 
	public int getBac() {
		return bac;
	}
	public void setBac(int bac) {
		this.bac = bac;
	}
}
