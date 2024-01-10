package com.samle.takeocourse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samle.takeocourse.model.Course;
import com.samle.takeocourse.repository.CourseRepository;

@Service
public class CourseService {
	
	
	@Autowired
	CourseRepository courseRepository;
	
	
	public Course getCourse(int courseId) {
	return courseRepository.findById(courseId).get();
	}
	
	public Course getCourseByName(String CourseName) {
	return courseRepository.findByCourseName(CourseName).get();
	}
	
	public void updateCourseName(String courseName,int courseId) {
		courseRepository.updateCoursName(courseName, courseId);
	}
	
	public void deleteCourseById(int courseId) {
		courseRepository.deleteById(courseId);
	}

}
