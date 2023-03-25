package com.studentinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentinfo.model.Students;
import com.studentinfo.repository.StuentRepository;


@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	private StuentRepository studentRepo;
	
	
	
	public Students saveStudents(Students student) {
		
		return studentRepo.save(student);
	}



	@Override
	public List<Students> getAllStudents() {
		
		return studentRepo.findAll();
	}

}
