package BaiHoc_Lesson.timHieuVe_Generic;

import java.util.Scanner;

//Kieu Generic se tu dong tim hieu no thuoc thuoc tinh kieu co ban hay thuoc tinh lop hay giao dien,... 
//Co the nghi no se la mot kieu bat ky
public class BOX<Flexible>/*Generic*/ {
	private Flexible value;
	//Ham xay dung
	public BOX() {//Xay dung khong doi so
		value = null;
	}
	public BOX(Flexible value) {//Xay dung co doi so
		this.value = value;
	}
	public BOX(BOX<Flexible> X) {//Xay dung sao chep sau
		this.value = X.value;
	}
	//Ham in
	public void in() {
		System.out.println("Gia tri: "+value);
	}
	public String toString() {
		return "\nGia tri: "+value;
	}
	//Get & Set
	public Flexible getValue() {
		return this.value;
	}
	public void setValue(Flexible X) {
		this.value = X;
	}
}
