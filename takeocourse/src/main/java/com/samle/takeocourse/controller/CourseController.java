package com.samle.takeocourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.samle.takeocourse.model.Course;
import com.samle.takeocourse.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	
	@GetMapping("/{id}")
	public Course getCourseDetails(@PathVariable("id") int id) {
		
		return courseService.getCourse(id);
	}

	
	@GetMapping("/coursename/{name}")
	public Course getCourseDetailsByName(@PathVariable("name") String courseName) {
		
		return courseService.getCourseByName(courseName);
	}
	
	@PutMapping("/coursename/{name}/courseI/{courseId}")

	public ResponseEntity<String> updateCourseName(@PathVariable("name") String courseName,@PathVariable("courseId") int courseId) {
		
	    courseService.updateCourseName(courseName,courseId);
	    return new ResponseEntity<>(HttpStatusCode.valueOf(200));
	
	}

}
