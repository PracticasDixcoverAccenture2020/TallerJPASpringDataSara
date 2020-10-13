package es.biblioteca.service;

import java.util.List;

import es.biblioteca.entity.Usuario;

public interface UsuarioService {

	public Usuario findById(Integer id);
	public List<Usuario> findAll();
	public List<Usuario> findByExample(Usuario usuario);
	public Usuario nuevoUsuario(Usuario usuario);
	public Usuario actualizarUsuario(Usuario usuario);
	public List<Usuario> findByNombre(String nombre);

}
