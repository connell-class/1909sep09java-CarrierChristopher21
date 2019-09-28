package carUser;

import java.io.Serializable;

/*
 * 	Serialize user information
 * 		figure out 
 * 			will need: private static final long serialVersionUID;
 * 			put in userdata then implement serializable to link to runner
 */

public class UserData implements Serializable{
	private static final long serialVersionUID = 1L;
	private String idNumber;
	private String password;	
	private String firstName;
	private String lastName;
	
	public String getIdNumber() {
		return idNumber;
	}	
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}	

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public UserData(String idNumber, String password, String firstName, String lastName) {
		super();
		this.idNumber = idNumber;
		this.password = password;		
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
		UserData += "Password = " + password + "\n";	
		UserData += "First Name = " + firstName + "\n";
		UserData += "Last Name = " + lastName + "\n";
		return UserData;
	}

	
	
	
}
