package Hoc_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Example1 {
	// 1.Them cac gia tri phan tu vao cuoi danh sach mang (.add(object))
	public void ThemPhanTuDanhSach(ArrayList<String> X) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu can muon them vao danh sach mang: ");
		n = sc.nextInt();
		if (n > 0) {
			String str = new String();
			sc.nextLine();
			for (int i = 0; i < n; i++) {
				System.out.print("Nhap gia tri phan tu thu " + (i + 1) + " : ");
				str = sc.nextLine();
				X.add(str); // Them gia tri vao cuoi danh sach mang
			}
		} else {
			System.out.println("\tKhong co phan tu nao can them vao danh sach mang.");
		}
	}

	// 2.In cac phan tu trong danh sach mang
	public void InDanhSach(ArrayList<String> X) {
		System.out.println("\tCac phan tu trong danh sach mang: ");
		int i = 0;
		for (String string : X) {
			System.out.println("[" + (i + 1) + "]" + string);
			i++;
		}
		// hoac System.out.println(X);
	}

	// 3.Loai phan tu trong danh sach mang (.remove(object) //Index )
	public void loaiTheoViTriPhanTu(ArrayList<String> X) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vi tri can muon xoa trong danh sach mang: ");
		n = sc.nextInt();
		if (n < 0 || n > X.size()) {
			System.out.println("Vi tri khong hop le");
		} else {
			System.out.println("Xoa thanh cong.");
			X.remove(n - 1); // Loai bo phan tu theo vi tri trong danh sach mang
		}
	}

	// 4.Loai phan tu trong danh sach mang (.remove(object) //Value )
	public void loaiTheoGiaTriPhanTu(ArrayList<String> X) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri can muon xoa trong danh sach mang: ");
		s = sc.nextLine();
		if (X.contains(s) == true) {// Tim kiem 1 gia tri nao do co o trong Arraylist khong
			System.out.println("Xoa thanh cong.");
			X.remove(s);
		} else {
			System.out.println("Khong tim thay gia tri can xoa");
		}
	}

	// 5.Tim kiem phan tu trong Arraylist (.contains(object))
	public void timKiemGiaTriPhanTu(ArrayList<String> X) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri can tim trong danh sach mang: ");
		s = sc.nextLine();
		if (X.contains(s) == true) {
			System.out.println("Tim thay gia tri: " + s+".Tai vi tri: "+(X.indexOf(s)+1)/*Tim kiem tu trai sang phai*/);
		} else {
			System.out.println("Khong tim thay gia tri " + s);
		}
	}

	// 6.In do dai trong Arratlis (.size())
	public int doDaiDanhSachMang(ArrayList<String> X) {
		return X.size();
	}

	// 7.Cap nhat|hay doi gia tri cua phan u tai vi tri nao do trong Arraylist(.set(index,value))
	public void capNhatPhanTuTrongDanhSAchMang(ArrayList<String> X) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vi tri can cap nhat: ");
		n = sc.nextInt();
		if (n < 0 || n > X.size()) {
			System.out.println("Vi tri khong hop le.");
		} else {
			String S = new String();
			sc.nextLine();
			System.out.print("Nhap gia tri can cap nhat: ");
			S = sc.nextLine();
			X.set(n - 1, S);// Cap nhat gia tri tai vi tri n-1 trong Arraylist
		}
	}
	//8. Xoa that ca phan tu trong Arraylist (.clear())
	public void xoaTatCaDuLieuTrongArrayList(ArrayList<String> X) {
		if(X.isEmpty()/*Kiem tra xem arraylist co rong khong*/ == true) {
			System.out.println("Danh sach rong khonf the xoa.");
		}else {
			X.clear();//Xoa toan bo du lieu
		}
	}
	public static void main(String[] args) {
		Example1 X = new Example1();
		ArrayList<String>/* Kieu cua danh sach mang */ listString/* Ten doi tuong danh sach mang */;
		listString = new ArrayList<String>(); // Khoi tao danh sach mang kieu chuoi

	}
}
