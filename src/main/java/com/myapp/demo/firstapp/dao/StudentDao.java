package com.myapp.demo.firstapp.dao;

import com.myapp.demo.firstapp.Entity.Student;

// first step to define a dao interface
public interface StudentDao {
    public void save(Student student);
}
