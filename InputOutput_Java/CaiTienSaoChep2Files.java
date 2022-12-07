package InputOutput_Java;

import java.io.*;
import java.util.Scanner;

public class CaiTienSaoChep2Files {
	/*
	 * Tang toc do sao chep tep tin bang dong nhap xuat co ho tro vung dem
	 * BufferedInputStream & BufferedOutputStream
	 */
	static Scanner sc = new Scanner(System.in);
	
	public void saoChepCaiTien(File Fn,File Fd) {
		if(Fn.isFile() || Fd.isFile()) {
			long batdau,tongTG=0;
			System.out.println("Kich co tep tin doc la: "+Fn.length()+" bytes.");
			try {
				BufferedInputStream vao = new BufferedInputStream(new FileInputStream(Fn));	//Su dung dong nhap co ho tro vung nho dem
				BufferedOutputStream ra = new BufferedOutputStream(new FileOutputStream(Fd)); //Su dung dong xuat co ho tro bo nho dem
				batdau = System.nanoTime(); //Lay thoi gian he thong
				int chuyen;
				while((chuyen = vao.read()) != -1) {
					ra.write(chuyen); //Viet vao tep tin den khi gap null hoac -1 la dung
				}
				tongTG = System.nanoTime() - batdau;	//tinh thoi gian copy
				System.out.println("Tong thoi gian copy la: "+(tongTG/1000000.0)+" ms.");
			}catch(IOException E) {
				E.printStackTrace();
			}
		}else {
			System.out.println("Duong dan khong hoop le.");
		}
	}
	
	public static void main(String[] args) {
		String Fnguon = new String(),		//Doc 1 tep tin
				Fdich =  new String();		//Nhap ket qua tu tep tin nguon
		System.out.println("Nhap duong den den tap tin nguon: "); Fnguon = sc.nextLine();	//Tap tin nguon
		System.out.println("Nhap duong den den tap tin nguon: "); Fdich = sc.nextLine();	//Tap tin dich
		File Fn = new File(Fnguon),
			 Fd = new File(Fdich);
		CaiTienSaoChep2Files T = new CaiTienSaoChep2Files();
		T.saoChepCaiTien(Fn, Fd);
	}

}
