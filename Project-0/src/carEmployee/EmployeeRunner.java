package carEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import carCustomer.CustomerData;
import carPrinter.CarNotValid;
import carPrinter.CarPrinter;
import carSerializer.UserDataAccessor;
import carSerializer.UserSerializer;
import carUser.UserData;

public class EmployeeRunner {
	
	EmployeeData aEmployeeData = new EmployeeData();
	CarNotValid aNotValid = new CarNotValid();
	CarPrinter aPrint = new CarPrinter();
	
	public EmployeeData aEmployee = new EmployeeData("Rob", "Connell", null, 0, "0123456789", "ABC546921837", null, null, null);
	EmployeeData aEmployee1 = new EmployeeData("Chris", "Carrier", null, 0, "1234567890", "ZYX193746825", null, null, null );
	EmployeeData aEmployee2 = new EmployeeData("Jeff", "Jamieson", null, 0, "2345678901", "LMN739185264", null, null, null );	
	
	
	
	static UserDataAccessor access;
	
	public String EmployeeHavic(String answer, Scanner sIn) {
		access = new UserSerializer();
		System.out.println(aEmployeeData);
//		Scanner sIn = new Scanner(System.in);
		String file = "./Data_Files/EmployeeData.txt";
		String EmployeeID = "", IDNumber = "", fName = "", lName = "";

		List<EmployeeData> aEmployee = new ArrayList<EmployeeData>();
		return answer;
		
		
	}

	public EmployeeData getaEmployee() {
		return aEmployee;
	}

	public void setaEmployee(EmployeeData aEmployee) {
		this.aEmployee = aEmployee;
	}
	
}
