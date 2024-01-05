package com.rk.nonweb.springbootnonweb.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class NameScheduler {

    @Autowired
    private ApplicationContext applicationContext;

    private Logger log = LoggerFactory.getLogger(NameScheduler.class);

    @Scheduled(fixedDelay = 10000)
    public void printName(){
        //AnnotationConfigApplicationContext - when running as simple application
        //AnnotationConfigServletWebServerApplicationContext - when running as web application
        log.info(applicationContext.toString());
        String name = "Rajkaran";
        log.info("name : {}",name);
    }
}
