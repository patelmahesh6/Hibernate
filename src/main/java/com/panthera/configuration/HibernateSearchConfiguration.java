/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.configuration;

import com.panthera.service.HibernateSearchService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Administrator
 */
//@Configuration
public class HibernateSearchConfiguration {

   /*@PersistenceContext
    private EntityManager em;*/

  /*  @Bean
    HibernateSearchService hibernateSearchService() {
        HibernateSearchService hibernateSearchService = new HibernateSearchService(em);
        hibernateSearchService.initializeHibernateSearch();
        return hibernateSearchService;
    }*/
}
