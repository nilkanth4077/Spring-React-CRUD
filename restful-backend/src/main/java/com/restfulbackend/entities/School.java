package com.restfulbackend.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class School {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long school_id;
	
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
    private List<Teacher> teachers;

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(Long school_id, String name, List<Teacher> teachers) {
		super();
		this.school_id = school_id;
		this.name = name;
		this.teachers = teachers;
	}

	public Long getSchool_id() {
		return school_id;
	}

	public void setSchool_id(Long school_id) {
		this.school_id = school_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	
	
	

}
