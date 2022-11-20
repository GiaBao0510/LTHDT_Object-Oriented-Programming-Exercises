package Buoi5;

import java.util.Scanner;

public class CongTac {
	private nhanVien nvien;
	private String dvi; 	//Don vi
	private int tnien;		//Tham nien cong tac cua nhan vien
	private boolean bche;	//Bien che: true la bien che, false la khong co bien che
	//Ham xay dung
	public CongTac() {
		nvien = new nhanVien();
		dvi = new String();
		tnien =0;
		bche = false;
	}
	public CongTac(nhanVien nhanvien,String donvi,int thamnien,boolean bienche) {
		nvien = new nhanVien(nhanvien);
		dvi = new String(donvi);
		tnien =thamnien;
		bche = bienche;
	}
	public CongTac(CongTac x) {
		nvien = new nhanVien(x.nvien);
		dvi = new String(x.dvi);
		tnien =x.tnien;
		bche = x.bche;
	}
	//Nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		nvien = new nhanVien();
		nvien.nhap();
		System.out.print("Nhap don vi cong tac: "); dvi = sc.nextLine();
		System.out.print("Nhap tham nien cong tac: "); tnien = sc.nextInt();
		int bc;
		do {
			System.out.println("Nhan vien nay co bien che khong: 1.Co - 0.Khong");
			System.out.print("Nhap bien che: "); bc = sc.nextInt();
			if(bc == 1) {
				System.out.println("Co bien che.");
				bche = true;
			}else if(bc == 0) {
				System.out.println("Khong co bien che.");
				bche = false;
			}else {
				System.out.println("Loi! Vui long nhap lai");
			}
		}while(bc !=1 && bc!=0);
	}
	//in 
	public void in() {
		nvien.in();
		System.out.println("Don vi: "+dvi+"\t Tham nien cong tac: "+tnien);
		System.out.println("Bien che: "+bche);
	}
	public String toString() {
		return nvien+"\nDon vi: "+dvi+"\t Tham nien cong tac: "+tnien+"\nBien che: "+bche;
	}
	//Get & Set
	public nhanVien getNvien() {
		return nvien;
	}
	public void setNvien(nhanVien nvien) {
		this.nvien = nvien;
	}
	public String getDvi() {
		return dvi;
	}
	public void setDvi(String dvi) {
		this.dvi = dvi;
	}
	public int getTnien() {
		return tnien;
	}
	public void setTnien(int tnien) {
		this.tnien = tnien;
	}
	public boolean getBche() {
		return bche;
	}
	public void setBche(boolean bche) {
		this.bche = bche;
	}
	//ham main
	public static void main(String[] args) {
		int m;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong nhan vien: "); m = sc.nextInt();
		if(m>0) {
			CongTac ds[] = new CongTac[m];
			for(int i=0;i<m;i++) {
				System.out.println("\t----- Nhap nhan vien thu "+(i+1)+" ------");
				ds[i] = new CongTac();
				ds[i].nhap();
			}
			System.out.println("\t\tDanh sach nhan vien:");
			for(int i=0;i<m;i++) {
				System.out.println("\t-------- Nhan vien thu "+(i+1)+" --------");
				ds[i].in();
			}
			//Tim kiem nhan vien theo ma so
			sc.nextLine();
			String mstim= new String();
			int danhdau=-1;
			System.out.print("Nhap ma so nhan vien can tim: "); mstim = sc.nextLine();
			int l=0,r=m-1;
			while(l<r) {
				if(ds[l].getNvien().getMSNV().compareToIgnoreCase(mstim) == 0) {
					danhdau=l;
					break;
				}
				if(ds[r].getNvien().getMSNV().compareToIgnoreCase(mstim) == 0) {
					danhdau=r;
					break;
				}
				l++;
				r--;
			}
			if(danhdau!=-1) {
				System.out.println("Da tim thay nhan vien co ma so: "+mstim);
				ds[danhdau].in();
			}else {
				System.out.println("Khong co nhan vien nao co ma so nhu vay");
			}
			//Liet ke chuc vu cua nhan vien co trong bien che
			System.out.println("\tCac nhan vien co bien che:");
			for(int i=0;i<m;i++) {
				if(ds[i].getBche() == true) {
					ds[i].in();
				}
			}
		}else {
			System.out.println("\tSo luong cong tac vien chua co ai.");
		}
				
	}
}
