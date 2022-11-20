package Buoi5;

public class UseMoveable {
	public static void main(String[] args) {
		moveable X = new moveablePoint(5,5); /*Giao dien khong the tao doi tuong chinh no ma no phai tao doi tuong tu lop co goi no.Nhung doi tuong vua tao khong the 
truy cap vao cac phuong thuc cua no ,ma no phai tu goi phuong thuc trong giao ma no duoc goi*/
		X.moveDown();
		System.out.println(X);
		X.moveLeft();
		System.out.println(X);
		X.moveRight();
		System.out.println(X);
		X.moveUp();
		System.out.println(X);
		moveablePoint Z = new moveablePoint(10, 10);/*Neu lop su dung giao dien tao doi tuong thi no se su dung duoc cac ham ben trong cua no lan cac phuong thuc cua giao
dien*/
		Z.nhap();
		System.out.println(Z);
		Z.moveDown();
		System.out.println(Z);
		Z.moveUp();
		System.out.println(Z);
		Z.moveRight();
		System.out.println(Z);
		Z.moveRight();
		System.out.println(Z);
		//------------------------------------------------------------------
		moveable st1 = new moveableStudent("Gia Bao","b2016947");
		System.out.println(st1);
		st1.moveDown();
		st1.moveLeft();
		st1.moveRight();
		st1.moveUp();
		
		moveable list[] = new moveable[2];
		list[0] = new moveablePoint(8,8);
		System.out.println(list[0]);
		list[1] = new moveableStudent("Gia Bao","B2016947");
		System.out.println(list[1]);
	}
}
