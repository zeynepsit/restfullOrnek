package com.galeriRestfull.model;

import java.util.HashSet;
import java.util.Set;

public class OtomobilSahip {

	private Long id;
	private String adi;
	private String soyAdi;
	private Set<Otomobil> otomobil = new HashSet<Otomobil>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyAdi() {
		return soyAdi;
	}

	public void setSoyAdi(String soyAdi) {
		this.soyAdi = soyAdi;
	}

	public Set<Otomobil> getOtomobil() {
		return otomobil;
	}

	public void setOtomobil(Set<Otomobil> otomobil) {
		this.otomobil = otomobil;
	}

	@Override
	public String toString() {
		return "OtomobilSahip [id=" + id + ", adi=" + adi + ", soyAdi=" + soyAdi + "]";
	}

}
