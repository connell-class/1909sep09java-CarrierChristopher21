package carRunners;

import java.util.Scanner;
import java.util.logging.Logger;

import carCustomer.CustomerSort;
import carDealership.Dealership;
import carDealership.ErrorRunner;
import carDriverPerson.CarHuman;
import carEmployee.EmployeeSort;
import carLogin.CarLogin;
import carLot.CarDriver;
import carLot.CarRunner;
import carPrinter.CarNotValid;
import carSystem.SystemRunner;
import carTestNumber.CarTestNumber;
import carUser.UserSort;

public class DealershipProgramDisplayFile extends CarHuman{

//    	private static final String CarLog = null; 

		int anSwitchId;
	
		//	Dealership
		Dealership aDealership = new Dealership();
		int numId = -1;
		//	User - 1
		UserSort aUserSort = new UserSort();
		//	Employee - 2
		EmployeeSort aEmployeeSort = new EmployeeSort();
		//	Customer - 3
		CustomerSort aCustomerSort = new CustomerSort();
		//	System - 4
		SystemRunner aSysRunner = new SystemRunner();
		//	Error - Default
		ErrorRunner aErrorRunner = new ErrorRunner();
		//	Not Valid
		CarNotValid aNotValid = new CarNotValid();
		// Car TestNumber
		CarTestNumber aTestNumber = new CarTestNumber();
		//	Car Login
		CarLogin aCarLogin = new CarLogin();
		//	CarDriver
		CarDriver aCarDriver = new CarDriver();
		//	CarRunner
		CarRunner aCarRunner = new CarRunner();
		
		
	       //  Program Display                 -       3rd Part
        public String ProgramDisplay(String answer, Scanner sIn)
        {
//        	final Logger logger = Logger.getLogger(CarLog);
        	
        	boolean pass = aTestNumber.isValidNumber(answer, anSwitchId);
//    		aTestNumber.ConvertUserID(answer, anId);
        	
            //bool canConvert_SwitchId = int.TryParse(answer, out anSwitchId);   // Switch - Changing value of anId to value of answer
            if(pass == true)
            {
            	anSwitchId = Integer.parseInt(answer);
                Logger logger = null;
				answer = ProgramConverter(anSwitchId, answer, sIn, logger);
            }
            else
                aNotValid.NotValidNumber(answer);
            return answer;
        }

		
		
		public String ProgramConverter(int anSwitchId, String answer, Scanner sIn, Logger logger) {
			
			if(anSwitchId > 0 && anSwitchId <= 4 && answer != "") {				
				switch(anSwitchId) {
					case 1:	//	User
						answer = aCarLogin.CustomerSortHavic(answer, sIn, logger);
//						answer = aUserSort.UserSortHavic(answer, sIn);
						//	Create Customer Account - Create setup / Register Form
						break;					
					case 2:	//	Car Collection
						answer = aCarRunner.CarPath(answer, sIn, logger);
						
//						answer = aCarDriver.CarDriverHavic(answer, sIn, logger);
//						answer = aCustomerSort.CustomerSortHavic(answer, sIn);
						break;
					case 3:	//	Current Customer
						answer = aEmployeeSort.EmployeeSortHavic(answer, sIn, logger);
//						
						//	Employee Sign In	- Create set up / Login Setup
						
						break;					
					case 4:	//	System
						
						//	Offers accept / deny
						//	Manage pay outs
						break;
				}
			}else {
//				System.out.println("Please try again.");
				aNotValid.NotValidNumber(answer);
			}
			
			return answer;
		}
		
}
