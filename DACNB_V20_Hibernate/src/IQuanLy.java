
public interface IQuanLy {
	
	void ThemSinhVien(String IDsv, String Tensv, String DiaChisv, String NgaySinhsv, String NienKhoa, String TinhTrang);
	void XoaSinhVien(String IDsv);
	void ThemMonHoc(String IDmh,String Tenmh, String NgayHocmh, String GioBatDaumh,	String GioKetThucmh,String TinhTrangmh);
	void XoaMonHoc(String IDmh);
	
	SinhVien TimSinhVien(String IDsv);
	MonHoc TimKiemMonHoc(String MonHoc);
	
}
