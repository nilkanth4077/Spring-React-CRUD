package com.restfulbackend.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long teacher_id;
	
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
    private List<Student> students;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(Long teacher_id, String name, List<Student> students) {
		super();
		this.teacher_id = teacher_id;
		this.name = name;
		this.students = students;
	}

	public Long getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(Long teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	
	

}
