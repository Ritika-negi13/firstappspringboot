package com.myapp.demo.firstapp.rest;
import com.myapp.demo.firstapp.common.PersonalDetails;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanLifeCycleController {
    public PersonalDetails personalDetails;

    BeanLifeCycleController(PersonalDetails personalDetails){
        this.personalDetails = personalDetails;
    }

    @PostConstruct
    public void doMyStartupstuffs(){
        System.out.println("initalized");
    }

    @PreDestroy
    public void doCleanUpStuffs(){
         System.out.println("destroyed");
    }

    @GetMapping("/checkBeanLifeCycle")
    public String checkBeanLifeCycle(){
        return "check Bean Life Cycle";
    }

}
