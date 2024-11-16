package Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import Entidade.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,String >{ 
	

}


