package Buoi4;
import java.util.Scanner;

import Buoi2.CBCC;
public class CBGD extends CBCC{	//Can bo giang day
	private int nambdgd;	//Nam Bat dau giang day
	private String hocvi;	//Hoc vi
	//Ham xay dung
	public CBGD() {
		super();
		nambdgd =0;
		hocvi = new String();
	}
	public CBGD(String masocb,String hoten,float hesoluong,int namsinh,int nambdgd,String hocvi) {
		super(masocb,hoten,hesoluong,namsinh);
		this.nambdgd = nambdgd;
		this.hocvi = new String(hocvi);
	}
	public CBGD(CBGD x) {
		super(x);
		this.nambdgd = x.nambdgd;
		this.hocvi = new String(x.hocvi);
	}
	//Ham nhap
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap nam bat dau giang day:");nambdgd = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap hoc vi: ");hocvi = sc.nextLine();
	}
	//Ham in
	public void in() {
		super.in();
		System.out.println("Hoc vi: "+hocvi+"\t .Nam bat dau giang day: "+nambdgd);
	}
	public String toString() {
		return super.toString()+"\nHoc vi: "+hocvi+"\t .Nam bat dau giang day: "+nambdgd;
	}
	//Get & Set
	public int getNambdgd() {
		return nambdgd;
	}
	public String getHocVi() {
		return hocvi;
	}
	public void setNambdgd(int x) {
		this.nambdgd = x;
	}
	public void setHocVi(String x) {
		this.hocvi = new String(x);
	}
}
