package Buoi3;

import java.util.Scanner;
public class Gach {
	private String maSo,	//Mã số
				   mau;		//Mẫu
	private int slVien, 	//Số lượng viên gạch trong 1 hộp
				Cdai, 		//Chiều dãi mỗi viên/cm
				Cngang;		//Chiều ngang mỗi viên/cm
	private long giaBan;	//Giá bán mỗi hộp
//các phương thức
	//Hàm xây dựng
	public Gach() { //Hàm xây dung mặc nhiên
		maSo = mau = new String();
		slVien = Cdai = Cngang =0;
		giaBan = 0;
	}
	public Gach(String maSo,String mau, int slVien, int Cdai, int Cngang, long giaBan) {//Hàm xây dựng có đối số
		this.maSo = new String(maSo);
		this.mau = new String(mau);
		this.slVien = slVien;
		this.Cdai = Cdai;
		this.Cngang = Cngang;
		this.giaBan = giaBan;
	}
	public Gach(Gach X) {	//Hàm xây dựng sao chép sâu
		maSo = new String(X.maSo);
		mau = new String(X.mau);
		slVien = X.slVien;
		Cdai =X.Cdai;
		Cngang = X.Cngang;
		giaBan = X.giaBan;
	}
	//Hàm nhập thông tin
	public void nhapThongTin() {
		System.out.println("\tNhập thông tin: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã số: "); this.maSo = sc.nextLine();
		System.out.print("Nhập mẫu gạch: "); this.mau = sc.nextLine();
		System.out.print("Nhập số lượng viên gạch trong một hộp: "); slVien=sc.nextInt();
		System.out.print("Nhập chiều dài(cm): "); Cdai=sc.nextInt();
		System.out.print("Nhập chiều rộng(cm): "); Cngang=sc.nextInt();
		System.out.print("Nhập giá bán một hộp: "); giaBan=sc.nextLong();
	}
	//Hàm in thông tin
	public void InThongTin() {
		System.out.println("\tIn thông tin: ");
		System.out.println("Mã số: "+maSo+"\t,Mẫu: "+mau);
		System.out.println("Số lượng viên gạch: "+slVien);
		System.out.println("Chiều dài: "+Cdai+"\t,Chiều ngang: "+Cngang);
		System.out.println("Giá Bán một hộp: "+giaBan);
	}
	public String toString() {
		return "Mã số: "+maSo+"\t,Mẫu: "+mau+"\n"+"Số lượng viên gạch: "+slVien+"\n"+"Chiều dài: "+Cdai+"\t,Chiều ngang: "+Cngang+"\n"+"Giá Bán một hộp: "+giaBan;
	}
	//Hàm tính lẻ ra giá bán lẻ một viên gạch(giá bán lẻ sẽ cao hơn bán nguyên hộp là 20%.)
	public float giaBanLe() {
		return (float)((1/(float)slVien)*(float)giaBan* (1+0.2));
	}
	//Hàm tính ra diện tích nền tối đa có thể lót được của hộp gạch
	public int dienTichNen() {
		return slVien * Cdai * Cngang;
	}
	//Hàm tính ra số lượng hộp gạch ít nhất cần có khi lót 1 nền có diện tích là D*N( Quy định là lót đúng chiều gạch, không cho xoay viên gạch)
	public int soLuongHop(int D,int N) {
		int SLV = (int)((D*N*100)/*Đổi sang cm*//(Cdai*Cngang));
		if(((D*N*100)%(Cdai*Cngang))!=0) {
			SLV++;
		}
		int SLH=0;
		while(SLV>0) {
			SLV-=slVien;
			SLH++;
		}
		//return SLH = SLV/slVien;
		return SLH;
	}
	//Ham Get
	public int getSLVien() {
		return slVien;
	}
	public int chieuDai() {
		return Cdai;
	}
	public int chieuNgang() {
		return Cngang;
	}
	public long getGiaBan() {
		return giaBan;
	}
	public String getMaSo() {
		return maSo;
	}
	public String getMau() {
		return mau;
	}
}