package com.exception_learning.service;

import java.io.IOException;
import java.sql.SQLException;

public interface CalculatorService{
	void divide(Integer...array) throws IOException, SQLException;

}
