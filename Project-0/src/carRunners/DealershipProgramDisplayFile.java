package carRunners;

import java.util.Scanner;

import carDealership.CustomerRunner;
import carDealership.Dealership;
import carDealership.EmployeeRunner;
import carDealership.ErrorRunner;
import carDealership.SystemRunner;
import carDealership.UserRunner;

public class DealershipProgramDisplayFile {
		//	Dealership
		Dealership aDealership = new Dealership();
		int numId = -1;
		//	User - 1
		UserRunner aUser = new UserRunner();
		//	Employee - 2
		EmployeeRunner aEmployee = new EmployeeRunner();
		//	Customer - 3
		CustomerRunner aCustomer = new CustomerRunner();
		//	System - 4
		SystemRunner aSysRunner = new SystemRunner();
		//	Error - Default
		ErrorRunner aError = new ErrorRunner();
		
		public String ProgramRan(String answer, Scanner sIn) {
			Scanner scanIn = new Scanner(System.in);
			System.out.println("What function do you want to do today? ");
			numId = scanIn.nextInt();
			
			if(numId >0 || numId <=4) {				
				switch(numId) {
					case 1:	//	User
						answer = aUser.UserHavic(answer, sIn);
						break;
					case 2:	//	Employee
						
						
						break;
					case 3:	//	Customer
						
						
						break;
					case 4:	//	System
						
						
						break;
				}
			}else {
				System.out.println("Please try again.");
			}
			
			scanIn.close();
			return null;
		}
		
}
