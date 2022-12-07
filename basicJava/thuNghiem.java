package basicJava;
import java.util.Scanner;
import java.util.StringTokenizer;

public class thuNghiem extends thiNghiem{
	
	public static void main(String[] args) {
		int i=1,j=10;
		do {
			
			i++;
			--j;
			System.out.println("i = "+i+" ;j = "+j);
		}while(i<5);
		System.out.println("i = "+i+" ;j = "+j);
	}

}
