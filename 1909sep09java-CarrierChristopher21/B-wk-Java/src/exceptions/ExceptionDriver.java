package exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * Exceptions have a hierarchy
 * 	Throwable------Class		Checked
 * 		|
 * Exception Checked		Error	Unchecked
 * 		|
 * RuntimeException Unchecked
 * 
 * We can use the keyword "throw" to throw an exception
 * 		or anything that inherits from Throwable
 * 
 * Runtime exceptions (really unchecked Throwables) do not 
 * 		have to be handled.
 * 
 * Checked Throwables must be handled. 
 * 		we can handle the exception with a try-catch block,
 * 		or duck responsibility with the throws declaration
 * 
 * 
 * 
 */

public class ExceptionDriver {
	public final static void main(String... args) throws MyCustomException {
//		ArrayIndexOutOfBoundsException ai =
//				new ArrayIndexOutOfBoundsException();
//		ai.printStackTrace();
//		throw ai;
//		System.out.println("yeah");
//		print();
//		tryAndMultipleCatch();
		finallyThisIsSomethingElse();
	}

	public static void print() throws MyCustomException {
		System.out.println("first line of method");
//		NullPointerException ne =
//				new NullPointerException();
//		System.out.println("second line of method");
//		throw ne;
//		ne.printStackTrace();
//		System.out.println("last line of method"); 
//		throw new StackOverflowError();
//		throw null;
//		try {
//		voice();
//		}catch (Exception e) {
//			
//		}
		voice();
	}

	static void voice() throws MyCustomException {
		System.out.println("voice");
		enjoyLife();
	}

	static void enjoyLife() throws MyCustomException {
		System.out.println("happy days");
//		try{doStuff();}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		doStuff();
	}

	static void doStuff() throws MyCustomException {
		System.out.println("do stuff");
//		throw new ArithmeticException();
//		System.out.println(10/0);
//		try {		//throw new IOException();
//		throw new Object(); must inherit from Throwable
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		throw new MyCustomException();
	}

	static void tryAndMultipleCatch() {
//		try {
//			throw new MyCustomException("I dont say bleh bleh bleh");
//		} catch (MyCustomException e) {
//			e.printStackTrace();
//		}

//		try {
//			throw new MyCustomException();
//
//		} catch (Throwable t) {
//			System.out.println("throwable");
//			
//		} catch (Exception e) {
//			System.out.println("exception");
//			
//		} catch (MyCustomException m) {
//			System.out.println("custom");
//
//		}
	}
	static void finallyThisIsSomethingElse() {
		try {
			Scanner s = new Scanner(System.in);
			s.nextInt();
			s.close();
			//finally will always run...unless
			System.exit(0);
		}catch(RuntimeException f) {
		}
		catch(Exception i) {}
		catch(Throwable m) {}
		finally {
		System.out.println("good?");
		}
	}
	static void tryWithResource() {
		try(Scanner s = new Scanner(System.in)){
			int x=s.nextInt();
			System.out.println(x);
		}
			catch(Exception e) {}
		}
	

}
