package OnThi;

import java.util.Scanner;

public class KySu extends CanBo{
	private String nganhDT; //Nganh dao tao
	//Ham xay dung
	public KySu() {
		super();
		nganhDT = new String();
	}
	public KySu(String HoTen, String dchi, int Tuoi, int sex,String nganhDT) {
		super(HoTen, dchi, Tuoi, sex);
		this.nganhDT = new String(nganhDT);
	}
	public KySu(KySu x) {
		super(x);
		this.nganhDT = new String(x.nganhDT);
	}
	//Ham xay dung
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap nganh dao tao: "); nganhDT = sc.nextLine();
	}
	//in 
	public void in() {
		super.in();
		System.out.println("Nganh dao tao: "+nganhDT);
	}
	public String toString() {
		String S = new String();
		S+= super.toString();
		S+="\nNganh dao tao: "+nganhDT;
		return S;
	}
	//Get & Set
	public String getNganhDT() {
		return nganhDT;
	}
	public void setNganhDT(String nganhDT) {
		this.nganhDT = nganhDT;
	}
}
