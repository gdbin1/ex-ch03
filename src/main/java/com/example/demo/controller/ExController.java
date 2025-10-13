package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ExService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ExController {
	
	ExService exService;
	
	public ExController(ExService exService) {
		this.exService = exService;
	}
	
//	@GetMapping("/")
//	public String getMethodName() {
//		return "루트경로";
//	}
	
	@GetMapping("/")
	public String getMethodName() {
		return exService.sayHello("안녕");
	}
	
	@GetMapping("/ex321")
	public String getEx321() {
		return exService.ex321();
	}
	
	@GetMapping("/ex322")
	public String getEx322() {
		return exService.ex322();
	}
	
	@GetMapping("/ex323")
	public String getEx323() {
		return exService.ex323();
	}
	
	@GetMapping("/ex324")
	public String getEx324() {
		return exService.ex324();
	}
	
	@GetMapping("/ex325")
	public String getEx325() {
		return exService.ex325();
	}
	
	@GetMapping("/ex326")
	public String getEx326() {
		return exService.ex326();
	}
	
	@GetMapping("/ex327")
	public String getEx327() {
		return exService.ex327();
	}
	
	@GetMapping("/ex328")
	public String getEx328() {
		return exService.ex328();
	}
	
	@GetMapping("/ex331")
	public String getEx331() {
		return exService.ex331();
	}
	
	@GetMapping("/ex332")
	public String getEx332() {
		return exService.ex332();
	}
	
	@GetMapping("/ex333")
	public String getEx333() {
		return exService.ex333();
	}
	
	@GetMapping("/ex334")
	public String getEx334() {
		return exService.ex334();
	}
	
	@GetMapping("/ex335")
	public String getEx335() {
		return exService.ex335();
	}
	
	
}
