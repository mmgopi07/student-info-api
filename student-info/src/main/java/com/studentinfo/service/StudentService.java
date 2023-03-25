package com.studentinfo.service;

import java.util.List;

import com.studentinfo.model.Students;


public interface StudentService {
	
	public Students saveStudents(Students student);

	public List<Students> getAllStudents();
}
