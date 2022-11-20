package Buoi4;
import java.util.Scanner;
import Buoi3.sinhVien;
public class SDsinhVienCNTT {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số lượng sinh viên: "); n = sc.nextInt();
		if(n>0) {
			sinhVienCNTT ds[]= new sinhVienCNTT[n];
			sc.nextLine();
			System.out.println("---------------Nhập danh sách sinh viên-----------------");
			for(int i=0;i<n;i++) {
				System.out.println("\tNhập thông tin sinh viên thứ "+(i+1)+" : ");
				ds[i] = new sinhVienCNTT();
				ds[i].nhapThongTin();
			}
			System.out.println("---------------In danh sách sinh viên-----------------");
			for(int i=0;i<n;i++) {
				System.out.println("\tIn thông tin sinh viên thứ "+(i+1)+" : ");
				ds[i].InThongTin();
				System.out.println("------------------------------------------------------------------");
			}
			String timEmail= new String();
			int timThay=0;
			System.out.println("Nhập Gmail muốn tìm: "); timEmail = sc.nextLine();
			for(int j=0;j<n;j++) {
				if(timEmail.compareTo(ds[j].getEmail())==0) {
					System.out.println("\t Tìm thấy: "+timEmail);
					ds[j].InThongTin();
					timThay=1;
					break;
				}
			}
			if(timThay == 0) {
				System.out.println("Không có sinh viên nào có email là: "+timEmail);
			}
		}else {
			System.out.println("Vì số lượng sinh viên < 0 nên khong thể lập danh sách.");
		}
		
	}
}
