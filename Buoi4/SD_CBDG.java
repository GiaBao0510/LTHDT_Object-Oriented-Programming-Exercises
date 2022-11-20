package Buoi4;

public class SD_CBDG {

	public static void main(String[] args) {
		CBGD ptphi = new CBGD();
		ptphi.nhap();
		ptphi.in();
		CBGD nvhai = new CBGD(ptphi),
			 nvba = new CBGD("12548", "zoro", 10, 1990, 2030, "Thuyen pho");
		nvba.in();
		nvhai.in();
	}

}
