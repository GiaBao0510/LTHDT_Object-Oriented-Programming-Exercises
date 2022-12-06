package InputOutput_Java;

import java.io.File;
import java.util.Scanner;

public class kiemTraKichThuocTapTin {
	public long KiemTraKichCoFile(File F) {
		if(F.isFile() == true) { //Kiem tra dung duong dan thi tra ve ket qua
			return F.length();
		}else {					//Nguoc lai tra ve -1
			return -1;
		}
	}
	public static void main(String[] args) {
		String S = new String();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap duong dan den tap tin can de kiem tra kich co: "); S = sc.nextLine();
		File F = new File(S);
		kiemTraKichThuocTapTin Kt = new kiemTraKichThuocTapTin();
		if(Kt.KiemTraKichCoFile(F)!=-1) {
			System.out.println("Kich co tap tin la: "+Kt.KiemTraKichCoFile(F)+" bytes.");
		}else {
			System.out.println("Duong dan khong hop le.");
		}
	}
}
