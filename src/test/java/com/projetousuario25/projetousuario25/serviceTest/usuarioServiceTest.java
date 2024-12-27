package com.projetousuario25.projetousuario25.serviceTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.projetousuario25.service.UsuarioService;

@SpringBootTest 
public class usuarioServiceTest {
	
	@Autowired
	private UsuarioService usuarioService; 
	
	@Autowired
	private PasswordEncoder passwordEncoder; 
	
	
	@Test
	void salvandoUsuario() { 
		
	}
	
	

}
