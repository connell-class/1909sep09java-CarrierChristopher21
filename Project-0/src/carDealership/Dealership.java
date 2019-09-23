package carDealership;

public class Dealership {
	public static void main(String [] args) {
		//	CarLot
		CarLot aCar = new CarLot();
		System.out.println(aCar);
		
		//	Customer
		CustomerData aCustomer = new CustomerData();
		System.out.println(aCustomer);
		
		//	Employee
		EmployeeData aEmployee = new EmployeeData();
		System.out.println(aEmployee);
		
		//	User
		UserData aUser = new UserData();
		System.out.println(aUser);
		
		
		//	Main Runner
		DealershipController aController = new DealershipController();
		aController.Controller();
	}
}

