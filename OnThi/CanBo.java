package OnThi;

import java.util.Scanner;

public class CanBo {
	private String hoTen, diaChi;
	private int tuoi, gioiTinh;//Gioi tinh(0:Men ,1:Woman,2:other)
	
	//Ham Xay dung
	public CanBo() {
		hoTen = diaChi = new String();
		tuoi = gioiTinh = 0;
	}
	public CanBo(String HoTen, String dchi, int Tuoi, int sex) {
		this.hoTen = new String(HoTen);
		this.diaChi = new String(dchi);
		this.tuoi = Tuoi;
		this.gioiTinh = sex;
	}
	public CanBo(CanBo x) {
		this.hoTen = new String(x.hoTen);
		this.diaChi = new String(x.diaChi);
		this.tuoi = x.tuoi;
		this.gioiTinh = x.gioiTinh;
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
	//Nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		String N= new String();
		//Kiem tra do dai cua ho va ten
		do {
			System.out.print("Nhap ho va ten: "); this.hoTen = sc.nextLine();
			if(hoTen.length() < 4) {
				System.out.println("\tHo ten it nhat phai 4 ky tu. Xin vui long nhap lai.");
			}
		}while(hoTen.length() < 4);
		System.out.print("Nhap tuoi: "); N = sc.nextLine();
		this.tuoi = KtraNhapInt(N);
		System.out.println("Gioi tinh: (0).Men (1).Woman (2).Other");
		//Kiem tra gioi tinh
		do{
			System.out.print("Nhap gioi tinh cua ban: "); N = sc.nextLine();
			this.gioiTinh = KtraNhapInt(N);
			if(this.gioiTinh!=0 && this.gioiTinh!=1 && this.gioiTinh!=2) {
				System.out.println("\tKhong hop le.Vui long chon lai.");
			}
		}while(this.gioiTinh!=0 && this.gioiTinh!=1 && this.gioiTinh!=2 );
		//Kiem tra do dai dia chi
		do {
			System.out.print("Nhap dia chi: "); this.diaChi = sc.nextLine();
			if(diaChi.length() < 10) {
				System.out.println("\tDia chi it nhat phai 10 ky tu. Xin vui long nhap lai");
			}
		}while(diaChi.length() < 10);
		 
	}
	//In
	public void in() {
		String gt = new String();
		System.out.println("Ho ten: "+hoTen+"\t Tuoi: "+tuoi);
		if(gioiTinh == 0) {
			gt = "Nam";
		}else if(gioiTinh == 1) {
			gt = "Nu";
		}else if(gioiTinh == 2) {
			gt = "Khac";
		}
		System.out.println("Gioi tinh: "+gt);
		System.out.println("Dia chi: "+diaChi);
	}
	public String toString() {
		String S,gt;
		S = gt = new String();
		S+="\nHo ten: "+hoTen+"\t Tuoi: "+tuoi;
		if(gioiTinh == 0) {
			gt = "Nam";
		}else if(gioiTinh == 1) {
			gt = "Nu";
		}else if(gioiTinh == 2) {
			gt = "Khac";
		}
		S+="\nGioi tinh: "+gt;
		S+="\nDia chi: "+diaChi;
		return S;
	}
	//Get & Set
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public int getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
}
