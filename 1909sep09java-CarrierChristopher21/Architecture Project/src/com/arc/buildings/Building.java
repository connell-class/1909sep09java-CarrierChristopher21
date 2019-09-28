package com.arc.buildings;

import java.io.Serializable;

public abstract class Building implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String address;
	private boolean parking;    
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	 public void setAddress(String address) {
		 this.address=address;
	 }
	 public String getAddress() {
		 return address;
	 }
	 public void setParking(boolean parking) {
		 this.parking=parking;
	 }
	 public boolean isParking() {
		 return parking;
	 }
	 
	 abstract double howLongToPaint();
	
}
