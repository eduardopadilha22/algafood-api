package com.algaworks.algafood.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algafood.domain.model.Restaurante;
import com.algaworks.algafood.domain.repository.RestauranteRepository;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {
	
	@Autowired
	RestauranteRepository restauranteRepository;
	
	public List<Restaurante> listar(){
		return restauranteRepository.listar();
	}
	
	@GetMapping("/{restauranteId")
	public ResponseEntity<Restaurante> buscar(@PathVariable Long restauranteId){
			Restaurante restauranteAtual = restauranteRepository.buscar(restauranteId);
			if(restauranteAtual != null) {
				return ResponseEntity.ok(restauranteAtual);
			}
			
			return ResponseEntity.notFound().build();
			
	}
}
