package carPrinter;

public class CarNotValid {
	CarPrinter aPrint = new CarPrinter();
	
	 /*          Response's to Wrong Data Entries          */
    //  Not Valid Number    -   
    public void NotValidNumber(String UserID)
    {
        if(UserID != "")
        {
            aPrint.PrintExist("Your entry is not a valid integer / number / title!!");
        }
    }
}
