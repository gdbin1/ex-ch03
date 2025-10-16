package com.gbk.calculator2.service;

import org.springframework.stereotype.Service;

@Service

public class CalculatorService2 {

//	public double add(int num1, int num2) {
//		double result = num1 + num2;
//		return result;
//	}
//
//	public double subtract(int num1, int num2) {
//		double result = num1 - num2;
//		return result;
//	}
//
//	public double multiply(int num1, int num2) {
//		double result = num1 * num2;
//		return result;
//	}
//
//	public double divide(int num1, int num2) {
//		double result = num1 / num2;
//		return result;
//	}

	
	
	public double add(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}
	
	public double subtract(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}
	
	public double multiply(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}
	
	public double divide(double num1, double num2) {
//		0으로 나눌 수 없음.
		if(num2 == 0)
			throw new ArithmeticException("0으로 못나눠요");
		double result = num1 / num2;
		return result;
	}

	public double calculate(double num1, double num2, String operation) {

		return switch(operation.toLowerCase()) {
//		사칙 연산을 구분해서 수행
					case "+" -> add(num1, num2);
					case "-" -> subtract(num1, num2);
					case "*" -> multiply(num1, num2);
					case "/" -> divide(num1, num2);
					default -> throw new IllegalArgumentException("적합하지 않은 연산자" + operation.toLowerCase());
		};
	}



	
//	public double add(int num1, int num2) {
//		return (num1 + num2);
//	}

	

	

}
