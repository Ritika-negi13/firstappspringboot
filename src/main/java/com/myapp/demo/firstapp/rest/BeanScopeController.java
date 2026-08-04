package com.myapp.demo.firstapp.rest;

import com.myapp.demo.firstapp.common.PersonalDetails;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanScopeController {
    private PersonalDetails personalDetails;
    private PersonalDetails myPersonalDetails;

    // as addressDetails is having prototype  scope , it will not share same instance for both
    BeanScopeController(@Qualifier("addressDetails") PersonalDetails details , @Qualifier("addressDetails") PersonalDetails myDetails){
        this.myPersonalDetails = myDetails;
        this.personalDetails = details;
    }

    // as personalDetails is having default scope (which is singleton), it will share same instance for both
    //    BeanScopeController(PersonalDetails details , PersonalDetails myDetails){
    //        this.myPersonalDetails = myDetails;
    //        this.personalDetails = details;
    //    }

    @GetMapping("/checkBeanScope")
    public boolean  checkBeanScope(){
        return this.personalDetails == this.myPersonalDetails; // if same instance true else false
    }
}
