package Buoi3;

import Buoi2.Diem;

public class SDdoanThang {

	public static void main(String[] args) {
		Diem A = new Diem(2, 3), B = new Diem(20, 35);
		doanThang AB = new doanThang(A, B);
		AB.inDoanThang();
		AB.tinhTienDoanThang(5, 3);
		AB.inDoanThang();
		doanThang CD = new doanThang();
		CD.nhapDoanThang();
		CD.inDoanThang();
	}
}
