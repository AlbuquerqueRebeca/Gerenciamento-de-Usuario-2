package com.projetousuario25.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projetousuario25.entidade.Usuario;
import com.projetousuario25.repositorio.UsuarioRepository;

@RestController  
@RequestMapping("/api")
public class UsuarioController {

	
	@Autowired 
   private UsuarioRepository usuarioRepository; 

//Registrando Usuario
   @PostMapping("/registrar-usuario")
public ResponseEntity<String> registrarUsuario(@RequestBody Usuario usuario){
Usuario salvarUsuario = usuarioRepository.save(usuario);
return ResponseEntity.ok("Usuario registrado com sucesso!! " + salvarUsuario.getNome()); 
   }

 //Buscando Usuario por Email   
@GetMapping("/usuario") 


}
}