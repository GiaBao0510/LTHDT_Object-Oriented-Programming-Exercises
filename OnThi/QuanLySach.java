package OnThi;

import java.util.Scanner;

public class QuanLySach {
	//Bien toan cuc
	static TaiLieu ds[] = new TaiLieu[50];
	static int vitri=0;
	//Them tai lieu moi
	public static void themTaiLieu(TaiLieu ds[],int vitri) {
		Scanner sc = new Scanner(System.in);
		int chon=0;
		System.out.println("\tTai Lieu: 1.Sach.\t2.Tap Chi.\t3.Bao.");
		do {
			System.out.print("Moi chon: "); chon = sc.nextInt();
			if(chon != 1 && chon != 2 && chon != 3) {
				System.out.println("\t Khong hop le.Vui long chon lai.");
			}
		}while(chon != 1 && chon != 2 && chon != 3);
		if(chon == 1) {
			System.out.println("Da chon sach.");
			ds[vitri] = new Sach();
		}else if(chon == 2) {
			System.out.println("Da chon tap chi.");
			ds[vitri] = new TapChi();
		}else if(chon == 3) {
			System.out.println("Da chon bao.");
			ds[vitri] = new Bao();
		}
		ds[vitri].nhap();
	}
	//In danh sach
	public static void HienThiTaiLieu(TaiLieu ds[],int vitri) {
		if(vitri!=0) {
			System.out.println("\t\t Danh sach tai lieu:");
			for(int i=0;i<vitri;i++) {
				System.out.println("\t---------- Tai lieu thu "+(i+1)+" : ---------");
				ds[i].in();
			}
		}
	}
	//Tim kiem sach theo ma tai lieu
	public static int timKiemMaTaiLieu(TaiLieu ds[],int vitri,String tk) {
		int l=0,
			r=vitri-1;
		while(r>l) {
			int m = (l+r)/2;
			if(ds[l].getMtl().compareTo(tk) == 0) {
				return l;
			}
			if(ds[m].getMtl().compareTo(tk) == 0) {
				return m;
			}
			if(ds[r].getMtl().compareTo(tk) == 0) {
				return r;
			}
			l++;
			r--;
		}
		return -1;
	}
	//Xoa tai lieu theo ma tai lieu
	public static int xoaTaiLieu(TaiLieu ds[],int vitri) {
		Scanner sc = new Scanner(System.in);
		String tk= new String();
		System.out.print("Nhap ma tai lieu muon xoa: "); tk = sc.nextLine();
		if(timKiemMaTaiLieu( ds, vitri,tk) != -1) {
			for(int i=timKiemMaTaiLieu( ds, vitri,tk)/*tra ve vi tri da tim thay*/;i<vitri;i++) {
				ds[i] = ds[i+1];
			}
			return 1;
		}else {
			System.out.println("Khong tim thay ma tai lieu can xoa");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chon=-1;
		do {
			System.out.println("\tMenu: \n(1)Them tai lieu.\n(2)In danh sach.\n(3)Tim tai lieu.\n(4)Xoa tai lieu.\n(other).Thoat");
			System.out.print("\nMoi lua chon: "); chon = sc.nextInt();
			if(chon == 1) {
				themTaiLieu(ds, vitri);
				vitri++;
			}else if(chon == 2) {
				HienThiTaiLieu(ds, vitri);
			}else if(chon == 3) {
				String tk = new String();
				sc.nextLine();
				System.out.print("Nhap ma tai lieu can tim: "); tk = sc.nextLine();
				if(timKiemMaTaiLieu(ds, vitri, tk) != -1) {
					System.out.println("\tDa tim thay");
					ds[timKiemMaTaiLieu(ds, vitri, tk)].in();
				}else {
					System.out.println("\tKhong tim thay.");
				}
			}
			else if(chon == 4) {
				if(xoaTaiLieu(ds,vitri) == 1) {
					vitri--;
				}
			}else {
				System.out.println("\t Escaped.");
				break;
			}
		}while(true);
	}

}
