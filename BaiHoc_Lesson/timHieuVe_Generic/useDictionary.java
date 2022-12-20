package BaiHoc_Lesson.timHieuVe_Generic;

import java.util.Scanner;

public class useDictionary {

	public static void main(String[] args) {
		//Khai bao du lieu
		Word<String,String>[] tu= new Word[] 
				{
				new Word<>("C","C là một ngôn ngữ lập trình tương đối nhỏ gọn vận hành gần với phần cứng và nó giống với ngôn ngữ Assembler hơn hầu hết các ngôn ngữ bậc cao. "),
				new Word<>("Java","Java là một trong những ngôn ngữ lập trình hướng đối tượng. Nó được sử dụng trong phát triển phần mềm, trang web, game hay ứng dụng trên các thiết bị di động"),
				new Word<>("html","HTML là một ngôn ngữ đánh dấu được thiết kế ra để tạo nên các trang web trên World Wide Web. Nó có thể được trợ giúp bởi các công nghệ như CSS và các ngôn ngữ kịch bản giống như JavaScript."),
				new Word<>("SQL","SQL, dịch là Ngôn ngữ truy vấn mang tính cấu trúc, là một loại ngôn ngữ máy tính phổ biến để tạo, sửa, và lấy dữ liệu từ một hệ quản trị cơ sở dữ liệu quan hệ."),
				new Word<>("ShellScript","Câu lệnh shell (tiếng Anh: Shell script) là một chương trình máy tính được thiết kế để chạy hoặc thực thi bởi Unix shell bởi một trình thông dịch theo dòng lệnh."),
				new Word<>("UML","Ngôn ngữ mô hình hóa thống nhất là một ngôn ngữ mô hình gồm các ký hiệu đồ họa mà các phương pháp hướng đối tượng sử dụng để thiết kế các hệ thống thông tin một cách nhanh chóng"),
				new Word<>("Python","Python là một ngôn ngữ lập trình bậc cao cho các mục đích lập trình đa năng, do Guido van Rossum tạo ra và lần đầu ra mắt vào năm 1991."),
				new Word<>("PHP","PHP: Hypertext Preprocessor, thường được viết tắt thành PHP là một ngôn ngữ lập trình kịch bản hay một loại mã lệnh chủ yếu được dùng để phát triển các ứng dụng viết cho máy chủ, mã nguồn mở, dùng cho mục đích tổng quát. Nó rất thích hợp với web và có thể dễ dàng nhúng vào trang HTML"),
				new Word<>("Ruby","Ruby là một ngôn ngữ lập trình hướng đối tượng, có khả năng phản ứng."),
				new Word<>("C++","C++ là một loại ngôn ngữ lập trình bậc trung. Đây là ngôn ngữ lập trình đa năng được tạo ra bởi Bjarne Stroustrup như một phần mở rộng của ngôn ngữ lập trình C, hoặc \"C với các lớp Class\""),
				};
		//Nap du lieu thong qua phuong thuc khoi tao
		Dictionary<String, String> dictionary = new Dictionary<>(tu);
		Scanner sc =new Scanner(System.in);
		String chon = new String();
		do {
			System.out.println("Nhap ngon ngu ban muon biet hoac nhan 'q' de thoat: ");
			chon = sc.nextLine();
			String ketQua =  dictionary.findWord(chon); //Tra cuu
			if(ketQua.equalsIgnoreCase("null") == true) {
				System.out.println("Khong tim thay ngon ngu ban tim.");
			}else {
				System.out.println(ketQua);
			}
		}while(chon != null && !chon.equalsIgnoreCase("q"));
		
	}
}
