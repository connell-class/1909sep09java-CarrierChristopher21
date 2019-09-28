package com.arc.buildings;

import java.util.ArrayList;
import java.util.List;

public class Skyscraper extends Building {

	private double height;
	private String sponsor;
	private boolean elevator;
	private List<Floor> floors = new ArrayList<>();

	public List<Floor> getFloors() {
		return floors;
	}

	public Skyscraper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skyscraper(double height, String sponsor, boolean elevator, List<Floor> floors) {
		super();
		this.height = height;
		this.sponsor = sponsor;
		this.elevator = elevator;
		this.floors = floors;
	}
	public Skyscraper(double height, String sponsor, boolean elevator) {
		super();
		this.height = height;
		this.sponsor = sponsor;
		this.elevator = elevator;
	}

	@Override
	public String toString() {
		return "Skyscraper [height=" + height + ", sponsor=" + sponsor + ", elevator=" + elevator + ", floors=" + floors
				+ "]";
	}

	public void setFloors(List<Floor> floors) {
		this.floors = floors;
	}
	
	public int numOfFloors() {
		return floors.size();
	}
	public Floor getFloor(int index) {
		return floors.get(index);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public boolean isElevator() {
		return elevator;
	}

	public void setElevator(boolean elevator) {
		this.elevator = elevator;
	}

	double howLongToPaint() {
		return height*10;
	}

}
