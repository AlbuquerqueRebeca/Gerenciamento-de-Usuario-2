package Entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


	
@Entity	
@Table(name = "Usuario") 
public class Usuario {

 private String nome;
 private String senha;
 
 @Id



}
