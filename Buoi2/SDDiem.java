package Buoi2;

public class SDDiem {
	public static void main(String[] args) {
		Diem A = new Diem();
		A.Diem(3,4);
		A.InDiem();
		Diem B = new Diem();
		B.nhapDiem();
		B.InDiem();
		System.out.print("Khoảng cách từ điểm B đến tâm O: ");
		B.khoangCachDenGocToaDo();
		Diem C = new Diem();
		System.out.print("Khoảng cách từ điểm A đến B: ");
		A.khoangCach2Diem(B);
		System.out.println("Điểm C đối xứng với điểm B");
		C.doiXung(B);
		C.InDiem();
	}
}
