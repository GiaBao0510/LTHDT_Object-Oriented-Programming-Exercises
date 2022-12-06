package InputOutput_Java;

import java.io.*;
import java.util.Scanner;

public class WriteToFile_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String();
		System.out.print("Nhap vao mot duong dan den tap tin: "); str = sc.nextLine();
		try {
			/*Lop FileOutputStream thua ke tu lop OutputStream nen
			 cung co cac phuong thuc giong voi  OutputStream */
			FileOutputStream F = new FileOutputStream(str);
			int ch='@';
			F.write(ch);   			//ghi 1 ky tu ra tep tin
			byte b1[] = new byte[10];
			int m=0;
			for(int i='0';i<='9';i++) {
				b1[m++] = (byte)i;		//Luu cac gia tri vao mang b1
			}
			F.write(b1);		//Ghi mang b1 vao ep tin
			m=0;
			F.write('\n');
			byte b2[] = new byte[50];
			for(int j='A';j<='Z';j++) {
				b2[m++] = (byte)j;
			}
			F.write(b2,0,m);  		//Ghi mot phan cua mang b2 ra tap tin
			F.close(); 			//Dong tep tin
		}catch(IOException e) {
			System.out.println("Loi khi truy xuat file.");
		}
	}
}
