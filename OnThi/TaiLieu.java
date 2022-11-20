package OnThi;

import java.util.Scanner;

public class TaiLieu {
	private String mtl,		//Ma tai lieu la ma duy nhat
				   tenNXB;	//Ten nha xuat ban
	private int soBPH;		//So ban phat hanh
	//Ham xay dung
	public TaiLieu() {
		mtl = tenNXB = new String();
		soBPH =0;
	}
	public TaiLieu(String mtl,String tenNXB,int soBPH) {
		this.mtl = new String(mtl);
		this.tenNXB = new String(tenNXB);
		this.soBPH = soBPH;
	}
	public TaiLieu(TaiLieu x) {
		this.mtl = new String(x.mtl);
		this.tenNXB = new String(x.tenNXB);
		this.soBPH = x.soBPH;
	}
	//Kiem tra dau vao so nguyen
	public int KtraNhapInt(String S) {
		Scanner sc = new Scanner(System.in);
		int kq=0;
		do {
			try {
				kq = Integer.parseInt(S); //Doi chuoi thanh so nguyen
			}catch(Exception e) { //Neu doi khong ra so nguyen thi yeu cau nhap lai 
				kq = Integer.MIN_VALUE;
				System.out.println("\tNhap sai! Vui long nhap lai.");
				System.out.print("Nhap lai: "); S = sc.nextLine();
			}
		}while(kq == Integer.MIN_VALUE);
		return kq;
	}
	//Ham nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		//Kiem tra do dai ma tai lieu phai tren 5 ky tu.
		do {
			System.out.print("Nhap ma tai lieu: "); this.mtl = sc.nextLine();
			if(mtl.length()<5) {
				System.out.println("\nMa tai lieu it nhat phai co 5 ky tu. Xin vui long nhap lai.");
			}
		}while(mtl.length()<5);
		do {
			System.out.print("Nhap ten nha xuat ban: "); this.tenNXB = sc.nextLine();
			if(tenNXB.length()<2) {
				System.out.println("\nTen nha xuat ban it nhat 2 ky tu. Xin vui long nhap lai.");
			}
		}while(tenNXB.length()<2);
		String S = new String();
		//Kiem tra so ban phat hanh
		do {
			System.out.print("Nhap so ban phat hanh: "); S =sc.nextLine();
			soBPH = KtraNhapInt(S);
			if(soBPH<0) {
				System.out.println("So ban phat hanh phai lon hon khong");
			}
		}while(soBPH<0);
	}
	//Ham in
	public void in() {
		System.out.println("Ma tai lieu: "+mtl+"\t Nha xuat ban: "+tenNXB);
		System.out.println("So ban phat hanh: "+soBPH);
	}
	public String toString() {
		return "\nMa tai lieu: "+mtl+"\t Nha xuat ban: "+tenNXB+"\nSo ban phat hanh: "+soBPH;
	}
	//Ham get & set
	public String getMtl() {
		return mtl;
	}
	public void setMtl(String mtl) {
		this.mtl = mtl;
	}
	public String getTenNXB() {
		return tenNXB;
	}
	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}
	public int getSoBPH() {
		return soBPH;
	}
	public void setSoBPH(int soBPH) {
		this.soBPH = soBPH;
	}
}
