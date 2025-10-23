package com.gbk.mybatis_thymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gbk.mybatis_thymleaf.domain.Student;
import com.gbk.mybatis_thymleaf.service.StudentService;

import lombok.RequiredArgsConstructor;









@Controller
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

	private final StudentService studentService;
	
//	전체 학생 목록 list
	@GetMapping
	public String list (Model model) {
//		전체 학생의 리스트 값을 화면에 변수(s)로 전달한다.
		model.addAttribute("students", studentService.getAllStudents());
		return "student/list";
	}
	
//	FORM_Blank: 입력 준비
	@GetMapping("/new")
	public String createForm(Model model) {
		model.addAttribute("student", new Student());
		return "student/form";
	}
	
//	FORM: 저장하기 버튼 클릭 후
	@PostMapping
	public String create(@ModelAttribute Student student) {
		studentService.createStudent(student);
		return "redirect:/students";
	}
	
	
	
//	FORM: 수정용: 단건 정보 출력
	@GetMapping("/{id}/edit")
	public String updateForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudent(id));
		return "student/form";
	}
	
//	FORM: 수정하기 버튼 클릭 후
	@PostMapping("/{id}")
	public String update(@PathVariable Long id, @ModelAttribute Student student) {
		student.setId(id);
		studentService.updateStudent(student);
		
		return "redirect:/students";
	}
	
//	List:삭제
	@PostMapping("/{id}/delete")
	public String delete(@PathVariable Long id) {
		studentService.deleteStudent(id);
		return "redirect:/students";
	}
	
	
}
