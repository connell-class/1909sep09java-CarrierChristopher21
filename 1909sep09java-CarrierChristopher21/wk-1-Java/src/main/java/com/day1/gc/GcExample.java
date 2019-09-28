package com.day1.gc;

public class GcExample {
	
	private String name;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	public GcExample() {
		super();
	}
	public GcExample(String name) {
		super();
		this.name = name;
	}
	@Override
	public void finalize() {
		System.out.println("in the finalization "+name);
	}
	public static void main(String[] args) {
		//Garbage collection in java comes automatically
		//	an object is eligible for garbage collection
		//	when there is no longer a reference to it.
		
		//	It is meant to help memory allocation and 
		//	and keep us from running out. 
		
		GcExample o_1=new GcExample("howard");
		GcExample o_2=new GcExample("duck");
		o_1=o_2;
		System.out.println(o_1==o_2);
		o_1=null;
		o_2=null;
		//the object in the heap that o_1 was pointing to
		//	is now eligible for garbage collection
		
		//We can request for garbage collection to run at
		//	specific points in our program with System.gc();
		//	we cannot force it though, so this essentially
		//	does nothing.
		System.gc();
		//different ways to call garbage collector
//		Runtime.getRuntime().gc();
//		System.runFinalization();
		//	press control+space, click inside the doc window
		//	and you have the options for opening the documentation
		
		
		//When the garbage collector comes to pick up objects
		//	it will call the finalize method on that object
		
		for(int i =0; i<40; i++) {
			System.out.println("hello "+i);
		}
		
		
	}
	
	
}
