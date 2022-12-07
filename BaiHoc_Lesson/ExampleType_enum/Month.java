package BaiHoc_Lesson.ExampleType_enum;

public enum Month {	//Thuong thi kieu enum se bi gioi han ve gia tri
	January(31),
	February(29),
	March(31),
	April(30),
	May(31),
	June(30),
	July(31),
	August(31),
	September(30),
	October(31),
	November(30),
	December(31);
	
	private final int soNgay;
	Month(int soNgay){	//Dua gia tri khac vao enum
		this.soNgay = soNgay;
	}
	public int soNgay() {
		return soNgay; 
	}
	
}
