package com.day2.covariance;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.day2.covariance.Parent;

/*
 * 	There are rules to the different ways we can override a method
 * 		Overriding deals with a child class inheriting a method from
 * 		the parent and giving it a different implementation. Remember
 * 		overriding vs overloading and overriding vs shadowing. 
 * 	The three rules to method overriding are:
 * 		1. the access to the method can be more accessible, but not 
 * 			more restrictive.
 * 		2. the return type must be covariant. It must be a child type of the
 * 			original. For example, the covariant type of class A would
 * 			be class B because class B has a "is a" relationship with
 * 			class A. However, Object is not covariant to Class A, since 
 * 			Object does not have a "is-a" relationship to class A.
 * 		3. the throws declaration cannot add to the potentially thrown
 * 			exceptions. It can throw less, the same, or none at all.
 * 			for instance: Since overriding is an example of runtime
 * 			polymorphism, it knows from the beginning that a method
 * 			has the potential to throw a certain exception. If you were 
 * 			to add more exceptions to it, then it would not know at 
 * 			compile time that it would potentially have to handle that
 * 			exception.
 * 	note: covariance refers to the return type of the method,
 * 		however, you will hear the entire topic be referred to 
 * 		as covariance.
 * 
 */


public class Child extends Parent{
//	first rule deals with the access modifier. I can get more accessible,
//		but not more restrictive
//	@Override
//	public Parent method1(int x) throws IOException, FileNotFoundException{
//		return null;
//	}
	
//	@Override
//	private Parent method1(int x) throws IOException, FileNotFoundException{
//		return null;
//	}	no no
	
	//the second rule deals with the return type. I can get more specific,
	//	but not more broad
//	@Override
//	Child method1(int x) throws IOException, FileNotFoundException{
//		return null;
//	}
	
//	@Override
//	Object method1(int x) throws IOException, FileNotFoundException{
//		return null;
//	} no no
	
	//the third rule deals with the throws declaration in the method.
	//	it can have less or the same amount, but cannot claim new
	//	exceptions, nor add to them.
	
//	@Override
//	Parent method1(int x) throws IOException{
//		return null;
//	}
	
//	@Override
//	Parent method1(int x){
//		return null;
//	}
	
//	@Override
//	Parent method1(int x) throws Exception{
//		return null;
//	} no no
	
//	@Override
//	Parent method1(int x) throws IOException, FileNotFoundException, SQLException{
//		return null;
//	} no no
	
	
}
