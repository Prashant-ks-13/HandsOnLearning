package com.exception_learning.exception;
/**
 * 
 * @author Prashant Singh
 */

public class MyCustomException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MyCustomException() {
		
	}
	
	public MyCustomException(String message) {
		super(message);
	}
	
	

}
