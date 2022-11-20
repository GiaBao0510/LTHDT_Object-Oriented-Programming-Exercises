package Buoi4;

import java.util.Scanner;

public class SDdongVat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		dongVat ds[] = new dongVat[3];
		System.out.println("\tSố con vật:"+"\n(1)Con Gà"+"\n(2)Con Mèo"+"\n(3)Con Chó");
		for(int i=0;i<3;i++) {
			int chon =0;
			System.out.print("Mời chọn số con vật: "); chon = sc.nextInt();
			if(chon == 1) {
				System.out.println("Bạn đã chọn con Gà: ");
				ds[i] = new conGa();
				ds[i].nhapLoaiDV();
			}
			else if(chon == 2) {
				System.out.println("Bạn đã chọn con Mèo: ");
				ds[i] = new conMeo();
				ds[i].nhapLoaiDV();
			}else {
				System.out.println("Bạn đã chọn con Chó: ");
				ds[i] = new conCho();
				ds[i].nhapLoaiDV();
			}
		}
		for(int i=0;i<3;i++) {
			System.out.println("\n-----Thông tin con vật thứ "+(i+1)+"-------");
			ds[i].In();
			ds[i].tiengKeu();
		}
	}

}

