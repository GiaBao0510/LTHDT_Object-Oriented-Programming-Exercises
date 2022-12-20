package InputOutput_Java;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TaoTepTin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = new String();
		System.out.println("Nhap duong dan den noi can tao tap tin: ");
		path = sc.nextLine();
		File F = new File(path);
		if(F.isDirectory()) {
			String tenF = new String();
			System.out.print("Nhap ten tap tin can tao: "); tenF = sc.nextLine();
			path+="\\"+tenF;
			try {
				F = new File(path);
				F.createNewFile();
				System.out.println("Tao thanh cong");
			}catch(IOException e) {
				//1 so loi:
					//Duong dan sai
					//O cung bi day
					//Khong co quyen tao tap tin
					//...
				e.printStackTrace();
			}
		}
	}

}
