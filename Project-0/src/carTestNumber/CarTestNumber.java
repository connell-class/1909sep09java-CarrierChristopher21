package carTestNumber;

import carPrinter.CarNotValid;
import carPrinter.CarPrinter;
import carUser.UserData;

public class CarTestNumber {
	
	CarNotValid aNotValid = new CarNotValid();
	CarPrinter aPrint = new CarPrinter();
	CarTestNumber aTestNumber = new CarTestNumber();
	UserData aUserData = new UserData();
	
//	Used from https://stackoverflow.com/questions/8391979/does-java-have-a-int-tryparse-that-doesnt-throw-an-exception-for-bad-data
	boolean tryParseInt(String answer, int anId) {  
	     try {  
	         Integer.parseInt(answer, anId);  
	         return true;  
	      } catch (NumberFormatException e) {  
	         return false;  
	      }  
	}
	
	// Used from https://www.dotnetperls.com/parseint-java
	public void ConvertUserID(String answer, int anId) {
		boolean pass = tryParseInt(answer, anId);
		System.out.println(pass);
		int count = 0, number = 0;
		System.out.println("AnId = " + anId);
            // If this is a valid number, parse it.
        if (isValidNumber(answer, count)) {
            number = Integer.parseInt(answer);
            System.out.print("We are all numbers ");
            System.out.println(number);
            if(anId == 10) {
				aUserData.setIdNumber(answer);
				
			}else {
				
				aNotValid.NotValidNumber(answer);
			}	            
        }else {
        	System.out.println("We have a Letter, Fix this");
        	aNotValid.NotValidNumber(answer);        	
        }
        
		

		
	}
	// Used from https://www.dotnetperls.com/parseint-java
	static boolean isValidNumber(String answer, int count) {
        // Loop over all characters in the String.
        // ... If isDigit is false, this method too returns false.
        for (int i = 0; i < answer.length(); i++) {
            if (!Character.isDigit(answer.charAt(i))) {
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
//	boolean Pass = Integer.parseInt(answer,anId);
	/*if(pass == true) {
		System.out.println(pass);
		if(anId == 10) {
			aUserData.setIdNumber(IDNumber);
		}else {
			
			aNotValid.NotValidNumber(IDNumber);
		}			
	}else {
		aNotValid.NotValidNumber(IDNumber);
	}*/
	
}
