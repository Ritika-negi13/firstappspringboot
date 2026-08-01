package com.myapp.demo.firstapp.common;

import org.springframework.stereotype.Component;

@Component
// marks a class as spring bean and makes it available for dependency injection
public class AddressDetails implements PersonalDetails {
    @Override
    public String getPersonalDetails() {
        return "your current address : Bangalore , Karnataka ,  India ";
    }
}
