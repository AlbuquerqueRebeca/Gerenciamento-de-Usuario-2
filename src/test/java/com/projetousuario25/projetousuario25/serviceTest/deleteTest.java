package com.projetousuario25.projetousuario25.serviceTest;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.projetousuario25.entidade.Usuario;
import com.projetousuario25.service.UsuarioService;

@SpringBootTest
public class deleteTest {
	
	
	 @Autowired 
	 private UsuarioService usuarioService;
	 
	 
	 @Test
	 void deletandoPerfil() { 
	 Usuario usuario = new Usuario();
	 usuario.setEmail("Rafaella-Floriano@hotmail.com"); 
	 usuario.setNome("Rafaella Floriano"); 
	 usuario.setLogin("Rafaella"); 
	 usuario.setSenha("24294");
	 
	 
	 usuarioService.buscandoUsuario(usuario.getEmail()); 
	 
	 Optional<Usuario> deletarUsuario = usuarioService.buscandoUsuario(null)
		 
	 }
	
	
	
	

}
