package com.rk.nonweb.springbootnonweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootNonWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootNonWebApplication.class, args);
	}

}
