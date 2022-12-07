package basicJava;
import java.util.Scanner;

public class BaiTap_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hoTen;
		System.out.println("Nhập họ và tên: ");
		hoTen = sc.nextLine();
		hoTen = hoTen.trim();// Loại bỏ khoảng trắng đầu và cuối
		System.out.println("Họ & tên: "+hoTen);
		int ho = hoTen.indexOf(" "),//Trả về vị trí của chuỗi cần tìm tìm từ trái sang phải
			ten = hoTen.lastIndexOf(" ");//Trả về vị trí của chuỗi cần tìm tìm từ phải sang trái
		System.out.println("Họ: "+hoTen.substring(0,ho)+"\nTên: "+hoTen.substring(ten));
	}
}
