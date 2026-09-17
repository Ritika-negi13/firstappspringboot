package com.myapp.demo.firstapp.rest;

import com.myapp.demo.firstapp.Entity.StudentErrorResponse;
import com.myapp.demo.firstapp.Entity.StudentPojo;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController {

    private List<StudentPojo> student;

    @PostConstruct // called once after bean is created
    public void setData(){
        this.student = new ArrayList<>();
        this.student.add(new StudentPojo("Ritika" , "Negi"));
        this.student.add(new StudentPojo("Shivam" , "Mandloi"));
        this.student.add(new StudentPojo("kriti" , "sanon"));
    }

    // get api /student/ getStudentData
    @GetMapping("/getStudentData")
    public List<StudentPojo> getStudent(){
        return student;
    }

    // postman request 'http://localhost:4200/myFirstApp/student/getStudentData'


    // get api with path variable
    @GetMapping("/getStudentData/{studentId}")
    public StudentPojo getStudentById(@PathVariable int studentId){
        // check if student id is valid
        if(studentId >= student.size() || studentId < 0)
            throw new StudentNotFoundException("Student id not found - " + studentId);

        return student.get(studentId);
    }
    //    postman request 'http://localhost:4200/myFirstApp/student/getStudentData/0'

}
