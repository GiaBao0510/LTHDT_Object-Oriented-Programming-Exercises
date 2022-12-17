package BaiHoc_Lesson.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Chuoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*--Su dung lop Stack---*/
		Stack<String> chuoi;	//Tao doi tuong chuoi la ngan xep chua gia tri kieu chuoi
		chuoi = new Stack<String>();	//Cap phat bo nho cho doi tuong chuoi
		// .push("Values") phuong thuc nay dung de day phan tu chua gia tri gi do vao dau cua ngan xep
		// .pop() Phuong thuc nay dung de hien thi gia tri o cuoi ngan xep .Dong thoi xoa luon no ra khoi ngan xep
		// .peek() Phuong thuc nay chi hien gia tri o cuoi ngan xep. Khong co xoa no 
		// .clear() Phuogn thuc nay dung de xoa tat ca cac phan tu co mat trong Stack
		// .contain("Gia tri can tim") phuong thu nay dung de tim kiem phan tu mang gia tri ma ta can tim trong Stak
		// .size() Phuong thuc nay tra ve do lon cua Stack
		//VD ve dao nguoc chuoi
		String hoten;
		System.out.print("Nhap ho va ten cua ban: "); hoten=sc.nextLine();
		for(int i=0;i<hoten.length();i++) {
			chuoi.push(hoten.charAt(i)+"");
		}
		System.out.println("Do lon cua Stack: "+chuoi.size());
		System.out.println("Chuoi dao nguoc:");
		for(int i=0;i<hoten.length();i++) {
			System.out.print(chuoi.pop());
		}
	}
}
