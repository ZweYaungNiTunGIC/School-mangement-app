package com.zwesuu.studentmanagement.serviceimpl;

import com.zwesuu.studentmanagement.service.StudentService;


import java.util.List;

import org.springframework.stereotype.Service;

import com.zwesuu.studentmanagement.entity.Student;
import com.zwesuu.studentmanagement.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService{
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	
}
