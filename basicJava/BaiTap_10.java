package basicJava;
import java.util.Scanner;

public class BaiTap_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m,k=0,sum=0;
		System.out.println("Nhập số nguyên n(Cận dưới):"); n=sc.nextInt();
		System.out.println("Nhập số nguyên m(Cận trên):"); m=sc.nextInt();
		if(n>m) {
			System.out.println("Lỗi! vì "+n+" > "+m);
		}else {
			for(int i=n;i<=m;i++) {
				sum+=i;
				k++;
			}
			System.out.println("Giá trị tổng là: "+sum+"\nGía trị trung bình là: "+((float)(sum/k)));
		}
	}

}
