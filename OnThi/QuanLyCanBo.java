package OnThi;

import java.util.Scanner;

public class QuanLyCanBo {
	static CanBo ds[] = new CanBo[100];//Bien toan cuc
	static int vitri=0;
	//Them vao cuoi danh sach
	public static void themCanBoMoi(CanBo ds[],int n) {
		int chon=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\tCan bo la: (1)Cong nhan \t (2)Ky su \t (3)Nhan Vien");
			System.out.print("Chon: ");chon = sc.nextInt();
			if(chon!=1 && chon!=2 && chon!=3) {
				System.out.println("\t-----Dau vao khong hop le. Xin vui long nhap lai.-----");
			}
		}while(chon!=1 && chon!=2 && chon!=3);
		if(chon == 1) {
			System.out.println("\tCan bo la cong nhan.");
			ds[n] = new CongNhan();
		}else if(chon == 2) {
			System.out.println("\tCan bo la ky su.");
			ds[n] = new KySu();
		}else if(chon == 3) {
			System.out.println("\tCan bo la nhan vien.");
			ds[n] = new NhanVien();
		}
		ds[n].nhap();
	}
	//Tim can bo
	public static int timKiem(CanBo ds[],int n) {
		String ten = new String();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten can bo can tim: "); ten = sc.nextLine();
			int l=0,	//Ben trai sang phai 
				r=n;	//Phai sang trai
			while(r>l) {
				int m = (l+r)/2;
				if(ds[l].getHoTen().compareTo(ten) == 0) {
					return l;
				}
				if(ds[r].getHoTen().compareTo(ten) == 0) {
					return r;
				}
				if(ds[m].getHoTen().compareTo(ten) == 0) {
					return m;
				}
				l++;
				r--;
			}
		return -1;
	}
	//Xoa can bo
	public static void xoaCanBo(CanBo ds[],int n) {
		int xd;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vi tri can xoa: "); xd = sc.nextInt();
		if(xd>n || xd<0) {
			System.out.println("\nKhong tim thay vi tri can bo nay");
			return;
		}else {
			for(int i=xd-1;i<n;i++) {
				ds[i] =ds[i+1]; //Sao chep can
			}
		}
	}
	//Hien thi danh sach
	public static void hienThiDanhSach(CanBo ds[],int n) {
		System.out.println("\t\tDanh sach cac can bo");
		for(int i=0;i<n;i++) {
			System.out.println("-------- Can bo thu "+(i+1)+" : --------");
			ds[i].in();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			//Menu
			int choose=-1;
			do {
				System.out.println("Menu: \n(1).Them can bo.\n(2).In danh sach can bo.\n(3).Tim Kiem ten can bo.\n(4).Xoa can bo\n(other).Thoat");
				System.out.print("Chon: "); choose = sc.nextInt();
				if(choose == 1) {
					themCanBoMoi( ds, vitri);
					vitri++;//Tang them mot don vi
				}else if(choose == 2) {
					hienThiDanhSach( ds, vitri);
				}else if(choose == 3) {
					int kq=timKiem( ds, vitri);
					if(kq != -1) {
						System.out.println("\tCan bo o vi tri thu "+(kq+1));
					}else {
						System.out.println("\tKhong co can bo nay.");
					}
				}else if(choose == 4) {
					xoaCanBo( ds, vitri);
					vitri--; //Giam di 1 don vi
				}else {
					System.out.println("Escaped.");
					break;
				}
			}while(true);
		}
}
