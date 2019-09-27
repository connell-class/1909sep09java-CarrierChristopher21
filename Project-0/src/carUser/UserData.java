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
	private String userId;
	private String idNumber;
	private String firstName;
	private String lastName;
	
	public String getIdNumber() {
		return idNumber;
	}	
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public UserData(String idNumber, String userId, String firstName, String lastName) {
		super();
		this.idNumber = idNumber;
		this.userId = userId;		
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
		UserData += "User Account ID = " + userId + "\n";	
		UserData += "First Name = " + firstName + "\n";
		UserData += "Last Name = " + lastName + "\n";
		return UserData;
	}
	
	
	
}
