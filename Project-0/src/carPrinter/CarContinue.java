package carPrinter;

import java.util.Scanner;

public class CarContinue {

	CarPrinter aPrint = new CarPrinter();
	
    public String ContinueQuestion(String answer, Scanner sIn)
    {
        answer = "";
        aPrint.Print("Do you want to continue? Y = Yes, N = No: ");
        
        return answer;
    }
	
//  While False                     -       6th Part
    public String WhileFalse(String answer)
    {
        while(answer != "y" || answer != "Y" || answer != "n" || answer != "N" || answer != "")
        {
            if(answer == "Y" || answer == "y" || answer == "n" || answer == "N" || answer == "")
            {
                break;
            }
            else
            {
                answer = WhileFalseEnd(answer);
            }
        }
        return answer;
    }
	
    //  While False End                 -       7th Part
    public String WhileFalseEnd(String answer)
    {
        //answer = "";
        aPrint.PrintExist("Your response is not valid answer!!");
        aPrint.Print("Do you want to continue? Y = Yes, N = No: ");
//        answer = Console.ReadLine();
        return answer;
    }


}
