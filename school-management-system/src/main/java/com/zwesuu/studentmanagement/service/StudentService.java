package com.zwesuu.studentmanagement.service;
import java.util.List;

import com.zwesuu.studentmanagement.entity.Student;
public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
}
