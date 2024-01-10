package com.takeo.takeostudent.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takeo.takeostudent.entity.Course;
import com.takeo.takeostudent.model.Student;
import com.takeo.takeostudent.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	private static final Logger LOGGER = LogManager.getLogger(StudentController.class);

	@Autowired
	StudentService studentService;
	
	

	@GetMapping(value = "/completedetails")
	public List<Course> getCourse() {
		return studentService.getCourse();
	}




	@PostMapping
	public Student saveStudent(@RequestBody Student student) {

		LOGGER.info("Hi this is sample student api");
		return studentService.saveStudentDetails(student);

	}

	@PutMapping(value = "/{id}")
	public Student updateStudentDetails(@PathVariable("id") int studentId) {

		LOGGER.info("Hi this is sample student api" + studentId);
		return null;

	}

	@DeleteMapping(value = "/{id}")
	public Student DeleteStudentDetails(@PathVariable("id") int studentId) {

		LOGGER.info("Hi this is sample student api" + studentId);
		return null;

	}

}
