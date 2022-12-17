package BaiHoc_Lesson;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class CoBan_PriorityQueue {

	public static void main(String[] args) {
		// VD ve danh sach luu tru ten sinh vien
		Scanner sc = new Scanner(System.in);
		Queue<String> dsSV = new PriorityQueue<String>();
		dsSV.offer("4.Con cua cac doi tuong 3");
		dsSV.offer("Nguyen Van C");
		dsSV.offer("3.Thuong binh, Benh binh,Quan nhan,Ha si quan, Chien si,... ");
		dsSV.offer("Nguyen Van A");
		dsSV.offer("1.Dan Toc thieu so");
		dsSV.offer("Nguyen Van D");
		dsSV.offer("2.Cong nhan lam viec 5 nam tro len");
		dsSV.offer("Nguyen Van B");
		String ten;
		while (true) {
			ten = dsSV.poll();
			if (ten == null) {
				break;
			}
			System.out.println(ten);
		}

	}

}
