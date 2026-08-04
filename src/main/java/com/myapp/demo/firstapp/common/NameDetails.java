package com.myapp.demo.firstapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary//to mark class as primary if there is no specific bean , spring ioc will use primary
public class NameDetails implements PersonalDetails{

    public NameDetails(){
        System.out.println("name details");
    }
    @Override
    public String getPersonalDetails() {
        return "Name : Ritika Negi";
    }
}
