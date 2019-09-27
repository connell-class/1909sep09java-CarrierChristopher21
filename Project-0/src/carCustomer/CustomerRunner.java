package carCustomer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import carPrinter.CarNotValid;
import carPrinter.CarPrinter;
import carSerializer.UserDataAccessor;
import carUser.UserData;

public class CustomerRunner {
	CustomerData aCustomerData = new CustomerData();
	CarNotValid aNotValid = new CarNotValid();
	CarPrinter aPrint = new CarPrinter();
	
									//			fName	lName		10			12				
	public CustomerData aCustomer = new CustomerData("Rob", "Connell", null, 0, "0123456789", "ABC546921837", null, null, null );
	CustomerData aCustomer1 = new CustomerData("Chris", "Carrier", null, 0, "1234567890", "ZYX193746825", null, null, null );
	CustomerData aCustomer2 = new CustomerData("Jeff", "Jamieson", null, 0, "2345678901", "LMN739185264", null, null, null );	
	
	
	static UserDataAccessor access;

	
	
	public String CustomerHavic(String answer, Scanner sIn) {
//		Scanner sIn = new Scanner(System.in);
		String file = "./Data_Files/UserData.txt";
		String fName = "n/a", lName = "n/a", aEmail = "n/a", aAddress = "n/a", aCity = "n/a", aZip = "n/a", aPhone = "n/a";
		int customerDOB = 0;
		Date aDate = null;
		List<CustomerData> aCustomer = new ArrayList<CustomerData>();
		
		
		
		System.out.println(aCustomerData);
		return answer;
		
		
	}
	
}
