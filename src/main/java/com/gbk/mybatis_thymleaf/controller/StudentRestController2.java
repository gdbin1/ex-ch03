package com.gbk.mybatis_thymleaf.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gbk.mybatis_thymleaf.domain.Student;
import com.gbk.mybatis_thymleaf.service.StudentService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentRestController2 {


//	데이터타입 String...
   	private final StudentService studentSerivce;
	
   	
	@GetMapping
	public List<Student> list() {
		return studentSerivce.getAllStudents();
	}
	
//	단건 조회
	@GetMapping("/{id}")
	public ResponseEntity<Student> detail(@PathVariable Long id) {
		Student student = studentSerivce.getStudent(id);
		return ResponseEntity.ok(student);
	}
	
//	등록: 학생 추가
	@PostMapping
	public ResponseEntity<Student> create(@RequestBody Student student) {
		studentSerivce.createStudent(student);
		return ResponseEntity.ok(student);
	}
	
//	수정
	@PutMapping("/{id}")
	public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student student) {
		student.setId(id);
		studentSerivce.updateStudent(student);
		return ResponseEntity.ok(student);
	}
	
//	삭제
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		studentSerivce.deleteStudent(id);
		return ResponseEntity.ok().build();
		
	}
}
