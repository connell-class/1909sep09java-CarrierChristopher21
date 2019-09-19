package carDealership;

public class CarLot {
	private String brandName;
	private String model;
	private int year;
	private int doors;
	private int wheels;
	private String typeOfVehicle;
	private int howManyOnLot;
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}

	public int getHowManyOnLot() {
		return howManyOnLot;
	}

	public void setHowManyOnLot(int howManyOnLot) {
		this.howManyOnLot = howManyOnLot;
	}

	public CarLot(String brandName, String model, int year, int doors, int wheels, 
			String typeOfVehicle, int howManyOnLot) {
		super();
		this.brandName = brandName;
		this.model = model;
		this.year = year;
		this.doors = doors;
		this.wheels = wheels;
		this.typeOfVehicle = typeOfVehicle;
		this.howManyOnLot = howManyOnLot;
	}	
	public CarLot() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override

	public String toString() {
		return "CarLot [brandName = " + brandName + ", model = " + model + ", year = " +
				year + ", doors = " + doors	+ ", wheels = " + wheels + 
				", typeOfVehicle = " + typeOfVehicle + ", howManyOnLot = " + 
				howManyOnLot + "]";
	}
}
















