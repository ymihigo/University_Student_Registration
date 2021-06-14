package com.Mihigo.university_intake.Services;

import java.util.Base64;
import java.util.List;
import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.Mihigo.university_intake.models.Faculty;
import com.Mihigo.university_intake.models.Gender;
import com.Mihigo.university_intake.models.Student;
import com.Mihigo.university_intake.repository.StudentREpository;


@Service
public class StudentServicesImpl implements StudentServices{

	@Autowired
	private StudentREpository sturepo;
	
	@Autowired
	private FacultyService facServ;
	
	@Override
	public void newStudent(String names, String phone, @Email String email, String gender, MultipartFile photo,
			String facultyId) {
		try {
			Faculty fac=new Faculty();
			long fid=Long.parseLong(facultyId);
			fac=facServ.searchById(fid);
			
			Student st=new Student();
			if(fac == null) {
				throw new RuntimeException("Faculty can't be empty");
			}
			
			String filename=StringUtils.cleanPath(photo.getOriginalFilename());
			if(filename.contains("..")) {
				throw new RuntimeException("invalid path");
			}
			
			st.setPhoto(Base64.getEncoder().encodeToString(photo.getBytes()));
			st.setPhone(phone);
			st.setGender(Gender.valueOf(gender));
			st.setEmail(email);
			st.setFaculty(fac);
			st.setNames(names);
			
			sturepo.saveAndFlush(st);
			
		}catch(Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
		
	}

	@Override
	public List<Student> allStudent() {
		try {
			return this.sturepo.findAll();
		}catch (Exception e) {
		throw new RuntimeException(e.getMessage());
		}
	}
	
}
