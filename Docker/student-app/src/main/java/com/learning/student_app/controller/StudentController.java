package com.learning.student_app.controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.student_app.studentRepo.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/getStudents")
	public List<Student> getStudent() {
	    return repo.findAll();
	}
	
	
	@RequestMapping("/addStudents")
	public List<Student> addStudents() {
	    List<Student> students = List.of(
	        new Student("Nitu", 21),
	        new Student("Saurav", 22),
	        new Student("Ankit", 23),
	        new Student("Nitish", 24),
	        new Student("Aditi", 25)
	    );

	    return repo.saveAll(students);
	}

}
