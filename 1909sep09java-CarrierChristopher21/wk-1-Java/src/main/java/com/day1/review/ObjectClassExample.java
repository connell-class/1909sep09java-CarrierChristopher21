package com.day1.review;

public class ObjectClassExample {

	private int id;
	
	@Override
	public void finalize() {
		
	}
	@Override
	public String toString() {
		return "whatever we want";
	}
//	@Override
//	public boolean equals(Object o) {
//		return this.hashCode()==o.hashCode();
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectClassExample other = (ObjectClassExample) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	/*
		the hashcode method returns a number that puts instances of a class 
	 * into a finite number of categories.
	 * 
	 */
//	@Override
//	public int hashCode() {
//		return 7*id;
//	}
	
	/*
	 * rules for overriding the hashcode and equals method
	 * 		1. You are expected to override hashCode() if you override equals()
	 * 		2. The result of hashCode() should not change in a program
	 * 		3. if equals() returns true, the hashCodes should be equal
	 * 		4. if equals() returns false, the hashCodes do not have to 
	 * 			distinct. However, doing so, will help the performance
	 * 			of hashtables.
	 */
	
}
