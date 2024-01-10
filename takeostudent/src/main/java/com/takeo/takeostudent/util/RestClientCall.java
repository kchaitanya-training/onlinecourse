package com.takeo.takeostudent.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.takeo.takeostudent.model.Course;

@Component
public class RestClientCall {
	
	@Autowired
	RestTemplate restTemplate;
	
	
	public Course apiCallForCourseDetailsByCourseName(String  courseName) {
		Course course=	restTemplate.getForObject("http://takeo-course/course/coursename/{courseName}", Course.class,courseName );
		//TAKEO-COURSE - takeo-course -- "http://localhost:8556/course/coursename/java
		return course;
	}

}
