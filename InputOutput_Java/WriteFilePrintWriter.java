package InputOutput_Java;

import java.io.*;
import java.util.Scanner;

public class WriteFilePrintWriter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url = new String();
		System.out.println("Nhap duong dan den tap tin can ghi vao: "); url = sc.nextLine();
		try {
			BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
			FileOutputStream f1 = new FileOutputStream(url); //Doc duong dan den tap tin can ghi du lieu
			PrintWriter pw = new PrintWriter(f1);//Hien thi du lieu ra man hinh theo nhieu cach khac nhau .Khi dung dung lop nay can phai goi them phuong thuc flush() de day du lieu ra ngoai
			System.out.println("Nhap noi dung can ghi vao file va ket thuc voi ky tu <CR>.<CR> : ");
			while(true) {
				String s = kb.readLine(); //Nhap
				if(s.equals(".")) {	//Dieu kien dung
					break;
				}
				pw.println(s);
				pw.flush();
			}
			f1.close();
			System.out.println("Da ghi thanh cong.");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
