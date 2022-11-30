//@Entity
//mapira našeg studenta u bazu podataka (vezano za Hibernate)

//@Table
//vezano za tablicu u nasoj bazi podataka

//@SequenceGenerator
//generira sekvencu

//@GeneratedValue
//za PostgreSQL defaultna/preporuca se : strategy = GenerationType.SEQUENCE
//generator ce biti sequence koji smo kreirali: generator = "student_sequence" 

//sada, kada smo sve ovo napisali, smo zapravo mapirali ovu "Student" klasu u tablicu unutar nase baze podataka

package com.example.demo.student.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@SequenceGenerator(
		name = "student_sequence",
		sequenceName = "student_sequence",
		allocationSize = 1
	)
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE,
		generator = "student_sequence"
	)
	private Long id;
	private String name;
	private String email;
	private LocalDate dob;
	private Integer age;
	
	//1. konstruktor - bez parametara
	public Student() {
		super();
	}
	
	//2. konstruktor - sa svim
	public Student(Long id, String name, String email, LocalDate dob, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}
	
	//3. konstruktor - bez id(jer ce baza podataka generirati id za nas)
	public Student(String name, String email, LocalDate dob, Integer age) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.age = age;
	}
	
	//Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	//toString()
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + ", age=" + age + "]";
	}
	
	
}


