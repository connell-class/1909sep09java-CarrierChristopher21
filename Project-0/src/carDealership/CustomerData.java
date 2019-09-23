package carDealership;

import java.util.Date;

public class CustomerData {
		private String FirstName;
		private String LastName;	
		private Date DOB;	
		private int age;		
		private String email;
		private String address;
		private String city;
		private String zip;
		private String phone;
		
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		public Date getDOB() {
			return DOB;
		}
		public void setDOB(Date dOB) {
			DOB = dOB;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getZip() {
			return zip;
		}
		public void setZip(String zip) {
			this.zip = zip;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		
		public CustomerData(String firstName, String lastName, Date dOB, int age, String email, String address, String city,
				String zip, String phone) {
			super();
			FirstName = firstName;
			LastName = lastName;
			DOB = dOB;
			this.age = age;
			this.email = email;
			this.address = address;
			this.city = city;
			this.zip = zip;
			this.phone = phone;
		}
		
		public CustomerData() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			String CustomerData = "";
			CustomerData = "Customer Data \n";
			CustomerData += "First Name = " + FirstName + "\n";
			CustomerData += "Last Name = " + LastName + "\n";
			CustomerData += "DOB = " + DOB + "\n";
			CustomerData += "Age = " + age	+ "\n";
			CustomerData += "Email = " + email + "\n";
			CustomerData += "Address = " + address + "\n";
			CustomerData += "City = " + city + "\n";
			CustomerData += "Zip = " + zip + "\n";
			CustomerData += "Phone = " + phone + "\n";
			return CustomerData; 
		}

}
