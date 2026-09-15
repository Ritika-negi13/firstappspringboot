package com.myapp.demo.firstapp.rest;

import com.myapp.demo.firstapp.Entity.StudentPojo;
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

    // get api /student/ getStudentData
    @GetMapping("/getStudentData")
    public List<StudentPojo> getStudent(){
        List<StudentPojo> student = new ArrayList<>();
        student.add(new StudentPojo("Ritika" , "Negi"));
        student.add(new StudentPojo("Shivam" , "Mandloi"));
        student.add(new StudentPojo("kriti" , "sanon"));
        return student;
    }

    // postman request 'http://localhost:4200/myFirstApp/student/getStudentData'


    // get api with path variable
    @GetMapping("/getStudentData/{studentId}")
    public List<StudentPojo> getStudentById(@PathVariable int studentId){
        List<StudentPojo> student = new ArrayList<>();
        student.add(new StudentPojo("Ritika" , "Negi"));
        student.add(new StudentPojo("Shivam" , "Mandloi"));
        student.add(new StudentPojo("kriti" , "sanon"));
        return Collections.singletonList(student.get(studentId));
    }
    //    postman request 'http://localhost:4200/myFirstApp/student/getStudentData/0'

}
