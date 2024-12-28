package com.projetousuario25.projetousuario25.serviceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.projetousuario25.entidade.Usuario;
import com.projetousuario25.service.UsuarioService;

@SpringBootTest 
public class usuarioServiceTest {
	
	@Autowired
	private UsuarioService usuarioService; 
	
	@Autowired
	private PasswordEncoder passwordEncoder; 
	
	
	//Registrando usuario
	@Test
	void salvandoUsuario() { 
	Usuario usuario = new Usuario(); 	
	usuario.setEmail("Rafaella-Floriano@hotmail.com"); 
	usuario.setNome("Rafaella Floriano"); 
	usuario.setLogin("Rafaella"); 
	usuario.setSenha("24294"); 
	
	
	usuarioService.registrandoUsuario(usuario); 
	
	assertEquals("Rafaella-Floriano@hotmail.com", usuario.getEmail(), "Email salvo com sucesso!!");
	assertEquals("Rafaella Floriano", usuario.getNome(), "Nome de usuario salvo com sucesso!!");
	assertEquals("Rafaella", usuario.getLogin(), "Login salvo com sucesso!!"); 
	
	assertTrue(passwordEncoder.matches("24294", usuario.getSenha()),"Senha codificada com sucesso"); 

		
	}
	
	//Buscando usuario por email
	@Test
	void buscandoUsuario() { 
	String email = "Rafaella-Floriano@hotmail.com";
	Optional<Usuario> usuario = usuarioService.buscandoUsuario(email); 
	assertTrue(usuario.isPresent(), "Usuario encontrado"); 
		
	}
	
	//Atualizando perfil de usuario
	
	@Test
	void atualizandoPerfil() { 
	Usuario usuario = new Usuario();
	usuario.setEmail("Rafaella-Floriano@hotmail.com"); 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
