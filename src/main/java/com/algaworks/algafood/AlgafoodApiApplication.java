package com.algaworks.algafood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class AlgafoodApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlgafoodApiApplication.class, args);
	}

}