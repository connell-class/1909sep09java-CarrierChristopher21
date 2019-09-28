package com.day2.review;

import java.util.ArrayList;
import java.util.List;

public class ExceptionReview {

	/*
	 * 	Hierarchy of Exceptions
	 * 
	 * 						Throwable (Class)
	 * 			Exception(Class checked)		Error (Class unchecked)
	 * 			RuntimeException (Class unchecked)
	 * 
	 * Examples of each
	 * 
	 * Exception examples:	
	 * 		FileNotFoundException, IOException, SQLException, etc...
	 * 
	 * RuntimeException examples:
	 * 		ArrayIndexOutOfBoundsException, NullPointerException, 
	 * 			IllegalArgumentException, etc...
	 * 
	 * Error examples:
	 * 		StackOverFlowError, OutOfMemoryError, etc...
	 * 	
	 * We can handle exceptions with throws declarations or try catch blocks
	 * 		We can throw exceptions with the throw keyword.
	 * 
	 * 	final, finalize, or finally
	 * 		final: non access modifier, used for:
	 * 			methods: cant be overriden
	 * 			variables: cant be changed
	 * 			class: cannot be extended
	 * 		finalize: A method inherited from object that is called by the
	 * 			gc when it is about to be destroyed.
	 * 		finally: used in a try statement as last bit of instructions for
	 * 			the program to run.
	 * 	note:  finalize is being deprecated for finally.
	 * 
	 */
	public static void main(String[] args) {
//		infrec(); StackOverFlowError
//		try {
//			generateOOM();
//		}catch(Exception e ) {
//			e.printStackTrace();
//		} Out Of Memory Error
	}
	static void infrec() {
		infrec();
		
	}
	public static void generateOOM() throws Exception {
		int iteratorValue = 20;
		System.out.println("\n=================> OOM test started..\n");
		for (int outerIterator = 1; outerIterator < 20; outerIterator++) {
			System.out.println("Iteration " + outerIterator + " Free Mem: " + Runtime.getRuntime().freeMemory());
			int loop1 = 2;
			int[] memoryFillIntVar = new int[iteratorValue];
			// feel memoryFillIntVar array in loop..
			do {
				memoryFillIntVar[loop1] = 0;
				loop1--;
			} while (loop1 > 0);
			iteratorValue = iteratorValue * 5;
			System.out.println("\nRequired Memory for next loop: " + iteratorValue);
			Thread.sleep(1000);
		}
	}
 



}
