package Buoi5;

import java.util.Scanner;

public class khachHang {
	private String MaKH, tenKH,DiaChi;
	private int soLuong;
	private HoaDon HD[];
	//Ham xay dung
	public khachHang() {
		soLuong=0;
		MaKH = tenKH = DiaChi = new String();
		HD = new HoaDon[soLuong];
	}
	public khachHang(String MaKH,String tenKH,String DiaChi,int soLuong,HoaDon HD[]) {
		this.MaKH = new String(MaKH) ;
		this.tenKH = new String(tenKH);
		this.DiaChi = new String(DiaChi);
		this.soLuong = soLuong;
		this.HD = new HoaDon[soLuong];
		for(int i=0;i<this.soLuong;i++) {
			HD[i] = new HoaDon(HD[i]);
		}
	}
	public khachHang(khachHang X) {
		this.MaKH = new String(X.MaKH) ;
		this.tenKH = new String(X.tenKH);
		this.DiaChi = new String(X.DiaChi);
		this.soLuong = X.soLuong;
		this.HD = new HoaDon[X.soLuong];
		for(int i=0;i<this.soLuong;i++) {
			HD[i] = new HoaDon(X.HD[i]);
		}
	}
	//Nhap
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho & ten: "); tenKH = sc.nextLine();
		System.out.print("Ma khach hang: "); MaKH = sc.nextLine();
		System.out.print("Dia chi: "); DiaChi = sc.nextLine();
		System.out.println("Nhap so luong hoa don: "); soLuong = sc.nextInt();
		if(soLuong > 0) {
			HD = new HoaDon[soLuong];
			for(int i=0;i<soLuong;i++) {
				System.out.println("\tHoa don thu "+(i+1)+": ");
				HD[i] = new HoaDon();
				HD[i].Nhap();
			}
		}else {
			System.out.println("Vay khach hang khong co hoa don nao.");
		}
	}
	//Tong tien tren mot khach hang
	public float tongThanhToan() {
		float tong=0;
		for(int i= 0;i<soLuong;i++) {
			tong+= HD[i].thanhTien();
		}
		return tong;
	}
	//In
	public void In() {
		System.out.println("Ho ten: "+tenKH+"\t.Ma khach hang: "+MaKH+"\nDia chi: "+DiaChi);
		for(int i=0;i<soLuong;i++) {
			HD[i].In();
		}
	}
	public String toString() {
		String S = new String();
		S+= "\nHo ten: "+tenKH+"\t.Ma khach hang: "+MaKH+"\nDia chi: "+DiaChi;
		for(int i=0;i<soLuong;i++) {
			S+=HD[i];
		}
		return S;
	}
	//Get&Set
	public String getMaKH() {
		return MaKH;
	}
	public void setMaKH(String maKH) {
		MaKH = maKH;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public HoaDon[] getHD() {
		return HD;
	}
	public void setHD(HoaDon[] hD) {
		HD = hD;
	}
}
