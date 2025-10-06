package com.exception_learning;

import com.exception_learning.service.CalculatorService;
import com.exception_learning.serviceImpl.CalculatorServiceImpl;



/**
 * 
 * @author Prashant Singh
 */

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorService cs = new CalculatorServiceImpl();
		System.out.println("Scenario 1 -------");
		cs.divide(10,5);
		System.out.println("Scenario 2 -------");
		cs.divide(10,0);

	}

}
