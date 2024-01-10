package com.takeo.takeostudent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.takeo.takeostudent.exception.StudentException;
import com.takeo.takeostudent.model.Student;
import com.takeo.takeostudent.repository.CourseRepository;
import com.takeo.takeostudent.repository.StudentRepository;
import com.takeo.takeostudent.util.RestClientCall;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRep;
	

    @Autowired
     RestClientCall restClientCall;

    @ExceptionHandler(StudentException.class)
	public Student saveStudentDetails(Student student)  {
	
	
			com.takeo.takeostudent.entity.Student stu=new com.takeo.takeostudent.entity.Student();

			stu.setStuName(student.getStuName());
			stu.setAddress(student.getAddress());
			//com.takeo.takeostudent.entity.Course curse=new com.takeo.takeostudent.entity.Course();
			//Course course=restClientCall.apiCallForCourseDetailsByCourseName(student.getCourseName());
			com.takeo.takeostudent.entity.Course course=  courseRep.findByCourseName(student.getCourseName());
			stu.setCourse(course);
		    studentRepository.save(stu);
		
	
		return student;
	}

	public List<com.takeo.takeostudent.entity.Course> getCourse() {

		return courseRep.findAll();
	}
	
	public List<com.takeo.takeostudent.entity.Student> getStudent(){
		return studentRepository.findAll();
	}

	
}
