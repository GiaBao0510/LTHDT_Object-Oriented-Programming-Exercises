package basicJava;
import java.util.Scanner;
public class BaiTap_15 {
	public static void main(String[] args) {
		String chuoi,ketQua=" ";
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap 1 chuoi: "); chuoi=sc.nextLine();
		for(int i=0;i<chuoi.length();i++) {
			if(chuoi.charAt(i)==' ') {
				continue;
			}
			else if(chuoi.charAt(i)=='a'||chuoi.charAt(i)=='A') {
				ketQua+=" 2";
			}
			else if(chuoi.charAt(i)=='b'||chuoi.charAt(i)=='B') {
				ketQua+=" 22";
			}
			else if(chuoi.charAt(i)=='c'||chuoi.charAt(i)=='C') {
				ketQua+=" 222";
			}
			else if(chuoi.charAt(i)=='d'||chuoi.charAt(i)=='D') {
				ketQua+=" 3";
			}
			else if(chuoi.charAt(i)=='e'||chuoi.charAt(i)=='E') {
				ketQua+=" 33";
			}
			else if(chuoi.charAt(i)=='f'||chuoi.charAt(i)=='F') {
				ketQua+=" 333";
			}
			else if(chuoi.charAt(i)=='g'||chuoi.charAt(i)=='G') {
				ketQua+=" 4";
			}
			else if(chuoi.charAt(i)=='h'||chuoi.charAt(i)=='H') {
				ketQua+=" 44";
			}
			else if(chuoi.charAt(i)=='i'||chuoi.charAt(i)=='I') {
				ketQua+=" 444";
			}
			else if(chuoi.charAt(i)=='j'||chuoi.charAt(i)=='J') {
				ketQua+=" 5";
			}
			else if(chuoi.charAt(i)=='k'||chuoi.charAt(i)=='K') {
				ketQua+=" 55";
			}
			else if(chuoi.charAt(i)=='l'||chuoi.charAt(i)=='L') {
				ketQua+=" 555";
			}
			else if(chuoi.charAt(i)=='m'||chuoi.charAt(i)=='M') {
				ketQua+=" 6";
			}
			else if(chuoi.charAt(i)=='n'||chuoi.charAt(i)=='N') {
				ketQua+=" 66";
			}
			else if(chuoi.charAt(i)=='o'||chuoi.charAt(i)=='O') {
				ketQua+=" 666";
			}
			else if(chuoi.charAt(i)=='p'||chuoi.charAt(i)=='P') {
				ketQua+=" 7";
			}
			else if(chuoi.charAt(i)=='q'||chuoi.charAt(i)=='Q') {
				ketQua+=" 77";
			}
			else if(chuoi.charAt(i)=='r'||chuoi.charAt(i)=='R') {
				ketQua+=" 777";
			}
			else if(chuoi.charAt(i)=='s'||chuoi.charAt(i)=='S') {
				ketQua+=" 7777";
			}
			else if(chuoi.charAt(i)=='t'||chuoi.charAt(i)=='T') {
				ketQua+=" 8";
			}
			else if(chuoi.charAt(i)=='u'||chuoi.charAt(i)=='U') {
				ketQua+=" 88";
			}
			else if(chuoi.charAt(i)=='v'||chuoi.charAt(i)=='V') {
				ketQua+=" 888";
			}
			else if(chuoi.charAt(i)=='w'||chuoi.charAt(i)=='W') {
				ketQua+=" 9";
			}
			else if(chuoi.charAt(i)=='x'||chuoi.charAt(i)=='X') {
				ketQua+=" 99";
			}
			else if(chuoi.charAt(i)=='y'||chuoi.charAt(i)=='Y') {
				ketQua+=" 999";
			}
			else if(chuoi.charAt(i)=='z'||chuoi.charAt(i)=='Z') {
				ketQua+=" 9999";
			}
		}
		System.out.println(ketQua.trim());
	}
}
