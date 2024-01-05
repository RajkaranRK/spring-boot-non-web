package com.rk.nonweb.springbootnonweb.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class NameScheduler {

    private Logger log = LoggerFactory.getLogger(NameScheduler.class);

    @Scheduled(fixedDelay = 10000)
    public void printName(){
        String name = "Rajkaran";
        log.info("name : {}",name);
    }
}
