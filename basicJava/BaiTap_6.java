import java.util.Scanner;

public class BaiTap_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, kiemTra = 1;
		System.out.println("Kiểm tra số nguyên tố");
		System.out.println("Nhập vào 1  số nguyên: ");
		n = sc.nextInt();
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				kiemTra = 0;
			}
		}
		if (kiemTra == 1) {
			System.out.println(n + " Là số nguyên tố");
		} else {
			System.out.println(n + " không phải là số nguyên tố");
		}
	}
}
