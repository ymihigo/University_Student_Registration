package com.Mihigo.university_intake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Mihigo.university_intake.models.Student;

@Repository
public interface StudentREpository extends JpaRepository<Student, Long>{

	@Query("select s from Student s where names = :name")
	Student searchByName(String name);
}
