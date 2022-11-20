package Buoi3;

import java.util.Scanner;

public class SDSinhVien {
	public static void main(String[] args) {
//		sinhVien S1 = new sinhVien();
//		S1.nhapThongTin();
//		S1.nhapHP();
//		S1.InThongTin();
//		System.out.println(S1.diemTrungBinh());
//		S1.themHP();
//		S1.InThongTin();
//		S1.xoaHP();
//		S1.InThongTin();
		sinhVien dssv[];
		dssv = new sinhVien[50];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng sinh viên: "); n = sc.nextInt();
		if(n>0) {
			for(int i=0;i<n;i++) {
			System.out.println("\tSinh viên "+(i+1));
			dssv[i] = new sinhVien();
			dssv[i].nhapThongTin();
			dssv[i].nhapHP();
			}
			int viTri=0,		//Lưu vị tí của học sinh Giỏi nhất
				canhBaoHV=0;	//Cảnh báo học vụ. Nếu lớn hơn 0 là có học sinh yếu
			float maxDTB = dssv[0].diemTrungBinh();
			for(int i=0;i<n;i++) {
				System.out.println("\tThông tin sinh viên "+(i+1));
				dssv[i].InThongTin();
				System.out.println("Điểm trung bình: "+dssv[i].diemTrungBinh());
				if(maxDTB < dssv[i].diemTrungBinh()) {
					maxDTB = dssv[i].diemTrungBinh();
					viTri =i;
				}
				if(dssv[i].diemTrungBinh()<1) {
					canhBaoHV++;
				}
				System.out.println("------------------------------------------------");
			}
			System.out.println("\tSinh viên có điểm trung bình cao nhất là:");
			dssv[viTri].InThongTin();
			System.out.println("Điểm trung bình: "+dssv[viTri].diemTrungBinh());
			System.out.println("\tThông tin những sinh viên cảnh báo học vụ.");
			if(canhBaoHV>0) {
				for(int i=0;i<n;i++) {
					if(dssv[i].diemTrungBinh()<1) {
						dssv[i].InThongTin();
					}
				}
			}else {
				System.out.println("Không có sinh viên nào để cảnh báo học vụ cả");
			}
			//Thong ke hoc luc cua sinh vien
			int soSVXS =0,
				soSVG =0,
				soSVKha =0,
				soSVTB =0,
				soSVY = 0,
				soSVKem =0;
			for(int i =0;i<n;i++) {
				if(dssv[i].diemTrungBinh()<=4 && dssv[i].diemTrungBinh()>=3.6) {
					soSVXS++;
				}
				else if(dssv[i].diemTrungBinh()<=3.59 && dssv[i].diemTrungBinh()>=3.2) {
					soSVG++;
				}
				else if(dssv[i].diemTrungBinh()<=3.19 && dssv[i].diemTrungBinh()>=2.5) {
					soSVKha++;
				}
				else if(dssv[i].diemTrungBinh()<=2.49 && dssv[i].diemTrungBinh()>=2) {
					soSVTB++;
				}
				else if(dssv[i].diemTrungBinh()<=1.99 && dssv[i].diemTrungBinh()>=1) {
					soSVY++;
				}else if(dssv[i].diemTrungBinh()<=1) {
					soSVKem++;
				}
			}
			System.out.println("\\tThong ke hoc luc sinh vien: ");
			System.out.println("So sinh vien xuat sac: "+soSVXS+"\nSo sinh vien gioi: "+soSVG+"\nSo sinh vien kha: "+soSVKha+"\nSo sinh vien trung binh: "+soSVTB+"\nSo sinh vien yeu: "+soSVY+"\nSo sinh vien kem: "+soSVKem);
					
		}
		else {
			System.out.println("Lỗi số lượng sinh viên phải lớn hơn 0");
		}
		
	}
}

