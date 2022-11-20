package com.xyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.xyz.repository.*")
@ComponentScan(basePackages = { "com.xyz.controller",  "com.xyz.service", "com.xyz.service.impl", "com.xyz.entity",  "com.xyz.repository"})
//@EntityScan("com.xyz.entity.*")   
public class MovieShowApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieShowApplication.class, args);
	}

}
