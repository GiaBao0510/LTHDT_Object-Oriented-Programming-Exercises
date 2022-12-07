package basicJava;
import java.util.Scanner;

public class BaiTap_16 {
	public void DaoChuoi(String chuoi) {
		System.out.println("Đảo chuỗi: ");
		for(int i=0;i<chuoi.length();i++) {
			System.out.print(chuoi.charAt(chuoi.length()-i-1));
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String chuoi;
		BaiTap_16 t = new BaiTap_16();
		System.out.println("Nhập vào một chuỗi ký tự: "); chuoi=sc.nextLine();
		t.DaoChuoi(chuoi);
	}
}
