package es.biblioteca.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import es.biblioteca.entity.Usuario;
import es.biblioteca.repository.UsuarioRepository;
import es.biblioteca.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario findById(Integer id) {

		return usuarioRepository.findById(id).orElse(null);
	}

	@Override
	public List<Usuario> findAll() {

		return usuarioRepository.findAll();
	}

	@Override
	public List<Usuario> findByExample(Usuario usuario) {

		Example<Usuario> exUsuario = Example.of(usuario);
		return usuarioRepository.findAll(exUsuario);
	}

	@Override
	public Usuario nuevoUsuario(Usuario usuario) {

		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {

		Usuario usuarioDB = findById(usuario.getId());

		if (null == usuarioDB){ return null; }

		usuarioDB.setNombre(usuario.getNombre());
		usuarioDB.setPrestamos(usuario.getPrestamos());

		return usuarioRepository.save(usuarioDB);
	}


	@Override
	public List<Usuario> findByNombre(String nombre) {

		return usuarioRepository.findByNombre(nombre);
	}

	@Override
	public void deleteById(Integer id) {

		usuarioRepository.deleteById(id);

	}



}


