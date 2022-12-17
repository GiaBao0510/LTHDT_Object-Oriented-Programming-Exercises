package OnThi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> ds; //Tao doi tuong
	//Ham xay xung/ConStructor
	public DanhSachSinhVien() {
		ds = new ArrayList<SinhVien>();
	}
	public DanhSachSinhVien(ArrayList<SinhVien> ds) {
		this.ds = ds;
	}
	//1.phuong thuc them sinh vien vao danh sach
	public void themSinhVien(SinhVien sv) {
		ds.add(sv); //Them 1 phan tu vao cuoi danh sach
	}
	public void themSinhVien(int x,SinhVien sv) {
		this.ds.add(x, sv); //Them sinh vien vao vi tri bat ky trong danh sach
	}
	//2.In cac gia tri cua doi tuong co trong danh sach
	public void In(SinhVien sv) {
		for(SinhVien x : this.ds) {
			System.out.println(x);
			System.out.println("--------------------------------------------------------");
		}
	}
	//3.Kiem tra danh sach sinh vien co rong khong
	public void DanhSachSV_Rong() {
		if(ds.isEmpty() == true) {
			System.out.println("Hien danh sach khong co sinh vien nao.");
		}else {
			System.out.println("Danh sach da co sinh vien.");
		}
	}
	//4.Lay so luong sinh vien trong danh sach
	public int soLuongSV() {
		return ds.size();	//Tra ve kich co cua Arraylist
	}
	//5.Lam rong danh sach sinh vien
	public void lamRongDSSV() {
		if(ds.size() == 0) {
			System.out.println("Vi danh sach da rong nen khong the lam rong.");
		}else {
			System.out.println("Da lam rong danh sach.");
			ds.clear();
		}
	}
	//6.Tim ma so sinh vien
	public boolean timKiemMSSV(SinhVien sv,String msct) {
		if(ds.size() == 0) {
			System.out.println("Hien danh sach khong co sinh vien nao");
			return false;
		}else {
			for (SinhVien s : ds) {
				if(s.getMssv().equals(msct)==true) {
					return true;
				}
			}
			return false;
		}
	}
	//7.Xoa sinh vien thong qua ma so sinh vien
	public boolean xoaSinhVienTheoMSSV(SinhVien sv,String mscx) {
		if(ds.isEmpty() == true) {
			System.out.println("Danh sach rong khong the xoa.");
			return false;
		}else {
			if(timKiemMSSV( sv, mscx) == true) {
				ds.remove(sv);
				return true;
			}else {
				return false;
			}
		}
	}
	//8.In ra danh sach theo ten cua sinh vien
	public void InDanhSachTheoTen(String ten) {
		for(SinhVien x : ds) {
			if(x.getHten().indexOf(ten) >= 0) { //Phuong thu indexOf() kiem tra neu co xuat hien tu nao do trong chuoi trung nhau thi se tra ve true
				System.out.println(x);
			}
		}
	}
	//9.Sap xep diem giam dan
	public void sapXepDiem_GiamDan() {
		Collections.sort(this.ds, new Comparator<SinhVien>() {

			
			public int compare(SinhVien sv1, SinhVien sv2) {
				//Neu sv1 > sv2 thi la -1
				if(sv1.getDtb() > sv2.getDtb()) {
					return -1;
				}//Neu sv1 == sv2 thi la 0
				else if(sv1.getDtb() == sv2.getDtb()){
					return 0;
				}//Neu sv1 < sv2 thi la 1
				else {
					return 1;
				}
				
			}

			
		});
	}
	
}
