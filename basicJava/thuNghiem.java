import java.util.Scanner;

public class thuNghiem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Nhap so luong ma: "); n = sc.nextInt();
		String ds[] = new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			ds[i] = new String();
			System.out.print("Nhap ma thu "+(i+1)+" : "); ds[i] = sc.nextLine();
		}
		String tim = new String();
		System.out.print("Nhap ma can tim: "); tim = sc.nextLine();
		int l=0,r=n-1;
		int vet = -1;
		while(r>l) {
			if(ds[l].compareToIgnoreCase(tim) == 0) {
				vet = l;
				break;
			}
			if(ds[r].compareToIgnoreCase(tim) == 0) {
				vet = r;
				break;
			}
			l++;
			r--;
		}
		if(vet!=-1) {
			System.out.println("Tim thay "+ds[vet]+"O vi tri: "+(vet+1));
		}else {
			System.out.println("Khong tim thay");
		}
	}

}
