package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan("com.stackroute.*")
//@EntityScan("com.stackroute.domain")
//@EnableJpaRepositories("com.stackroute.repository")
public class MuzixApp {

	public static void main(String[] args) {
		SpringApplication.run(MuzixApp.class, args);
	}

}

