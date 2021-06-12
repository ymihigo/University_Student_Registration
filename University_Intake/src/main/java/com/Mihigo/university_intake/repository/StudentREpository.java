package com.Mihigo.university_intake.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Mihigo.university_intake.models.Student;

public interface StudentREpository extends JpaRepository<Student, Long>{

}
