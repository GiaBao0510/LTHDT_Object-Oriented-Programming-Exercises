package Buoi4;

import java.util.Scanner;

public class UseShape {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong hinh dang: "); n =sc.nextInt();
		if(n>0) {
			Shape ds[] = new Shape[n];
			for(int i=0;i<n;i++) {
				int opt;
				System.out.print("Choose a shape (1).Rectangle | (2).Circle | (3).Square | (other).Break: "); opt = sc.nextInt();
				if(opt == 1) {
					System.out.println("\tYou chose Rectangle.");
					ds[i] = new Rectangle();
					ds[i].inputValue();
				}else if(opt == 2) {
					System.out.println("\tYou chose Circle.");
					ds[i] = new Circle();
					ds[i].inputValue();
				}else if(opt == 3){
					System.out.println("\tYou chose Square.");
					ds[i] = new Square();
					ds[i].inputValue();
				}else {
					break;
				}
			}
			for(int i=0;i<n;i++) {
				if(ds[i]!= null) {
					System.out.println((i+1)+". "+ds[i]);
				}
			}
		}else {
			System.out.println("Vi so luong hinh dang < 0 .Nen khong thuc thi");
		}
	}

}
