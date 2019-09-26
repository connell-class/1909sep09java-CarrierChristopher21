package carRunners;

import java.util.Scanner;

import carPrinter.CarPrinter;

public class CarStartupInput {
	//	Printer
	CarPrinter aPrint = new CarPrinter();
	
    public String GetStartUpInput(String answer, Scanner sIn)
    {
        answer = "";
        aPrint.Print("Students = 1, Category = 2, Customers = 3, Employee = 4, Order Details = 5: \n" +
            "Order = 6, Product = 7, Shipper = 8, Supplier = 9: ");
        aPrint.PrintList("Press a number 1 - 9: ");
        answer = sIn.next();    //  Collecting input from Console
        return answer;
    }
}
