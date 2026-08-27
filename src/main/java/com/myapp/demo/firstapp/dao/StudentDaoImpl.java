package com.myapp.demo.firstapp.dao;

import com.myapp.demo.firstapp.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

//@repository for component scanning  , used for dao implementation
@Repository
public class StudentDaoImpl  implements  StudentDao{

    // define field for entitiy manager // saves the java object
    private EntityManager entityManager ;

    @Autowired // just to make is easier to understand (which constructor will used for dependency injection)
    public StudentDaoImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Transactional // used to automagically begin and ends traction for Jpa code
    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }


   //    @Transactional is not needed since we are only performing the query not saving or anything
    public Student findById(int id){
        return entityManager.find(Student.class , id);
    }

    // normal query , order by query
    @Override
    public List<Student> findAll(){
      // TypedQuery<Student>  query= entityManager.createQuery("FROM Student" , Student.class);
        TypedQuery<Student>  query= entityManager.createQuery("FROM Student order by lastName" , Student.class);
        return query.getResultList();
    }

    /// using named parameter
    @Override
    public List<Student> findByLastName(){
        TypedQuery<Student> query = entityManager.createQuery("From Student where lastName  =:theData" , Student.class);
        //set query parameter
        query.setParameter( "theData" , "Negi");

        return query.getResultList();
    }

    @Override
    @Transactional // performaing transation
    public void update(Student theStudent){
        entityManager.merge(theStudent);
    }

    @Override
    @Transactional
    public  void delete(int id){
        // finding  value to delete
        Student student = entityManager.find(Student.class , id);

        // remove that value
        entityManager.remove(student);
    }


    @Override
    @Transactional
    public int deleteAll(){
        int x = entityManager.createQuery("DELETE fROM Student").executeUpdate();
        return x;
    }
}
