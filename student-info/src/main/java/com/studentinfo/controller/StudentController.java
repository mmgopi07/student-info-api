package com.studentinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.studentinfo.model.Students;
import com.studentinfo.service.StudentService;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("add")
	public String add(@RequestBody Students student) {

		studentService.saveStudents(student);

		return "Student Info Added Successfully...";
	}
	
	@GetMapping("/getAll")
	public List<Students> getAllStudents(){
		
		return studentService.getAllStudents();
	}

}
