package com.algaworks.algafood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.model.*;
import com.algaworks.algafood.domain.repository.CozinhaRepository;

public class BuscaCozinhaMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
									.web(WebApplicationType.NONE).run(args);
		
		CozinhaRepository cadastrocozinha = applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha = cadastrocozinha.buscar(1L);
		
		System.out.println(cozinha.getNome());
	}
}
