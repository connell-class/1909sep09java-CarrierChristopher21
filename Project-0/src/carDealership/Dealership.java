package carDealership;


import java.util.Scanner;

import carRunners.DealershipController;

public class Dealership {
	
	
	public static void main(String [] args) {
		//	CarLot
		CarLot aCar = new CarLot();
		//	Customer
		CustomerData aCustomer = new CustomerData();
		//	Employee
		EmployeeData aEmployee = new EmployeeData();
		//	User
		UserData aUserData = new UserData();		
		UserRunner aUserRunner = new UserRunner();
		
		//	Main Runner
		DealershipController aController = new DealershipController();
		
		Scanner sIn = new Scanner(System.in);
		String answer = "";
		//		CarLot
		System.out.println(aCar);
		
		//	Customer
		System.out.println(aCustomer);
		
		//	Employee
		System.out.println(aEmployee);
		
		//	User

		System.out.println("HI\n" + aUserData);
		System.out.println(aUserRunner.user);
		aUserRunner.UserHavic(answer, sIn);
		
		//	Main Runner
//		DealershipController aController = new DealershipController();
		aController.Controller(answer, sIn);
	}
}

