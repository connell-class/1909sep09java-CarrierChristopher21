package exceptions;

/*
 * We can create our own custom exceptions and Errors by 
 * 		extending the classes. We can extend Throwable and
 * 		Exception to create a custom checked exception, or
 * 		extend RuntimeException to create an unchecked 
 * 		exception.
 */

public class MyCustomException extends Exception{

	public MyCustomException() {
		super("custom exception");
	}
	public MyCustomException(String message) {
		super("custom message is "+message);
	}
}
