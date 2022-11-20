package Buoi4;
import java.util.Scanner;

import Buoi3.sinhVien;
import Buoi2.Date;
public class sinhVienCNTT extends sinhVien{
	private String taiKhoan,matKhau,gmail,major;
	//Các hàm xây dựng
	public sinhVienCNTT() {
		super();/*Bị nạp đè*/
		taiKhoan = matKhau = gmail = major =new String();
	}
	public sinhVienCNTT(String mssv,String hoten,Date ngaySinh,int soLuongHP,String tenHP[],String diemHP[],String taiKhoan,String matKhau,String gmail,String major) {
		super(mssv,hoten,ngaySinh,soLuongHP,tenHP,diemHP);/*Bị nạp đè*/
		this.taiKhoan = taiKhoan;
		this.matKhau= matKhau;
		this.gmail = gmail;
		this.major = major;
	}
	public sinhVienCNTT(sinhVienCNTT X) { //Phương thức xây dựng sao chép
		super((sinhVien)X);/*Bị nạp đè*/
		taiKhoan = X.taiKhoan;
		matKhau = X.matKhau;
		gmail = X.gmail;
		major = X.major;
	}
	//Hàm nhập
	public void nhapThongTin() {
		super.nhapThongTin();/*Bị nạp đè*/
		super.nhapHP();/*Bị nạp đè*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your account: "); taiKhoan = sc.nextLine();
		System.out.println("Enter your Gmail: "); gmail = sc.nextLine();
		System.out.println("Enter your major: "); major = sc.nextLine();
		System.out.println("Enter your password: "); matKhau = sc.nextLine();
	}
	//Hàm in
	public void InThongTin() {
		super.InThongTin();
		System.out.println("Tài khoản: "+taiKhoan);
		System.out.println("Gmail: "+gmail);
		System.out.println("Chuyên ngành: "+major);
	}
	public String toString() {
		return (super.toString()+"\n"+"Tài khoản: "+taiKhoan+"\n"+"Gmail: "+gmail+"\n"+"Chuyên ngành: "+major);
	}
	//Đổi mật khẩu
	public void doiMatKhau() {
		Scanner sc = new Scanner(System.in);
		String pw = new String();
		System.out.println("\t Thay đổi mật khẩu: ");
		System.out.print("Nhập lại mật khẩu cũ: "); pw = sc.nextLine();
		if(pw.compareTo(matKhau) == 0) {
			do {
				System.out.print("Nhập mới: "); pw = sc.nextLine();
				if(pw.compareTo(matKhau) == 0) {
					System.out.println("Lỗi! Vì mật khẩu vừa nhập trùng với mật khẩu cũ. Vui lòng nhập lại");
				}else {
					matKhau = new String(pw);
					System.out.println("Thay đổi mật khẩu thành công.");
					break;
				}
			}while(pw.compareTo(matKhau) == 0);
		}else {
			System.out.println("Lỗi! Không khớp mật khẩu cũ.");
		}
			
	}
	//Get & Set
	public String getTaiKhoan() {
		return taiKhoan;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public String getChuyenNganh() {
		return major;
	}
	public String getEmail() {
		super.getEmail();/*Bị nạp đè*/
		return gmail;
	}
	public void setTaiKhoan(String x) {
		taiKhoan = new String(x);
	}
	public void setMatKhau(String x) {
		matKhau = new String(x);
	}
	public void setChuyenNganh(String x) {
		major = new String(x);
	}
	public void setEmail(String x) {
		gmail = new String(x);
	}
}
