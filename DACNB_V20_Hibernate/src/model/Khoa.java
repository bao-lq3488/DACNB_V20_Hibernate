package model;

import java.util.HashSet;
import java.util.Set;

/**
 * Khoa generated by hbm2java
 */
public class Khoa implements java.io.Serializable {

	private String idkhoa;
	private String tenkhoa;
	private Set<Lop> lops = new HashSet<Lop>(0);

	public Khoa() {
	}

	public Khoa(String idkhoa) {
		this.idkhoa = idkhoa;
	}

	public Khoa(String idkhoa, String tenkhoa, Set<Lop> lops) {
		this.idkhoa = idkhoa;
		this.tenkhoa = tenkhoa;
		this.lops = lops;
	}

	public String getIdkhoa() {
		return this.idkhoa;
	}

	public void setIdkhoa(String idkhoa) {
		this.idkhoa = idkhoa;
	}

	public String getTenkhoa() {
		return this.tenkhoa;
	}

	public void setTenkhoa(String tenkhoa) {
		this.tenkhoa = tenkhoa;
	}

	public Set<Lop> getLops() {
		return this.lops;
	}

	public void setLops(Set<Lop> lops) {
		this.lops = lops;
	}

}