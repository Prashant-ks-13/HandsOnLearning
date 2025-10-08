package com.exception_learning.serviceImpl;

import java.io.IOException;

import com.exception_learning.exception.MyCustomException;
import com.exception_learning.service.CalculatorService;
import com.exception_learning.utility.CustomResource;
import com.exception_learning.utility.CustomResource2;

/**
 * 
 * @author Prashant Singh
 * @version 1.0
 * @since 07-10-1025
 */

public class CalculatorServiceImpl3 implements CalculatorService {

	@Override
	public void divide(Integer... array) throws MyCustomException {
		// TODO Auto-generated method stub
		int q = 0;
		CustomResource cr = new CustomResource();
		CustomResource2 cr2 = new CustomResource2();
		try (cr ; cr2) { // Try with resources.
			cr.process();
			if (array[1] == 0) {
				throw new MyCustomException(": Cannot divide " + array[0] + " by " + array[1]);
			}

			q = array[0] / array[1];
			System.out.println("The result is " + q);
		} catch (Exception ex) {
			System.out.println("Opps Exception occurs in " + this.getClass() + " error is " + ex.getMessage());
			throw ex;
		}

	}

}
