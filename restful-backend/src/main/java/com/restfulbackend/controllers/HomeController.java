package com.restfulbackend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.restfulbackend.entities.User;
import com.restfulbackend.repos.UserRepo;

@RestController
@RequestMapping("/api/")
public class HomeController {
	
	@Autowired
    private UserRepo userRepo;
	
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @GetMapping("/get_user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        Optional<User> user = userRepo.findById(id);
        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping("/create_user")
    public User createUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @PutMapping("/update_user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        Optional<User> user = userRepo.findById(id);
        if (user.isPresent()) {
            User updatedUser = user.get();

            if (userDetails.getName() != null) {
                updatedUser.setName(userDetails.getName());
            }
            if (userDetails.getEmail() != null) {
                updatedUser.setEmail(userDetails.getEmail());
            }
            if (userDetails.getPhone() != null) {
                updatedUser.setPhone(userDetails.getPhone());
            }
            if (userDetails.getAge() != null) {
                updatedUser.setAge(userDetails.getAge());
            }

            return ResponseEntity.ok(userRepo.save(updatedUser));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @DeleteMapping("/delete_user/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        Optional<User> user = userRepo.findById(id);
        if (user.isPresent()) {
            userRepo.delete(user.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

}
