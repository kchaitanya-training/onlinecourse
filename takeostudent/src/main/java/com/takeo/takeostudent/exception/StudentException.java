package com.takeo.takeostudent.exception;

import java.sql.SQLException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentException extends Exception{

	
	@ExceptionHandler(SQLException.class)
	public ProblemDetail  sqlHandlingException(SQLException e) {
	
		   ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
	        problemDetail.setTitle("SQL issue");
	        problemDetail.setStatus(HttpStatus.UNPROCESSABLE_ENTITY);;
	        return problemDetail;
	}
}
	
	
