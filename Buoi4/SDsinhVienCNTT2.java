package Buoi4;
import Buoi3.sinhVien;
import java.util.Scanner;
import Buoi3.sinhVien;
public class SDsinhVienCNTT2 extends sinhVien{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhập số lượng sinh viên: "); n=sc.nextInt();
		if(n>0) {
			sinhVien ds[];
			ds= new sinhVien[n]; 
			for(int i=0;i<n;i++) {
				int chon=1;
				System.out.println("\tNhập thông tin sinh viên thứ "+(i+1)+" :");
				do {
					System.out.println("Bạn chọn sinh viên khoa CNTT(1) hay khoa khác(2): "); chon=sc.nextInt();
					if(chon ==1) {
						System.out.println("Bạn là sinh viên khoa CNTT: ");
						ds[i] = new sinhVienCNTT();
						ds[i].nhapThongTin();
					}else if(chon == 2){
						System.out.println("Bạn là sinh viên khoa khác:");
					}else {
						System.out.println("Bạn nhập không đúng.Vui lòng nhập lại.");
					}
				}while(chon!=1 &&chon !=2);
				
			}
		}else {
			System.out.println("Vì số lượng sinh viên < 0 nên khong thể lập danh sách.");
		}
	}

}

