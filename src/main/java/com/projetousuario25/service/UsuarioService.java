package com.projetousuario25.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.projetousuario25.entidade.Usuario;
import com.projetousuario25.repositorio.UsuarioRepository;

@Service 
public class UsuarioService{
	
	@Autowired
	private PasswordEncoder passwordEncoder; 
	
	@Autowired 
	private UsuarioRepository usuarioRepository; 
	
	
	//Tratamento de exceçao
   public void registrandoUsuario(Usuario usuario) {  
	   String normalizedEmail = usuario.getEmail().toLowerCase();
	   String normalizedLogin = usuario.getLogin().toLowerCase();
	   if(usuarioRepository.existsById(normalizedEmail)) { 
		   throw new RuntimeException("Esse email já existe!!");
		   }
	   
	    //Codificando senha / Registro de Usuario 
	   String encodePassword = passwordEncoder.encode(usuario.getSenha()); 
	   usuario.setEmail(normalizedEmail);
	   usuario.setLogin(normalizedLogin);
	   usuario.setSenha(passwordEncoder.encode(usuario.getSenha())); 
	   usuarioRepository.save(usuario);
	   System.out.println("Usuario registrado com sucesso!! " + usuario.getLogin());
	   
	    }
   
     
       //Listar todos Usuarios
      public List<Usuario> listandoUsuarios(){
    	  return usuarioRepository.findAll();
    	  
    }
    
        //Buscando usuario por email
       public Optional<Usuario> buscandoUsuario(String email){
    	   return usuarioRepository.findById(email);
       }
       
       //Atualizando perfil de usuario
       public Usuario atualizandoPerfil(Usuario usuario) {
    	   return usuarioRepository.save(usuario);
    	}
       
       //Deletar Perfil
       public void deletarPerfil(String email) {
    	   usuarioRepository.deleteById(email);
    	   
       }
	
}
