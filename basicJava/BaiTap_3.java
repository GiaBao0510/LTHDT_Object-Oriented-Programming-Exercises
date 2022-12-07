package basicJava;
import java.util.Scanner;

public class BaiTap_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float f[],tong=0,max;
		f = new float[5];// Cấp phát bộ nhớ
		String soThuc;
		for(int i=0;i<f.length;i++) {
			System.out.println("Nhập vào 1 số thực: ");soThuc = sc.nextLine();
			try {
				f[i] = Float.parseFloat(soThuc);
			}catch(Exception F){
				f[i]=0;
			}
		}
		max=f[0];
		for(int i=0;i<f.length;i++) {
			tong+=f[i];
			if(f[i]>max) {
				max=f[i];
			}
		}
		System.out.println("Tổng là: "+tong+"\nGía trị lớn nhất là: "+max);
	}

}
