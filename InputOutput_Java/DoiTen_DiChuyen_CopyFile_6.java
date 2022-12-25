package InputOutput_Java;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class DoiTen_DiChuyen_CopyFile_6 {
	static Scanner sc = new Scanner(System.in);
	//Doi ten file
	public void doiTenFileCach1(File Fx) {
		String tenMoi = new String();
		System.out.println("Nhap ten moi cho file "+Fx.getName()+" : "); tenMoi = sc.nextLine();
		//Bien nay dung de luu tru duong dan den ten file moi
		String path = Fx.getParent() + "\\" + tenMoi;
		File fnew = new File(path);
		//renameTo(File) phuong thuc nay dung de doi ten 1 file tu 1 file chua ton tai.De bien doi ten file da ton tai thanh ten file khac
		if(Fx.renameTo(fnew)) {
			System.out.println("Doi ten file thanh cong");
		}else {
			System.out.println("Doi ten file that bai");
		}
	}
	//Doi ten file cach 2
	public void doiTenFileCach2(File Fx) {
		/*.move(path1 , path2 , option):
		 * Ham nay dung de: 
		 * 		Thu muc:
		 * 					Neu la thu muc 2 da ton tai thi di chuyen thu muc 1 vao trong thu muc 2
		 * 					Neu ls thu muc 2 chua ton tai thi doi ten thu muc 1 thanh ten thu muc 2
		 * 		Tep tin:
		 * 					Neu la tep tin 2 da ton tai thi su dung 1 so tuy chon de ap dung cho hop ly 
		 * 					Neu la tep tin 2 chua ton tai thi doi ten tep tin 1 thanh ten tep tin 2
		 */
		String tenMoi = new String();
		System.out.print("Nhap ten cho tep tin(Da ton tai/ chua tin tai) tai "+Fx.getName()+" : ");
		tenMoi = sc.nextLine();
		String path = Fx.getParent() + "\\" + tenMoi;
		File fnew = new File(path);
		try {
			Files.move(Fx.toPath(), fnew.toPath() , StandardCopyOption.REPLACE_EXISTING/*Tuy chon: ghi de len*/ );
		}catch(IOException x) {
			x.printStackTrace();
		}
	}
	//Di chuyen file vao thu muc
	public void diChuyenFile(File Fx) {
		String thung = new String();
		System.out.print("Nhap duong dan den thu muc can luu tep tin "+Fx.getName()+" : ");
		thung = sc.nextLine();
		String path = new String();
		path = thung + "\\" + Fx.getName();
		File chua = new File(path);
		try {
			Files.move(Fx.toPath(), chua.toPath() , StandardCopyOption.REPLACE_EXISTING );
		}catch(IOException x) {
			x.printStackTrace();
		}
	}
	//Copy file
	public void copyObj(File Fx) {
		//Luu duong dan thu muc moi can chua du lieu thu muc cu
		String thuMucMoi = new String();
		System.out.print("Nhap ten thu muc moi can chua du lieu thu muc "+Fx.getName()+" : ");
		thuMucMoi = sc.nextLine();
		String path = new String();
		path = Fx.getParent() + "\\" + thuMucMoi; 
		File DirNew = new File(path);//Luu tru duong dan chua thu muc chua ton tai va mon copy thu muc goc
		//Goi ham copyAll
			copyAll(Fx,DirNew);
	}
	public void copyAll(File F1, File F2) {//F2 sao chep F1
		System.out.println(F1.getAbsolutePath());
		System.out.println(F2.getAbsolutePath());
		try {
			//Tu sao chep chinh no truoc
			Files.copy(F1.toPath(), F2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		}catch(IOException x){
			x.printStackTrace();
		}
		//kiem tra xem no co phai la thu muc khong
		if(F1.isDirectory()) {
			File subArray[] = F1.listFiles();
			//Lay danh sach mang con trong no
			for(File fn: subArray) {
				File Fnew = new File(F2.getAbsolutePath()+"//"+fn.getName());
				copyAll(fn, Fnew);
			}
		}
	}
	public static void main(String[] args) {
		DoiTen_DiChuyen_CopyFile_6 Ob = new DoiTen_DiChuyen_CopyFile_6();
		String ddan = new String();
		System.out.println("Nhap duong dan: "); ddan = sc.nextLine();
		File Fm = new File(ddan);
		Ob.copyObj(Fm);
	}

}
