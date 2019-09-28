package carRunners;

import java.util.Scanner;

import carCustomer.CustomerRunner;
import carDealership.Dealership;
import carDealership.ErrorRunner;
import carEmployee.EmployeeRunner;
import carPrinter.CarNotValid;
import carSystem.SystemRunner;
import carTestNumber.CarTestNumber;
import carUser.UserRunner;

public class DealershipProgramDisplayFile {
    	int anId;
    	int anSwitchId;
	
		//	Dealership
		Dealership aDealership = new Dealership();
		int numId = -1;
		//	User - 1
		UserRunner aUserRunner = new UserRunner();
		//	Employee - 2
		EmployeeRunner aEmployeeRunner = new EmployeeRunner();
		//	Customer - 3
		CustomerRunner aCustomerRunner = new CustomerRunner();
		//	System - 4
		SystemRunner aSysRunner = new SystemRunner();
		//	Error - Default
		ErrorRunner aErrorRunner = new ErrorRunner();
		//	Not Valid
		CarNotValid aNotValid = new CarNotValid();
		// Car TestNumber
		CarTestNumber aTestNumber = new CarTestNumber();
		
	       //  Program Display                 -       3rd Part
        public String ProgramDisplay(String answer, Scanner sIn)
        {
        	
        	boolean pass = aTestNumber.isValidNumber(answer, anSwitchId);
//    		aTestNumber.ConvertUserID(answer, anId);
        	
            //bool canConvert_SwitchId = int.TryParse(answer, out anSwitchId);   // Switch - Changing value of anId to value of answer
            if(pass == true)
            {
            	anSwitchId = Integer.parseInt(answer);
                answer = ProgramConverter(anSwitchId, answer, sIn, anId);
            }
            else
                aNotValid.NotValidNumber(answer);
            return answer;
        }

		
		
		public String ProgramConverter(int anSwitchId, String answer, Scanner sIn, int anId) {
			
			if(anSwitchId > 0 && anSwitchId <= 4 && answer != "") {				
				switch(anSwitchId) {
					case 1:	//	User
						answer = aUserRunner.UserHavic(answer, sIn);
						//	Create Customer Account - Create setup / Register Form
						break;
					case 2:	//	Employee
						answer = aEmployeeRunner.EmployeeHavic(answer, sIn);
						//	Returning Customer - Create set up / Login Setup
						
						break;
					case 3:	//	Customer
						answer = aCustomerRunner.CustomerHavic(answer, sIn);
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
