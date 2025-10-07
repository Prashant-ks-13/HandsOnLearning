package com.exception_learning.serviceImpl;

import com.exception_learning.service.CalculatorService;

/**
 * 
 * @author Prashant Singh
 * @version 1.0
 * @since 07-10-1025
 */

public class CalculatorServiceImpl2 implements CalculatorService {

	@Override
	public void divide(Integer... array) {
		// TODO Auto-generated method stub
		int q = 0;
		try {
			q = array[0]/array[1];
			System.out.println("The result is " +q);
		}catch(ArithmeticException |ArrayIndexOutOfBoundsException c){
			//System.out.println("cannot " +c.getMessage());
			System.out.println("Either Arithimetic or ArrayIndexOutOfBounds Exception  " );
		}
//			catch(ArrayIndexOutOfBoundsException c) {
//			//System.out.println(c.getMessage());
//			System.out.println("Minimum 2 argument/input are needed");
//		// Always Catch (Exception ex) as it is the parent class of all the exceptions.
//		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("------This is the finally Block excecuting--------");
		}

	}

}
