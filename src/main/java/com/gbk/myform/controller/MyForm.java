package com.gbk.myform.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gbk.myform.dto.ArticleRequest;



@RestController

public class MyForm {
	
	private static final Logger log = LoggerFactory.getLogger(MyForm.class);
//	http://localhost:8080/article-get?title=제목&content=get
	@GetMapping("/article-get")
	public String articleGet(@RequestParam String title, @RequestParam String content) {
		String result = "제목: " + title + "\n" + "<br>내용: " + content;
		log.info(result);
		return result;
	}
//	http://localhost:8080/article-post
	@PostMapping("/article-post")
	public String articlePost(@ModelAttribute ArticleRequest request) {
		String result =  "제목: " + request.title() + "<br>내용: " +request.content();
		return result;
	}
//	http://localhost:8080/article-postman
//	포스트맨으로 테스트하세요
	@PostMapping("/article-postman")
	public String articlePostman(@RequestBody ArticleRequest request) {
		String result =  "제목: " + request.title() + "<br>내용: " +request.content();
		return result;
	}
//	화면테스트 가능, 포스트맨 테스트 가능
//	http://localhost:8080/article-auto
	@PostMapping("/article-auto")
	public String articleAuto(ArticleRequest request) {
		String result =  "제목: " + request.title() + "<br>내용: " +request.content();
		return result;
	}
}
