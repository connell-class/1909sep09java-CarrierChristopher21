package carDealership;

import java.util.Scanner;

public class DealershipController {
	public void Controller() {
		int num = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("What function do you want to do today? ");
		num = s.nextInt();
		if(num >0 || num <=4) {				
			switch(num) {
				case 1:	//	User
					UserRunner user = new UserRunner();
					
					break;
				case 2:	//	Employee
					EmployeeRunner employee = new EmployeeRunner();
					
					break;
				case 3:	//	Customer
					CustomerRunner customer = new CustomerRunner();
					
					break;
				case 4:	//	System
					SystemRunner sysRunner = new SystemRunner();
					
					break;
				default:
					ErrorRunner error = new ErrorRunner();
					
					break;
			}
		}else {
			System.out.println("Please try again.");
		}
		
		s.close();
	}
}
