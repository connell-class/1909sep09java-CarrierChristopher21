package carUser;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import carPrinter.CarNotValid;
import carPrinter.CarPrinter;
import carSerializer.UserDataAccessor;
import carSerializer.UserSerializer;


public class UserRunner {
	UserData aUserData = new UserData();	
						//			10			12				fName	lName
	public UserData user = new UserData("0123456789", "ABC546921837", "Rob", "Connell");
	UserData user1 = new UserData("1234567890", "ZYX193746825", "Chris", "Carrier");
	UserData user2 = new UserData("2345678901", "LMN739185264", "Jeff", "Jamieson");
	
	static UserDataAccessor access;
	CarNotValid aNotValid = new CarNotValid();
	CarPrinter aPrint = new CarPrinter();
//	CarTestNumber aTestNumber = new CarTestNumber();
	
	public String UserHavic(String answer, Scanner sIn) {
		
		
		
		access = new UserSerializer();
//		Scanner sIn = new Scanner(System.in);
		String file = "./Data_Files/UserData.txt";
		String UserID = "", IDNumber = "", fName = "", lName = "";
		
		List<UserData> aUser = new ArrayList<UserData>();
		aUser.add(user);
		aUser.add(user1);
		aUser.add(user2);
		int anId = 0;
		
		
		//	UserID number Section
		System.out.print("\nPlease type your 12 digit UserID Account Number with first 3 " +
				"being letters ");
		UserID = sIn.nextLine();	
		
		//	ID Number Section
		System.out.print("Please type your 10 digit ID Number ");
		IDNumber = sIn.nextLine();
		anId = IDNumber.length();
		ConvertUserID(IDNumber, anId);	
		//	Link to different file to test number
		
	

		//	First Name Section
		System.out.print("\nPlease type first name ");
		fName = sIn.nextLine();
		
		//	Last Name Section
		System.out.print("\nPlease type last name ");
		lName = sIn.nextLine();
		
		
		aUserData.setUserId(UserID);
		aUserData.setFirstName(fName);
		aUserData.setLastName(lName);
		
		
		
		System.out.println("\nAhem\n" + aUserData);
//		System.out.println("Hows it going? \n" + aUser + "\nHowdy \n");
		//	Writefile
		access.writeObject(file, aUserData);
		access.readObject(file);
		sIn.close();
//		return;
		return answer;
		
	}
	
	
	//	Used from https://stackoverflow.com/questions/8391979/does-java-have-a-int-tryparse-that-doesnt-throw-an-exception-for-bad-data
	boolean tryParseInt(String IDNumber, int anId) {  
	     try {  
	         Integer.parseInt(IDNumber, anId);  
	         return true;  
	      } catch (NumberFormatException e) {  
	         return false;  
	      }  
	}
	
	// Used from https://www.dotnetperls.com/parseint-java
	public void ConvertUserID(String IDNumber, int anId) {
		boolean pass = tryParseInt(IDNumber, anId);
		System.out.println(pass);
		int count = 0, number = 0;
		System.out.println("AnId = " + anId);
            // If this is a valid number, parse it.
        if (isValidNumber(IDNumber, count)) {
            number = Integer.parseInt(IDNumber);
            System.out.print("We are all numbers ");
            System.out.println(number);
            if(anId == 10) {
				aUserData.setIdNumber(IDNumber);
			}else {
				
				aNotValid.NotValidNumber(IDNumber);
			}	            
        }else {
        	System.out.println("We have a Letter, Fix this");
        	aNotValid.NotValidNumber(IDNumber);        	
        }		
	}
	// Used from https://www.dotnetperls.com/parseint-java
	static boolean isValidNumber(String IDNumber, int count) {
        // Loop over all characters in the String.
        // ... If isDigit is false, this method too returns false.
        for (int i = 0; i < IDNumber.length(); i++) {
            if (!Character.isDigit(IDNumber.charAt(i))) {
            	System.out.println("You failed");
            	count++;
            	System.out.println(count);
                return false;
            }
            count++;
        }
        System.out.println(count);
        return true;
    }
	
}

