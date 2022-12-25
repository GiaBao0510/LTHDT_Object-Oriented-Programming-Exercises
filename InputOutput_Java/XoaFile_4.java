package InputOutput_Java;

import java.io.File;
import java.util.Scanner;

public class XoaFile_4 {
	//delete() Phuong thuc nay dung de xoa tap tin hoac thu muc(Nhung phai la thu muc rong)
	public boolean xoaTepTinHoacThuMuc(File F) {
		if(F.isDirectory() == false) {
			System.out.println("Duong dan khong hop le");
			return false;
		}
		return F.delete();
	}
	//deleteInExit() Phuong thuc nay se xoa di 1 tap tin hoac thu muc .Neu thu muc hoac tap tin khong ton tai thi no se khong bao loi
	public void xoaTepTinHoacThuMuc_2(File F) {
		F.deleteOnExit();
	}
	//Xoa thu muc de quy
	public void xoaFile_deQuy(File F) {
		if(F.isFile()) {//Neu la tap tin thi xoa
			System.out.println("Da xoa tep tin: "+F.getName());
			F.delete();
		}else if(F.isDirectory()) {
			//Liet ke danh sach cac file con
			File duLieu[] = F.listFiles();
			for(File fi : duLieu) {
				xoaFile_deQuy(fi);//De quy neu la thu muc(rong hoac khong rong)
			}
			//Xoa ban than thu muc sau khi da xoa cac file trong no
			F.delete();
			System.out.println("Da xoa thu muc: "+F.getName());
		}
	}
	public static void main(String[] args) {
		XoaFile_4 T = new XoaFile_4();
		Scanner sc = new Scanner(System.in);
		String path = new String();
		int chon = -1; 
		do {
			System.out.println("1.Xoa thu muc rong.\n"
								+"2.Xoa thu muc khong rong.\n"
								+"0.Thoat");
			if(chon == 0) {
				System.out.println("Da thoat");
			}
			System.out.println("Moi chon: "); chon = sc.nextInt();
			sc.nextLine();
			System.out.print("Nhap duong dan de xoa tap tin hoac thu muc: ");
			path = sc.nextLine();
			File Fx = new File(path);
			if(chon == 1) {
				if(T.xoaTepTinHoacThuMuc(Fx)) {
					System.out.println("Xoa thanh cong");
				}else {
					System.out.println("Xoa that bai");
				}
			}
			else if(chon == 2) {
				T.xoaFile_deQuy(Fx);
			}
		}while(chon != 0);
	}
}
