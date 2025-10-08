package com.exception_learning.serviceImpl;

import java.io.IOException;
import java.sql.SQLException;

import com.exception_learning.service.CalculatorService;
import com.exception_learning.utility.CustomResource;

/**
 * 
 * @author Prashant Singh
 * @version 1.0
 * @since 06-10-2025
 */

public class CalculatorServiceImpl1 implements CalculatorService {

	@Override
	public void divide(Integer... array) throws IOException, SQLException{
		// TODO Auto-generated method stub
		int q = 0;
		
		
		try {
			
			q = array[0]/array[1];
			System.out.println("The result is " +q);
		}catch(ArithmeticException c){
			//System.out.println("cannot " +c.getMessage());
			System.out.println("cannot divide " + array[0]+" with "+ array[1]);
		}catch(ArrayIndexOutOfBoundsException c) {
			//System.out.println(c.getMessage());
			System.out.println("Minimum 2 argument/input are needed");
		// Always Catch (Exception ex) as it is the parent class of all the exceptions.
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("------This is the finally Block excecuting--------");
			
		}

	}

}
