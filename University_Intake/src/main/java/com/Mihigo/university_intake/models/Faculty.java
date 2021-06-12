package com.Mihigo.university_intake.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Faculty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String facultyname;
	
	public Faculty() {
	}

	public Faculty(long id, String facultyname) {
		this.id = id;
		this.facultyname = facultyname;
	}

	public Faculty(String facultyname) {
		this.facultyname = facultyname;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFacultyname() {
		return facultyname;
	}

	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}
	
	
	
	
	
}
