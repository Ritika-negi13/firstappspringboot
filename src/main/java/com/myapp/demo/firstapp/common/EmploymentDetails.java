package com.myapp.demo.firstapp.common;

import org.springframework.web.bind.annotation.GetMapping;

public class EmploymentDetails implements  PersonalDetails{

    public EmploymentDetails(){
        System.out.println("in employment details");
    }

    @GetMapping("/getPersonalDetails")
    public String getPersonalDetails(){
        return "employed at Go digit";
    }

}
