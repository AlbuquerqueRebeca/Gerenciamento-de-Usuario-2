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
	
}

	 
	 




}
