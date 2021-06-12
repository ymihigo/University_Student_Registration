package com.Mihigo.university_intake.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Mihigo.university_intake.models.Faculty;

@Service
public interface FacultyService {

	
	void newFaculty(String name);
	List<Faculty> allFaculty();
}
