package com.projetousuario25.security.jwt;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import com.projetousuario25.service.UsuarioDetailsServiceImpl;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AuthFilterToken extends OncePerRequestFilter{ 
	 
	 @Autowired 
	 private UsuarioJwtUtils jwtUtil; 
	 
	 @Autowired
	 private UsuarioDetailsServiceImpl userDetailService;

	 @Override
		protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
				throws ServletException, IOException { 
		
		    try {
		    	  String jwt = getToken(request); 
		    	  System.out.println("token recebido" + jwt);
		    	  if(jwt != null && jwtUtil.validateJwtToken(jwt)) { 
		    		  
		    		  String username = jwtUtil.getUsernameToken(jwt);
		    		  System.out.println("username extraido do token" + username);
		    		  
		    		  UserDetails userDetails = userDetailService.loadUserByUsername(username);
		    		  System.out.println("detalhes do usuario carregados" + userDetails);
                      UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
		    	      auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
		    	      
		    	      SecurityContextHolder.getContext().setAuthentication(auth);
		    	  
		    	    }
		    	  
		    	  }catch(Exception e) {
		    		  System.out.println("Ocorreu um erro ao processar o token");
		    	  }finally {
		    		  
		    	  }
		          
		             filterChain.doFilter(request, response); 
		           
	  }
	 
	            private String getToken(HttpServletRequest request) { 
	                    String headerToken = request.getHeader("Authorization");	
	            	    if(StringUtils.hasText(headerToken) && headerToken.startsWith("Bearer ")) {
	            	    	return headerToken.replace("Bearer ", "");
	            	    }
	            	    
	            	       return null; 
	            }
	 
	 
	 
}
