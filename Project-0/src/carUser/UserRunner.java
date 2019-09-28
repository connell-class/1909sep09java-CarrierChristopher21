package carUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import carPrinter.CarNotValid;
import carPrinter.CarPrinter;
import carSerializer.UserDataAccessor;
import carSerializer.UserSerializer;
import carTestNumber.CarTestNumber;


public class UserRunner {
	UserData aUserData = new UserData();	
						//			10			12				fName	lName
	public UserData user0 = new UserData("0123456789", "n/a", "Rob", "Connell");
	UserData user1 = new UserData("1234567890", "n/a", "Chris", "Carrier");
	UserData user2 = new UserData("2345678901", "n/a", "Jeff", "Jamieson");
	
	static UserDataAccessor access;
	CarNotValid aNotValid = new CarNotValid();
	CarPrinter aPrint = new CarPrinter();
	CarTestNumber aTestNumber = new CarTestNumber();
	
	public String UserHavic(String answer, Scanner sIn) {
		
		access = new UserSerializer();
		String file = "./Data_Files/UserData.txt";
		String password = "", IDNumber = "", fName = "", lName = "";
		
		List<UserData> aUser = new ArrayList<UserData>();
		aUser.add(user0);
		aUser.add(user1);
		aUser.add(user2);
		int anId = 0;
		
		
		//	ID Number Section
		System.out.print("\nPlease enter in your 5 digit ID Number ");
		IDNumber = sIn.nextLine();
		anId = IDNumber.length();
		aTestNumber.isValidNumber(IDNumber, anId);	
		//	Link to different file to test number
		
		//	Password Section
		System.out.print("\nPlease enter in your password: ");
		password = sIn.nextLine();

		//	First Name Section
		System.out.print("\nPlease enter in your first name ");
		fName = sIn.nextLine();
		
		//	Last Name Section
		System.out.print("\nPlease enter in your last name ");
		lName = sIn.nextLine();
		
		
		aUserData.setPassword(password);
		aUserData.setFirstName(fName);
		aUserData.setLastName(lName);
		
		
		
		System.out.println("\nAhem\n" + aUserData);
		//	Write File
		access.writeObject(file, aUserData);
		//	Read File
		access.readObject(file);

//		return;
		return answer;
		
	}
	
}













