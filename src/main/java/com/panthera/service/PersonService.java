/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.service;

import com.panthera.dao.PersonDao;
import com.panthera.model.Person;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrator
 */
@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    public Person create(Person person) {
        return personDao.save(person);
    }

    public Person delete(int id) {
        Optional<Person> person = findById(id);
        if (person.isPresent()) {
            personDao.delete(person.get());
        }
        return person.get();
    }

    public List<Person> findAll() {
        return (List<Person>) personDao.findAll();
    }

    public Optional<Person> findById(long id) {
        return personDao.findById(id);
    }

    public Person update(Person person) {
        return null;
    }

}
