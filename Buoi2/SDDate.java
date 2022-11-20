package Buoi2;

import java.util.Scanner;

public class SDDate {

	public static void main(String[] args) {
		int NamNhuan=0;
		Date ngay1 = new Date();
		ngay1.EnterDate();
		ngay1.hienThiCach1();
		System.out.println("Hiển thị cách 2:");
		System.out.println(ngay1);
		System.out.println("Kiểm tra ngày hợp lệ cách một");
		if(ngay1.kiemTraHopLeCach1(NamNhuan)) {
			System.out.println("Đầu vào hợp lệ.");
			ngay1.NgayKeTiepCach1(NamNhuan);
			ngay1.hienThiCach1();
		}else {
			System.out.println("\tĐầu vào không hợp lệ.");
		}
		System.out.println("Kiểm tra ngày hợp lệ cách hai");
		if(ngay1.kiemTraHopLeCach2()==true) {
			System.out.println("\tĐầu vào hợp lệ.");
			ngay1.ngayKeTiepCach2();
			ngay1.hienThiCach1();
			Date ngay2 = new Date();
			ngay2 =ngay1.congNgay();
			ngay2.hienThiCach1();
		}else {
			System.out.println("\tĐầu vào không hợp lệ.");
		}
	}

}

