package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ExService;


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
	
	@GetMapping("/ex336")
	public String getEx336() {
		return exService.ex336();
	}
	
	@GetMapping("/ex337")
	public String getEx337() {
		return exService.ex337();
	}
	
	@GetMapping("/ex338")
	public String getEx338() {
		return exService.ex338();
	}
	
//	@GetMapping("/ex339")
//	public String getEx339() {
//		return exService.ex339();
//	}
	
	@GetMapping("/ex3310")
	public String getEx3310() {
		return exService.ex3310();
	}
	
	@GetMapping("/ex3311")
	public String getEx3311() {
		return exService.ex3311();
	}
	
	@GetMapping("/ex3312")
	public String getEx3312() {
		return exService.ex3312();
	}
	
	@GetMapping("/ex3313")
	public String getEx3313() {
		return exService.ex3313();
	}
	
	@GetMapping("/ex3314")
	public String getEx3314() {
		return exService.ex3314();
	}
	
	
}
