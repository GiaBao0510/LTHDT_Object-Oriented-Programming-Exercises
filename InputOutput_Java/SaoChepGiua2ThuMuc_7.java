package InputOutput_Java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class SaoChepGiua2ThuMuc_7 {

	public void copyAll(File F1,File F2) {
		System.out.println(F1.getAbsolutePath());
		System.out.println(F2.getAbsolutePath());
		try {
			//Tu copy ban than no truoc tien
			Files.copy(F1.toPath(), F2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		}catch(IOException e) {
			e.printStackTrace();
		}
		//Neu F1 la thu muc thi F2 sao chep du liei ben trong cua F1
		if(F1.isDirectory()) {
			File subArray[] = F1.listFiles();
			for(File fi : subArray) {
				File Fnew = new File(F2.getAbsolutePath()+"\\"+fi.getName());
				copyAll(fi,Fnew);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Duong dan goc
		String pathR = new String(); 
		System.out.print("Nhap duong dan den thu muc can sao chep: "); pathR = sc.nextLine();
		File F1 = new File(pathR); 
		//Ten thu muc moi duoc nhan sao chep
		String nameDir = new String(); 
		System.out.println("Nhap ten thu muc moi: "); nameDir = sc.nextLine();
		//Duong dan chua thu muc sao chep chua ton tai
		String pathN = new String();
		pathN = F1.getParent() + "\\" + nameDir;
		File F2 = new File(pathN);
		SaoChepGiua2ThuMuc_7 ob=new SaoChepGiua2ThuMuc_7();
		ob.copyAll(F1, F2);
	}

}
