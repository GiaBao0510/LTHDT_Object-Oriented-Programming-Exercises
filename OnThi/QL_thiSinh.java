package OnThi;

import java.util.Scanner;

public abstract class QL_thiSinh {
	private int soBD,			//so bao danh
				muc; 			//Muc uu tien
	private String hten,		//Ho ten
					dchi;		//Dia chi
	//Ham xay dung
	public QL_thiSinh(){
		hten = dchi = new String();
		soBD = muc=0;
	}
	public QL_thiSinh(int soBD,int muc,String hten,String dchi) {
		this.hten = new String(hten);
		this.dchi = new String(dchi);
		this.soBD = soBD;
		this.muc = muc;
	}
	public QL_thiSinh(QL_thiSinh X) {
		this.hten = new String(X.hten);
		this.dchi = new String(X.dchi);
		this.soBD = X.soBD;
		this.muc = X.muc;
	}
	//Ham nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so bao danh: "); soBD = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap ho va ten: "); hten = sc.nextLine();
		System.out.print("Nhap muc uu tien: "); muc = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap dia chi: "); dchi = sc.nextLine();
	}
	//Ham in
	public void in() {
		System.out.println("Ho ten: "+hten+"\t .So bao danh: "+soBD);
		System.out.println("Muc uu tien: "+muc);
		System.out.println("Dia chi: "+dchi);
	}
	public String toString() {
		return "Ho ten: "+hten+"\t .So bao danh: "+soBD+"\nMuc uu tien: "+muc+"\nDia chi: "+dchi;
	}
	//Get&Set
	public int getSoBaoDanh() {
		return soBD;
	}
	public int getMucUuTien() {
		return muc;
	}
	public String getHoTen() {
		return hten;
	}
	public String getDiaChi() {
		return dchi;
	}
	public void setSoBaoDanh(int soBD) {
		this.soBD = soBD;
	}
	public void setMucUuTien(int muc) {
		this.muc = muc;
	}
	public void setHoTen(String hten) {
		this.hten = new String(hten);
	}
	public void setDiaChi(String dchi) {
		this.dchi = new String(dchi);
	}
	//Phuong thuc truu tuong Tong diem
	public abstract void tongDiem();
}
