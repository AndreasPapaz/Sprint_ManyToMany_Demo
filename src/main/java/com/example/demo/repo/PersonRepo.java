package com.example.demo.repo;

import com.example.demo.model.Person;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonRepo {

    @PersistenceContext
    EntityManager entityManager;

    //connect to database
    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }

}
