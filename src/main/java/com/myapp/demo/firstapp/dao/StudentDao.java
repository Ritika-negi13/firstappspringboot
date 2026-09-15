package com.myapp.demo.firstapp.dao;

import com.myapp.demo.firstapp.Entity.Student;

import java.util.List;

// first step to define a dao interface
public interface StudentDao {
    public void save(Student student);

    public Student findById(int id);

    public List<Student> findAll();

    public List<Student> findByLastName();

    public void update(Student theStudent);

    public void delete(int id);

    public int deleteAll();
}
