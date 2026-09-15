package com.myapp.demo.firstapp.rest;

import com.myapp.demo.firstapp.Entity.StudentPojo;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
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
    public List<StudentPojo> getStudentById(@PathVariable int studentId){

        return Collections.singletonList(student.get(studentId));
    }
    //    postman request 'http://localhost:4200/myFirstApp/student/getStudentData/0'

}
