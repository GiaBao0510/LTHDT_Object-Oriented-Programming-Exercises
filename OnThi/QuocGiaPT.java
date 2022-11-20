package OnThi;

import java.util.Scanner;

public class QuocGiaPT extends QuocGia{
	private float ttho,				//Tuoi tho
					dtich;			//Dien tich									
	private String chluc;			//Chau luc
	//Ham xay dung
	public QuocGiaPT() {
		super();
		ttho = dtich = 0;
		chluc = new String();
	}
	public QuocGiaPT(String msqg, String tenqg, String tenthudo,float GDP,float ttho,float dtich,String chluc) {
		super(msqg, tenqg, tenthudo, GDP);
		this.ttho = ttho;
		this.dtich = dtich;
		this.chluc = new String(chluc);
	}
	public QuocGiaPT(QuocGiaPT x) {
		super(x);
		this.ttho = x.ttho;
		this.dtich = x.dtich;
		this.chluc = new String(x.chluc);
	}
	//Ham nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		do {
			System.out.print("Nhap tuoi tho cua quoc gia: "); ttho = sc.nextFloat();
			System.out.print("Nhap dien tich cua quoc gia: "); dtich = sc.nextFloat();
			if(ttho<0 || dtich<0) {
				System.out.println("Tuoi tho hoac dien tich cua quoc gia nho hon 0. Xin vui long nhap lai.");
			}
		}while(ttho<0 || dtich<0);
		
		System.out.println("\tHay chon ky tu cua moi chau luc: \n(A)chau A.\n(W)chau Au.\n(M)chau My.\n(U)chau Uc.\n(P)chau phi.");
		do {
			sc.nextLine();
			System.out.print("Moi chon ky tu: "); chluc = sc.nextLine();
			if(chluc.compareTo("A")!=0 &&
				chluc.compareTo("W")!=0 &&
				chluc.compareTo("M")!=0 &&
				chluc.compareTo("U")!=0 &&
				chluc.compareTo("P")!=0) {
				System.out.println("\tKhong hop le.Xin vui long nhap lai.");
			}
		}while(chluc.compareTo("A")!=0 &&
				chluc.compareTo("W")!=0 &&
				chluc.compareTo("M")!=0 &&
				chluc.compareTo("U")!=0 &&
				chluc.compareTo("P")!=0);
	}
	//Ham in
	public void in() {
		super.in();
		System.out.println("Dien tich: "+dtich+"\t ;Tuoi tho: "+ttho);
		System.out.println("Chau luc: ");
		switch(chluc) {
			case "A": 
				System.out.print("Chau A");
				break;
			case "W": 
				System.out.print("Chau Au");
				break;
			case "M": 
				System.out.print("Chau My");
				break;
			case "U": 
				System.out.print("Chau Uc");
				break;
			case "P": 
				System.out.print("Chau Phi");
				break;
		}
	}
	public String toString() {
		String S = new String();
		S+="\nDien tich: "+dtich+"\t ;Tuoi tho: "+ttho;
		S+="\nChau luc: ";
		switch(chluc) {
		case "A": 
			S+=("Chau A");
			break;
		case "W": 
			S+=("Chau Au");
			break;
		case "M": 
			S+=("Chau My");
			break;
		case "U": 
			S+=("Chau Uc");
			break;
		case "P": 
			S+=("Chau Phi");
			break;
		}
		return S;
	}
	//Get & Set
	public float getTtho() {
		return ttho;
	}
	public void setTtho(float ttho) {
		this.ttho = ttho;
	}
	public float getDtich() {
		return dtich;
	}
	public void setDtich(float dtich) {
		this.dtich = dtich;
	}
	public String getChluc() {
		return chluc;
	}
	public void setChluc(String chluc) {
		this.chluc = chluc;
	}
	
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong quoc gia: "); n = sc.nextInt();
		if(n>0) {
			QuocGiaPT ds[] = new QuocGiaPT[n];
			//Nhap
			for(int i=0;i<n;i++) {
				System.out.println("---------- Nhap thong tin quoc gia thu "+(i+1)+" : ----------");
				ds[i]= new QuocGiaPT();
				ds[i].nhap();
			}
			//in
			for(int i=0;i<n;i++) {
				System.out.println("\n---------- Thong tin quoc gia thu "+(i+1)+" : ----------");
				ds[i].in();
			}
			//Hien thi ten cac quoc gia chau phi va co GDP >= 500
			System.out.println("\n\tThong tin cac quoc gia chau phi co GDP >= 500:");
			for(int i=0;i<n;i++) {
				if(ds[i].getChluc().compareTo("P")==0 && ds[i].getGDP()>=500) {
					ds[i].in();
				}
			}
		}else {
			System.out.println("Khong co quoc gia nao.");
		}
		
	}
}
