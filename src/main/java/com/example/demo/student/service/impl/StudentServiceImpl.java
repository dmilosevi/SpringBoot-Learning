//@Controller/@Service
//ove anotacije koristimo kako bi klasu "oznacili" kao BEAN
//obje anotacije imaju jednaku funkciju ali koristimo @Service radi semantike tj. citljivosti

//! ! ! Za klasu "StudentController" koja predstavlja API Layer koristimo anotaciju @RestController, a za klasu "StudentService" koja predstavlja
	//Service Layer koristimo @Service

package com.example.demo.student.service.impl;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.student.model.Student;
import com.example.demo.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public List<Student> getStudents() {
		return List.of(
			new Student(
				1L,
				"Dominik",
				"domiloevi@gmail.com",
				LocalDate.of(1998, Month.NOVEMBER, 30),
				23
			)    //
		);
	}
}
