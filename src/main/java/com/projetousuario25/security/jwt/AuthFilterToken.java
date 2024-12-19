package com.projetousuario25.security.jwt;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import com.projetousuario25.service.UsuarioDetailsServiceImpl;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AuthFilterToken extends OncePerRequestFilter{ 
	 
	 @Autowired 
	 private UsuarioJwtUtils usuarioJwtUtils; 
	 
	 @Autowired
	 private UsuarioDetailsServiceImpl userDetailService;

	 @Override
		protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
				throws ServletException, IOException{ 
		 
	        }
	 
	 
}
