package Buoi3;

import java.util.Scanner;
public class SDGach {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số lượng loại gạch: "); n =sc.nextInt();
		if(n>0) {
			Gach ds[] = new Gach[n];
			for(int i=0;i<n;i++) {
				ds[i] = new Gach();//Cấp phát bộ nhớ
				ds[i].nhapThongTin();
				System.out.println("----------------------------------------\n");
			}
			//in
			for(int i=0;i<n;i++) {
				ds[i].InThongTin();
				System.out.println("Giá bán lẻ 1 viên trong hộp: "+ds[i].giaBanLe());
				System.out.println("----------------------------------------\n");
			}
			//Hiển thị ra màn hình loại gạch có chi phí lót thấp nhất (giá tiền / đơn vị diện tích).
			float min = (float)ds[0].getGiaBan()/(float)ds[0].dienTichNen();
			for(int i=0;i<n;i++) {
				if((float)ds[i].getGiaBan()/(float)ds[i].dienTichNen() < min) {
					min = (float)ds[i].getGiaBan()/(float)ds[i].dienTichNen();
				}
			}
			System.out.println("Loại gạch có chi phí lót thấp nhất là: "+min);
			//Tính ra chi phí mua gạch khi ta lót 1 diện tích có chiều ngang là 5 m và chiều dài là 20m khi ta dùng từng loại gạch trong danh sách trên.
			for(int i=0;i<n;i++) {
				System.out.println("Số hộp cho chi phí lót diện tích 5m và 20m của "+ds[i].getMau()+" là: "+ds[i].soLuongHop(5,20)+" hộp.");
			}
		}else System.out.println(" Lỗi!vì số lượng nhập < 0.");
	}
}
