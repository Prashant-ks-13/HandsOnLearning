package com.exception_learning.serviceImpl;

import com.exception_learning.service.CalculatorService;

/**
 * 
 * @author Prashant Singh
 */

public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public void divide(Integer... array) {
		int q = 0;
		q = array[0] / array[1];
		System.out.println("The result is " +q);
		// TODO Auto-generated method stub
		
	}

}
