package OnThi;

import java.util.Scanner;

public class testDS_SinhVien {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SinhVien SV = new SinhVien(); // Doi tuong sinh vien
		DanhSachSinhVien DSSV = new DanhSachSinhVien();// Mang dong
		testDS_SinhVien Ob = new testDS_SinhVien(); // Doi tuong testDS_sinhvien

		String str = new String();
		int chon = -1;
		do {
			do {
				System.out.println("\n\t\tMenu: " + "\n(1)Them sinh vien." + "\n(2)In danh sach sinh vien."
						+ "\n(3)Kiem tra danh sach sinh vien co rong khong?"
						+ "\n(4)Lay so luong sinh vien trong danh sach ra." + "\n(5)Lam rong danh sach sinh vien."
						+ "\n(6)Tim kiem sinh vien thong qua ma so sinh vien"
						+ "\n(7)Xoa sinh vien thong qua ma so sinh vien."
						+ "\n(8)Tim kiem tat ca sinh vien dua tren TEN duoc nhap tu ban phim ."
						+ "\n(9)In danh sach diem trung binh tu cao den thap." + "\n(0).Exit");
				System.out.print("Vui long chon chuc nang: ");
				str = sc.nextLine();
				try {
					chon = Integer.parseInt(str); // Chuyen chuoi sang so
				} catch (Exception e) {
					System.out.println("\tChi nhap so khong nhap chu cai. Xin vui long nhap lai.");
					chon = Integer.MIN_VALUE;
				}
			} while (chon == Integer.MIN_VALUE);
			// Thoat vong lap tren
			if (chon == 1) {
				System.out.println("\tNhap thong tin cua sinh vien: ");
				SV = new SinhVien();
				SV.nhap();
				DSSV.themSinhVien(SV);
			} else if (chon == 2) {
				System.out.println("\tThong tin cac sinh vien co trong danh sach:");
				DSSV.In(SV);
			} else if (chon == 3) {
				System.out.println("\tDanh sach sinh vien: ");
				DSSV.DanhSachSV_Rong();
			} else if (chon == 4) {
				System.out.println("So luong sinh vien hien co: "+DSSV.soLuongSV());
			} else if (chon == 5) {
				System.out.println("Hien danh sach sinh vien: ");
				DSSV.lamRongDSSV();
			} else if (chon == 6) {
				String tim = new String();
				System.out.print("Vui long nhap ma so sinh vien can tim: "); tim = sc.nextLine();
				System.out.println("Kiem tra sinh vien co trong danh sach: "+DSSV.timKiemMSSV(SV,tim));
			} else if (chon == 7) {
				String tim = new String();
				System.out.print("Vui long nhap ma so sinh vien can tim: "); tim = sc.nextLine();
				System.out.println("Kiem tra da xoa chua: "+DSSV.xoaSinhVienTheoMSSV(SV,tim));
			} else if (chon == 8) {
				System.out.println("Nhap ten sinh vien can tim: ");
				String ten = new String();
				ten = sc.nextLine();
				DSSV.InDanhSachTheoTen(ten);
			} else if (chon == 9) {
				DSSV.sapXepDiem_GiamDan();
				DSSV.In(SV);
			} else if (chon == 0) {
				System.out.print("Da thoat.");
			} else {
				System.out.print("Lua chon khong hop le. Vui long nhap lai.");
			}
		} while (chon != 0);
	}
}
