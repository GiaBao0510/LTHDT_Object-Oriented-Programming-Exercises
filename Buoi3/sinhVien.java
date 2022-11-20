package Buoi3;

import java.util.Scanner;

import Buoi2.Date;

public class sinhVien {
	private String mssv,	//Mã số sinh viên
				   hoTen;	
	private Date ngaySinh;
	private int slHocPhan;	//Số lượng học phần đã học
	private String[] tenHP, //Tên học phần đã học
					 diemHP;//Điểm của học phần đã học
	int max = 50;
	//Các hàm xây dụng
	public sinhVien() {
		mssv = hoTen = new String();
		ngaySinh = new Date();
		slHocPhan =0;
		tenHP = diemHP = new String[max];
	}
	public sinhVien(String mssv, String hoTen,Date ngaySinh,int slHocPhan,String tenHP[],String diemHP[]) {
		this.mssv = new String(mssv);
		this.hoTen = new String(hoTen);
		this.ngaySinh = new Date(ngaySinh);
		this.slHocPhan=slHocPhan;
		this.tenHP = this.diemHP = new String[max];
		for(int i=0;i<slHocPhan;i++) {
			this.tenHP[i] = new String(tenHP[i]);
			this.diemHP[i] = new String(diemHP[i]);
		}
	}
	public sinhVien(sinhVien X) { //Phương thức xây dựng sao chép sâu
		this.mssv = new String(X.mssv);
		this.hoTen = new String(X.hoTen);
		this.ngaySinh = new Date(X.ngaySinh);
		this.slHocPhan=X.slHocPhan;
		this.tenHP = this.diemHP = new String[max];
		for(int i=0;i<X.slHocPhan;i++) {
			this.tenHP[i] = new String(X.tenHP[i]);
			this.diemHP[i] = new String(X.diemHP[i]);
		}
	}
	//Hàm nhập
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);		
		System.out.print("Họ & tên: "); hoTen = sc.nextLine();
		System.out.print("Mã số sinh viên: "); mssv = sc.nextLine();
		do {
			System.out.print("\tNgày sinh: \n"); ngaySinh.EnterDate();
			if(ngaySinh.kiemTraHopLeCach1(0)==false) {
				System.out.println("!Lỗi. Ngày nhập không hợp lệ.");
			}
		}while(ngaySinh.kiemTraHopLeCach1(0)==false);
	}
	public void nhapHP() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng học phần: "); slHocPhan = sc.nextInt();
		sc.nextLine();
		diemHP = new String[max];
		tenHP = new String[max];
		for(int i=0;i<slHocPhan;i++) {
			System.out.print("Nhập tên học phần thứ "+(i+1)+": "); 
			tenHP[i] = new String();
			tenHP[i]= sc.nextLine();
			do {
				System.out.print("Nhập điểm học phần thứ "+(i+1)+": ");
				diemHP[i] = new String();
				diemHP[i]= sc.nextLine();
				if(diemHP[i].equalsIgnoreCase("A") &&
						diemHP[i].equalsIgnoreCase("B+") &&
						diemHP[i].equalsIgnoreCase("B") &&
						diemHP[i].equalsIgnoreCase("C+") &&
						diemHP[i].equalsIgnoreCase("C") &&
						diemHP[i].equalsIgnoreCase("D+") &&
						diemHP[i].equalsIgnoreCase("D") &&
						diemHP[i].equalsIgnoreCase("F")) {
					System.out.println("\t!Lỗi. Điểm không hợp lệ vui lòng nhập lại.");
				}
				
			}while(diemHP[i].equalsIgnoreCase("A") &&
					diemHP[i].equalsIgnoreCase("B+") &&
					diemHP[i].equalsIgnoreCase("B") &&
					diemHP[i].equalsIgnoreCase("C+") &&
					diemHP[i].equalsIgnoreCase("C") &&
					diemHP[i].equalsIgnoreCase("D+") &&
					diemHP[i].equalsIgnoreCase("D") &&
					diemHP[i].equalsIgnoreCase("F"));	
		}
	}
	//Hàm in
	public void InThongTin() {
		System.out.println("Họ và tên: "+hoTen.trim()+"\t, Mã số sinh viên: "+mssv);
		System.out.println("Ngày sinh: "+ngaySinh);
		System.out.println("Số lượng môn đã học: "+slHocPhan);
		for(int i=0;i<slHocPhan;i++) {
			System.out.println("Tên học phần: "+tenHP[i]+"\t, Diem: "+ diemHP[i]);
		}
	}
	public String toString() {
		String S = new String();
		S += "\n\t Thông tin sinh viên:"+ "\nHọ và tên: "+hoTen.trim()+"\t, Mã số sinh viên: "+mssv+"\nNgày sinh: "+ngaySinh+"\nSố lượng môn đã học: "+slHocPhan;
		for(int i=0;i<slHocPhan;i++) {
			S+="\nTên học phần: "+tenHP[i]+"\t, Diem: "+diemHP[i];
		}
		return S;
	}
	//tính điểm trung bình
	public float diemTrungBinh() {
		float dtb=0.f;
		System.out.println("\tĐiểm trung bình: ");
		for(int i=0;i<slHocPhan;i++) {
			if(diemHP[i].equalsIgnoreCase("A")) {
				dtb+=4;
			}else if(diemHP[i].equalsIgnoreCase("B+")) {
				dtb+=3.5;
			}else if(diemHP[i].equalsIgnoreCase("B")) {
				dtb+=3.0;
			}else if(diemHP[i].equalsIgnoreCase("C+")) {
				dtb+=2.5;
			}else if(diemHP[i].equalsIgnoreCase("C")) {
				dtb+=2.0;
			}else if(diemHP[i].equalsIgnoreCase("D+")) {
				dtb+=1.5;
			}else if(diemHP[i].equalsIgnoreCase("D")) {
				dtb+=1.0;
			}
			else if(diemHP[i].equalsIgnoreCase("F")) {
				dtb+=0;
			}	
		}
		return dtb/(float)slHocPhan;
	}
	//Thêm học phần cho sinh viên
	public void themHP() {
		if(slHocPhan<max) {
			Scanner sc = new Scanner(System.in);
			String ten,diem;
			ten = diem = new String();
			
			System.out.println("\t Thêm học phần:");
			System.out.println("Nhập tên học phần: "); ten = sc.nextLine();
			System.out.println("Nhập điểm học phần: "); diem = sc.nextLine();
			tenHP[slHocPhan]= new String(ten);
			diemHP[slHocPhan] = new String(diem);
			slHocPhan++;
		}
		else {
			System.out.println("Số lượng học phần đã đầy");
		}
	}
	//Xóa học phần
	public void xoaHP() {
		String hpxoa = new String();
		int vitri=0;
		System.out.println("\t Xóa học phần:");
		Scanner sc = new Scanner(System.in);	
		System.out.println("Nhập tên học phần cần xóa: "); hpxoa = sc.nextLine();
		for(vitri=0;vitri<=slHocPhan;vitri++) {
			if(tenHP[vitri].equalsIgnoreCase(hpxoa)== true) {
				break;
			}
		}
		if(vitri<slHocPhan) {
			for(int j=vitri;j<slHocPhan;j++) {
				tenHP[j]=tenHP[j+1];
				diemHP[j]= diemHP[j+1];
			}
			slHocPhan--;
		}else {
			System.out.println("Không tìm thấy học phần cần xóa");
		}
	}
	//Get 
	public String getHoTen() {
		return hoTen;
	}
	public String getMSSV() {
		return mssv;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public String getEmail() {
		return " ";
	}
	
	//Set
	public void setHoTen(String ht) {
		hoTen = new String(ht);
	}
	public void setMSSV(String ms) {
		mssv = new String(ms);
	}
	public void setNgaySinh(Date NS) {
		ngaySinh = new Date(NS);
	}
}

