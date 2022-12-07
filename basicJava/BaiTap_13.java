package basicJava;
import java.util.Scanner;

public class BaiTap_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int int1, int2;
		char op;
		System.out.println("Nhập số nguyên thứ 1: ");
		int1 = sc.nextInt();
		System.out.println("Nhập số nguyên thứ 2: ");
		int2 = sc.nextInt();
		System.out.println("Nhập vào một toán tử: ");
		op = sc.next().charAt(0);
		switch (op) {
			case '+': {
				System.out.println(int1+" + "+int2+" = "+(int1+int2));
				break;
			}
			case '-': {
				System.out.println(int1+" - "+int2+" = "+(int1-int2));
				break;
			}
			case '*': {
				System.out.println(int1+" * "+int2+" = "+(int1*int2));
				break;
			}
			case '/': {
				System.out.println(int1+" / "+int2+" = "+(int1/int2));
				break;
			}
			case '%': {
				System.out.println(int1+" % "+int2+" = "+(int1%int2));
				break;
			}
			default:{
				System.out.println("Lỗi! Nhập sai.");
				break;
			}
		}
	}

}
