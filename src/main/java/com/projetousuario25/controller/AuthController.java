package com.projetousuario25.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetousuario25.dto.AuthenticationDto;
import com.projetousuario25.service.AuthService;
import com.projetousuario25.service.UsuarioService;

@RestController 
@RequestMapping("/auth") 
public class AuthController{
	
	
	@Autowired
    private AuthService authService; 
	
	@Autowired
	private UsuarioService usuarioService; 
	
	
	@PostMapping(value = "/login") 
	public ResponseEntity<?> login(@RequestBody AuthenticationDto authDto) { 
		
	}
	
	
	
}
