package InputOutput_Java;

import java.io.*;
import java.util.Scanner;

public class docVaXuatRaTungDongCuaFile {
	/*Su dung lop BufferReader va BufferWrite la 2 lop con thua ke tu lop Reader va Write 
	 co ho tro vung dem, cung cap kha nang nhap xuat khoi ky tu thay vi theo tung ky tu.
	 Ngoai ra lop  BufferReader con cung cap phuong thuc readline() ung cap kha nang doc 1 dong
	 tu va tra ve 1 chuoi ky tu.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String duLieuVao = new String();
		System.out.println("Nhap duong dan tep tin de doc: "); duLieuVao = sc.nextLine();
		try{
			BufferedReader inFile =  new BufferedReader(new FileReader(duLieuVao));
			String line = new String();
			while((line = inFile.readLine()) != null) { //Neu chua doc het file du lieu thi tep tuc doc
				System.out.println(line);
			}
		}catch(IOException E){
			E.printStackTrace();
		}

	}

}
