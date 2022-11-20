package Buoi5;
import Buoi2.Date;
import java.util.Scanner;

public class khachHangVIP extends khachHang{
	private float GiamGia;
	private Date ngayMienGiam;
	//Ham xay dung
	public khachHangVIP() {
		super();
		GiamGia=0;
		ngayMienGiam = new Date();
	}
	public khachHangVIP(float GiamGia,String MaKH,String tenKH,String DiaChi,int soLuong,HoaDon HD[],Date ngayMienGiam) {
		super(MaKH, tenKH, DiaChi, soLuong, HD);
		this.GiamGia=GiamGia;
		this.GiamGia*=(1/100);
		this.ngayMienGiam = new Date(ngayMienGiam);
	}
	public khachHangVIP(khachHangVIP X) {
		super((khachHangVIP) X);
		this.GiamGia=X.GiamGia;
		this.GiamGia*=(1/100);
		this.ngayMienGiam = new Date(X.ngayMienGiam);
	}
	//Ham nhap
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		super.Nhap();
		System.out.print("Nhap ty le giam gia: "); GiamGia = sc.nextFloat();
		GiamGia*=(1/100);
		System.out.println("Nhap ngay mien giam cho khach hang VIP: ");
		ngayMienGiam.EnterDate();
	}
	//Tong tien tren mot khach hang VIP
	public float tongThanhToan() {
		float tong=super.tongThanhToan();
		return tong*GiamGia;
	}
	//Ham in
	public void In() {
		super.In();
		System.out.println("Ty le giam gia cho khach hang VIP la: "+GiamGia+"\nNgay mien giam la: "+ngayMienGiam);
	}
	public String toString() {
		return super.toString()+"\nTy le giam gia cho khach hang VIP la: "+GiamGia+"\nNgay mien giam la:"+ngayMienGiam;
	}
	//Get & Set
	public float getGiamGia() {
		return GiamGia;
	}
	public void setGiamGia(float giamGia) {
		GiamGia = giamGia;
	}
	
}
