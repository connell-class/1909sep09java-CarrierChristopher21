package com.arc.buildings;

public class Warehouse extends Building {

	private boolean rollUpDoors;
	private int fanDiameter;
	private Floor floor;
	
	
	@Override
	public String toString() {
		return "Warehouse [rollUpDoors=" + rollUpDoors + ", fanDiameter=" + fanDiameter + ", floor=" + floor + "]";
	}


	public Warehouse(boolean rollUpDoors, int fanDiameter) {
		super();
		this.rollUpDoors = rollUpDoors;
		this.fanDiameter = fanDiameter;
	}


	public Warehouse() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Warehouse(boolean rollUpDoors, int fanDiameter, Floor floor) {
		super();
		this.rollUpDoors = rollUpDoors;
		this.fanDiameter = fanDiameter;
		this.floor = floor;
	}


	public Floor getFloor() {
		return floor;
	}


	public void setFloor(Floor floor) {
		this.floor = floor;
	}


	public boolean isRollUpDoors() {
		return rollUpDoors;
	}


	public void setRollUpDoors(boolean rollUpDoors) {
		this.rollUpDoors = rollUpDoors;
	}


	public int getFanDiameter() {
		return fanDiameter;
	}


	public void setFanDiameter(int fanDiameter) {
		this.fanDiameter = fanDiameter;
	}


	@Override
	double howLongToPaint() {
		// TODO Auto-generated method stub
		return 100;
	}

}
