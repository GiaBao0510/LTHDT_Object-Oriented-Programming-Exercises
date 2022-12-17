package BaiHoc_Lesson.Map_Struct;

import java.util.Scanner;

public class SuDungTuDien {
	public static void main(String[] args) {
		Tu_Dien TD = new Tu_Dien();
		Scanner sc = new Scanner(System.in);
		int chon = -1;
		String ktra = new String();
		do {
			//Nhap
			System.out.println("---------------------------------------------");
			System.out.println("\t\t\tMenu:");
			System.out.println("Tra tu dien Anh - Viet:\n"
					+"1.Them tu (Tieng Anh, Tieng Viet).\n"
					+"2.Xoa tu(Tieng Anh).\n"
					+"3.Tra cuu tu vung(Tieng Anh).\n"
					+"4.Danh sach cac tu vung.\n"
					+"5.So luong tu vung.\n"
					+"6.Xoa tat ca cac tu vung co trong danh sach.\n"
					+"0.Thoat khoi chuong trinh.\n");
			//Kiem tra dau vao co phai la so nguyen khong
			do {
				try {
				System.out.print("Moi chon: "); ktra = sc.nextLine();
				chon = Integer.parseInt(ktra);
				}catch(Exception x) {
					chon = Integer.MIN_VALUE;
					System.out.println("\tChi chap nhan so nguyen .Xin vui long nhap lai.");
				}
			}while(chon == Integer.MIN_VALUE);
			
			//Kiem tra dau vao co dung dieu kien khong
			if(chon == 1 || chon == 2 || chon ==3) {
				String tuKhoa = new String();
				System.out.print("Nhap tu vung Tieng Anh: "); tuKhoa = sc.nextLine();
				if(chon == 1) {
					String YNghia = new String();
					System.out.print("Nhap tu vung y nghia Tieng Viet: "); YNghia = sc.nextLine();
					TD.themTu(tuKhoa, YNghia);
				}else if(chon == 2) {
					if(TD.xoaTu(tuKhoa) == null) {
						System.out.println("Khong tim thay tu vung: "+tuKhoa);
					}else {
						System.out.println("\tDa xoa tung khoa: "+tuKhoa);
						TD.xoaTu(tuKhoa);
					}
				}else if(chon == 3) {
					if(TD.traTu(tuKhoa) == null) {
						System.out.println("Khong tim thay tu vung: "+tuKhoa);
					}else {
						System.out.println(tuKhoa+" : "+TD.traTu(tuKhoa));
					}
				}
			}else if(chon == 4) {
				System.out.println("\tDanh sach cac tu vung: ");
				TD.InTuKhoa();
			}else if(chon == 5) {
				System.out.println("\tSo luong tu vung la: "+TD.soLuongTu());
			}else if(chon == 6) {
				System.out.println("\tDa xoa het cac tu vung trong danh sach.");
				TD.xoaHet();
			}else if(chon == 0){
				System.out.println("\tDa thoat.");
			}else {
				System.out.println("!Loi. Dau vao khong hop le xin vui long nhap lai.");
			}
		}while(chon != 0);
	}
}
