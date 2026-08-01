package com.myapp.demo.firstapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // to inject values from application.properties files
    @Value("${coach.name}")
    private String coachName;

    @Value("${coach.course}")
    private String course;


    @GetMapping("/courseinfo")
    private String teamInfo(){
        return coachName + "  " + course;
    }

     @GetMapping("/")
    public String sayHello(){
         return "Hello ritika , i m ritika  hiiiiiiiiiiii   shivam  ," + coachName + "  " + course;
     }

    @GetMapping("/workout")
    public String getWorkOut(){
         return "run 5km !!";
    }
}
