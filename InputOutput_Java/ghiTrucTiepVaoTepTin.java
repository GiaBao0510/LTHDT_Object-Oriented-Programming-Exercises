package InputOutput_Java;

import java.io.*;
import java.util.Scanner;

public class ghiTrucTiepVaoTepTin {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String url = new String();
		System.out.println("Nhap vao duong dan den tap tin can ghi vao:");
		url = sc.nextLine();
		//Phai bat buot dat trong try_catch voi ngoai le IOException
		try {
			FileOutputStream F = new FileOutputStream(url);
			String S = new String();
			System.out.println("Nhap du lieu vao tep tin: "); S= sc.nextLine();
			int soNguyen;
			for(int i=0;i<S.length();i++) {
				soNguyen = S.charAt(i); //doi tung ky tu thanh so
				F.write(soNguyen); //Ghi vao tap tin
			}
			F.close(); //Dong tep tin
			System.out.println("Da ghi vao tap tin.");
		}catch(IOException E) {
			E.printStackTrace();
		}
	}

}
