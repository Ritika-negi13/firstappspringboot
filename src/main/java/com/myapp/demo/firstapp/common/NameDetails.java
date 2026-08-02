package com.myapp.demo.firstapp.common;

import org.springframework.stereotype.Component;

@Component
public class NameDetails implements PersonalDetails{

    @Override
    public String getPersonalDetails() {
        return "Name : Ritika Negi";
    }
}
