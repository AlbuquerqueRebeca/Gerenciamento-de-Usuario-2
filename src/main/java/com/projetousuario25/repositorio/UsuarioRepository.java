package com.projetousuario25.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetousuario25.entidade.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{ 
	
	Optional<Usuario>  findByLogin(String login);

	}  
