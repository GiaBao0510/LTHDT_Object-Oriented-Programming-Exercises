package BaiHoc_Lesson.ExampleType_enum;

public class TimeTable {
	private Day thu;		//Chi nhan cac gia tri co trong enum Day
	private String monHoc;
	//Ham xay dung
	public TimeTable(){
		thu = null;
		monHoc = new String();
	}
	public TimeTable(Day thu,String monHoc) {
		this.thu = thu;
		this.monHoc = new String(monHoc);
	}
	public TimeTable(TimeTable x) {
		this.thu = x.thu;
		this.monHoc = new String(x.monHoc);
	}
	//Ham in
	public String toString() {
		return "Thu "+thu+"\t;Mon hoc: "+monHoc;
	}
	//Get&Set
	public Day getThu() {
		return thu;
	}
	public void setThu(Day thu) {
		this.thu = thu;
	}
	public String getMonHoc() {
		return monHoc;
	}
	public void setMonHoc(String monHoc) {
		this.monHoc = monHoc;
	}
	
}
