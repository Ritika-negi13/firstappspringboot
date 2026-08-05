package com.myapp.demo.firstapp.config;

import com.myapp.demo.firstapp.common.AddressDetails;
import com.myapp.demo.firstapp.common.EmploymentDetails;
import com.myapp.demo.firstapp.common.PersonalDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DetailsConfig {

    @Bean
    public PersonalDetails employmentDetails(){
        return new EmploymentDetails();
    }
}
