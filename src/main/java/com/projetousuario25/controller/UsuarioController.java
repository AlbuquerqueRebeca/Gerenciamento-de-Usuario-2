package com.projetousuario25.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetousuario25.repositorio.UsuarioRepository;

@RestController  
@RequestMapping("/api")
public class UsuarioController {

	
	@Autowired 
   private UsuarioRepository usuarioRepository; 


   @PostMapping 
public ResponseEntity<String>




}
