package InputOutput_Java;

import java.io.File;
import java.util.Scanner;

public class xoaTapTinHoacThuMuc {
	public void deleteFile_Directory(File F) {
		//Kiem tra duong dan co noi den tap tin hay thu muc khong
		if(F.isDirectory() || F.isFile()) {
			if(F.delete() == true) { //Thuc hien xoa
				F.delete();
				System.out.println("Xoa thanh cong.");
			}else {
				System.out.println("Xoa that bai.");
			}
		}else {
			System.out.println("Duong dan khong hop le.");
		}
	}
	public static void main(String[] args) {
		String S = new String();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap duong dan den tap tin can de kiem tra kich co: "); S = sc.nextLine();
		File F = new File(S);
		xoaTapTinHoacThuMuc X = new xoaTapTinHoacThuMuc();
		X.deleteFile_Directory(F);
	}
}
