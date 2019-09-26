package carDealership;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import carPrinter.CarNotValid;
import carPrinter.CarPrinter;
import carSerializer.UserDataAccessor;
import carSerializer.UserSerializer;
/*
 * 	Serialize user information
 * 		figure out 
 * 			will need: private static final long serialVersionUID;
 * 			put in userdata
 */


public class UserRunner {
	UserData aUserData = new UserData();	
						//			10			12				fName	lName
	UserData user = new UserData("0123456789", "ABC546921837", "Rob", "Connell");
	UserData user1 = new UserData("1234567890", "ZYX193746825", "Chris", "Carrier");
	UserData user2 = new UserData("2345678901", "LMN739185264", "Jeff", "Jamieson");
	
	static UserDataAccessor access;
	CarNotValid aNotValid = new CarNotValid();
	CarPrinter aPrint = new CarPrinter();
	
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

		//	ID number Section
		System.out.print("\nPlease type your 12 digit ID Number with first 3 being letters ");
		IDNumber = sIn.next();
		
		//	UserID Section
		System.out.print("Please type your 10 digit UserID ");
		UserID = sIn.next();
		anId = UserID.length();
		ConvertUserID(UserID, anId, answer);
		
		System.out.println(anId);

		//	First Name Section
		System.out.print("\nPlease type first name ");
		fName = sIn.next();
		//	Last Name Section
		System.out.print("\nPlease type last name ");
		lName = sIn.next();
		
		
		aUserData.setIdNumber(IDNumber);
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
	boolean tryParseInt(String answer, int anId) {  
	     try {  
	         Integer.parseInt(answer, anId);  
	         return true;  
	      } catch (NumberFormatException e) {  
	         return false;  
	      }  
	}
	public void ConvertUserID(String UserID, int anId, String answer) {
		boolean pass = tryParseInt(answer, anId);
		
		boolean anIdbool = Boolean.parseBoolean(answer);

//		boolean Pass = Integer.parseInt(answer,anId);
		if(anId == 10) {
			if(pass == true) {
				aUserData.setUserId(UserID);
			}else {
				
				aNotValid.NotValidNumber(answer);
			}			
		}else {
			aNotValid.NotValidNumber(answer);
		}
		
	}
	
	static boolean isValidNumber(String answer) {
        // Loop over all characters in the String.
        // ... If isDigit is false, this method too returns false.
        for (int i = 0; i < answer.length(); i++) {
            if (!Character.isDigit(answer.charAt(i))) {
                return false;
            }
        }
        return true;
    }

	

	

	
}
