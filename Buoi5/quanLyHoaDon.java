package Buoi5;

import java.util.Scanner;

public class quanLyHoaDon {

	public static void main(String[] args) {
		int slKH;	//So luong khach hang
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong khach hang: "); slKH = sc.nextInt();
		if(slKH >0) {
			khachHang KH[] = new khachHang[slKH];
			int slKVIP = 0,	//So luong khach vip
				slKKT = 0;	//So kuong khach thuong
			float tongTien =0;
			//Nhap
			for(int i=0;i<slKH;i++) {
				int chon = 0;
				System.out.print("\t1.Khach hang VIP. \n\tOther.Khach hang thuong. \nVui long chon: "); chon = sc.nextInt();
				if(chon == 1) {
					slKVIP++;
					System.out.println("\t---Khach hang VIP thu "+slKVIP+" ---");
					KH[i] = new khachHangVIP();
					KH[i].Nhap();
				}else {
					slKKT++;
					System.out.println("\t---Khach hang thuong thu "+slKKT+" ---");
					KH[i] = new khachHang();
					KH[i].Nhap();
				}
				tongTien += KH[i].tongThanhToan();
			}
			//In
			for(int i =0;i<slKH;i++) {
				KH[i].In();
			}
			System.out.println("So luong khach VIP: "+slKVIP);
			System.out.println("So luong khach thuong: "+slKKT);
			System.out.println("Tong tien cua cac hoa don tren la: "+tongTien);
		}else {
			System.out.println("!Khong co khach hang nao.");
		}
	}

}
