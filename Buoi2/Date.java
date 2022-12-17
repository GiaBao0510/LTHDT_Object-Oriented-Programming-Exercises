package Buoi2;

import java.util.Scanner;

public class Date {
//Thuộc tính
	private int day, month, year;

//Phương thức
	public Date(){	// Hàm mặc nhiên
		this.day=1;
		this.month=1;
		this.year=1;
	}
	public Date(int d,int m,int y) {	//Ham xay dung co doi so
		this.day=d;
		this.month=m;
		this.year=y;
	}
	public Date(Date X) { //Hàm xây dựng sao chép
		day = X.day;
		month = X.month;
		year = X.year;
	}
	//Hàm không mặc nhiên
	public void MyDate(int d, int m, int y) {	//Ham gan
		this.day = d;
		this.month = m;
		this.year = y;
	}
	// Hiển thị ra màn hình
	public void hienThiCach1() {
		System.out.println("Ngày " + this.day + "/tháng " + this.month + "/Năm " + this.year);
	}

	public String toString() {
		return ("\nNgày " + this.day + "/tháng " + this.month + "/Năm " + this.year);
	}

	// Hàm kiểm tra đầu vào có hợp lệ hay không
	public int Nhap(String X, int n) {
		Scanner sc = new Scanner(System.in);
		do {
			try {
				n = Integer.parseInt(X);
			} catch (Exception k) {
				System.out.println("\tLỗi! Vui lòng nhập lại.");
				n = Integer.MIN_VALUE;
					X = sc.nextLine();
			}
		} while (n == Integer.MIN_VALUE);
		return n;
	}
	// Kiểm tra tính hợp lệ cách 1
	public boolean kiemTraHopLeCach1(int namNhuan) {
		if (this.year >= 1900) {
			// năm nhuận
			if ((this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0)) {
				if (this.month >= 1 && this.month <= 12) {
					if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8|| this.month == 10 || this.month == 12) {
						if (this.day < 1 || this.day > 31) {
							return false;
						}
					} else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month==11) {
						if (this.day < 1 || this.day > 30) {
							return false;
						}
					} else if (this.month == 2) {
						if (this.day < 1 || this.day > 29) {
							return false;
						}
					}
				} else {
					return false;
				}
				System.out.println("Năm nhuận");
				namNhuan=1;
			}
			//Năm không nhuận
			else {
				if (this.month >= 1 && this.month <= 12) {
					if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8|| this.month == 10 || this.month == 12) {
						if (this.day < 1 || this.day > 31) {
							return false;
						}
					} else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month==11) {
						if (this.day < 1 || this.day > 30) {
							return false;
						}
					} else if (this.month == 2) {
						if (this.day < 1 || this.day > 28) {
							return false;
						}
					}
				} else {
					return false;
				}
				System.out.println("Năm không nhuận");
			}
		} else {
			return false;
		}
		return true;
	}
	//Tính ngày tiếp theo cách 1
	public void NgayKeTiepCach1(int namNhuan) {
		System.out.println("Ngày kế tiếp");
		this.day+=1;
		if(this.kiemTraHopLeCach1(namNhuan)!=true) {
			this.day=1;
			this.month++;
			if(this.kiemTraHopLeCach1(namNhuan)!=true) {
				this.month=1;
				this.year++;
			}
		}
	}
	//Kiểm tra ngày hợp lệ cách 2
		public boolean kiemTraHopLeCach2() {
			boolean kq = false;
			int maxMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};
			maxMonth[1]=28;
			if((this.year%4==0 && this.year%100!=0)||(this.year%400==0)) {
				maxMonth[1]=29;
			}
			if(this.year>1990 && (this.month>=1 && this.month<=12) && (this.day>0 && this.day <= maxMonth[this.month-1])) {//Kiểm tra hợp lệ
				kq = true;
			}
			return kq;
		}
	//NHập ngày
		public void EnterDate() {
			Date T = new Date();
			Scanner sc = new Scanner(System.in);
			do {
				String test;
			    int n = 0;
				System.out.print("Nhập ngày: ");
				test = sc.nextLine();
				this.day = T.Nhap(test, n);
				System.out.print("Nhập tháng: ");
				test = sc.nextLine();
				this.month = T.Nhap(test, n);
				System.out.print("Nhập năm: ");
				test = sc.nextLine();
				this.year = T.Nhap(test, n);
				if(this.kiemTraHopLeCach2() == false) { //Kiem tra dieu kien
					System.out.println("\tNgay vua nhap khong hop le!!!");
				}
			}while(this.kiemTraHopLeCach2() == false);
		}
		//Ngày kế tiếp cách 2
		public void ngayKeTiepCach2() {
			this.day++;
			if(this.kiemTraHopLeCach2()==false) {
				this.day=1;
				this.month++;
				if(this.kiemTraHopLeCach2()==false) {
					this.month=1;
					this.year++;
				}	
			}
		}
		//Cộng ngày 
		public Date congNgay() {
			int n;
			Scanner sc=new Scanner(System.in);
			System.out.println("Nhập số ngày cộng vào Date: "); n=sc.nextInt();
			Date A = new Date(this.day,this.month,this.year);
			for(int i=1;i<=n;i++) {
				A.ngayKeTiepCach2();
			}
			return A;
		}
		//Get & Set
		public int getDay() {
			return day;
		}
		public int getMonth() {
			return month;
		}
		public int getYear() {
			return year;
		}
		public void setDay(int x) {
			day = x;
		}
		public void setMonth(int x) {
			month = x;
		}
		public void setYear(int x) {
			day = x;
		}
}

