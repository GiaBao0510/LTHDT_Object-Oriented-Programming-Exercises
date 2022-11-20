package Buoi2;
import java.util.Scanner;
public class Diem {
	private int x,y;
	//Hàm mặc nhiên
	public Diem() {
		x=0;
		y=0;
	}
	public Diem(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public Diem(Diem X) {//Phương thức xây dựng sao chép
		this.x=X.x;
		this.y=X.y;
	}
	//Hàm xây dựng 2 tham số
	public void Diem(int x1,int y1) {
		this.x=x1;
		this.y=y1;
	}
	//Nhập tọa độ cho điểm từ bàn phím
	public void nhapDiem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tại tung hoành X: "); x=sc.nextInt();
		System.out.println("Nhập tại tung độ Y: "); y=sc.nextInt();
	}
	//In điểm ra màn hình
	public String toString() {
		System.out.println("\tIn điểm cách 1: " );
		return ("X = "+this.x+", Y = "+this.y);
	}
	public void InDiem() {
		System.out.println("\nX = "+this.x+", Y = "+this.y );
	}
	//Dời điểm đi 1 độ dời(dx,dy)
	public void doiDiem1(int dx,int dy) {
		System.out.println("\t Độ dời điểm không thay đổi giá trị");
		System.out.println("Độ dời khi chuyển động từ "+this.x+" đến "+dx+" là: "+(this.x+dx));
		System.out.println("Độ dời khi chuyển động từ "+this.y+" đến "+dy+" là: "+(this.y+dy));
	}
	public void doiDiem2(int dx,int dy) {
		System.out.println("\t Độ dời điểm có thay đổi giá trị");
		x+=dx;
		y+=dy;
	}
	//Trả về giá trị tại hoành độ
	public int giaTriX() {
		return this.x;
	}
	//Trả về giá trị tại tung độ 
	public int giaTriY() {
		return this.y;
	}
	//tính khoảng cách từ một điểm đến gốc tọa độ
	public void khoangCachDenGocToaDo() {
		float kq = (float)(Math.sqrt(Math.pow(this.x,2) + Math.pow(this.y,2)));//ép kiểu tường minh
		System.out.println(kq);
	}
	//Tính khoảng cách giữa hai điểm từ điểm này đến điểm kia
	public void khoangCach2Diem(Diem Y) {
		float kq= (float)( Math.sqrt(Math.pow(Y.x - this.x, 2) + Math.pow(Y.y - this.y, 2)) );
		System.out.println(kq);
	}
	public float khoangCachDiem(Diem Y) {
		float kq= (float)( Math.sqrt(Math.pow(Y.x - this.x, 2) + Math.pow(Y.y - this.y, 2)) );
		return kq;
	}
	//Đối xứng của một điêm
	public void doiXung(Diem M) {
		this.x = -M.x;
		this.y = -M.y;
	}
	//Hàm get & set
		public int getX() {
			return this.x;
		}
		public int getY() {
			return y;
		}
		public void setX(int X) {
			x=X;
		}
		public void setY(int Y) {
			y=Y;
		}
}
