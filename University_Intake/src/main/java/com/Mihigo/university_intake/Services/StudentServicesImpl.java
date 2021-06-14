package com.Mihigo.university_intake.Services;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.Email;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.Mihigo.university_intake.models.Gender;
import com.Mihigo.university_intake.models.Student;


@Service
public class StudentServicesImpl implements StudentServices{

	@Override
	public void newStudent(String names, String phone, @Email String email, String gender, String photo,
			int facultyId) {
		try {
			
			
		}catch(Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
		
	}

	@Override
	public List<Student> allStudent() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
