package BaiHoc_Lesson.Map_Struct;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
	
public class Tu_Dien {
	private Map<String/*Key*/, String/*Value*/> tuDien;
						/*------------ 1.Ham xay dung ------------ */
	/*HashMap thi khi them cac khoa vao thi no khong quan tam den cac thu tu cua khoa */
	public void TuDien_HashMap(){
		this.tuDien = new HashMap<String, String>();
	}
	/*TreeMap thi khi them cac khoa vao thi no se sap xep lai cac khoa sau cho co thu tu */
	public void TuDien_TreeMap() {
		this.tuDien = new TreeMap<String, String>();
	}
	public Tu_Dien() { //Mac dinh khoi tao cho dung TreeMap
		tuDien = new TreeMap<String, String>();
	}
	public Tu_Dien(Map<String,String> X) {
		this.tuDien = X;
	}
	public Tu_Dien(Tu_Dien X) {
		this.tuDien = X.tuDien;
	}
	// .put(K,V) dung de day khoa va gia tri vao trong Map
	public String themTu(String khoa,String ynghia) {
		return this.tuDien.put(khoa, ynghia);
	}
	// .remove(K) dung de tim khoa trong Map va xoa no lan gia tri cua no
	public String xoaTu(String khoa) {
		return this.tuDien.remove(khoa);
	}
	// .get(K) dung de xac dinh khoa trong Map va se tra ve gia tri cua no
	public String traTu(String khoa) {
		return this.tuDien.get(khoa);
	}
	// .keySet() dung de liet ke tat het tat ca cac thu khoa co trong Map
	public void InTuKhoa() {
		Set<String> tapHopTuKhoa = this.tuDien.keySet();
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
 	}
	// .size() dung de tra va so luong khoa trong Map
	public int soLuongTu() {
		return this.tuDien.size();
	}
	// .clear() dung de xoa tat ca cac khoa lan gia tri trong Map
	public void xoaHet() {
		this.tuDien.clear();
	}
}
