package com.example.DDDUnisabana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.example.DDDUnisabana.infrastructure.out.persistence.orm")

public class DddUnisabanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DddUnisabanaApplication.class, args);
	}

}
