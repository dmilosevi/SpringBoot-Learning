package com.example.demo.student.dao;

import java.util.List;

import com.example.demo.student.model.Student;

public interface StudentDAO {

	/**
	 * Dohvaća listu studenata 
	 * @return
	 */
	public List<Student> getStudentsList();

	/**
	 * Dohvat studenta po id-u
	 * @param pIdStudent
	 * @return
	 */
	public Student getStudentByID(Integer pIdStudent);
}
