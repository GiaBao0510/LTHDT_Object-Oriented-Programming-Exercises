package basicJava;
import java.util.Scanner;

public class BaiTap_4 {
	public int Nhap(int n) {
		Scanner sc = new Scanner(System.in);
		String soNguyen;
		do {
			System.out.println("Nhập 1 số nguyên bất kỳ: "); soNguyen=sc.nextLine();
			try {
				n=Integer.parseInt(soNguyen);
			}
			catch(Exception k){
				System.out.println("Lỗi! Vui long nhập lại.");
				n=Integer.MIN_VALUE;
			}
		}while(n==Integer.MIN_VALUE);
		return n;
	}
	public static void main(String[] args) {
		BaiTap_4 t = new BaiTap_4();
		int a=0, b=0;
		a=t.Nhap(a);
		b=t.Nhap(b);
		System.out.println("Tổng: "+a+" + "+b+" = "+(a+b) );
	}
}
