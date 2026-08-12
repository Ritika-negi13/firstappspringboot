package com.myapp.demo.firstapp.rest;
import com.myapp.demo.firstapp.common.PersonalDetails;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigBeanController {
    private PersonalDetails personalDetails;

    // if you try to use bean without , define error it will throw error
    // Parameter 0 of constructor in com.myapp.demo.firstapp.rest.ConfigBeanController required a bean of type 'com.myapp.demo.firstapp.common.PersonalDetails' that could not be found.
    // The injection point has the following annotations:
    //    - @org.springframework.beans.factory.annotation.Qualifier("employmentDetails")

    public ConfigBeanController(@Qualifier("employmentDetails") PersonalDetails personalDetails){
        this.personalDetails = personalDetails;
    }



    // crea
    @GetMapping("/configBean")
    public String getConfigBean(){
        return this.personalDetails.getPersonalDetails();
    }
}
