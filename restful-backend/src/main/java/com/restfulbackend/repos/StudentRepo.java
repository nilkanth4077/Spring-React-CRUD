package com.restfulbackend.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restfulbackend.entities.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

}
