package com.zwesuu.studentmanagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zwesuu.studentmanagement.entity.Student;
import com.zwesuu.studentmanagement.repository.StudentRepository;

@SpringBootApplication
public class SchoolManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementSystemApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student student1 = new Student("Albert","Einstein","albert@gmail.com");
		
		studentRepository.save(student1);
		Student student2 = new Student("Harry","Style","albert@gmail.com");
		
		studentRepository.save(student2);
		
	}
	
	
	
	

}
