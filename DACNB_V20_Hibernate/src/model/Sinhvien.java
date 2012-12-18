package model;
// default package
// Generated Dec 18, 2012 11:25:24 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Sinhvien generated by hbm2java
 */
public class Sinhvien implements java.io.Serializable {

	private String idsinhvien;
	private Lop lop;
	private String tensinhvien;
	private Date ngaysinh;
	private String diachi;
	private String status;
	private String datejoin;
	private String dateend;

	public Sinhvien() {
	}

	public Sinhvien(String idsinhvien) {
		this.idsinhvien = idsinhvien;
	}

	public Sinhvien(String idsinhvien, Lop lop, String tensinhvien,
			Date ngaysinh, String diachi, String status, String datejoin,
			String dateend) {
		this.idsinhvien = idsinhvien;
		this.lop = lop;
		this.tensinhvien = tensinhvien;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
		this.status = status;
		this.datejoin = datejoin;
		this.dateend = dateend;
	}

	public String getIdsinhvien() {
		return this.idsinhvien;
	}

	public void setIdsinhvien(String idsinhvien) {
		this.idsinhvien = idsinhvien;
	}

	public Lop getLop() {
		return this.lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}

	public String getTensinhvien() {
		return this.tensinhvien;
	}

	public void setTensinhvien(String tensinhvien) {
		this.tensinhvien = tensinhvien;
	}

	public Date getNgaysinh() {
		return this.ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDatejoin() {
		return this.datejoin;
	}

	public void setDatejoin(String datejoin) {
		this.datejoin = datejoin;
	}

	public String getDateend() {
		return this.dateend;
	}

	public void setDateend(String dateend) {
		this.dateend = dateend;
	}

}
