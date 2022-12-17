package BaiHoc_Lesson.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ThapPhanSangNhiPhan {
	public static void main(String[] args) {
		Stack<Integer> soNguyen = new Stack<Integer>();
		int so;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao 1 so nguyen: "); so = sc.nextInt();
		while(true) {
			if(so == 0) {
				break;
			}
			soNguyen.push(so%2);
			so/=2;
		}
		System.out.println("So nhi phan la:");
		int n =soNguyen.size(); //Dat n.Vi neu de cho for co dieu kien dung la i<soNguyen.size() Thi moi lan lap thi vong kich thuoc lan lap se giam dan
		for(int i=0;i<n;i++) {
			System.out.print(soNguyen.pop());
		}
	}
}
