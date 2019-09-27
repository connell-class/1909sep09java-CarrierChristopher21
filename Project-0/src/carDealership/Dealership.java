package carDealership;


import java.util.Scanner;

import carCustomer.CustomerData;
import carCustomer.CustomerRunner;
import carEmployee.EmployeeData;
import carEmployee.EmployeeRunner;
import carRunners.DealershipController;
import carSystem.SystemRunner;
import carUser.UserData;
import carUser.UserRunner;

public class Dealership {
	
	
	public static void main(String [] args) {
		//	CarLot
		CarLot aCar = new CarLot();
		//	Customer
		CustomerData aCustomer = new CustomerData();
		CustomerRunner aCustomerRunner = new CustomerRunner();
		//	Employee
		EmployeeData aEmployee = new EmployeeData();
		EmployeeRunner aEmployeeRunner = new EmployeeRunner();
		//	User
		UserData aUserData = new UserData();		
		UserRunner aUserRunner = new UserRunner();
		//	System
		SystemRunner aSytemRunner = new SystemRunner();
		
		
		//	Main Runner
		DealershipController aController = new DealershipController();
		
		Scanner sIn = new Scanner(System.in);
		String answer = "";
		//		CarLot
		System.out.println("CarLot\n" + aCar);
		
		
		//	Customer
		System.out.println("Customer\n" + aCustomer);
		System.out.println(aCustomerRunner.aCustomer);
		aCustomerRunner.CustomerHavic(answer, sIn);
				
		//	Employee
		System.out.println("Employee\n" + aEmployee);
		System.out.println(aEmployeeRunner.aEmployee);
		aEmployeeRunner.EmployeeHavic(answer, sIn);
		
		//	User

		System.out.println("HI\n" + aUserData);
		System.out.println(aUserRunner.user);
		aUserRunner.UserHavic(answer, sIn);
		
		//	System
		System.out.println("System\n" + aSytemRunner);
//		System.out.println(aSytemRunner.);
		
		//	Main Runner
//		DealershipController aController = new DealershipController();
		aController.Controller(answer, sIn);
	}
}

