package com.restfulbackend.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restfulbackend.entities.School;

@Repository
public interface SchoolRepo extends JpaRepository<School, Long>{

}
