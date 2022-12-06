package InputOutput_Java;

import java.io.*;
import java.util.Scanner;

public class SaoChepGiua2Files {
	
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		String filedoc = new String(),
			   fileghi = new String();
		System.out.print("Nhap duong dan tap tin doc: "); filedoc = sc.nextLine();
		System.out.print("Nhap duong dan tap tin ghi: "); fileghi = sc.nextLine();
		long batdau,tongTG=0;
		File F = new File(filedoc);
		if(F.isFile()) {
			System.out.println("Kich co tap tin: "+ F.length()+" bytes.");
			try {
				FileInputStream vao = new FileInputStream(filedoc); //File bi doc
				FileOutputStream ra = new FileOutputStream(fileghi); //File bi ghi
				batdau = System.nanoTime();	//Lay thoi gian he thong tin (ns)
				int ch;
				while((ch = vao.read()) != -1) {	//Neu trong file bi doc khong rong thi tiep tuc vong lap
					ra.write(ch); 	//Ghi vao tep tin fileghi
				}
				tongTG = System.nanoTime() - batdau;//Tinh thoi gian copy du lieu
				System.out.println("Thoi gian copy: "+(tongTG/1000000.0)+" ms");
			}catch(IOException er) {
				er.printStackTrace();
			}
		}else {
			System.out.println("Duong dan khong hop le.");
		}
	}

}
