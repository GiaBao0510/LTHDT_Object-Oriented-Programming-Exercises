package OnThi;

import java.util.Scanner;

public class QuocGia {
	private String msqg,		//Ma so quoc gia
					tenqg,		//Ten quoc gia
					tenthudo;	//Ten thu do
	private float GDP;
	//Ham xay dung
	public QuocGia() {
		msqg = tenqg =tenthudo = new String();
		GDP = 0;
	}
	public QuocGia(String msqg, String tenqg, String tenthudo,float GDP) {
		this.msqg = new String(msqg);
		this.tenqg = new String(tenqg);
		this.tenthudo = new String(tenthudo);
		this.GDP = GDP;
	}
	public QuocGia(QuocGia x) {
		this.msqg = new String(x.msqg);
		this.tenqg = new String(x.tenqg);
		this.tenthudo = new String(x.tenthudo);
		this.GDP = x.GDP;
	}
	//Nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		//Kiem tra ma so quoc gia
		do {
			System.out.print("Nhap ma so quoc gia: "); msqg = sc.nextLine();
			if(msqg.length()<1) {
				System.out.println("\tKy tu ma so quoc gia phai lon hon 1.Xin vui long nhap lai.");
			}
		}while(msqg.length()<1);
		//Kiem tra ten quoc gia
		do {
			System.out.print("Nhap ten quoc gia: "); tenqg = sc.nextLine();
			if(tenqg.length()<1) {
				System.out.println("\tKy tu ten quoc gia phai lon hon 1.Xin vui long nhap lai.");
			}
		}while(tenqg.length()<1);
		//Kiem tra ten thu do 
		do {
			System.out.print("Nhap ten thu do: "); tenthudo = sc.nextLine();
			if(tenthudo.length()<0) {
				System.out.println("\tKy tu thu do cua quoc gia phai lon hon 1.Xin vui long nhap lai.");
			}
		}while(tenthudo.length()<0);
		//Kiem tra GDP
		do {
			System.out.print("Nhap GDP cua quoc gia: "); GDP = sc.nextFloat();
			if(GDP<0) {
				System.out.println("GDP cua quoc gia phai lon hon 0.Xin vui long nhap lai.");
			}
		}while(GDP<0);
		
	}
	//In
	public void in() {
		System.out.println("Quoc gia: "+tenqg+"\t ;Ma so quoc gia: "+msqg);
		System.out.println("Thu do: "+tenthudo+"\nGDP: "+GDP);
	}
	public String toString() {
		return "\nQuoc gia: "+tenqg+"\t ;Ma so quoc gia: "+msqg+"\nThu do: "+tenthudo+"\nGDP: "+GDP;
	}
	//Get & Set
	public String getMsqg() {
		return msqg;
	}
	public void setMsqg(String msqg) {
		this.msqg = msqg;
	}
	public String getTenqg() {
		return tenqg;
	}
	public void setTenqg(String tenqg) {
		this.tenqg = tenqg;
	}
	public String getTenthudo() {
		return tenthudo;
	}
	public void setTenthudo(String tenthudo) {
		this.tenthudo = tenthudo;
	}
	public float getGDP() {
		return GDP;
	}
	public void setGDP(float gDP) {
		GDP = gDP;
	}
	//Ham main
	public static void main(String[] args) {
		QuocGia qg1 = new QuocGia();
		qg1.nhap();
		QuocGia qg2 = new QuocGia(qg1);
		qg2.in();
	}
}
