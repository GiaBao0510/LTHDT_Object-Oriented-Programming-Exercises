package Buoi2;
import java.util.Scanner;
public class PhanSo {
//Thuộc tính	
	private int tu, mau;

//Phương thức	
	// Hàm xây dựng mặc nhiên tự động gọi
	public PhanSo() {
		this.tu = 1;
		this.mau = 1;

	}

	public PhanSo(int x, int y) {
		this.tu = x;
		this.mau = y;
	}

	// Hàm xây dựng nhiều đối số
	public void PhanSo(int x, int y) {
		this.tu = x;
		this.mau = y;
	}

	// Hàm kiểm tra mẫu số có bằng 0 hay không
	public boolean mauSoLa0() {
		if (this.mau == 0) {
			return true;
		}
		return false;
	}

	// Hàm nhập giá trị phân số
	public void nhapPhanSo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập tử số: ");
		this.tu = sc.nextInt();
		do {
			System.out.print("Nhập mẫu số: ");
			this.mau = sc.nextInt();
			if (this.mau == 0) {
				System.out.println("Vì mẫu số bằng 0. Vui lòng nhập lại");
			}
		} while (this.mau == 0);
	}

	// Rút gọn phân số
	public void rutgon() {
		int a = Math.abs(this.tu), b = Math.abs(this.mau);
		int uocChungLonNhat = 1;
		if (a == 0 || b == 0) {
			uocChungLonNhat = a + b;
		}
		while (a != b) {
			if (a > b) {
				a -= b;
			} else if (a < b) {
				b -= a;
			}
			uocChungLonNhat = a;
		}
		this.tu/=uocChungLonNhat;
		this.mau/=uocChungLonNhat;
	}

	// Hàm In phân số
	public void HienThiPhanSo1() {
		System.out.println("Hiển thị phân số: ");
		if (this.tu == 0) {
			System.out.println(0);
		} else if (this.mau == 1) {
			System.out.println(this.tu);
		} else if ((this.tu < 0 && this.mau < 0) || (this.tu > 0 && this.mau > 0)) {
			System.out.println(this.tu + "/" + this.mau);
		} else if ((this.tu < 0 && this.mau > 0) || (this.tu > 0 && this.mau < 0)) {
			System.out.println((-this.tu) + "/" + this.mau);
		}
	}
	//Hàm gán phân số này thành phân Số kia
	public void ganPhanSo(PhanSo obj) {
		this.tu=obj.tu;
		this.mau=obj.mau;
	}
	// Hàm nghịch đảo phân số
	public void NghichDao() {
		if (this.mau != 0 && this.tu != 0) {
			int x = this.tu;
			this.tu = this.mau;
			this.mau = x;
		}
	}

	// Hàm tính ra phân số nghịch đảo của một phân số
	public PhanSo giaTriNghichDao() {
		PhanSo a = new PhanSo(this.mau, this.tu);
		return a;
	}

	// Hàm tính giá trị thực của phân số
	public float giaTriThuc() {
		return ((float)this.tu/(float)this.mau);
	}

	// Hàm so sánh lớn hơn giữa 2 phân số
	public boolean lonHon(PhanSo A) {
		if (this.giaTriThuc() > A.giaTriThuc()) {
			return true;
		}
		return false;
	}

	// Cộng trừ nhân chia giữa hai phân số
	// Hàm cộng
	public PhanSo cong(PhanSo A) {
		PhanSo kq = new PhanSo();
		kq.tu = this.tu*A.mau + this.mau*A.tu;
		kq.mau = this.mau*A.mau;
		kq.rutgon();
		return kq;
	}

	// Hàm trừ
	public PhanSo tru(PhanSo A) {
		PhanSo kq = new PhanSo();
		kq.tu = this.tu*A.mau - this.mau*A.tu;
		kq.mau = this.mau*A.mau;
		kq.rutgon();
		return kq;
	}

	// Hàm nhân
	public PhanSo nhan(PhanSo A) {
		PhanSo kq = new PhanSo();
		kq.tu = this.tu*A.tu;
		kq.mau = this.mau*A.mau;
		kq.rutgon();
		return kq;
	}

	// Hàm chia
	public PhanSo chia(PhanSo A) {
		PhanSo kq = new PhanSo();
		kq.tu = this.tu*A.mau;
		kq.mau = this.mau*A.tu;
		kq.rutgon();
		return kq;
	}

	// Hàm cộng trừ nhan chia giữa phân số với một số nguyên
	// Cộng
	public PhanSo cong(int N) {
		PhanSo kq = new PhanSo();
		kq.tu = this.tu + this.mau*N;
		kq.mau = this.mau;
		kq.rutgon();
		return kq;
	}

	// Trừ
	public PhanSo tru(int N) {
		PhanSo kq = new PhanSo();
		kq.tu = this.tu - this.mau*N;
		kq.mau = this.mau;
		kq.rutgon();
		return kq;
	}

	// NHân
	public PhanSo nhan(int N) {
		PhanSo kq = new PhanSo();
		kq.tu = this.tu * N;
		kq.mau = this.mau;
		kq.rutgon();
		return kq;
	}

	// Chia
	public PhanSo chia(int N) {
		PhanSo kq = new PhanSo();
		kq.tu = this.tu ;
		kq.mau = this.mau *N;
		kq.rutgon();
		return kq;
	}
	// Quy đồng giữa hai phân số
	public void QuyDongGiua2PhanSo(PhanSo A) {
		int mauChung = this.mau * A.mau;
		if (A.mau % this.mau == 0) {
			mauChung = A.mau;
		}

	}
}

