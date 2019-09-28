package com.arc;

import java.util.Scanner;

import com.arc.buildings.Building;
import com.arc.buildings.Skyscraper;
import com.arc.data.DataAccessor;
import com.arc.data.Serializer;

public class Driver {

	static DataAccessor da;
	public static void main(String[] args) {
		
		da=new Serializer();

//		Skyscraper sk1 = new Skyscraper(1000.0, "microsoft", true);
//		Skyscraper sk2 = new Skyscraper(120.5, "mcdonalds", true);
//		Skyscraper sk3 = new Skyscraper(30.2, "phifer", false);
//		
//		Floor f1 = new Floor(1, "folks", 7);
//		Floor f2 = new Floor(2, "larry", 2);
//		Floor f3 = new Floor(3, "Jerry", 5);
//		
//		Owner o = new Owner(new ArrayList<>(), "lars", 0);
//		
//		o.getBuildings().add(sk1);
//		o.addBuilding(sk2);
//		o.addBuilding(sk3);
//		sk1.getFloors().add(f1);
//		sk1.getFloors().add(f3);
//		sk1.getFloors().add(f2);
//		Collections.sort(sk1.getFloors());
//		
//		o.setNumOfBuildings();
//		System.out.println(sk1);
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Please type 3 things something? ");	
			System.out.print("Type your name: ");
			String name = s.next();
			System.lineSeparator();
			System.out.print("Please type your address: ");
			String address = s.next();
			System.lineSeparator();
			System.out.print("Are you hanging in a elevator? ");
			boolean b = new Boolean(s.next());
			Skyscraper sk = new Skyscraper();	
			sk.setName(name);			
			sk.setSponsor(address);			
			sk.setElevator(b);
			da.writeObject("baconator", sk);
			Building bark = (Building) da.readObject("baconator");
			System.out.println(bark);
		}

	}

}
