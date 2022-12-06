package InputOutput_Java;

import java.io.File;
import java.util.Scanner;

public class lietKetTrongThuMuc {
	public static void listRecursive(File dir) {
		File [] item = dir.listFiles(); // .listFiles tra ve danh sach ben trong thu muc
		for(File X : item) {
			System.out.println(X.getAbsoluteFile());
			if(X.isDirectory() == true) {
				listRecursive(X);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url = new String();
		System.out.println("Liet ke toan bo du lieu ben trong thu muc");
		System.out.println("Nhap duong dan: "); url = sc.nextLine();
		File dir = new File(url);
		if(dir.isDirectory()) {
			listRecursive( dir);
		}else {
			System.out.println("Duong dan khong hop le.");
		}
	}

}
