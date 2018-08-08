/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.controller;

import com.panthera.model.Person;
import com.panthera.service.PersonService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrator
 */
@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping(value = "person", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<Person>> getAllVehicle() {
        List<Person> personList = new ArrayList<>();
        try {

            for (int i = 0; i < 10; i++) {
                Person p = new Person();
                p.setFirstName("Mahesh" + i);
                p.setLastName("Patel" + i);
                personService.create(p);
                personList.add(p);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return new ResponseEntity<>(personList, HttpStatus.OK);
    }

}
