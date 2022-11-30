//@RestController 
//ova anotacija cini ovu klasu RESTful
//ova anotacija "makes this class to serve REST endpoints
//jedini endpoint koji imamo je ovaj ispod @GetMapping anotacije i on vraca listu u kojoj je svaki clan te liste tipa "Student"

//@GetMapping
//ova anotacija znaci da zelimo nesto sa naseg servera
//da bi metoda hello() predstavljala RESTful endpoint moramo staviti anotaciju @GetMapping

//@Autowired
//ova anotacija ce magicno instancirati StudentService i injectati ga u konstruktor StudentController
//no da bi ovo radilo, klasa StudentService mora biti SPRING BEAN (@Component/@Service)

package com.example.demo.student.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.model.Student;
import com.example.demo.student.service.impl.StudentServiceImpl;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
	
	private final StudentServiceImpl studentService;

	//Constructor
	@Autowired
	public StudentController(StudentServiceImpl studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping()
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
	
}
