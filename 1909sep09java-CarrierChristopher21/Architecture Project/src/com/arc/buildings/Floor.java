package com.arc.buildings;

public class Floor implements Comparable<Floor> {

	private int id;
	private String lessee;
	private int nmOfDoors;

	@Override
	public String toString() {
		return "Floor [id=" + id + ", lessee=" + lessee + ", nmOfDoors=" + nmOfDoors + "]";
	}

	public Floor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Floor(int id, String lessee, int nmOfDoors) {
		super();
		this.id = id;
		this.lessee = lessee;
		this.nmOfDoors = nmOfDoors;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLessee() {
		return lessee;
	}

	public void setLessee(String lessee) {
		this.lessee = lessee;
	}

	public int getNmOfDoors() {
		return nmOfDoors;
	}

	public void setNmOfDoors(int nmOfDoors) {
		this.nmOfDoors = nmOfDoors;
	}

	@Override
	public int compareTo(Floor o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}

}
