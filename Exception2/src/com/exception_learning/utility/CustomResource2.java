package com.exception_learning.utility;
/**
 * 
 * @author Prashant Singh
 */

public class CustomResource2 implements AutoCloseable{

	public CustomResource2() {
		System.out.println("Custom resource2 Started");
	}
	public void process() {
		System.out.println("Custom resource2 processing");
		
	}
	public void close() {
		System.out.println("Custom resource2 closing");
	}
	

}
