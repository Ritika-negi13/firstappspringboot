package com.myapp.demo.firstapp.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy //to make class lazy , only creates instance if required
// marks a class as spring bean and makes it available for dependency injection
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // prototype means different instance for each injection
public class AddressDetails implements PersonalDetails {
    public AddressDetails(){
        System.out.println("address details");
    }
    @Override
    public String getPersonalDetails() {
        return "your current address : Bangalore , Karnataka ,  India ";
    }
}
