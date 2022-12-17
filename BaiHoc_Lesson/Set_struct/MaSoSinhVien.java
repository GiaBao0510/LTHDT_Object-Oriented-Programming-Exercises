package BaiHoc_Lesson.Set_struct;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MaSoSinhVien {
	private Set<String> mssv;
	//Ham xay dung
	public MaSoSinhVien() {
		mssv = new HashSet<String>();
	}
	public MaSoSinhVien(Set<String> mssv) {
		this.mssv = mssv;
	}
	public MaSoSinhVien(MaSoSinhVien X) {
		this.mssv = new HashSet<String>(X.mssv);
	}
	//Phuong thuc 
	public boolean them1MSSV(String S) {
		return this.mssv.add(S);
	}
	public boolean xoa1MSSV(String S) {
		return this.mssv.remove(S);
	}
	public boolean KiemTraMSSV(String S) {
		return this.mssv.contains(S);
	}
	public void xoaTatCaMSSV() {
		this.mssv.clear();
	}
	public int soLuongMSSV() {
		return this.mssv.size();
	}
	public void dsMSSV() {
		System.out.println(Arrays.toString(this.mssv.toArray()));
	}
	public static void main(String[] args) {
		MaSoSinhVien SV = new MaSoSinhVien();
		Scanner sc = new Scanner(System.in);
		int chon = -1;
		do {
			System.out.println("----------------------------------------------------");
			System.out.println("\n\t\tMenu:\n");
			System.out.println("1. Them ma so sinh vien.");
			System.out.println("2. Xoa 1 ma so sinh vien.");
			System.out.println("3. Kiem tra ma so sinh vien co ton tai hay khong?");
			System.out.println("4. Xoa tat ca ma so sinh vien. ");
			System.out.println("5. So luong ma so sinh vien.");
			System.out.println("6. Danh sach ma so sinh vien.");
			System.out.println("0. Thoat");
			System.out.print("Moi chon: "); chon = sc.nextInt();
			if(chon == 1 || chon == 2 || chon == 3) {
				sc.nextLine();
				String ms = new String();
				System.out.print("Nhap ma so sinh vien: "); ms = sc.nextLine();
				if(chon == 1) {
					if(SV.them1MSSV(ms)==true) {
						System.out.println("\tThem ma so sinh vien thanh cong.");
					}else {
						System.out.println("\tThem that bai do loi hoac ma so sinh vien da ton tai.");
					}
				}
				else if(chon == 2) {
					if(SV.xoa1MSSV(ms) == true) {
						System.out.println("\tXoa ma so sinh vien thanh cong.");
					}else {
						System.out.println("\t!Loi.Vi ma so sinh vien nay khong ton tai.");
					}
				}else if(chon == 3) {
					if(SV.KiemTraMSSV(ms) == true) {
						System.out.println("\tMa so sinh vien nay da ton tai.");
					}else {
						System.out.println("\tMa so sinh vien nay khong ton tai.");
					}
				}
			}
			else if(chon == 4) {
				System.out.println("\tDa xoa tat ca ma so sinh vien tren.");
				SV.xoaTatCaMSSV();
			}else if(chon == 5) {
				System.out.println("\tSo luong ma so sinh vien la: "+SV.soLuongMSSV());
			}else if(chon == 6) {
				System.out.println("\tDanh sach ma so sinh vien: ");
				SV.dsMSSV();
			}else if(chon == 0) {
				System.out.println("\tDa thoat.");
				break;
			}else {
				System.out.println("\n\tLoi khong hop le.Xin vui long nhap lai.\n");
			}
		}while(chon!=0);
	}

}
