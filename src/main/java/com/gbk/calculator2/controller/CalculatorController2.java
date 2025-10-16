package com.gbk.calculator2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gbk.calculator2.dto.CalculatorRequest2;
import com.gbk.calculator2.dto.CalculatorResponse2;
import com.gbk.calculator2.service.CalculatorService2;

import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("calculator2")

@RestController

public class CalculatorController2 {
//	spring 방식1
//	@Autowired
//	CalculatorService2 calculatorService2;
	
//	spring 방식2 : 생성자를 통한 객체 주입 방식
	CalculatorService2 calculatorService2;
	
	public CalculatorController2(CalculatorService2 calculatorService2) {
		this.calculatorService2 = calculatorService2;
	}
	
//	자바 생성자 방식
//	CalculatorService2 calculatorService2 = new CalculatorService2();
	
//	----- return String ----- (문자열을 return)
//	@GetMapping("/add")
//	public String add() {
//		return new String("/덧셈");
//	}
	
//	----- double 타입의 연산 결과를 return -----
//	@GetMapping("/add")
//	public double add() {
//		return (10+5);
//	}
	
//	----- 객체(오브젝트).메소드: 서비스 로직으로 연산 결과를 return -----
//	@GetMapping("/add")
//	public double add() {
////		return (10/3);
//		return calculatorService2.add(10,5);
//	}
	
//	@GetMapping("/subtract")
//	public double subtract() {
//		return calculatorService2.stract(10,5);
//	}
//	
//	@GetMapping("/multiply")
//	public double multiply() {
//		return calculatorService2.multiply(10,5);
//	}
//	
//	@GetMapping("/divide")
//	public double divide() {
//		return calculatorService2.divide(10,5);
//	}
	
//	CalculatorResponse2 calculatorResponse2 = new CalculatorResponse2(num1, num2, "add", num1+num2);
//	new CalculatorResponse2(num1, num2, "add", num1+num2);
	
//	----- 사용자가 입력한 값을 받아서, 서비스 로직으로 연산 결과를 리턴후, 결과포멧을 dto 를 사용하겠다. record 타입 -----
//	@GetMapping("/add")
//	public double add(@RequestParam int num1, @RequestParam int num2) {
//		return calculatorService2.add(num1, num2);
//	}
	
//	@GetMapping("/subtract")
//	public double subtract(@RequestParam int num1, @RequestParam int num2) {
//		return calculatorService2.stract(num1, num2);
//	}
	
//	@GetMapping("/multiply")
//	public double multiply(@RequestParam int num1, @RequestParam int num2) {
//		return calculatorService2.multiply(num1, num2);
//	}
//	
//	@GetMapping("/divide")
//	public double divide(@RequestParam int num1, @RequestParam int num2) {
//		return calculatorService2.divide(num1, num2);
//	}
	
//	------1. 결과값: 서비스 로직으로 연산결과를 얻음
//	------2. 결과 포맷을 dto (record 타입)를 사용하겠다 ------
//	------3. return 타입을 dto (record 타입)으로 수정해주자
//	------4. 브라우저확인1: http://localhost:8080/calculator/add?num1=20&num2=30
//	------4. 브라우저확인2: http://localhost:8090/calculator/add?num1=20&num2=30
	@GetMapping("/add")
	public CalculatorResponse2 add(@RequestParam int num1, @RequestParam int num2) {
		double result = calculatorService2.add(num1, num2);
		return new CalculatorResponse2(num1, num2, "add", result);
	}
	
	@GetMapping("/subtract")
	public CalculatorResponse2 subtract(@RequestParam int num1, @RequestParam int num2) {
		double result = calculatorService2.subtract(num1, num2);
		return new CalculatorResponse2(num1, num2, "subtract", result);
	}
	
	@GetMapping("/multiply")
	public CalculatorResponse2 getMethodName(@RequestParam int num1, @RequestParam int num2) {
		double result = calculatorService2.multiply(num1, num2);
		return new CalculatorResponse2(num1, num2, "multiply",result);
	}
	
	@GetMapping("/divide")
	public CalculatorResponse2 divide(@RequestParam int num1,  @RequestParam int num2) {
		double result = calculatorService2.divide(num1, num2);
		return new CalculatorResponse2(num1,num2,"divide",result);
	}
//	------- Post메소드 테스트: entity 문자열을 리턴
//	ENDpoint 테스트:  http://localhost:8090/calculator/calculate
//	@PostMapping("calculate")
//	public String postMethodName(@RequestBody String entity) {
//		return entity;
//	}
//	----- 1. @RequestBody: 객체 방식으로 값을 저장 -----
//	----- 2. result : 연산 결과값을 저장 -----
//	----- 3. 출력포멧 : 객체 방식으로 값을 화면에 뿌려줌 -----
//	@PostMapping("calculate")
//	public CalculatorResponse2 postMethodName(@RequestBody CalculatorRequest2 request) {
//		request ==>> num1 = 100, num2 = 50, operation = "ADD"
//
//		//		result(150) =  더하기 (getNum1 (100), getNum2 (50))
//		double result = calculatorService2.add(request.getNum1(), request.getNum2());
//	
// //		출력포멧을 결정
// //		num1 = 100, num2 = 50, operation = "ADD",result
//		return new CalculatorResponse2(request.getNum1(), request.getNum2(),request.getOpertaion(),result);
//	}
	
	
//	테스트: http://localhost:8090/calculator/calculate
//	{
//	    "num1": 100,
//	    "num2": 50,
//	    "operation": "*"
//	}
	@PostMapping("calculate")
	public CalculatorResponse2 postMethodName(@RequestBody CalculatorRequest2 request) {
		
//		+ - * / 
		double result = calculatorService2.calculate(request.getNum1(), request.getNum2(), request.getOperation());
	
//		출력포멧을 결정
//		num1 = 100, num2 = 50, operation = "ADD",result
		return new CalculatorResponse2(request.getNum1(), request.getNum2(),request.getOperation(),result);
	}
	
	
}
