package com.samle.takeocourse.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.samle.takeocourse.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

	Optional<Course> findByCourseName(String courseName);

	@Modifying
    @Query("UPDATE Course c SET c.courseName = :courseName WHERE c.courseId = :courseId")
    void updateCoursName(@Param("courseName") String courseName,@Param("courseId") int courseId);
	
	
	
	
	
   
}
