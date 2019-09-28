package carCustomer;

import java.util.ArrayList;
//import java.util.Date;
import java.util.List;
import java.util.Scanner;

import carPrinter.CarNotValid;
import carPrinter.CarPrinter;
import carSerializer.UserDataAccessor;
import carSerializer.UserSerializer;

public class CustomerRunner {
	CustomerData aCustomerData = new CustomerData();
	CarNotValid aNotValid = new CarNotValid();
	CarPrinter aPrint = new CarPrinter();
	
									//			fName	lName		10			12				
	public CustomerData aCustomer0 = new CustomerData("SharkTheDestroyer","n/a", "Chris", "Carrier", 
			28, "n/a", "12702 Bruce B Downs Blvd", "Tampa", "33612", "698-365-5486");
	
	CustomerData aCustomer1 = new CustomerData("PolarBearAnnihilator", "n/a", "Rob", "Connell", 
			31, "n/a", "3700 Sharon Gagnon Ln #101", "Anchorage", "99508", "586-698-2846");
	
	CustomerData aCustomer2 = new CustomerData("CrocTheConquer", "n/a", "Jeff", "Jamieson", 
			22, "n/a", "255 SW 11th St", "Miami", "33130", "657-252-3978" );	
	
	
	static UserDataAccessor access;

	
	
	public String CustomerHavic(String answer, Scanner sIn) {
		access = new UserSerializer();
		
		String file = "./Data_Files/UserData.txt";
		
//			Declare Variable Labeling
		String userName = "n/a", password = "n/a";
		String fName = "n/a", lName = "n/a", aEmail = "n/a", aAddress = "n/a";
		String aCity = "n/a", aZip = "n/a", aPhone = "n/a";

		int aAge = -1;
		
		List<CustomerData> aCustomer = new ArrayList<CustomerData>();
		aCustomer.add(aCustomer0);
		aCustomer.add(aCustomer1);
		aCustomer.add(aCustomer2);
		
		
		
		//	Customer Username
		System.out.print("\nPlease enter in your UserName ");
		userName = sIn.nextLine();
		
		//	Customer Password
		System.out.print("\nPlease enter in your Password ");
		password = sIn.nextLine();
		
		//	First Name Section
		System.out.print("\nPlease enter in your First Name ");
		fName = sIn.nextLine();	
		
		//	Last Name Section
		System.out.print("\nPlease enter in your Last Name ");
		lName = sIn.nextLine();	
		
		//	Age Section
		System.out.print("\nPlease enter in your Age ");
		//aAge = sIn.nextInt();	//	NextInt for some reason skips completely over Email.
		aAge = Integer.parseInt(sIn.nextLine());
		//	Email Section
		System.out.print("\nPlease enter in your Email ");
		aEmail = sIn.nextLine();	
		
		//	Address Section
		System.out.print("\nPlease enter in your Address ");
		aAddress = sIn.nextLine();	
		
		//	City Section
		System.out.print("\nPlease enter in your City ");
		aCity = sIn.nextLine();	
		
		//	Zip Code Section
		System.out.print("\nPlease enter in your Zip Code ");
		aZip = sIn.nextLine();	
		
		//	Phone Number Section
		System.out.print("\nPlease enter in your Phone Number ");
		aPhone = sIn.nextLine();	
		
		
		
		aCustomerData.setUserName(userName);
		aCustomerData.setPassword(password);
		aCustomerData.setFirstName(fName);
		aCustomerData.setLastName(lName);
		aCustomerData.setAge(aAge);
		aCustomerData.setEmail(aEmail);
		aCustomerData.setAddress(aAddress);
		aCustomerData.setCity(aCity);
		aCustomerData.setZip(aZip);
		aCustomerData.setPhone(aPhone);
		
		
		System.out.println("\nOlly\n" + aCustomerData);
		access.writeObject(file, aCustomerData);
		access.readObject(file);

		return answer;
		
		
	}
	
}

















