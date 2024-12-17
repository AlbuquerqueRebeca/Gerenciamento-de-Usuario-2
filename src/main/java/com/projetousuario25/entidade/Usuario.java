package com.projetousuario25.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	
	
 @Id
 private String email; //buscar por email //identificado unico

 
 private String nome;
 private String login;
 private String senha;
 
 
 
 public String getNome() {
	 return nome; 
 }
 
 public void setNome(String nome) { 
	this.nome = nome; 
 }
 
 public String getSenha() {
	 return senha; 
 }
 
 public void setSenha(String senha) { 
	 this.senha = senha;
 }
 
 public String getEmail() { 
	 return email; 
 }
 
 public void setEmail(String email) {
     this.email = email;	 
 }

public String getLogin() {
	return login;
}

public void setLogin(String login) {
	this.login = login;
}
 
 
	
	
	
	
	

}
