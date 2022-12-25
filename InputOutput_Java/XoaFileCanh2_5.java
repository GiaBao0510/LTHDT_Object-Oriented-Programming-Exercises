package InputOutput_Java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class XoaFileCanh2_5 {
	//Xoa thu muc con de quy
	public void XoaThuMucConDeQuy(File F) {
		if(F.isDirectory() || F.isFile()) {
			File mang[] = F.listFiles();
			for(File fx: mang) {
				XoaThuMucConDeQuy(fx);
			}
			Path ddan = F.toPath();
			try {
				Files.deleteIfExists(ddan);
				System.out.println("Xoa: "+ddan);
			}catch(IOException x){
				x.printStackTrace();
			}
		}else {
			System.out.println("Duong dan khong hop le");
		}
	}
	public static void main(String[] args) {
		XoaFileCanh2_5 OB = new XoaFileCanh2_5();
		//Su dung class Files de xoa tap tin va thu muc
		Scanner sc = new Scanner(System.in);
		String path = new String();
		System.out.print("Nhap duong dan de xoa tap tin hoac thu muc: ");
		path = sc.nextLine();
		File PF = new File(path); 
		OB.XoaThuMucConDeQuy(PF);
	}

}
