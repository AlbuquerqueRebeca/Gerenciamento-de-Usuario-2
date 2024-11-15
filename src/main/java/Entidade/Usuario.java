package Entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	
@Entity	
@Table(name = "Usuario") 
public class Usuario {

 private String nome;
 private String senha;
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 
 private String Id; 
 private String email;

 
 
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
 
 public String getId() {
	 return Id;
 }
 
 public void setId(String Id) {
	 this.Id = Id;
 }
 
 public String getEmail() {
	 
 }

	 
	 




}
