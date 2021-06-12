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
	
	
	public Student() {
	}


	public Student(long id, String names, String phone, @Email String email, Gender gender, String photo,
			Faculty faculty) {
		this.id = id;
		this.names = names;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.photo = photo;
		this.faculty = faculty;
	}


	public Student(String names, String phone, @Email String email, Gender gender, String photo, Faculty faculty) {
		this.names = names;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.photo = photo;
		this.faculty = faculty;
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * @return the names
	 */
	public String getNames() {
		return names;
	}


	/**
	 * @param names the names to set
	 */
	public void setNames(String names) {
		this.names = names;
	}


	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}


	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}


	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}


	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}


	/**
	 * @return the faculty
	 */
	public Faculty getFaculty() {
		return faculty;
	}


	/**
	 * @param faculty the faculty to set
	 */
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	
	
	
}
