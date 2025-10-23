package com.gbk.mybatis_thymleaf.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gbk.mybatis_thymleaf.domain.Student;
import com.gbk.mybatis_thymleaf.mapper.StudentMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StudentService {

	private final StudentMapper studentMapper;
	
	public List<Student> getAllStudents() {
		return studentMapper.findAll();
		
	}

	public Student getStudent(Long id) {
		return studentMapper.findById(id);
	}

	@Transactional
	public void createStudent(Student student) {
		studentMapper.insert(student);
		
	}

	public void updateStudent(Student student) {
		studentMapper.update(student);
		
	}

	public void deleteStudent(Long id) {
		studentMapper.delete(id);
		
	}


}
