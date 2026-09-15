package com.myapp.demo.firstapp.Entity;

public class StudentPojo {
    private String firstname ;
    private  String lastName;

    public StudentPojo(String firstName, String lastName){
        this.firstname = firstName;
        this.lastName = lastName;
    }

    // getter methods
    public String getLastName() {
        return lastName;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


    // setter methods
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }
}
