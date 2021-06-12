package com.Mihigo.university_intake.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;

import org.springframework.context.annotation.Scope;

@Entity
@Scope(value = "singleton")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String names;
	private String phone;
	@Email
	private String email;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	private String photo;
	@ManyToOne
	private Faculty faculty;
	
	
	
	
}
