package com.myapp.demo.firstapp.dao;

import com.myapp.demo.firstapp.Entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
}
