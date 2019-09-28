package com.day5.CollectionApi;

import java.util.Comparator;

import com.day3.completeclasses.Building;

public class BuildingSorter implements Comparator<Building>{

	@Override
	public int compare(Building o1, Building o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

	

}
