package BaiHoc_Lesson.Map_Struct;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BangTuanHoan {
	private Map<String, String> ngto ;
	//Ham xay dug
	public BangTuanHoan() {	//Mac dinh khoi tao la dung lop HashMap
		ngto = new HashMap<String, String>();
	}
	public BangTuanHoan(Map<String, String> ngto) {
		this.ngto = new HashMap<String, String>(ngto);
	}
	public BangTuanHoan(BangTuanHoan X) {
		this.ngto = new HashMap<String, String>(X.ngto);
	}
	//them
	public String themNguyenTo(String kyHieu,String YNghia) {
		return ngto.put(kyHieu, YNghia);
	}
	//Xoa 1 khoa
	public String xoa_1NguyenTo(String kyHieu) {
		return ngto.remove(kyHieu);
	}
	//.replace(K,New Value) dung de sua gia tri cua khoa can tim
	public String suaGiaTriNguyenTo(String kyHieu,String YNghiaMoi) {
		return ngto.replace(kyHieu, YNghiaMoi);
	}
	//Gia tri cua khoa
	public String NguyenTo(String kyHieu) {
		return this.ngto.get(kyHieu);
	}
	//In cac ki hieu trong bang tuan hoan
	public void InBangTanHoan() {
		Set<String> tapHopyHieu = ngto.keySet();
		System.out.println(Arrays.toString(tapHopyHieu.toArray()));
	}
	//so luong cac ky hieu
	public int soLuong() {
		return this.ngto.size();
	}
	//Xoa het tat ca cac ky hieu
	public void xoaHet() {
		this.ngto.clear();
	}
	//.containKey() Kiem tra xem trong danh sach co chua khoa can tim khong
	public boolean kiemTraKyHieu(String kyHieu) {
		return this.ngto.containsKey(kyHieu);
	}
	//.containValue() Kiem tra xem trong danh sach co chua khoa can tim khong
	public boolean kiemTraNguyenTo(String nguyenTo) {
		return this.ngto.containsValue(nguyenTo);
	}
	// .empty() Kiem tra trong HashMap co trong hay khong
	public boolean HashMap_Rong() {
		return this.ngto.isEmpty();
	}
}
