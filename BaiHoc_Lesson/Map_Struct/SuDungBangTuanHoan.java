package BaiHoc_Lesson.Map_Struct;

import java.util.Scanner;

public class SuDungBangTuanHoan {

	public static void main(String[] args) {
		BangTuanHoan B = new BangTuanHoan();
		Scanner sc = new Scanner(System.in);
		int chon = -1;
		String ktra = new String();
		do {
			System.out.println("---------------------------------------------");
			System.out.println("\t\t\tMenu:");
			System.out.println("\tBang tuan hoan:\n"
					+"1.Them 1 o nguyen to (Ky hieu, Nguyen to).\n"
					+"2.Xoa 1 ky hieu.\n"
					+"3.Tra cuu ky hieu trong bang tuan hoan.\n"
					+"4.Sua doi ten nguyen to cua ky hieu.\n"
					+"5.Danh sach cac ky hieu trong bang tuan hoan.\n"
					+"6.So luong ky hieu trong bang tuan hoan.\n"
					+"7.Xoa het cac ky hieu trong bang tuan hoan.\n"
					+"8.Kiem tra ky hieu nao do co trong bang khong?.\n"
					+"9.Kiem tra nguyen to nao do co trong bang khong?.\n"
					+"10.Kiem tra bang tuan hoan co rong khong?.\n"
					+"0.Thoat khoi chuong trinh.\n");
			//Kiem tra dau vao co hop le khong
			do {
				try {
					System.out.print("Moi chon: "); ktra = sc.nextLine();
					chon = Integer.parseInt(ktra);
					}catch(Exception x) {
						chon = Integer.MIN_VALUE;
						System.out.println("\tChi chap nhan so nguyen .Xin vui long nhap lai.");
					}
			}while(chon == Integer.MIN_VALUE);
			if(chon == 1 ||chon == 2 || chon == 3 || chon == 4 || chon == 8 ) {
				String kh = new String();
				System.out.print("Nhap vao ky hieu: "); kh = sc.nextLine();
				if(chon == 1) {
					String ngto = new String();
					System.out.print("Nhap vao nguyen to: "); ngto = sc.nextLine();
					B.themNguyenTo(kh, ngto);
				}else if(chon == 2) {
					if(B.xoa_1NguyenTo(kh) == null) {
						System.out.println("\nKy hieu nay khong ton tai trong bang.Vi chua duoc them vao.");
					}else {
						B.xoa_1NguyenTo(kh);
						System.out.println("Xoa ky hieu "+kh+" thanh cong");
					}
				}else if(chon == 3) {
					if(B.NguyenTo(kh) == null) {
						System.out.println("\nKy hieu nay khong ton tai trong bang.Vi chua duoc them vao.");
					}else {
						System.out.println(kh+" : "+B.NguyenTo(ktra));
					}
				}else if(chon == 4) {
					String nNgto = new String();
					System.out.print("Nhap ten nguyen to can su cho ky hieu: "+kh+" : "); nNgto = sc.nextLine();
					B.suaGiaTriNguyenTo(kh, nNgto);
				}else if(chon == 8) {
					if(B.kiemTraKyHieu(kh)==true) {
						System.out.println("\tKy hieu nay da ton tai trong bang");
					}else {
						System.out.println("\tKy hieu nay khong ton tai trong bang");
					}
				}
			}else if(chon == 5) {
				System.out.println("\tDanh sach bang tuan hoan:");
				B.InBangTanHoan();
			}else if(chon == 6) {
				System.out.println("\tSo luong ky hieu trong bang tuan hoan: "+B.soLuong());
			}else if(chon == 7) {
				System.out.println("\tDa xoa het ky hieu trong bang tuan hoan.");
				B.xoaHet();
			}else if(chon == 9) {
				String Gtri = new String();
				System.out.print("Nhap nguyen to can tim trong bang: "); Gtri = sc.nextLine();
				if(B.kiemTraNguyenTo(Gtri)==true) {
					System.out.println("\nNguyen to nay da ton tai.");
				}else {
					System.out.println("\nNguyen to nay khong ton tai.");
				}
			}else if(chon == 10) {
				if(B.HashMap_Rong() == true) {
					System.out.println("Bang tuan hoan rong.");
				}else {
					System.out.println("Bang tuan hoan khong rong.");
				}
			}else if(chon == 0) {
				System.out.println("\tDa thoat");
			}else {
				System.out.println("Loi khong hop le.Xin vui long nhap lai.");
			}
		}while(chon != 0);
	}

}
