package OnThi;

import java.util.Scanner;

public class Bao extends TaiLieu{
	private int ngayPH; // So phat hanh

//Ham xay dung
	public Bao() {
		super();
		ngayPH = 0;
	}
	public Bao(String mtl,String tenNXB,int soBPH,int ngPH) {
		super(mtl, tenNXB, soBPH);
		this.ngayPH = ngPH;
	}

	public Bao(Bao x) {
		super(x);
		ngayPH = x.ngayPH;
	}
	//NHap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		// Kiem tra thang phat hanh
		do {
			System.out.print("Nhap ngay phat hanh: ");
			ngayPH = sc.nextInt();
			if (ngayPH < 1 || ngayPH > 30) {
				System.out.println("\tNgay phat hang khong hop le.Xin vui long nhap lai.");
			}
		} while (ngayPH < 1 || ngayPH > 30);
	}

	// In
	public void in() {
		super.in();
		System.out.println("Ngay phat hanh: " + ngayPH);
	}

	public String toString() {
		return super.toString()+"\nNgay phat hanh: " + ngayPH;
	}
	//Get & Set

	public int getNgayPH() {
		return ngayPH;
	}
	public void setNgayPH(int ngayPH) {
		this.ngayPH = ngayPH;
	}
	
}
