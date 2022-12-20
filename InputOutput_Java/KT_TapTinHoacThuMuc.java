package InputOutput_Java;

import java.io.File;
import java.util.Scanner;

public class KT_TapTinHoacThuMuc {

	public static void main(String[] args) {
		//Bai nay tui muon kiem tra xem tap tin hoac thu muc co ton tai hay khong
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.println("Nhap duong dan den tap tin hoac thu muc can kiem tra: ");
		str = sc.nextLine();
		File kt = new File(str);
		if(kt.exists() == true) {
			System.out.println("\tThu muc hoac tap tin nay da ton tai.");
		}else {
			System.out.println("\tThu muc hoac tap tin nay khong ton tai.");
		}

	}

}
