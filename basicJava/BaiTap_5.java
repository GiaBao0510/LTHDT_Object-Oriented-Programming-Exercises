package basicJava;
import java.util.Scanner;

public class BaiTap_5 {
	public static/*Hàm tĩnh*/ void ptb1(double a,double b) {
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình vô số nghiệm");
			}else {
				System.out.println("Phương trình vô nghiệm");
			}
		}else {
			System.out.println("Nghiệm: "+(-b/a));
		}
	}
	public static/*Hàm tĩnh*/ void ptb2(double a,double b,double c) {
		if(a==0) {
			ptb1(b,c);
		}else {
			double D = Math.pow(b, 2) -4*a*c;
			if(D<0) {
				System.out.println("Phương trình vô nghiệm");
			}else if(D==0) {
				System.out.println("Phương trình có nghiệm kép: x1 = x2 ="+(-b/(2*a)));
			}else if(D>0){
				System.out.println("Phương trình có 2 nghiệm phân biệt:");
				System.out.println("X1 = "+((-b + Math.sqrt(D))/(2*a))+"\nX2 = "+((-b - Math.sqrt(D))/(2*a)));
			}
		}
		
	}
	// 1 hàm tĩnh không chỉ được gọi từ 1 đối tượng
	// 1 hàm tĩnh(static) có thể được gọi từ 1 đối tượng hoặc tên lớp
	// hàm tĩnh phải được gọi bên trong hàm tĩnh => hạn chế viết hàm tĩnh
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double a,b,c;
		System.out.println("Nhập số thực A: "); a=sc.nextDouble();
		System.out.println("Nhập số thực B: "); b=sc.nextDouble();
		System.out.println("Nhập số thực C: "); c=sc.nextDouble();
		System.out.println("Giải phương trình bậc 2: ");
		ptb2( a, b, c);
	}
}
