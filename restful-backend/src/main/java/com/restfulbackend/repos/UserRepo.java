package com.restfulbackend.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restfulbackend.entities.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
