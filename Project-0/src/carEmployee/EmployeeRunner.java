package carEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import carPrinter.CarNotValid;
import carPrinter.CarPrinter;
import carSerializer.UserDataAccessor;
import carSerializer.UserSerializer;

public class EmployeeRunner {
	
	EmployeeData aEmployeeData = new EmployeeData();
	CarNotValid aNotValid = new CarNotValid();
	CarPrinter aPrint = new CarPrinter();
	
	public EmployeeData aEmployee0 = new EmployeeData("CrocTheConquer", "n/a", "Jeff", "Jamieson", 26, "n/a");
	EmployeeData aEmployee1 = new EmployeeData("SharkTheDestroyer", "n/a", "Chris", "Carrier", 28, "n/a");
	EmployeeData aEmployee2 = new EmployeeData("PolarBearAnnihilator", "n/a", "Rob", "Connell", 32, "n/a");
	
	
	static UserDataAccessor access;
	
	public String EmployeeHavic(String answer, Scanner sIn) {
		access = new UserSerializer();
		System.out.println(aEmployeeData);
//		Scanner sIn = new Scanner(System.in);
		String file = "./Data_Files/EmployeeData.txt";
		String  userName = "n/a", password = "n/a", fName = "n/a", lName = "n/a", aEmail = "n/a";
		int aAge = -1;
		List<EmployeeData> aEmployee = new ArrayList<EmployeeData>();
		
		aEmployee.add(aEmployee0);
		aEmployee.add(aEmployee1);
		aEmployee.add(aEmployee2);
		
		//	UserName Section
		System.out.print("\nPlease enter your UserName ");
		userName = sIn.nextLine();
		
		//	anId = IDNumber.length();
		//	ConvertUserID(IDNumber, anId);	
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
		
		//	Age Section
		System.out.print("\nPlease enter in your Age ");
		aAge = sIn.nextInt();	//	NextInt for some reason skips completely over Email.
		
		//	Email Section
		System.out.print("\nPlease enter in your Email ");
		aEmail = sIn.nextLine();
		
		
		aEmployeeData.setUserName(userName); 
		aEmployeeData.setPassword(password);
		aEmployeeData.setFirstName(fName);
		aEmployeeData.setLastName(lName);
		aEmployeeData.setEmail(aEmail);
		aEmployeeData.setAge(aAge);
		
		
		
		System.out.println("\nAhem\n" + aEmployeeData);
		//	Write File
		access.writeObject(file, aEmployeeData);
		//	Read File
		access.readObject(file);
		
		return answer;		
		
	}


	
}
