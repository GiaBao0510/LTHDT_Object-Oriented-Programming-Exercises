package BaiHoc_Lesson;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CoBan_Queue {
	/*Mot so phuong thuc co ban cua Queue Interface
	 .add() dung de chen 1 phan tu vao cuoi hang doi.Neu chen duoc tra ve true.Nguoc lai quang ra 1 ngoai le
	 .offer() dung de chen 1 phan tu vao cuoi hang doi.Neu chen duoc tra ve true.Nguoi lai tra ve false
	 .element() Tra ve gia tri o dau hang doi.Quang ra ngoai le neu hang doi trong
	 .peek() Tra ve gia tri o dau hang doi.Tra ve null neu hang doi trong
	 .remove() Xoa phan tu o dau hang doi. Quang ra ngoai le neu hang doi trong
	 .poll() Hien thi gia tri phan tu o dau hang doi va xoa phan tu no luon.Tra ve null neu hang doi trong
	*/
	public static void main(String[] args) {
		//VD ve danh sach luu tru ten sinh vien
		Scanner sc = new Scanner(System.in);
		int sl;
		System.out.print("Nhap so luong sinh vien"); sl=sc.nextInt();
		Queue<String> dsSV = new LinkedList<String>();
		sc.nextLine();
		String hten= new String();
		for(int i =0 ;i<sl;i++) {
			System.out.print("Nhap ten sinh vien thu "+(i+1)+": "); hten = sc.nextLine();
			dsSV.offer(hten);
		}
		String ten;
		while(true) {
			ten = dsSV.poll();
			if(ten == null) {
				break;
			}
			System.out.println(ten);
		}
	}

}
