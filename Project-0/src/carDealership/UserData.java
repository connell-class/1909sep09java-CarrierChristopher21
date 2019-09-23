package carDealership;

import javax.jws.soap.SOAPBinding.Use;

public class UserData {
	private String idNumber;
	private String firstName;
	private String lastName;
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public UserData(String idNumber, String firstName, String lastName) {
		super();
		this.idNumber = idNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String UserData = "";
		UserData = "User Data \n";
		UserData += "ID Number = " + idNumber + "\n";
		UserData += "First Name = " + firstName + "\n";
		UserData += "Last Name = " + lastName + "\n";
		return UserData;
	}
	
	
	
}
