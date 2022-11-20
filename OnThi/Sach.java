package OnThi;

import java.util.Scanner;

public class Sach extends TaiLieu{
	private String tacgia;
	private int sotrang;
	//Ham xay dung
	public Sach() {
		super();
		sotrang=0;
		tacgia = new String();
	}
	public Sach(String mtl,String tenNXB,int soBPH,String tacgia,int sotrang) {
		super(mtl, tenNXB, soBPH);
		this.sotrang=sotrang;
		this.tacgia = new String(tacgia);
	}
	public Sach(Sach x) {
		super(x);
		this.sotrang=x.sotrang;
		this.tacgia = new String(x.tacgia);
	}
	//Nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		do {
			System.out.print("Nhap ho ten tac gia: "); tacgia = sc.nextLine();
			if(tacgia.length()<4) {
				System.out.println("\tHo ten cua tac gia it nhat phai 4 ky tu. Xin vui long nhat lai.");
			}
		}while(tacgia.length()<4);
		do {
			System.out.print("Nhap so trang sach: "); sotrang = sc.nextInt();
			if(sotrang<0) {
				System.out.println("\tSo trang sach phai lon hon 0. Vui long nhap lai.");
			}
		}while(sotrang<0);
	}
	//in
	public void in() {
		super.in();
		System.out.println("Ho ten tac gia: "+tacgia);
		System.out.println("So tranh sach: "+sotrang);
	}
	public String toString() {
		return super.toString()+"\nHo ten tac gia: "+tacgia+"\nSo tranh sach: "+sotrang;
	}
	//Get & Set
	public String getTacgia() {
		return tacgia;
	}
	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}
	public int getSotrang() {
		return sotrang;
	}
	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}
}
