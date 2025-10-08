package com.exception_learning.utility;
/**
 * 
 * @author Prashant Singh
 */

public class CustomResource implements AutoCloseable{

	public CustomResource() {
		System.out.println("Custum resource Started");
	}
	public void process() {
		System.out.println("Custom resource processing");
		
	}
	public void close() {
		System.out.println("Custom resource closing");
	}
	

}
