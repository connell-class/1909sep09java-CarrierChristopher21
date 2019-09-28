package com.day2.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
	
	/*
	 * Reflection API is used to monitor and change something about an
	 * 		object during runntime
	 * 		example: we can change the accessibility of methods and 
	 * 			variables during runtime.
	 * 			we can get a list of constructors and methods during runtime.
	 * 		Reflections is all about being able to monitor and adjust things
	 * 			without needing to recompile our code. This also allows
	 * 			us to change things about someone else's code during runtime.
	 * 			Imagine some using Test as a member, we could create an
	 * 			instance and assign that member to it, between the time	
	 * 			the other developer writes it and actually uses it.
	 * 
	 */

	public static void main(String[] args) throws Exception{
		
		//creating an object whose properties is to be checked
		Test t = new Test();
		
		//creating class object from the object using getclass method
		Class c = t.getClass();
		
		System.out.println("the name of the class is "+c.getModifiers());
		
		//getting the constructor of the class through the class object
		Constructor con = c.getConstructor();
		System.out.println("the name of the constructor is "+
				con.getParameterCount());
		
		//getting the methods of the class
		Method[] methods = c.getMethods();
		
		//printing the names of the methods
		// can also print other parts such as parameters, throws, etc...
//		System.out.println("the methods in the class are:");
//		for(Method m:methods) {
//			System.out.println(m.getName());
//		}
		
//		creates object of desired method by providing the method
		//name and parameter class as arguments to the 
			//getdeclaredmethod
		Method m1 = c.getDeclaredMethod("method2", int.class);
		
		//invokes the method at runtime
		m1.invoke(t, 19);
		
		//creates object of the desired field by providing the name
		// of the field as an argument to the getDeclaredField method
		Field f = c.getDeclaredField("s");
		
		//allows the object to access the field irrespective
		// of the access modifier used with the field
		f.setAccessible(true);
		
		//takes the object and the new value to be assigned to
		// the field as arguments
		f.set(t, "ooga booga");
		
		//same thing as with method2 but with no args
		Method m2 = c.getDeclaredMethod("method1");
		
		//invoking the method at runtime
		m2.invoke(t);
		
		Method m3 = c.getDeclaredMethod("method3");
		m3.setAccessible(true);
		m3.invoke(t);
		
		
		
		
		
	}
}
