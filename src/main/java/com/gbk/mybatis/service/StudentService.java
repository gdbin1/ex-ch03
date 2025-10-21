package com.gbk.mybatis.service;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gbk.mybatis.domain.Student;
import com.gbk.mybatis.mapper.StudentMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class StudentService {

	private final StudentMapper studentMapper;
	
	public List<Student> getAllStudent() {
		
		return studentMapper.findAll();
//		List<Student> students = new ArrayList<>();
//		students.add(new Student() {{setId(1L); setName("홍길동");}});
//		students.add(new Student() {{setId(2L); setName("이몽룡");}});
//		students.add(new Student() {{setId(3L); setName("성춘향");}});
//		return students;
	}

	public Student getStudent(Long id) {
		
		return studentMapper.findById(id);
	}

	@Transactional
	public void createStudent(Student student) {
		studentMapper.insert(student);
		
	}
	
	@Transactional
	public void updateStudent(Student student) {
		studentMapper.update(student);
		
	}

//	public void deleteStudent(Student student) {
//		studentMapper.delete(student);
//	}
	@Transactional
	public void deleteStudent(Long id) {
		studentMapper.delete(id);
	}

	
}
