package BaiHoc_Lesson.Set_struct;

import java.util.Arrays;
import java.util.HashSet;//La them phan tu vao tap hop nhung khong quan tam den thu tu cua gia tri
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class RutThamTrungThuong_HashSet {
	Set<String> thungPhieu; //Tao doi tuong tu giao dien Set
	 
	public RutThamTrungThuong_HashSet() {
		this.thungPhieu = new HashSet<String>();//Cap phat bo nho bang giao dien hash set
	}
	
	public RutThamTrungThuong_HashSet(Set<String> thungPhieu){	//Ham xay dung co doi so
		this.thungPhieu = thungPhieu;
	}
	public RutThamTrungThuong_HashSet(RutThamTrungThuong_HashSet X) {	//Ham xay dung sao chep co doi so
		this.thungPhieu = new HashSet<String>(X.thungPhieu);
	}
	//Them 1 phieu
	public boolean them_1Phieu(String maSo) {
		return this.thungPhieu.add(maSo);
	}
	//Xoa 1 phieu
	public boolean xoa_1Phieu(String maSo) {
		return this.thungPhieu.remove(maSo);
	}
	//Kiem tra 1 phieu co trong thung khong
	public boolean kiemTraPhieu(String maSo) {
		return this.thungPhieu.contains(maSo);
	}
	//Xoa tat ca phieu du thuong
	public void xoaTatCaPhieuDuThuong() {
		this.thungPhieu.clear();
	}
	//Kiem tra so phieu trong thung chua
	public int soLuongPhieu() {
		return this.thungPhieu.size();
	}
	//Rut tham
	public String rut1Phieu() {
		//Su dung them doi tuong rd duoc tao bang lop random
		Random rd = new Random(); 
		int viTri = rd.nextInt(this.thungPhieu.size()); //Lay ngau nhien theo so nguyen va mien gia tri lay ngau nhien thu 0 den so luong phieu co trong thung chua
		String kq = new String();
		kq = (String) (this.thungPhieu.toArray()[viTri]);
		return kq;
	}
	//In ra tat ca ma so
	public void InRaTatCaMaSo() {
		System.out.println(Arrays.toString(this.thungPhieu.toArray())); //Liet ra tat ca cac phieu ma khong can dung vong lap for
	}
	
	public static void main(String[] args) {
		RutThamTrungThuong_HashSet RT = new RutThamTrungThuong_HashSet();
		Scanner sc = new Scanner(System.in);
		int chon=-1;
		do {
			System.out.println("-----------------------------------");
			System.out.println("\t\tMenu:\n");
			System.out.println("1. Them ma so du thuong vao thung chua.");
			System.out.println("2. Lay ma so du thuong ra khoi thung chua.");
			System.out.println("3. Kiem tra ma so du thuong co trong thung khong?");
			System.out.println("4. So luong ma du thuong trong thung.");
			System.out.println("5. Xoa tat ca ma so du thuong trong thung.");
			System.out.println("6. Rut tham trung thuong.");
			System.out.println("7. In ra tat ca cac phieu.");
			System.out.println("0. Thoat khoi chuong trinh.");
			System.out.print("Moi chon: "); chon = sc.nextInt();
			if(chon == 1 || chon == 2 || chon == 3 ) {//Nhap chuoi
				String maSo;
				sc.nextLine();
				System.out.print("Vui long nhap ma phieu du thuong: "); maSo = sc.nextLine();
				if(chon == 1) {
					if(RT.them_1Phieu(maSo) == true) {
						System.out.println("\tThem phieu thanh cong.");
					}else {
						System.out.println("\tThem phieu that bai hoac do phieu nay da ton tai roi");
					}
				}else if(chon == 2) {
					if(RT.xoa_1Phieu(maSo) == true) {
						System.out.println("\tXoa phieu thanh cong");
					}else {
						System.out.println("\tXoa phieu that ba hoac do phieu nay khong ton tai.");
					}
				}else if(chon == 3) {
					if(RT.kiemTraPhieu(maSo) == true) {
						System.out.println("\tPhieu nay co trong thung chua");
					}else {
						System.out.println("\tPhieu nay khong co trong thung chua.");
					}
				}
			}else if(chon == 5){
				System.out.println("\tDa so tat ca cac phieu trong thung");
				RT.xoaTatCaPhieuDuThuong();
			}else if(chon == 4) {
				System.out.println("\tSo luong phieu trong thung la: "+RT.soLuongPhieu());
			}else if(chon == 6) {
				String kq = new String();
				kq = RT.rut1Phieu();
				System.out.println("\tMa so da trung thuong la: "+kq);
				RT.xoa_1Phieu(kq); //Dong thoi lay no ra khoi thung chua
			}else if(chon == 7) {
				System.out.println("\tCac ma phieu du thuong la: ");
				RT.InRaTatCaMaSo();
			}else if(chon == 0) {
				System.out.println("\tDa thoat khoi chuong trinh.");
				break;
			}else {
				System.out.println("\n\tKhong hop le. Xin vui long nhap lai.\n");
			}
		}while(chon!=0);
	}

}
