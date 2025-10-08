package com.exception_learning;

import com.exception_learning.service.CalculatorService;
import com.exception_learning.serviceImpl.CalculatorServiceImpl3;
import com.exception_learning.utility.CustomResource;

/**
 * 
 * @author Prashant Singh
 * @since 06-10-2025
 * @version 1.0
 */

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorService cs = new CalculatorServiceImpl3();
		CustomResource cr = new CustomResource();
		try {
			cr.process();
			System.out.println("Scenario 1 -------");
			cs.divide(10, 5);
			System.out.println("Scenario 2 -------");
			cs.divide(10, 0);
			System.out.println("Scenario 3 -------");
			cs.divide(10);
		} catch (Exception ex) {
			System.out.println("Something went wrong " + ex);
		} finally {
			cr.close();
		}

	}

}
