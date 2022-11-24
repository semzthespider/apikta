package com.kta.asosiasi.apikta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ApiktaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiktaApplication.class, args);
	}

}
