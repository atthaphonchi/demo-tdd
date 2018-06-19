package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class DevideOperation {

	public double calculate(int operand1, int operand2) {
		if(operand2 == 0) {
			throw new DivideOperationException();
		}
		return operand1/operand2;
	}

}
