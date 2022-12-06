package InputOutput_Java;

import java.io.*;
import java.util.Scanner;

public class classInputStream_example {
	public static void main(String[] args) {
		while (true) {
			System.out.println("Nhap chuoi: ");
			byte[] b = new byte[100]; // Tao vung dem de nhap chuoi
			try {
				int n = System.in.read(b); // Nhap n ky tu
				String str = new String(b, 0, n - 2); // doi byte[] => String
				if (str.equals("Exit")) {	//Dieu kien thoat
					System.out.println("Thoat.");
					break;
				}
				System.out.println("Chuoi nhan duoc la: "+str);
			} catch (IOException e) { // Bat ngoai le IOException
				System.out.println("Error: "+e);
			}
		}
	}
}
