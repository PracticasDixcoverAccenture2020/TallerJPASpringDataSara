package es.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import es.biblioteca.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>,  QueryByExampleExecutor<Usuario>, JpaSpecificationExecutor<Usuario>{
	
	/**
	 * 
	 * @param nombre
	 * @return
	 */
	public List<Usuario> findByNombre(String nombre);
	
	
}
