package com.Mihigo.university_intake.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Mihigo.university_intake.models.Faculty;
import com.Mihigo.university_intake.repository.FacultyRepository;

@Service
public class FacultyServicesImpl implements FacultyService{

	@Autowired
	private FacultyRepository facrepo;
	
	@Override
	public void newFaculty(String name) {
		try {
			facrepo.saveAndFlush(new Faculty(name));
		}catch(Exception ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}

	@Override
	public List<Faculty> allFaculty() {
		
		return facrepo.findAll();
	}

	@Override
	public Faculty searchById(Long id) {
		try {
			Faculty fac=facrepo.getById(id);
			return fac;
		}catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}
	

}
