package com.Mihigo.university_intake.Services;

import java.util.List;

import javax.validation.constraints.Email;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mihigo.university_intake.models.Student;

public interface StudentServices extends JpaRepository<Student, Long>{

	
	void newStudent(String names, String phone, @Email String email, String gender, String photo, int facultyId);
	List<Student> allStudent();
}
