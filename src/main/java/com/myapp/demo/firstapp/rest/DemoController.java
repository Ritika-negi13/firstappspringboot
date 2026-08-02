package com.myapp.demo.firstapp.rest;

import com.myapp.demo.firstapp.common.PersonalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // as it is rest controller
public class DemoController {

    // define a private field for dependency
    private PersonalDetails personalDetails;

    // field injection
    // generally not  used difficult to test
    /*@Autowired
    private PersonalDetails myData;*/

    // define a constructor for dependency injection
    // autowired tells to inject dependency
    @Autowired // id you have only one constructor no need to use autowired

    //  @Qualifier is used when multiple beans of the same type exist, and Spring needs to know which specific bean to inject.
    public DemoController(@Qualifier("nameDetails") PersonalDetails myPersonalDetails){
        this.personalDetails = myPersonalDetails;
    }


    // getter injection
    // if dependency is optional
    /*@Autowired
    public void getter(PersonalDetails myPersonalDetails){
        this.personalDetails = myPersonalDetails;
    }*/

    // need to create a rest api

    @GetMapping("/getPersonalDetails")
    public String getPersonalDetails(){
        return this.personalDetails.getPersonalDetails();
    }
}
