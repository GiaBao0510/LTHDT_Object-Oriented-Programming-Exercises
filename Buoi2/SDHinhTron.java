package Buoi2;

import java.util.Scanner;

public class SDHinhTron {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng hình tròn: ");
		n = sc.nextInt();
		if (n > 0) {
			hinhTron ds[] = new hinhTron[n];
			for (int i = 0; i < n; i++) {
				ds[i] = new hinhTron();
				System.out.println("\tNhập thông tin hình tròn thứ " + (i + 1) + " : ");
				ds[i].nhapHinhTron();
			}
			for (int i = 0; i < n; i++) {
				System.out.println("\tThông tin hình tròn thứ " + (i + 1) + " : ");
				ds[i].hienThi();
				ds[i].dienTich_ChuVi();
				System.out.println("-----------------------------------------");
			}
		} else {
			System.out.println("Lỗi! vì " + n + " < 1 .Nên không thể thực thi.");
		}
	}
}

