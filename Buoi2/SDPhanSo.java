package Buoi2;

import java.util.Scanner;

public class SDPhanSo {

	public static void main(String[] args) {
		PhanSo A = new PhanSo(3, 7),
			   B = new PhanSo(4, 9);
		A.HienThiPhanSo1();
		B.HienThiPhanSo1();
		PhanSo X = new PhanSo(),
			   Y = new PhanSo();
		X.nhapPhanSo();
		Y.nhapPhanSo();
		System.out.println("Hiển thị phân số của X: ");
		X.HienThiPhanSo1();
		System.out.println("Hiển thị phân số của Y: ");
		Y.HienThiPhanSo1();
		System.out.println("Hiển thị Giá trị nghịch đảo của X: ");
		X.giaTriNghichDao().HienThiPhanSo1();
		System.out.println("Các phép toán trên X và Y: ");
		System.out.println("X + Y =");
		X.cong(Y).HienThiPhanSo1();
		System.out.println("X - Y =");
		X.tru(Y).HienThiPhanSo1();
		System.out.println("X * Y =");
		X.nhan(Y).HienThiPhanSo1();
		System.out.println("X / Y =");
		X.chia(Y).HienThiPhanSo1();
		//Tạo danh sách
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử trong danh sách: "); n =sc.nextInt();
		if(n>0) {
			PhanSo DSPS[];
			DSPS = new PhanSo[n];
			//Cấp phát bộ nhớ
			for(int i=0;i<n;i++) {
				DSPS[i] = new PhanSo();
			}
			//Nhập 
			for(int i=0;i<n;i++) {
				System.out.println(i);
				DSPS[i].nhapPhanSo();
			}
			PhanSo PhanSoMax = new PhanSo();
			float tongPS=0;
			PhanSoMax.ganPhanSo(DSPS[0]);
			PhanSoMax.HienThiPhanSo1();
			for(int i=0;i<n;i++) {
				if(PhanSoMax.lonHon(DSPS[i])==false) {
					PhanSoMax.ganPhanSo(DSPS[i]);
				}
				tongPS+=DSPS[i].giaTriThuc();
			}
			System.out.println("Hiển thị Giá trị phân số lớn nhất trong tham số: ");
			PhanSoMax.HienThiPhanSo1();
			System.out.println("Tổng giá trị của danh sách tham số: "+tongPS);
			//Sắp xếp
			System.out.println("Insertion sort:"); 
			for(int i=1;i<n;i++) {
				int j = i;
				while((j>0)&&(DSPS[j-1].lonHon(DSPS[j]))) {
					PhanSo temp = DSPS[j-1];
					DSPS[j-1] = DSPS[j];
					DSPS[j]= temp;
					j--;
				}
			}
			//In Danh sach
			for(int i=0;i<n;i++) {
				DSPS[i].HienThiPhanSo1();
			}
		}else {
			System.out.println("Vì n<1 nên không thể lập danh sách các phần tử.");
		}
	}

}

