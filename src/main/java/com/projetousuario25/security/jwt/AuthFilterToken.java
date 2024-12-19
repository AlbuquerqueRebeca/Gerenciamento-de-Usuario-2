package com.projetousuario25.security.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import com.projetousuario25.service.UsuarioDetailsServiceImpl;

public class AuthFilterToken extends OncePerRequestFilter{ 
	 
	 @Autowired 
	 private UsuarioJwtUtils usuarioJwtUtils; 
	 
	 @Autowired
	 private UsuarioDetailsServiceImpl userDetailService; 
}
