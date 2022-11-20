package Buoi3;
import Buoi2.Diem;
public class doanThang {
	private Diem d1,	//Điểm đầu
				 d2;	//Điểm cuối
	//Hàm xây dựng
	public doanThang() {
		d1 = d2 = new Diem();
	}
	public doanThang(Diem A, Diem B) { //Phương thức xây dựng sao chép
		d1 = new Diem(A);
		d2 = new Diem(B);
	}
	public doanThang(int ax,int ay,int bx,int by) {
		d1 = new Diem(ax, ay);
		d2 = new Diem(bx, by);
	}
	public doanThang(doanThang DT) {
		d1 = new Diem(DT.d1);
		d2 = new Diem(DT.d2);
	}
	//Phương  thức nhập
	public void nhapDoanThang() {
		System.out.println("Điểm đầu");
		d1 = new Diem();
		d1.nhapDiem();
		System.out.println("Điểm cuối");
		
		do {
			d2 = new Diem();
			d2.nhapDiem();
			if(d1.getX() == d2.getX() && d1.getY() == d2.getY()) {
				System.out.println("\tLoi! Vi diem cuoi trung voi diem dau vui long nhap lai.");
			}
		}while(d1.getX() == d2.getX() && d1.getY() == d2.getY());
	}
	//Phương thức in
	public void inDoanThang() {
		System.out.println("\tIn doan thang:");
		System.out.println("Điểm đầu: ");
		d1.InDiem();
		System.out.println("Điểm cuối: ");
		d2.InDiem();
	}
	public String toString() {
		return "\nĐiểm đầu: "+d1+"\t,Điểm cuối:"+d2;
	}
	//Tịnh tiến đoạn thẳng đi 1 dộ dời (dx, dy) nào đó.
	public void tinhTienDoanThang(int dx,int dy) {
		d1.doiDiem2(dx, dy);
		d2.doiDiem2(dx, dy);
	}
	//Tính độ dài của đoạn thẳng
	public float doaiDoanThang() {
		return (float)(Math.sqrt(Math.pow(d2.getX() - d1.getX(), 2) + Math.pow(d2.getY() - d1.getY(), 2)));
	}
	//Trung điểm của đoạn thẳng
	public void trungDiem() {
		System.out.println("\tTrung điểm của đoạn thẳng:");
		System.out.println("X = "+((d1.getX()+d2.getX())/2));
		System.out.println("Y = "+((d1.getY()+d2.getY())/2));
	}
	//Khoảng cách giữa hai điểm của đoạn thằng
	public float chieuDaiDoanThang() {
		return d1.khoangCachDiem(d2);
	}
}

