package InputOutput_Java;

import java.io.File;
import java.util.Scanner;

public class TaoThuMuc_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = new String();
		System.out.println("Nhap duong dan den noi can tao thu muc: ");
		path = sc.nextLine();
		File D = new File(path);
		if(D.isDirectory()) {
			String chon = new String();
			System.out.println("(1)Tao 1 thu muc \t - \t (2)Nhieu thu muc long nhau:");
			System.out.println("Moi chon: "); chon = sc.nextLine();
			if(chon.equalsIgnoreCase("1")) {
				String nameDir = new String();
				System.out.println("Nhap ten thu muc can tao: ");
				nameDir = sc.nextLine();
				path+="\\" + nameDir;
				//System.out.println(path);
				D = new File(path);
				if(D.mkdir()) {	//Tao 1 thu muc duy nhat
					System.out.println("Tao thu muc thanh cong");
				}else {
					System.out.println("Tao thu muc that bai");
				}
			}else if(chon.equalsIgnoreCase("2")) {
				int n;
				System.out.print("Nhap so luong thu muc can tao: "); n=sc.nextInt();
				sc.nextLine();
				String nameDir[] = new String[n];
				for(int i=0;i<n;i++) {
					nameDir[i] = new String();
					System.out.println("Nhap ten thu muc thu thu "+(i+1)+" : ");
					nameDir[i] = sc.nextLine();
					path+="\\"+nameDir[i];
				}
				D = new File(path);
				if(D.mkdirs()) {	//Tao 1 thu muc duy nhat
					System.out.println("Tao thu muc thanh cong");
				}else {
					System.out.println("Tao thu muc that bai");
				}
			}else {
				System.out.println("Khong tao thu muc nao.");
			}
		}else {
			System.out.println("Duong dan khong hop le.");
		}

	}

}
