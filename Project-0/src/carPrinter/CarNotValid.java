package carPrinter;

public class CarNotValid {
	CarPrinter aPrint = new CarPrinter();
	
	 /*          Response's to Wrong Data Entries          */
    //  Not Valid Number    -   answer
    public void NotValidNumber(String answer)
    {
        if(answer != "")
        {
            aPrint.PrintExist("Your entry is not a valid integer / number / title!!");
        }
    }
}
