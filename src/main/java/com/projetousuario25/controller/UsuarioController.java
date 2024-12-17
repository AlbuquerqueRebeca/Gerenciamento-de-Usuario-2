package com.projetousuario25.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projetousuario25.dto.UserRegisterDto;
import com.projetousuario25.entidade.Usuario;
import com.projetousuario25.repositorio.UsuarioRepository;
import com.projetousuario25.service.UsuarioService;

@RestController  
@RequestMapping("/api")
public class UsuarioController {

	
	@Autowired 
   private UsuarioRepository usuarioRepository; 
	
	@Autowired 
	private UsuarioService usuarioService;  
	
	
	//Registrando usuario
	@PostMapping 
	
	
	
	
	
	
	
	
	
	
	
	
}
