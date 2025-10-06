package com.exception_learning.serviceImpl;

import com.exception_learning.service.CalculatorService;

/**
 * 
 * @author Prashant Singh
 */

public class CalculatorServiceImpl1 implements CalculatorService {

	@Override
	public void divide(Integer... array) {
		// TODO Auto-generated method stub
		int q = 0;
		try {
			q = array[0]/array[1];
			System.out.println("The result is " +q);
		}catch(ArithmeticException c){
			System.out.println("cannot " +c.getMessage());
		}

	}

}
