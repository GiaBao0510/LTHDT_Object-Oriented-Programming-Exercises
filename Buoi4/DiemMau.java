package Buoi4;
import java.util.Scanner;
import Buoi2.Diem;
public class DiemMau extends Diem{ //tham chieu den lop cha
	private String Mau;
	//Cac ham xay dung
	public DiemMau() {	/*Bị nạp đè*/
		super();// Bien Super dung de tham chieu den bien cha gan nhat. VD: Diem()
		Mau = new String();
	}
	public DiemMau(int x,int y, String mau) {	/*Bị nạp đè*/
		super(x,y);//Bien super dung den nhan gia tri x,y vao phuong thuc Diem(x,y)
		Mau = new String(mau);
	}
	public DiemMau(DiemMau X) { //Phuong thuc xay dung sao chep
		super(X); /*Bị nạp đè*/
		Mau = new String(X.Mau);
	}
	//Ham nhap
	public void Nhap() {
		super.nhapDiem();/*Bị nạp đè*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap mau cho diem: "); Mau = sc.nextLine();
	}
	//Ham in thong tin
	public void In() {
		super.InDiem();/*Bị nạp đè*/
		System.out.println("Diem co mau: "+Mau);
	}
	public String toString() {/*Bị nạp đè*/
		return super.toString() +"\n"+ "Diem co mau: "+Mau;
	}
	//Get&Set
	public String getMau() {
		return Mau;
	}
	public void setMau(String x) {
		Mau = new String(x);
	}
}
