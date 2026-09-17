package com.myapp.demo.firstapp.rest;

import com.myapp.demo.firstapp.Entity.StudentErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {
    // add an exception handler
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException s){
        // create error response
        StudentErrorResponse ser = new StudentErrorResponse(HttpStatus.NOT_FOUND.value() ,s.getMessage() ,System.currentTimeMillis());
        return new ResponseEntity<>(ser , HttpStatus.NOT_FOUND);
    }


    // add another exception handler to catch any type ike if string as id
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleAllException(Exception s){
        StudentErrorResponse ser = new StudentErrorResponse(HttpStatus.BAD_REQUEST.value() ,s.getMessage() ,System.currentTimeMillis());
        return new ResponseEntity<>(ser , HttpStatus.BAD_REQUEST);
    }
}
