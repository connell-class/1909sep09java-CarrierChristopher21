package com.arc.buildings;

import java.util.List;

public class Owner {
	private List<Building> buildings;
	private String name;
	private int numOfBuildings;

	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Owner(List<Building> buildings, String name, int numOfBuildings) {
		super();
		this.buildings = buildings;
		this.name = name;
		this.numOfBuildings = numOfBuildings;
	}

	public int getNumOfBuildings() {
		return numOfBuildings;
	}

	@Override
	public String toString() {
		return "Owner [buildings=" + buildings + ", name=" + name + ", numOfBuildings=" + numOfBuildings + "]";
	}

	public Owner(String name) {
		super();
		this.name = name;
	}

	public Owner(String name, int numOfBuildings) {
		super();
		this.name = name;
		this.numOfBuildings = numOfBuildings;
	}

	public void setNumOfBuildings() {
		this.numOfBuildings = this.buildings.size();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}

	public Building getBuilding(int index) {
		return buildings.get(index);
	}

	public void addBuilding(Building b) {
		this.buildings.add(b);
	}
}
