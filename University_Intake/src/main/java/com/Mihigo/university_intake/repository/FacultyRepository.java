package com.Mihigo.university_intake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Mihigo.university_intake.models.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long>{

}
