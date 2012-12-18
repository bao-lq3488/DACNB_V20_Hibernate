package model;
// default package
// Generated Dec 18, 2012 11:25:24 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Lop generated by hbm2java
 */
public class Lop implements java.io.Serializable {

	private String idlop;
	private Khoa khoa;
	private String tenlop;
	private Set<Sinhvien> sinhviens = new HashSet<Sinhvien>(0);

	public Lop() {
	}

	public Lop(String idlop) {
		this.idlop = idlop;
	}

	public Lop(String idlop, Khoa khoa, String tenlop, Set<Sinhvien> sinhviens) {
		this.idlop = idlop;
		this.khoa = khoa;
		this.tenlop = tenlop;
		this.sinhviens = sinhviens;
	}

	public String getIdlop() {
		return this.idlop;
	}

	public void setIdlop(String idlop) {
		this.idlop = idlop;
	}

	public Khoa getKhoa() {
		return this.khoa;
	}

	public void setKhoa(Khoa khoa) {
		this.khoa = khoa;
	}

	public String getTenlop() {
		return this.tenlop;
	}

	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}

	public Set<Sinhvien> getSinhviens() {
		return this.sinhviens;
	}

	public void setSinhviens(Set<Sinhvien> sinhviens) {
		this.sinhviens = sinhviens;
	}

}