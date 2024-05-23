package com.restfulbackend.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restfulbackend.entities.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long>{

}
