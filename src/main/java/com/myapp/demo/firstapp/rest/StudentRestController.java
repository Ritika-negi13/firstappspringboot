package com.myapp.demo.firstapp.rest;

import com.myapp.demo.firstapp.Entity.StudentPojo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentRestController {

    @GetMapping("/getStudentData")
    public List<StudentPojo> getStudent(){
        List<StudentPojo> student = new ArrayList<>();
        student.add(new StudentPojo("Ritika" , "Negi"));
        student.add(new StudentPojo("Shivam" , "Mandloi"));
        student.add(new StudentPojo("kriti" , "sanon"));
        return student;
    }

    // postman request 'http://localhost:4200/myFirstApp/student/getStudentData'
}
