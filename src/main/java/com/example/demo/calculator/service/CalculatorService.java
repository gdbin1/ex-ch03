package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public String calculate(double num1, double num2, String operation) {
		
		return switch(operation.toUpperCase()) {
				case "ADD" -> add(num1, num2);
				case "SUBTRACT" -> subtract(num1, num2);
				case "MULTIPLY" -> multiply(num1, num2);
				case "DIVIDE" -> divide(num1, num2);
				default -> throw new IllegalArgumentException("적합하지 않은 연산자 ㅗ");
		};
		
		
	}
	
	public String add(double num1, double num2) {
		String result = String.valueOf(num1 + num2);
		return result;
	}

	public String subtract(double num1, double num2) {
		String result = String.valueOf(num1 - num2);
		return result;
	}

	public String multiply(double num1, double num2) {
		double result = num1 * num2;
		return String.valueOf(result);
	}

	public String divide(double num1, double num2) {
		double result = num1 / num2;
		return String.valueOf(result);
	}

}
