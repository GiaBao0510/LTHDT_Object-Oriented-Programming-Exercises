package BaiHoc_Lesson.ExampleType_enum;
public enum ScoresInCanThoUniversity {
	A(4),
	B(3),
	C(2),
	D(1),
	F(0);
	private final int diem;
	ScoresInCanThoUniversity (int diem){
		this.diem = diem;
	}
	public int ScoresInCanThoUniversity() {
		return diem;
	}
}
