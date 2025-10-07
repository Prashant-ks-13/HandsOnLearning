package com.exception_learning.serviceImpl;

import java.io.IOException;
import java.sql.SQLException;

import com.exception_learning.service.CalculatorService;

/**
 * 
 * @author Prashant Singh
 * @version 1.0
 * @since 07-10-1025
 */

public class CalculatorServiceImpl3 implements CalculatorService {

	@Override
	public void divide(Integer... array) throws IOException, SQLException {
		// TODO Auto-generated method stub
		int q = 0;
		if(array[1]==0) {
			throw new IOException(": Cannot divide "+array[0]+" by "+array[1]);
		}

		q = array[0] / array[1];
		System.out.println("The result is " + q);

	}

}
