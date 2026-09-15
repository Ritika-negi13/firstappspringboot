package com.myapp.demo.firstapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ProjectRestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Ritika love shivam";
    }

    //curl --location 'http://localhost:4200/myFirstApp/test/hello'
}
