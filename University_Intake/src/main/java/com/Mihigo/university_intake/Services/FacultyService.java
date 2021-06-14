package com.Mihigo.university_intake.Services;

import java.util.List;


import com.Mihigo.university_intake.models.Faculty;

public interface FacultyService {

	
	void newFaculty(String name);
	List<Faculty> allFaculty();
}
