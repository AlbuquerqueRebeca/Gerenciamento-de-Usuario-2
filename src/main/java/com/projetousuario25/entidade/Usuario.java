package com.projetousuario25.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Usuario {
	
	
 @Id
 private String email; //buscar por email
 private String nome;
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
 
 public void setSenha() {
	 
 }
	
	
	
	
	

}
