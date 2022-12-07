package OnThi;

import java.util.Scanner;

public class tuyenSinh {
	//Du lieu
	protected QL_thiSinh ds[];
	protected int size=0;
	//Them thi sinh
	public void themThiSinh(tuyenSinh x) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\tMenu:\n(1).Thi sinh khoi A.\n(2).Thi sinh khoi B.\n(3).Thi sinh khoi C.");
		int chon =-1;
		String C = new String();
		do {
			System.out.print("Moi chon: "); C = sc.nextLine();
			try {
				chon = Integer.parseInt(C); //doi chuoi sang so nguyen
			}catch(Exception e) {
				chon = Integer.MIN_VALUE;
			}
			if(chon == 1) {
				System.out.println("\tNhap thong tin thi sinh khoi A:");
				x.ds[x.size] = new thiSinhKhoi_A();
			}else if(chon == 2) {
				System.out.println("\tNhap thong tin thi sinh khoi B:");
				x.ds[x.size] = new thiSinhKhoi_B();
			}
			else if(chon == 3) {
				System.out.println("\tNhap thong tin thi sinh khoi C:");
				x.ds[x.size] = new thiSinhKhoi_C();
			}else {
				chon = Integer.MIN_VALUE;
				System.out.println("\tKhong hop le. Xin vui long nhap lai.");
			}
		}while(chon == Integer.MIN_VALUE);
		x.ds[x.size].nhap();
		x.size++;
	}
	//Hien thi danh sach thi sinh
	public void thongTinCacThiSinh(tuyenSinh x) {
		System.out.println("\t Thong tin cac thi sinh trong danh sach:");
		for(int i=0;i<x.size;i++) {
			System.out.println("\t-----\tThi sinh thu "+(i+1)+":\t-----\t");
			x.ds[i].in();
			x.ds[i].tongDiem();
		}
	}
	//Tim kiem thi sinh thong qua so bao danh
	public void timKiemSoBaoDanh(tuyenSinh x) {
		int chon=-1;
		String str = new String();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap so bao danh can tim: "); str = sc.nextLine();
			try {
				chon = Integer.parseInt(str);
			}catch(Exception e) {
				System.out.println("\tSo Bao danh chi gom cac so nguyen khong co chu cai.");
				System.out.println("Xin vui long nhap lai.");
				chon = Integer.MIN_VALUE;
			}
		}while(chon == Integer.MIN_VALUE);
		int l=0,		//Bat dau tu trai
			r=x.size-1;//Bat dau tu phai
		while(l<r) {
			if(x.ds[l].getSoBaoDanh() == chon) {
				System.out.println("Da tim thay thi sinh mang so bao danh: "+chon);
				x.ds[l].in();
				break;
			}
			if(x.ds[r].getSoBaoDanh() == chon) {
				System.out.println("Da tim thay thi sinh mang so bao danh: "+chon);
				x.ds[r].in();
				break;
			}
			l++;
			r--;
			if(l>=r) {
				System.out.println("\tKhong co thi sinh nao mang so bao danh: "+chon);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		tuyenSinh T = new tuyenSinh();
		T.ds = new QL_thiSinh[50];
		int chon =-1;
		String C = new String();
		do {
			//Vong lap 1
			do {
				//Kiem tra dau vao
				System.out.println("\t\tMenu: \n\t(1).Them thi sinh.\n\t(2).Xem danh sach thi sinh.\n\t(3).Tim kiem thi sinh thong qua so bao danh.\n\t(0).Thoat.");
				System.out.print("Moi chon: "); C = sc.nextLine();
				try {
					chon = Integer.parseInt(C); //doi chuoi sang so nguyen
				}catch(Exception e) {
					System.out.println("\tKhong hop le. Xin vui long nhap lai.");
					chon = Integer.MIN_VALUE;
				}
			}while(chon == Integer.MIN_VALUE);
			//Thoat vong lap 2. Kiem tra ket qua
			if(chon == 1) {
				T.themThiSinh(T);
			}else if(chon == 2) {
				T.thongTinCacThiSinh(T);
			}
			else if(chon == 3) {
				T.timKiemSoBaoDanh(T);
			}else if(chon == 0){
				System.out.println("Da thoat.");
				break;
			}
		}while(true);
	}
}
