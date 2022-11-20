package Buoi5;
import java.util.Scanner;

import Buoi2.Date;
public class HoaDon {
	private String maSo,tieuDe,hoten;
	private Date ngayThanhToan;
	private ChiTiet chiTiet[];
	private int soLuong; 
	//Ham xay dung
	public HoaDon() {
		maSo = tieuDe = hoten = new String();
		ngayThanhToan = new Date();
		soLuong = 0;
		chiTiet = new ChiTiet[soLuong];
	}
	public HoaDon(String maSo,String tieuDe,String hoten,Date ngayThanhToan,int soLuong,ChiTiet chiTiet[]) {
		this.maSo = new String(maSo);
		this.tieuDe = new String(tieuDe);
		this.hoten = new String(hoten);
		this.ngayThanhToan = new Date(ngayThanhToan);
		this.soLuong = soLuong;
		this.chiTiet = new ChiTiet[soLuong];
		for(int i=0;i<this.soLuong;i++) {
			this.chiTiet[i] = new ChiTiet(chiTiet[i]);
		}
	}
	public HoaDon(HoaDon X) {
		this.maSo = new String(X.maSo);
		this.tieuDe = new String(X.tieuDe);
		this.hoten = new String(X.hoten);
		this.ngayThanhToan = new Date(X.ngayThanhToan);
		this.soLuong = X.soLuong;
		this.chiTiet = new ChiTiet[this.soLuong];
		for(int i=0;i<this.soLuong;i++) {
			this.chiTiet[i] = new ChiTiet(X.chiTiet[i]);
		}
	}
	//Ham nhap
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so: "); maSo = sc.nextLine();
		System.out.print("Nhap tieu de: "); tieuDe = sc.nextLine();
		System.out.print("Nhap ho ten nguoi thanh toan: "); hoten = sc.nextLine();
		ngayThanhToan.EnterDate();
		System.out.println("Nhap so luong loai hang hoa: "); soLuong = sc.nextInt();
		sc.nextLine();
		if(soLuong > 0) {
			chiTiet = new ChiTiet[soLuong];
			for(int i=0;i<soLuong;i++) {
				System.out.println("-----------\tLoai "+(i+1)+" \t-------------");
				chiTiet[i] = new ChiTiet();
				chiTiet[i].Nhap();
			}
		}else {
			System.out.println("\tVi so luong loai hang nho hon 0. Nen khong the thuc thi");
		}
	}
	//Tinh tien
	public float thanhTien() {
		if(soLuong>0) {
			float tong=0;
			for(int i=0;i<soLuong;i++) {
				tong+=chiTiet[i].tongDonGia();
			}
			return tong;
		}else {
			return 0f;
		}
	}
	//Ham in
	public void In() {
		System.out.println("\t\tQuan "+tieuDe);
		System.out.println("Nguoi thanh toan: "+hoten+"\t\t.Ma so: "+maSo);
		System.out.print(ngayThanhToan);
		System.out.println("So luong loai hang: "+soLuong);
		if(soLuong>0) {
			for(int i =0 ;i<soLuong;i++) {
				System.out.println("\t\tLoai "+(i+1)+":");
				System.out.print(chiTiet[i]);
			}
			System.out.println("\nTong tien can phai tra la: "+thanhTien());
		}
	}
	public String toString() {
		String S = new String();
		S+= "\t\tQuan "+tieuDe;
		S+= "\nNguoi thanh toan: "+hoten+"\t\t.Ma so: "+maSo;
		S+= "\nSo luong loai hang: "+soLuong;
		if(soLuong>0) {
			for(int i =0 ;i<soLuong;i++) {
				S+=("\n\t\tLoai "+(i+1)+":");
				S+=(chiTiet[i]);
			}
			S+="\nTong tien can phai tra la: "+thanhTien();
		}
		return S;
	}
	//Get & Set
	public String getMaSo() {
		return maSo;
	}
	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}
	public String getTieuDe() {
		return tieuDe;
	}
	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public Date getNgayThanhToan() {
		return ngayThanhToan;
	}
	public void setNgayThanhToan(Date ngayThanhToan) {
		this.ngayThanhToan = ngayThanhToan;
	}
	public ChiTiet[] getChiTiet() {
		return chiTiet;
	}
	public void setChiTiet(ChiTiet[] chiTiet) {
		this.chiTiet = chiTiet;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
}
