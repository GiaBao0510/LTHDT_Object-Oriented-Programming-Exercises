package InputOutput_Java;

import java.io.File;
import java.util.Scanner;

public class ExamFile_3 {
	//canExecute() Phuong thuc nay se xac dinh xem duong dan den tep tin nay co the duoc thuc thi khong
	public boolean kiemTraFileThucThi(File F) {
		return F.canExecute();
	}
	//canRead() Phuong thuc nay se xac dinh xem duong dan den tep tin nay co the duoc doc khong
	public boolean kiemTraFileDoc(File F) {
		return F.canRead();
	}
	//canWrite() Phuong thuc nay se xac dinh xem duong dan den tep tin nay co the duoc viet khong
	public boolean kiemTraFileGhi(File F) {
		return F.canWrite();
	}
	//getAbsolutePath() tra ve dung dan theo kieu String
	public String InTenDuongDan(File F) {
		return F.getAbsolutePath();
	}
	//getName() tra ve ten cua file hoac ten thu muc
	public String InTenFileHoacDirectory(File F) {
		return F.getName();
	}
	/*	idDirectory() kiem tra xem duong dan nay co phai la thu muc hay khong
		idFile() kiem tra xem duong dan nay co phai la tep tin hay khong	*/
	public void kiemTraThuMucHoacTepTin(File F) {
		if(F.isDirectory()) {
			System.out.println("\tDay la thu muc.");
		}else if(F.isFile()) {
			System.out.println("\tDay la tep tin.");
		}else {
			System.out.println("\tDuong dan khong hop le.");
		}
	}
	//list() tra ve ten thu muc va tap tin ben trong thu muc nao no.Nhung duong dan nay phai la thu muc
	public void InDanhSachCacTepTin_ThuMucBenTrong(File F) {
		if(F.isDirectory()) {
			System.out.println("\tCac tap tin/ thu muc con la:");
			File duLieu[] = F.listFiles();
			for(File ptu: duLieu) {
				System.out.println(ptu.getAbsolutePath());
			}
		}else if(F.isFile()) {
			System.out.println("Vi day la tep tin .Nen khong co chua cac thuc muc con va tap tin ben trong");
		}else {
			System.out.println("Loi duong dan khong hop le.");
		}
	}
	//Hien thi cay thu muc
	public void InCayChiTietThuMuc(File F,int capBac) {
		for(int i=0;i<capBac;i++) {
			if(i>0) {
				System.out.print("\t");
			}
		}
		System.out.print("|__");
		System.out.println(F.getName());
		if(F.canRead() && F.isDirectory()) {//Chi in ra thu muc co the doc
			File duLieu[] = F.listFiles();
			for(File fn : duLieu) {
				InCayChiTietThuMuc(fn,capBac++);	
			}
		}	
	}
	public static void main(String[] args) {
		ExamFile_3 OB = new ExamFile_3();
		Scanner sc = new Scanner(System.in);
		int luaChon=-1;
		String path = new String();
		File F;
		do {
			System.out.println("\t\t\tMenu: ");
			System.out.println("(1).Kiem tra thu muc hoac tap tin co the thuc thi.\n"
								+"(2).Kiem tra thu muc hoac tap tin co the doc.\n"
								+"(3).Kiem tra thu muc hoac tap tin co the ghi.\n"
								+"(4).In duong dan.\n"
								+"(5).In ten File.\n"
								+"(6).Kiem tra File co phai tap tin hay thuc muc khong.\n"
								+"(7).In ra danh sach cac File con.\n"
								+"(8).In ra cay thu muc.\n"
								+"(0).Thoat.\n");
			System.out.print("Moi chon chuc nang: "); luaChon = sc.nextInt();
			sc.nextLine();
			System.out.print("Nhap duong dan: "); path = sc.nextLine();
			F= new File(path);
			if(luaChon == 1) {
				System.out.println("Thu muc hoac tap tin nay co the thuc thi khong: "+OB.kiemTraFileThucThi(F));
			}
			else if(luaChon == 2) {
				System.out.println("Thu muc hoac tap tin nay co the doc khong: "+OB.kiemTraFileDoc(F));
			}
			else if(luaChon == 3) {
				System.out.println("Thu muc hoac tap tin nay co the ghi khong: "+OB.kiemTraFileGhi(F));
			}
			else if(luaChon == 4) {
				System.out.println("Ten duong dan: "+OB.InTenDuongDan(F));
			}
			else if(luaChon == 5) {
				System.out.println("Ten File hoac Directory: "+OB.InTenFileHoacDirectory(F));
			}
			else if(luaChon == 6) {
				OB.kiemTraThuMucHoacTepTin(F);
			}
			else if(luaChon == 7) {
				OB.InDanhSachCacTepTin_ThuMucBenTrong(F);
			}
			else if(luaChon == 8) {
				OB.InCayChiTietThuMuc(F, 1);
			}
			else if(luaChon == 0) {
				System.out.println("Da thoat.");
			}
		}while(luaChon != 0);

	}

}
