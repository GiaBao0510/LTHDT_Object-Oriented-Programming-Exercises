package BaiHoc_Lesson.timHieuVe_Generic;

public class useBOX {

	public static void main(String[] args) {
		BOX b1 = new BOX<Integer>(15);
		System.out.println(b1.getValue());
		
		BOX pi = new BOX<Float>(3.15f);
		System.out.println(pi.getValue());
		
		BOX ten = new BOX<String>("Gia Bao");
		System.out.println(ten.getValue());
	}

}
