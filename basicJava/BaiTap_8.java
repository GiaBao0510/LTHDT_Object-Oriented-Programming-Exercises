import java.util.Scanner;

public class BaiTap_8 {
	int a[];

	public void nhap(int n) {
		String soNguyen;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập số lượng phần tử: ");
			soNguyen = sc.nextLine();
			try {
				n = Integer.parseInt(soNguyen);
			} catch (Exception K) {
				System.out.println("Lỗi! vui lòng nhập lại");
				n = Integer.MIN_VALUE;
			}
		} while (n == Integer.MIN_VALUE);
		a = new int[n];
		for (int i = 0; i < a.length; i++) {
			System.out.print("[" + i + "] = ");
			a[i] = sc.nextInt();
		}
	}

	public void in() {
		System.out.println("In :");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public int timKiem(int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return 1;
			}
		}
		return 0;
	}

	public void Insertionsort() {
		for(int i=0;i<a.length;i++) {
			int j=i;
			while((j>0) && a[j]<a[j-1]) {
				int t =a[j];
				a[j]=a[j-1];
				a[j-1]=t;
				j--;
			}
		}
	}
	public static void main(String[] args) {
		BaiTap_8 t = new BaiTap_8();
		int n=0;
		t.nhap(n);
		t.in();
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào một giá trị cần tìm: ");
		x = sc.nextInt();
		if (t.timKiem(x) == 1) {
			System.out.println("Tìm thấy " + x);
		} else {
			System.out.println("Không tìm thấy " + x);
		}
		System.out.println("Sắp xếp: ");
		t.Insertionsort();
		t.in();
	}
}
