package com.exception_learning.utility;
/**
 * 
 * @author Prashant Singh
 */

public class CustomResource {

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
