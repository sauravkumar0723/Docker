package com.learning.student_app.studentRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.student_app.controller.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>  {
	

}
