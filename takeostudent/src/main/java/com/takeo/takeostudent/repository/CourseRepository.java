package com.takeo.takeostudent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.takeo.takeostudent.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
	
	/*
	 * @NamedQuery("SELECT s.stuId,s.stu_name,s.stu_courseid,c.courseName from Student s,"
	 * + "Course c where s.stu_course_id=c.courseId and s.stuId := stuId") public
	 * Course findByStudentId(@Param("stuId") int stuId);
	 */
	
	Course findByCourseName(String courseName);


}

