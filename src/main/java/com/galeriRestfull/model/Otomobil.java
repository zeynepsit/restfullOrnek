package com.galeriRestfull.model;

import java.sql.Date;
 
public class Otomobil {

	private Long id;
	private String model;
	private Date modelYil;
	private OtomobilSahip otomobilSahip;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Date getModelYil() {
		return modelYil;
	}
	public void setModelYil(Date modelYil) {
		this.modelYil = modelYil;
	}
	public OtomobilSahip getOtomobilSahip() {
		return otomobilSahip;
	}
	public void setOtomobilSahip(OtomobilSahip otomobilSahip) {
		this.otomobilSahip = otomobilSahip;
	}
	@Override
	public String toString() {
		return "Otomobil [id=" + id + ", model=" + model + ", modelYil=" + modelYil + ", otomobilSahip=" + otomobilSahip
				+ "]";
	}
	
}	