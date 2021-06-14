package com.Mihigo.university_intake.Services;

import java.util.List;

import javax.validation.constraints.Email;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.multipart.MultipartFile;

import com.Mihigo.university_intake.models.Student;

public interface StudentServices{

	
	void newStudent(String names, String phone, @Email String email, String gender, MultipartFile photo, long facultyId);
	List<Student> allStudent();
}
