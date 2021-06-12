package com.Mihigo.university_intake.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Mihigo.university_intake.models.Faculty;


@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long>{

}
