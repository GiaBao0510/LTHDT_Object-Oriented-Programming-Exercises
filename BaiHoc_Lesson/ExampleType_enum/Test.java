package BaiHoc_Lesson.ExampleType_enum;

public class Test {
	public static void main(String[] args) {
		TimeTable thu2 = new TimeTable(Day.Monday, "Toan - Vat ly - Hoa hoc"),
				  thu3 = new TimeTable(Day.Tuesday, "Ngu van - Linh su - Dia ly"),
				  thu4 = new TimeTable(Day.Wednesday,"GDCD - The duc"),
				  thu5 = new TimeTable(Day.Thursday, "Tin hoc - Toan");
		System.out.println(thu2);
		
		//Lay so ngay trong thang
		int x = Month.January.soNgay();
		System.out.println(x);
	}
}
